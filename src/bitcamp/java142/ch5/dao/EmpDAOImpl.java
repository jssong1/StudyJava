package bitcamp.java142.ch5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.sql.EmpSqlQueryMap;
import bitcamp.java142.ch5.vo.EmpVO;
import bitcamp.java142.common.ConnProperty;

public class EmpDAOImpl implements EmpDAO {

	@Override
	public ArrayList selectEmp() {
		// TODO Auto-generated method stub
		System.out.println("A>오버라이딩 EmpDAOImpl.selectEmp()추상함수 시작 ------------------------------------------");
		Connection con = null; 			//연결을 위해 연결통로Connection초기화
		PreparedStatement pstmt = null;	//쿼리를 읽기위해 PreparedStatement 초기화
		ResultSet rsRs = null;			//쿼리실행위한 ResultSet초기화
		EmpVO evo = null; 				//실행한 데이터 담을 깡통(ValueObject) 초기화
		ArrayList aList = null;			//실행한 데이터를 깡통에담고 그 깡통을 추가할 배열통 ArrayList 초기화
		 
		
		try{
				
			//Connection 구하기 
			//session(연결하는행위) 만들었다 (= thread가 연결됐다)
			con = ConnProperty.getConnection();//연결
			System.out.println("--2>selctEmp_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EmpSqlQueryMap.getSelectQuery());//쿼리 불러와(EmpSqlQueryMap.getSelectQuery()쿼리돌아감)//왜 2번찍히지??로그찍을때한번더돌아감
			System.out.println("--3>selctEmp_SELECT로그 찍어보기>>> : " + EmpSqlQueryMap.getSelectQuery());//로그찍어보기//조회 두개만했네(쿼리문자체가2개) 함수시작하고 출력이되네...?
			System.out.println("--4>selctEmp_pstmt쿼리돌았지 >>> : " + pstmt);
			
			//매개변수가 없으니까 실행을 위한 바인딩셋팅(get)이 생략됨
			rsRs=pstmt.executeQuery(); //쿼리 실행 (DB까지 갔다옴)
			System.out.println("--5>selctEmp_rsRs실행된 주소값 >>> : " + rsRs);
			
				if(rsRs != null){  //만약 쿼리실행한 데이터가 null이아니라면  
					aList = new ArrayList(); //???왜 인스턴스하징 import한 ArrayList클래스를 쓰려고 메모리올리는건가?  ->ㅇㅇ if로걸러들어온 데이터있을때 쓰겠다!!
					while (rsRs.next()){// 1건이라도 규칙 단일화를 위해 while루프 돌림 //while조건이 true일때 실행됨//조건- next()함수(커서함수): 데이터있어?있으면true 없으면false; 단방향으로만돈다
//						evo = new EmpVO(); //실제 데이터담을 깡통EmpVo를 변수명 evo에 인스턴스   
//						evo.setEmpno(rsRs.getInt("EMPNO")); //깡통에 담기  //쿼리실행후 조회된 컬럼 EMPNO을get해서 evo깡통에set
//						evo.setEname(rsRs.getString(2));//쿼리실행후 조회된 2번컬럼 문자열들을 get해서 evo깡통의 ename(컬럼인덱스2번)에 담기
						evo = new EmpVO(rsRs.getInt("EMPNO"), rsRs.getString(2));//생성자이용해서 인스턴스; 단, EmpVO.java에 생성자추가;
						
						aList.add(evo); //컬럼 2개만 조회했음; 데이터 담은 evo깡통을 배열통 aList참조변수에 add()함수이용해서 추가하기 (로우단위로)
						System.out.println("while돌면서 aList에 add되는 주소값들 >>> : " + aList);
					}//while끝
				}//if끝
				
			//계속돌아가지않게 문닫아주기. 모르는것처럼 null 초기화까지 ㄱㄱ	
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null; //에러났을때는 열려있을테니까 finally로 잡아주기
			
		}catch(Exception e){
			System.out.println("A>DB연결 또는 쿼리 등에서 문제가 발생 >>> : " + e);
		}//try-catch끝		
		System.out.println("A>오버라이딩 EmpDAOImpl.selectEmp()추상함수 끝 ------------------------------------------");
		return aList; //데이터 추가한 배열통 aList리턴
	}//ArrayList selectEmp() 오버라이딩끝

	@Override
	public ArrayList searchEmp(EmpVO canEvo ) {//OracleTest_4---searchEmp()에서 매개변수 받았으니까 데이터유무확인해서 있을때만 돌게하기
		// TODO Auto-generated method stub
		System.out.println("B>오버라이딩 EmpDAOImpl.searchEmp(EmpVO canEvo)추상함수 시작 ------------------------------------------");
		Connection con = null; 			//연결을 위해 연결통로Connection초기화
		PreparedStatement pstmt = null;	//쿼리를 읽기위해 PreparedStatement 초기화
		ResultSet rsRs = null;			//쿼리실행위한 ResultSet초기화
		EmpVO evo = null; 				//실행한 데이터 담을 깡통(ValueObject) 초기화
		ArrayList aList = null;			//실행한 데이터를 깡통에담고 그 깡통을 추가할 배열통 ArrayList 초기화
		
		try{
			con = ConnProperty.getConnection();//연결
			System.out.println("--2>searchEmp_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EmpSqlQueryMap.getSearchQuery());//쿼리 불러와
			System.out.println("--3>searchEmp_SELECT로그 찍어보기>>> : " + EmpSqlQueryMap.getSearchQuery());//로그찍어보기
			System.out.println("--4>searchEmp_pstmt쿼리돌았지 >>> : " + pstmt);
			
			//매개변수 셋팅 (실행을 위한 바인딩 필요)
			//쿼리문에 있는 물음표(?:플레이스홀더)갯수가2개니까 바인딩넘버링 순차대로 셋팅
			System.out.println("플레이스홀더에 바인딩할 매개변수깡통 데이터 >>>> :" + "1번 : " + canEvo.getEmpno()+  " / 2번 : "+canEvo.getEname());
			pstmt.setInt(1, canEvo.getEmpno());//pstmt.setString(parameterIndex, x);
			pstmt.setString(2, canEvo.getEname());
			
			rsRs=pstmt.executeQuery(); //쿼리 실행 (DB까지 갔다옴)
			System.out.println("--5>searchEmp_rsRs실행된 주소값 >>> : " + rsRs);
			
				if(rsRs !=null){
					aList = new ArrayList(); //배열통 인스턴스
					while(rsRs.next()){
						evo = new EmpVO();// 1건이라도 규칙 단일화를 위해 while루프 돌림
						evo.setEmpno(rsRs.getInt("EMPNO"));
						System.out.println("오잉 " + rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString(2));
						aList.add(evo); //데이터 담은 깡통을 배열통 aList에 추가하기
						System.out.println("while돌면서 aList에 add되는 주소값들 >>> : " + aList);
					}//while끝
				}//if끝
				
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null; 
						
		}catch(Exception e){
			System.out.println("B>DB연결 또는 쿼리 등에서 문제가 발생 >>> : " + e);
		}//try-catch끝
		System.out.println("B>오버라이딩 EmpDAOImpl.searchEmp(EmpVO canEvo)추상함수 끝 ------------------------------------------");
		return aList;
	}//searchEmp()함수끝

	@Override
	public ArrayList likeSearchEmp(EmpVO canEvo) {
		// TODO Auto-generated method stub
		System.out.println("C>오버라이딩 EmpDAOImpl.likesearchEmp(EmpVO canEvo)추상함수 시작 ------------------------------------------");
		Connection con = null; 			//연결을 위해 연결통로Connection초기화
		PreparedStatement pstmt = null;	//쿼리를 읽기위해 PreparedStatement 초기화
		ResultSet rsRs = null;			//쿼리실행위한 ResultSet초기화
		EmpVO evo = null; 				//실행한 데이터 담을 깡통(ValueObject) 초기화
		ArrayList aList = null;			//실행한 데이터를 깡통에담고 그 깡통을 추가할 배열통 ArrayList 초기화
		
		try{		
			con = ConnProperty.getConnection();//연결
			System.out.println("--2>likesearchEmp_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EmpSqlQueryMap.getLikeSearchQuery());//쿼리 불러와
			System.out.println("--3>likesearchEmp_SELECT로그 찍어보기>>> : " + EmpSqlQueryMap.getLikeSearchQuery());//로그찍어보기
			System.out.println("--4>likesearchEmp_pstmt쿼리돌았지 >>> : " + pstmt);
			
			System.out.println("플레이스홀더에 바인딩할 매개변수깡통 데이터 >>>> :" + canEvo.getEname());
			pstmt.setString(1, canEvo.getEname());
//			pstmt.setString(2, canEvo.getEname());//????왜1이지 : 물음표(플레이스홀더)갯수가1개잖아
//			? (placeholder, 매개변수 바인딩 인자):preparestatement문에서 select할때 매개변수 담는 역할,넘버링함 where있는?가1번 ename2번
//			?, ? :  플레이스 홀더는 시퀀스규칙을 갖는다. 쿼리문에서 맨 먼저 기술되는?가 1번부터 시작함 나머지?들은 순차적으로 번호가 부여된다.
//			?에 바인딩하기 : psmt.setXXX(바인딩넘버링, 값); :set데이터타입에 따라 함수 사용 ex) DB의 NUMBER => setInt() ; DB의 VARCHAR2 => setString()함수 사용
			rsRs=pstmt.executeQuery(); //쿼리 실행 (DB까지 갔다옴)
			System.out.println("--5>likesearchEmp_rsRs실행된 주소값 >>> : " + rsRs);
			
				if(rsRs !=null){
					aList = new ArrayList(); //배열통 인스턴스
					while(rsRs.next()){
						evo = new EmpVO();// 1건이라도 규칙 단일화를 위해 while루프 돌림
						evo.setEmpno(rsRs.getInt("EMPNO"));
						System.out.println("조회된 " + rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString(2));
						aList.add(evo); //데이터 담은 깡통을 배열통 aList에 추가하기
						System.out.println("while돌면서 aList에 add되는 주소값들 >>> : " + aList);
					}//while끝
				}//if끝
			
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null; 
			
		}catch(Exception e){
			System.out.println("B>DB연결 또는 쿼리 등에서 문제가 발생 >>> : " + e);
		}//try-catch끝
		System.out.println("C>오버라이딩 EmpDAOImpl.likesearchEmp(EmpVO canEvo)추상함수 끝 ------------------------------------------");
		return aList;
	}


}
