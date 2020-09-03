package bitcamp.java142.ch5;
//�Լ��� �ִ� try  catch�������
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bitcamp.java142.ch5.sql.EmpSqlQueryMap;
import bitcamp.java142.common.ConnProperty;

//�Լ�ȣ�������
public class OracleTest_3 {
	
	public void selectEmp() throws Exception{
		
		System.out.println("��1�١١١١١١١� OralceTest_3.selectEmp() �Լ� ���� ------------------------");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		con = ConnProperty.getConnection();
		System.out.println("selectEmp> 1-2 con   >>> : " +con);
		pstmt = con.prepareStatement(EmpSqlQueryMap.getSelectQuery());//Stringbuffer�� �������Ⱦ� ����sb.toString();
		System.out.println("selectEmp> 1-3pstmt >>> : " +pstmt);
		rsRs = pstmt.executeQuery();
		System.out.println("selectEmp> 1-4rsRs  >>> : " + rsRs);
		
		if(rsRs != null){
			while(rsRs.next()){
				System.out.print(rsRs.getString("EMPNO"));
				System.out.println(" " + rsRs.getString("ENAME"));
			}//while��
		}//if��
		System.out.println("��1��------------------ OralceTest_3.selectEmp() �Լ� ���١١١١١١١� ");
	}//selectEmp()�Լ���
	
	
	public void searchEmp(int iVal, String sVal) throws Exception{
		System.out.println("��2�١١١١١١١١� OralceTest_3.searchEmp() �Լ� ���� ------------------------");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		con = ConnProperty.getConnection();
		System.out.println("searchEmp> 2-2con >>> : "+con);
		pstmt = con.prepareStatement(EmpSqlQueryMap.getSearchQuery());
		System.out.println("searchEmp> 2-3pstmt >>> : " + pstmt);
		
		pstmt.setInt(1, iVal);
		pstmt.setString(2, sVal);
		rsRs = pstmt.executeQuery();
		System.out.println("searchEmp> 2-4rsRs >>> : " + rsRs);
		
		if(rsRs != null){
			while (rsRs.next()){
				System.out.print(rsRs.getString("EMPNO"));
				System.out.println(" " + rsRs.getString("ENAME"));
			}//while��
		}//if��
		System.out.println("��2��------------------ OralceTest_3.searchEmp() �Լ� ���١١١١١١١� ");
	}//searchEmp()�Լ� ��
	
	public void likeSearchEmp(String sVal) throws Exception{
		System.out.println("��3�١١١١١١١١� OralceTest_3.likeSearchEmp() �Լ� ���� ------------------------");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
			
		con = ConnProperty.getConnection();
		System.out.println("likeSearchEmp> 3-2���Ϲ��� con >>> : "+con);
		pstmt = con.prepareStatement(EmpSqlQueryMap.getLikeSearchQuery());
		System.out.println("likeSearchEmp> 3-3pstmt >>> : " + pstmt);
					
		pstmt.setString(1, sVal);
		rsRs = pstmt.executeQuery();
		System.out.println("likeSearchEmp> 3-4rsRs >>> : " + rsRs);
		
		if(rsRs != null){
			while (rsRs.next()){
				System.out.print(rsRs.getString("EMPNO"));
				System.out.println(" " + rsRs.getString("ENAME"));
			}//while��
		}//if��
	
		System.out.println("��3��------------------ OralceTest_3.likeSearchEmp() �Լ� ���١١١١١١١� ");
	}//likeSearchEmp()�Լ� ��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------��OralceTest_3 �����Լ� ���ۡ� ");
		try{
			OracleTest_3 ot3 = new OracleTest_3();
			ot3.selectEmp();
			ot3.searchEmp(7369, "SMITH");
			ot3.likeSearchEmp("S");
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}//try-catch��
		
		System.out.println("��OralceTest_3 �����Լ� ���� --------------------------------------------------");
	}//���γ�

}//OracleTest_3Ŭ������
