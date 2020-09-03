package bitcamp.java142.ch5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//혼자하고 쌤주석정리까지 

/*
 *CLASSPATH
 *.;%JAVA_HOME%\classes\ojdbc6.jar
 **/
public class OracleTest_0 {
//	자바 어플리케이션과 데이터베이스 연결정보 : datasource
//	1. orcle.jdbc.driver.OracleDriver : jdbc 드라이버를 시작하는 클래스 
//		위 클래스는 ORACLE버전이 9이후 더이상 업데이트를 지원하지 않는다.
//		oracle.jdbc.OracleDriver를 사용하라고 권고
	public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";// 오라클벤더가 제공하는 드라이버에서 출발하깅//오라클thin드라이버형식일때 클래스만드는방식
	
	
//	2. JDBC 드라이버를 이용해서 오라클데이터 베이스에 연결하는 접속정보
//	2-1. 소문자! jdbc:oracle:thin: -> jdbc 4 type thin 드라이버 연결 메타데이터 (퓨어자바의 접두어...)
//	2-2. @ : 구분자
//	2-3. 127.0.0.1 : 오라클이 설치된 서버(컴퓨터) 정보 
//					 localhost,  192.168.41.18 : 도메인 또는 ip 정보이용 (/cmd/ipconfig)
//	2-4. 1521 : 오라클 어플리케이션를 설치한 TCP PORT
//	2-5. orclJSW : 오라클 데이터베이스 SID  

	public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";//내 db찾아와라 ip(컴이름):포트:db이름 //jdbc:oracle:thin-jdbc드라이버 형식이 oracle thin
//	 											"jdbc:oracle:thin:@192.168.41.42:1521:orclEUB";
	
//	scott / tiger : 사용자계정 정보 (account info)
	public static final String ORACLE11G_USER = "scott";//계정아이디
	public static final String ORACLE11G_PASS = "tiger";//계정비번
	
	
	//생성자 ??클래스명이랑 같아야했던가 
	public OracleTest_0(){
		try {
			/*
			 * Class.forName()함수를 이용해서 (class.forname은 한번올려놓으면 재사용가능)
			 * JDBC드라이버 시작 클래스 
			 * oracle.jdbe.driver.OracleDriver를 찾는다.
			 * */
			Class.forName(ORACLE11G_JDBCDRIVER); //시작점 클래스 static Class<?>리턴형 : forName(String className)함수 : Returns the Class object associated with the class or interface with the given string name.
												//시작점 드라이버 로드해라
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 찾는데 문제가 생김>>> : " + e);
		}
	}//OracleTest()끝
	
	public void selectEmp(){
		
		
		 //인터페이스껍데기
		Connection con = null; //연결통로 초기화
		Statement stmt = null; //쿼리날릴곳 초기화
		ResultSet rsRs = null; //쿼리받을거 초기화
		
		try{
//			Connection 인터페이스를 이용해서 
//			자바 어플리케이션에서 제공한 연결정보(datasource)를 가지고
//			오라클 데이터베이스와 연결하며
//			잘 연결되면 자바어플리케이션과 오라클 데이터베이스에 하나의 session(connection)이 생긴다. 
			con = DriverManager.getConnection (ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //DriverManager자바내 클래스 자바에서 시작 getConnection함수가일해 url,user,pass연결정보가 메모리에올라가 accept가되어 jdbc connection인터페이스에 오라클연결
			System.out.println("con >>> : "+con); 
			
//			연결된 세션(session, connection)을 가지고
//			sql 질의문을 오라클에 전달하기 위한
//			하나의 통로를 만든다(이해하기 쉽게 설명하려고 하는 것)
//			위 역할을 Statement 인터페이스가 수행한다.
			stmt = con.createStatement();
			System.out.println("stmt >>> : "+stmt);
			
			
			
//			Statement 인터페이스에 있는 함수 중 sql질의문이 SELECT인경우/ executeQuery()함수를 이용해서 /sql 질의문을 오라클 데이터베이스에 전달한다.
//			sql질의문이 오라클 데이터베이스에 전달되고 
//			전달받은 sql질의문을 오라클 엔진에서 수행하여 그 결과를 파일로 만들어서 다시 자바어플리케이션으로 전달한다.
//			이때 전달된 파일은 ResultSet인터페이스가 리턴 받는다.
			rsRs = stmt.executeQuery("SELECT A.EMPNO EMPNO, A.ENAME ENAME FROM EMP A");
//			rsRs = stmt.executeQuery("SELECT EMPNO AA, ENAME BB FROM EMP");
			System.out.println("rsRs >>> : "+rsRs);
			
			if(rsRs !=null){
				while(rsRs.next()){
					System.out.println(rsRs.getString("EMPNO"));
					System.out.println(""+ rsRs.getString("ENAME"));
//					System.out.println(rsRs.getString("AA"));
//					System.out.println(""+rsRs.getString("BB"));
//					System.out.println(rsRs.getString("1"));
//					System.out.println(""+rsRs.getString("2"));
//					System.out.println(rsRs.getString("3"));
//					System.out.println(""+rsRs.getString("5"));
				
				}//while끝
			}//if끝
		}catch(SQLException e){ 
			System.out.println("DB연결 또는 퀴리 등에서 문제가 발생 >>> : "+e);
			}//catch끝		
	}//selectEmp()끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_0 OT = new OracleTest_0();
		OT.selectEmp();
	}//메인끝

}//클래스끝


