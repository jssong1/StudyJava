package bitcamp.java142.ch5;
//쌤거 복붙
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	/*
	 * CLASSPATH
	 * .;%JAVA_HOME%\classes\ojdbc6.jar
	 * */

	public class OracleTest_0s {
		
		// 자바 어플리케이션과 데이터베이스 연결정보 : datasource 
		// 1. oracle.jdbc.driver.OracleDriver : jdbc 드라이버를 시작하는 클래스 
		//    위 클래스는 ORACLE 9I 부터 더이상 업데이트를 지원하지 않는다.
		//    oracle.jdbc.OracleDriver 를 사용하라고 권고한다. 
		public static final String ORACLE11G_JDBCDRIVER = 
				"oracle.jdbc.driver.OracleDriver";
		// 2. JDBC 드라이버를 이용해서 오라클데이터 베이스에 연결하는 접속 정보 
		// 2-1. jdbc:oracle:thin: -> jdbc 4 type thin 드라이버 연결 메타데이터
		// 2-2. @ : 구분자 
		// 2-3. 127.0.0.1 : 오라클이 설치된 서버(컴퓨터) 정보
		//                  localhost, 192.168.0.23 : 도메인 또는 ip 정보이용
		// 2-4. 1521 : 오라클 어플리케이션를 설치한 TCP PORT 
		// 2-5. orclHBE : 오라클 데이터베이스 SID 	
		public static final String ORACLE11G_URL = 
//				"jdbc:oracle:thin:@192.168.41.42:1521:orclLEB";
				"jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";
		// 3. scott / tiger : 계정 정보(account info)
		public static final String ORACLE11G_USER = "scott";
		public static final String ORACLE11G_PASS= "tiger";
		
		// 생성자 
		public OracleTest_0s(){
			try {
				/*
				 * Class.forName() 함수를 이용해서 
				 * JDBC 드라이버 시작 클래스
				 * "oracle.jdbc.driver.OracleDriver 를 찾는다.
				 * */
				Class.forName(ORACLE11G_JDBCDRIVER);
			}catch(ClassNotFoundException e){
				System.out.println("드라이버 찾는데 문제가 생김 >>> : " + e);
			}
		}
		
		public void selectEmp(){
			
			Connection con = null;
			Statement  stmt = null;
			ResultSet  rsRs = null;
			
			try {
				// Connection 인터페이스를 이용해서 
				// 자바 어플리케이션에서 제공한 연결정보(datasource)를 
				// 가지고 오라클 데이터베이스와 연결 하며
				// 잘 연결되면 자바어플리케이션과 오라클 데이터베이스에 
				// 하나의 session(connection)이 생긴다.
				con = DriverManager.getConnection( ORACLE11G_URL
						                          ,ORACLE11G_USER
						                          ,ORACLE11G_PASS);			
				System.out.println("con >>> : " + con);
			// 연결된 세션(session, connection)을 가지고 
				// sql 질의문을 오라클에 전달하기위해서 
				// 하나의 통로를 만든다(이해하기 쉽게 설명하려고 하는 것)
				// 위 역활을 Statement 인터페이스가 수행한다.  
				stmt = con.createStatement();
				System.out.println("stmt >>> : " + stmt);

				// Statement 인터페이스에 있는 함수 중 
				// sql 질의문 중 SELECT 인 경우 
				// executeQuery() 함수를 이용해서 
				// sql 질의문을 오라클 데이터베이스에 전달한다. 
				// sql 질의문이 오라클 데이터베이스에 전달되고
				// 오라클 데이터베이스에서 전달 받은 sql 질의문을 
				// 오라클 엔진이 수행해서 결과를 파일로 만들어서 
				// 만들어진 파일을 다시 자바 어플리케이션으로 전달하는데
				// 이 전달되는 파일을 ResultSet 인터페이스가 
				// 리턴 받는다. 
				rsRs = stmt.executeQuery(  "SELECT A.EMPNO EMPNO, "
		                 + "A.ENAME ENAME FROM EMP A");			
//				rsRs = stmt.executeQuery("SELECT EMPNO AA, ENAME BB FROM EMP");
				System.out.println("rsRs >>> : " + rsRs);
				
				if(rsRs !=null){
					while (rsRs.next()){
						System.out.print(rsRs.getString("EMPNO"));
						System.out.println(" " + rsRs.getString("ENAME"));
//						System.out.print(rsRs.getString("AA"));
//						System.out.println(" " + rsRs.getString("BB"));
//						System.out.print(rsRs.getString(1));
//						System.out.print(" " + rsRs.getString(2));
//						System.out.println(" " + rsRs.getString(3));
					}
				}
			}catch(SQLException e){
				System.out.println("DB연결 또는 퀴리등에서 문제가 발생  >>> : " + e);
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new OracleTest_0s().selectEmp();
		}
	}


