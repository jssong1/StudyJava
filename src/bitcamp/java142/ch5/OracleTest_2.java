package bitcamp.java142.ch5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class OracleTest_2 {

	public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.01:1521:orclJSW";
	public static final String ORACLE11G_USER = "scott";
	public static final String ORACLE11G_PASS = "tiger";
	
	//������
	public OracleTest_2(){
		try {
			Class.forName(ORACLE11G_JDBCDRIVER); 
		}catch(ClassNotFoundException e){
			System.out.println("OracleTest_2 ����̹� ã�µ� ������ ����>>> : " + e);
		}
	}
	
	
	public void selectEmp(){
	
		Connection con = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String sql = " SELECT A.EMPNO EMPNO, " + " A.ENAME ENAME FROM EMP A ";
		
		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS);
			System.out.println("selectEmp> con >>> : " + con);
			pstmt = con.prepareStatement(sql);
//			stmt= con.createStatement();
			System.out.println("selectEmp> pstmt >>> : " + pstmt);
			rsRs = pstmt.executeQuery();
//			rsRs = stmt.executeQuery(sql);
			System.out.println("selectEmp> rsRs >>>> : "+rsRs);
			
			
			if (rsRs != null){
				while (rsRs.next()){
					System.out.print(rsRs.getString("EMPNO"));
					System.out.println(" " + rsRs.getString("ENAME"));
				}
			}
		}catch(SQLException e){
			System.out.println("selectEmpDB>���� �Ǵ� ���� ��� ������ �߻� >>> :" + e);
		}
	}
	
//	���ǰ˻�//������Ÿ����������
	public void searchEmp(int iVal, String sVal){

		Connection con = null;
//		Statement  stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
//		? (placeholder, �Ű����� ���ε� ����):preparestatement������ select�Ҷ� �Ű����� ��� ����,�ѹ����� where�ִ�?��1�� ename2��
//		?, ? :  �÷��̽� Ȧ���� ��������Ģ�� ���´�. ���������� �� ���� ����Ǵ�?�� 1������ ������ ������?���� ���������� ��ȣ�� �ο��ȴ�.
//		?�� ���ε��ϱ� : psmt.setXXX(���ε��ѹ���, ��); :set������Ÿ�Կ� ���� �Լ� ��� ex) DB�� NUMBER => setInt() ; DB�� VARCHAR2 => setString()�Լ� ���
		
		String sql = " SELECT A.EMPNO EMPNO, " + " A.ENAME ENAME "+ " FROM EMP A " + " WHERE A.EMPNO = ? "  + " AND A.ENAME = ? ";
		
		
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT A.EMPNO EMPNO \n");
//		sb.append("		, A.ENAME ENAME \n");
//		sb.append("FROM   EMP A \n");
//		sb.append("WHERE  A.EMPNO = ? \n");
//		sb.append*/("AND    A.ENAME = ? \n");  
//		String sql ��� StringBuffer�� append�ξ��ٸ� try�����ִ� pstmt �ٲٱ� = con.prepareStatement(sb.toString());

		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //Ŀ�ؼ��� �Լ����Ǹ��� ���ε��� ������� ������ ����//�׷��� ���������� ���̾���
			System.out.println("searchEmp> con >>> : " + con);
			pstmt = con.prepareStatement(sql);
			System.out.println("searchEmp> pstmt >>> : " + pstmt);
			pstmt.setInt(1,iVal); //�����������ϰ� �����ϴ°� ���̿� �÷�������Ÿ�Ե������ѹ�������?(�÷��̽�Ȧ��)�����ֱ� // pstmt.setInt(1,����);
			pstmt.setString(2,sVal);//pstmt.seteString(2,���ڿ�);
			rsRs = pstmt.executeQuery();
			System.out.println("searchEmp> rsRs >>>> : "+rsRs);
			
			if(rsRs != null){
				while (rsRs.next()){
					System.out.print(rsRs.getString("EMPNO"));
					System.out.println(" " + rsRs.getString("ENAME"));
				}//while��
			}//if��
		}catch(SQLException e){
			System.out.println("searchEmp>DB���� �Ǵ� ���� ��� ������ �߻� >>> : " + e);
		}//try-catch��
	}//	searchEmp�Լ���
	
	
	public void likeSearchEmp(String sVal){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String sql =  " SELECT A.EMPNO EMPNO, " 
					+ "		   A.ENAME ENAME "
					+ " FROM   EMP A " 
					+ " WHERE  A.ENAME LIKE '%' || ? || '%' ";//��Ƽ��2��:���ϱ⿪��
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT A.EMPNO EMPNO \n");
//		sb.append("		, A.ENAME ENAME \n");
//		sb.append("FROM   EMP A \n");
//		sb.append("WHERE  A.ENAME LIKE '%' || ? || '%'" \n);
		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //Ŀ�ؼ��� �Լ����Ǹ��� ���ε��� ������� ������ ����//�׷��� ���������� ���̾���
			System.out.println("likeSearchEmp> con >>> : " + con);
			pstmt = con.prepareStatement(sql);
			System.out.println("likeSearchEmp> pstmt >>> : " + pstmt);
			pstmt.setString(1,sVal);//pstmt.setString(2,���ڿ�);
			rsRs = pstmt.executeQuery();
			System.out.println("likeSearchEmp> rsRs >>>> : "+rsRs);
				
			if(rsRs != null){
				while (rsRs.next()){
					System.out.print(rsRs.getString("EMPNO"));
					System.out.println(" " + rsRs.getString("ENAME"));
				}//
			}
		}catch(SQLException e){
			System.out.println("likeSearchEmp> DB���� �Ǵ� ���� ��� ������ �߻� >>> :" + e);
		}
	}//likeSerachEmp�Լ���
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_2 ot2 = new OracleTest_2();
		ot2.selectEmp();
		ot2.searchEmp(7369,"SMITH");
		ot2.likeSearchEmp("S");
	}//main�Լ���
}//OracleTest_2Ŭ������
