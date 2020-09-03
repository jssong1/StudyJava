package bitcamp.java142.ch5;
//함수에 있는 try  catch다지우기
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bitcamp.java142.ch5.sql.EmpSqlQueryMap;
import bitcamp.java142.common.ConnProperty;

//함수호출시작점
public class OracleTest_3 {
	
	public void selectEmp() throws Exception{
		
		System.out.println("☆1☆☆☆☆☆☆☆☆ OralceTest_3.selectEmp() 함수 시작 ------------------------");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		con = ConnProperty.getConnection();
		System.out.println("selectEmp> 1-2 con   >>> : " +con);
		pstmt = con.prepareStatement(EmpSqlQueryMap.getSelectQuery());//Stringbuffer로 쿼리날렸어 리턴sb.toString();
		System.out.println("selectEmp> 1-3pstmt >>> : " +pstmt);
		rsRs = pstmt.executeQuery();
		System.out.println("selectEmp> 1-4rsRs  >>> : " + rsRs);
		
		if(rsRs != null){
			while(rsRs.next()){
				System.out.print(rsRs.getString("EMPNO"));
				System.out.println(" " + rsRs.getString("ENAME"));
			}//while끝
		}//if끝
		System.out.println("☆1☆------------------ OralceTest_3.selectEmp() 함수 끝☆☆☆☆☆☆☆☆ ");
	}//selectEmp()함수끝
	
	
	public void searchEmp(int iVal, String sVal) throws Exception{
		System.out.println("☆2☆☆☆☆☆☆☆☆☆ OralceTest_3.searchEmp() 함수 시작 ------------------------");
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
			}//while끝
		}//if끝
		System.out.println("☆2☆------------------ OralceTest_3.searchEmp() 함수 끝☆☆☆☆☆☆☆☆ ");
	}//searchEmp()함수 끝
	
	public void likeSearchEmp(String sVal) throws Exception{
		System.out.println("☆3☆☆☆☆☆☆☆☆☆ OralceTest_3.likeSearchEmp() 함수 시작 ------------------------");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
			
		con = ConnProperty.getConnection();
		System.out.println("likeSearchEmp> 3-2리턴받은 con >>> : "+con);
		pstmt = con.prepareStatement(EmpSqlQueryMap.getLikeSearchQuery());
		System.out.println("likeSearchEmp> 3-3pstmt >>> : " + pstmt);
					
		pstmt.setString(1, sVal);
		rsRs = pstmt.executeQuery();
		System.out.println("likeSearchEmp> 3-4rsRs >>> : " + rsRs);
		
		if(rsRs != null){
			while (rsRs.next()){
				System.out.print(rsRs.getString("EMPNO"));
				System.out.println(" " + rsRs.getString("ENAME"));
			}//while끝
		}//if끝
	
		System.out.println("☆3☆------------------ OralceTest_3.likeSearchEmp() 함수 끝☆☆☆☆☆☆☆☆ ");
	}//likeSearchEmp()함수 끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------☆OralceTest_3 메인함수 시작☆ ");
		try{
			OracleTest_3 ot3 = new OracleTest_3();
			ot3.selectEmp();
			ot3.searchEmp(7369, "SMITH");
			ot3.likeSearchEmp("S");
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}//try-catch끝
		
		System.out.println("☆OralceTest_3 메인함수 끝☆ --------------------------------------------------");
	}//메인끝

}//OracleTest_3클래스끝
