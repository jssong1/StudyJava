package bitcamp.java142.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


//1. 디비연결할 때 연결정보 공통으로
//2. EmpSqlQueryMap 데이터연동후 쿼리한곳에서 모아놓고쓰기
//3. 레이어 나누기 (단계별)-화면, 프론트


public abstract class ConnProperty {
	
	//연결정보 : datasource
	public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orclKBW";
	public static final String ORACLE11G_USER = "scott";
	public static final String ORACLE11G_PASS = "tiger";
	
	
	//커넥션은 연결, 끊는 두가지 행위를 해야한다.
	public static Connection getConnection() throws Exception{
		System.out.println("--1-------------<<<<<<<<<<<<계정연결 시작 ");

		Connection conn = null;
		Class.forName(ORACLE11G_JDBCDRIVER);
		conn = DriverManager.getConnection( ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS);
		System.out.println("--1------------->>>>>>>>>>>>계정연결 conn리턴 ");
		return conn;
		
	}//getConnection 끝
	
	public static void conClose (Connection conn
								,PreparedStatement pstmt
								,ResultSet rsRs){
		try{
			if(rsRs != null) try{ rsRs.close(); rsRs = null; }catch(Exception ex){}
			if(pstmt != null) try{ pstmt.close(); pstmt =null; }catch(Exception ex){}
			if(conn != null) try{ conn.close(); conn =null; }catch(Exception ex){}
		}catch(Exception e2){}		
	} //conClose끝
	
	public static void conClose (Connection conn, PreparedStatement pstmt){ //conClose가 두개네 오버로딩?
		try{
			if(pstmt != null) try{ pstmt.close(); pstmt =null; }catch(Exception ex){}
			if(conn != null) try{ conn.close(); conn =null; }catch(Exception ex){}
		}catch(Exception e2){}		
		} //conClose끝
		
	
}//ConnProperty클래스끝

