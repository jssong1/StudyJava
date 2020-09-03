package bitcamp.java142.ch5;
//수업시간 들으면서 한거
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *CLASSPATH
 *.;%JAVA_HOME%\classes\ojdbc6.jar
 **/

public class OracleTest {

	
	//연결정보, 공통으로쓸거는 문자상수로 만들어서  ㅅㅏ용
	public static final String ORACLE11G_JDBCDRIVER="oracle.jdbc.driver.OracleDriver";//시작점,얘를잘찾아해
	public static final String ORACLE11G_URL="jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";//형식 thin타입드라이버쓰겠다/@찾아오도록 아이피:포트:db이름
	public static final String ORACLE11G_USER="scott";//계정이름
	public static final String ORACLE11G_PASS="tiger";//계정ㅂㅣ번
	
	//생성자
	public OracleTest(){
		
		try{
			Class.forName(ORACLE11G_JDBCDRIVER);//시작점 찾아라 로드해라
			
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 찾는데 문제가 생김 >>>:" +e);
		}
	}//OracleTest()끝
	
	public void selectEmp(){//리턴형보이드 함수
		Connection con =null;//인터페이스초기화
		Statement stmt =null;////인터페이스초기화
		ResultSet rsRs = null;//인터페이스초기화
		
		
		//쿼리
		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //통로가 생기는거
			System.out.println("con>>> : "+con);//오라클벤더에서 클래스연결시켜준거 (연결고리의주소값)
			stmt = con.createStatement();  //문장연결하라는통로/이어줘서움직이는역할/ 내sql을전달하고받는역할
			System.out.println("stmt>>> : "+stmt); //OracleStatementWrapper클래스가실제일하는거
			
			//rsRs = stmt.executeQuery("SELECT * FROM EMP");//SELECT시작점 쿼리문의시작쿼리가날라간당 RSrS가받는당 와일드카드*말고 EMPNO,ENAME으로 조회해보면 부적절한열인덱스/ 밑에컬럼아이디 1,2있으면 갠춘 
			//ALIAS썼으면 " SELECT EMPNO AA, ENAME BB FROM EMP" getString("EMPNO")하면 오류나 getString("AA")로해야해
			rsRs = stmt.executeQuery("SELECT A.EMPNO EMPNO , A.ENAME ENAME FROM EMP A");//ㅌㅔ이블alias명써서쿼리만들기 (이쿼리가날라가는거)
			System.out.println("rsRs>>> : "+rsRs);//SetImpl이셀렉트한결과를받아주는거 
			
			
			if(rsRs != null){ //데이터있어야해확인해
				while(rsRs.next()){ //true,false리턴해
					System.out.println(" "+rsRs.getString("EMPNO"));//ALIAS명으로 조회
					System.out.println(" "+rsRs.getString("ENAME"));
//					System.out.println(" "+rsRs.getString("AA"));
//					System.out.println(" "+rsRs.getString("BB"));
					System.out.println(rsRs.getString(1));//select하는컬럼의아이디 1,2,3으로가져온거 아이디대신 "EMPNO"문자로조회가능 단 ALIAS썼으면 ALIAS로조회
					System.out.println(" "+rsRs.getString(2));
//					System.out.println(" "+rsRs.getString(3));//없는거달라고하면안돼 위에 rsRs초기화할때 와일드카드랑 비교 
//					System.out.println(" "+rsRs.getString(5));//컬럼아이디5번인 hiredate조회되어 가져옴
				}//while끝
				
			}//if끝
			
		}catch(SQLException e){
			System.out.println("DB연결 또는 퀴리 등에서 문제가 발생 >>> : "+e);
		}	//catch끝
		
	}//selectEmp()함수 끝
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest OT = new OracleTest();
		OT.selectEmp();
		
	} //메인함수끝

}//OracleTest클래스끝
