package bitcamp.java142.ch5;


	import java.sql.*;


public class OracleTest_1108 {
	

		public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";
		public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";
		public static final String ORACLE11G_USER = "scott";
		public static final String ORACLE11G_PASS = "tiger";
		
	 
		public OracleTest_1108(){
			try {
				Class.forName(ORACLE11G_JDBCDRIVER); 
			}catch(ClassNotFoundException e){
				System.out.println("드라이버 찾는데 문제가 생김>>> : " + e);
			}
		}//OracleTest()끝
		
		public void selectEmp(){
			
			//statement빠르게 조회
			//prepareStatement조회건수가 많거나 조회여러번할경우권고 
			
			Connection con = null; //연결통로 초기화
			PreparedStatement pstmt = null;
//			Statement stmt = null; //쿼리날릴곳 초기화
			ResultSet rsRs = null; //쿼리받을거 초기화
			String sql = "SELECT A.EMPNO," + "A.ENAME ENAME FROM EMP A"; //쿼리에들어가기전까지 문자열에불과
			
			try{
				con = DriverManager.getConnection (ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); 
				System.out.println("con >>> : "+con); 
			
				
				//PreparedStatement와 Statement비교 
				//쿼리문이어디있는지 비교 PrepareStatement()에 쿼리문sql넣고 executeQuery()에는 매개변수 없이
				//Statement()는 쿼리문 위치가 반대이다
				//우리는 PreparedStatement()만 쓸거닷
				
				pstmt= con.prepareStatement(sql);
				System.out.println("pstmt >>> : "+pstmt);
//				stmt = con.createStatement();
//				System.out.println("stmt >>> : "+stmt);
				
				rsRs = pstmt.executeQuery();
//				rsRs = stmt.executeQuery("SELECT A.EMPNO EMPNO, A.ENAME ENAME FROM EMP A");
//				rsRs = stmt.executeQuery("SELECT EMPNO AA, ENAME BB FROM EMP");
				System.out.println("rsRs >>> : "+rsRs);
				
				if(rsRs !=null){
					while(rsRs.next()){
						System.out.print(rsRs.getString("EMPNO"));
						System.out.println(" "+ rsRs.getString("ENAME"));
//						System.out.println(rsRs.getString("AA"));
//						System.out.println(" "+rsRs.getString("BB"));
//						System.out.println(rsRs.getString("1"));
//						System.out.println(" "+rsRs.getString("2"));
//						System.out.println(rsRs.getString("3"));
//						System.out.println(" "+rsRs.getString("5"));
					
					}//while끝
				}//if끝
			}catch(SQLException e){ 
				System.out.println("DB연결 또는 퀴리 등에서 문제가 발생 >>> : "+e);
				}//catch끝		
		}//selectEmp()끝

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleTest_1108 OT = new OracleTest_1108();
		OT.selectEmp();
		
	}//메인끝

}//클래스끝
	



