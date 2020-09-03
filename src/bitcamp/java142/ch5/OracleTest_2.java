package bitcamp.java142.ch5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class OracleTest_2 {

	public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.01:1521:orclJSW";
	public static final String ORACLE11G_USER = "scott";
	public static final String ORACLE11G_PASS = "tiger";
	
	//생성자
	public OracleTest_2(){
		try {
			Class.forName(ORACLE11G_JDBCDRIVER); 
		}catch(ClassNotFoundException e){
			System.out.println("OracleTest_2 드라이버 찾는데 문제가 생김>>> : " + e);
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
			System.out.println("selectEmpDB>연결 또는 쿼리 등에서 문제가 발생 >>> :" + e);
		}
	}
	
//	조건검색//데이터타입을따진다
	public void searchEmp(int iVal, String sVal){

		Connection con = null;
//		Statement  stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
//		? (placeholder, 매개변수 바인딩 인자):preparestatement문에서 select할때 매개변수 담는 역할,넘버링함 where있는?가1번 ename2번
//		?, ? :  플레이스 홀더는 시퀀스규칙을 갖는다. 쿼리문에서 맨 먼저 기술되는?가 1번부터 시작함 나머지?들은 순차적으로 번호가 부여된다.
//		?에 바인딩하기 : psmt.setXXX(바인딩넘버링, 값); :set데이터타입에 따라 함수 사용 ex) DB의 NUMBER => setInt() ; DB의 VARCHAR2 => setString()함수 사용
		
		String sql = " SELECT A.EMPNO EMPNO, " + " A.ENAME ENAME "+ " FROM EMP A " + " WHERE A.EMPNO = ? "  + " AND A.ENAME = ? ";
		
		
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT A.EMPNO EMPNO \n");
//		sb.append("		, A.ENAME ENAME \n");
//		sb.append("FROM   EMP A \n");
//		sb.append("WHERE  A.EMPNO = ? \n");
//		sb.append*/("AND    A.ENAME = ? \n");  
//		String sql 대신 StringBuffer와 append로쓴다면 try절에있는 pstmt 바꾸기 = con.prepareStatement(sb.toString());

		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //커넥션은 함수세션마다 따로따로 써줘야함 위에썼어도 쓰기//그러나 연결정보는 같이쓰넹
			System.out.println("searchEmp> con >>> : " + con);
			pstmt = con.prepareStatement(sql);
			System.out.println("searchEmp> pstmt >>> : " + pstmt);
			pstmt.setInt(1,iVal); //쿼리문세팅하고 실행하는거 사이에 컬럼데이터타입따져서넘버링으로?(플레이스홀더)에값넣기 // pstmt.setInt(1,숫자);
			pstmt.setString(2,sVal);//pstmt.seteString(2,문자열);
			rsRs = pstmt.executeQuery();
			System.out.println("searchEmp> rsRs >>>> : "+rsRs);
			
			if(rsRs != null){
				while (rsRs.next()){
					System.out.print(rsRs.getString("EMPNO"));
					System.out.println(" " + rsRs.getString("ENAME"));
				}//while끝
			}//if끝
		}catch(SQLException e){
			System.out.println("searchEmp>DB연결 또는 쿼리 등에서 문제가 발생 >>> : " + e);
		}//try-catch끝
	}//	searchEmp함수끝
	
	
	public void likeSearchEmp(String sVal){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String sql =  " SELECT A.EMPNO EMPNO, " 
					+ "		   A.ENAME ENAME "
					+ " FROM   EMP A " 
					+ " WHERE  A.ENAME LIKE '%' || ? || '%' ";//버티컬2개:더하기역할
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT A.EMPNO EMPNO \n");
//		sb.append("		, A.ENAME ENAME \n");
//		sb.append("FROM   EMP A \n");
//		sb.append("WHERE  A.ENAME LIKE '%' || ? || '%'" \n);
		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //커넥션은 함수세션마다 따로따로 써줘야함 위에썼어도 쓰기//그러나 연결정보는 같이쓰넹
			System.out.println("likeSearchEmp> con >>> : " + con);
			pstmt = con.prepareStatement(sql);
			System.out.println("likeSearchEmp> pstmt >>> : " + pstmt);
			pstmt.setString(1,sVal);//pstmt.setString(2,문자열);
			rsRs = pstmt.executeQuery();
			System.out.println("likeSearchEmp> rsRs >>>> : "+rsRs);
				
			if(rsRs != null){
				while (rsRs.next()){
					System.out.print(rsRs.getString("EMPNO"));
					System.out.println(" " + rsRs.getString("ENAME"));
				}//
			}
		}catch(SQLException e){
			System.out.println("likeSearchEmp> DB연결 또는 쿼리 등에서 문제가 발생 >>> :" + e);
		}
	}//likeSerachEmp함수끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_2 ot2 = new OracleTest_2();
		ot2.selectEmp();
		ot2.searchEmp(7369,"SMITH");
		ot2.likeSearchEmp("S");
	}//main함수끝
}//OracleTest_2클래스끝
