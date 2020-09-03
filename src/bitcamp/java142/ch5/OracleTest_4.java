package bitcamp.java142.ch5;

import java.util.ArrayList;

import bitcamp.java142.ch5.dao.EmpDAO;
import bitcamp.java142.ch5.dao.EmpDAOImpl;
import bitcamp.java142.ch5.vo.EmpVO;

public class OracleTest_4 {
	
	//**배열하는 통 arraylist타입은 데이터타입관계없이 (element object) //동일한데이터타입아니라도 다들어감
	
	//전체조회
	public ArrayList selectEmp(){//ArrayList는 리턴타입인 사용자정의 selectEmp()함수 시작
		System.out.println("-----------------------------------------------------A번 OracleTest_4---selectEmp()함수시작");
		EmpDAO edao = new EmpDAOImpl(); //부모인터페이스클래스 EmpDAO를 변수명 edao를 사용하여 자식클래스 EmpDAOImpl()를 인스턴스한다. 
		ArrayList aList = edao.selectEmp();//배열통 ArrayList에 변수명 aList을 사용하여 인스턴스한 edao에있는 selectEmp()함수를 호출한다.
		System.out.println("edao.selectEmp()에서 리턴된 aList>>>>>: "+aList);
		System.out.println("------------------------------------------------------A번 OracleTest_4---selectEmp()함수끝");
		
		return aList; //인터페이스를 거쳐받은 결과값 aList를 메인에 리턴값으로 가져간다 
	}//OracleTest_4; selectEmp()함수끝
	
	//키워드 조회
	public ArrayList searchEmp(int iVal, String sVal){ //데이터타입맞추기
		System.out.println("-----------------------------------------------------B번 OracleTest_4---searchEmp()함수시작");
		System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) 매개변수 iVal 받음  >>> 확인 : " + iVal);
		System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) 매개변수 sVal 받음  >>> 확인 : " + sVal);
		EmpDAO edao = new EmpDAOImpl(); //부모선언 자식인스턴스
		
		//매개변수있으니까 매개변수가 낱개로 다니지 않게 깡통VO에 담는과정필요  
		//깡통에 담아서 edao로 넘기기 
		EmpVO can0 = null;// 매개변수가 낱개로 다니지 않게 import한 깡통EmpVO클래스를 can0변수명으로 초기화 
		can0 = new EmpVO();// 매개변수깡통쓰기위해 인스턴스 
		can0.setEmpno(iVal);//import&인스턴스한 EmpVO에서 함수setEmpno()깡통에 바인딩한 매개변수 7369 set담기   //여기서 데이터타입맞춰진건가
		can0.setEname(sVal);//ename깡통에 바인딩한 매개변수 SMITH set담기
		System.out.println("EmpVO.empno()깡통에 7369 담았음 확인 >>>>>: "+can0.getEmpno());
		System.out.println("EmpVO.ename()깡통에 SMITH 담았음 확인>>>>>: "+can0.getEname());
		
		ArrayList aList = edao.searchEmp(can0);//배열통 ArrayList에 변수명 aList를 사용하여; 호출된 edao에있는 searchEmp()함수에 매개변수깡통 can0를 바인딩 ;searchEmp()함수의리턴형은  ArrayList
		System.out.println("edao.searchEmp()에서 리턴된 aList>>>>>: "+aList);
		System.out.println("-----------------------------------------------------B번 OracleTest_4---searchEmp()함수끝");
		
		return aList;//인터페이스를 거쳐받은 결과값 aList를 메인에 리턴값으로 가져간다 
	}
	
	public ArrayList likeSearchEmp(String sVal){
		System.out.println("-----------------------------------------------------C번 OracleTest_4---likesearchEmp()함수시작");
		System.out.println("OracleTest_4.likesearchEmp(String sVal) 매개변수 sVal 받음  >>> 확인 : " + sVal);
		EmpDAO edao = new EmpDAOImpl(); //부모선언 자식인스턴스
		//생성자이용해보기
		EmpVO can1 = null;// 매개변수가 낱개로 다니지 않게 import한 깡통EmpVO클래스를 can1변수명으로 초기화
		can1 = new EmpVO(sVal);//EmpVO.java에 데이터타입맞는 생성자 따로 만들어서 올려둬야함
		ArrayList aList = edao.likeSearchEmp(can1);//배열통 ArrayList에 변수명 aList를 사용하여; 호출된 (edao위치한) likeSearchEmp()함수에 매개변수깡통 can1를 바인딩 ;likeSearchEmp()함수의리턴형은  ArrayList
		System.out.println(">>>>>: "+aList);
		System.out.println("-----------------------------------------------------C번 OracleTest_4---likesearchEmp()함수끝");
		
		return aList;//인터페이스를 거쳐받은 결과값 aList를 메인에 리턴값으로 가져간다 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_4 ot4 = new OracleTest_4();// OracleTest_4 클래스 ot4 참조변수로 인스턴스(객체화, 메모리에 올림)
		

//		if equals로 부분조회하면 각각 블럭마다 클래스인스턴스필요
		
		//1번 전체조회 selectEmp
		System.out.println("★★★★★★★★★★★★★★★★★ 1번 ot4.selectEmp()함수로 데이터베이스 조회 및 출력 과정 시작★★★★★★★★★★★★★★★★★ ");
		ArrayList aList0 = ot4.selectEmp();//ArrayList클래스 데이터 타입의 참조변수로; 변수명 aList0를선언하여; ot4클래스에있는 함수 selectEmp()의 리턴값을 바인딩한다//참조변수니까 클래스명ArrayList써(일반변수면데이터타입int적지)
		System.out.println("DAOImp에서 데이터 추가되어 리턴받은 배열통 aList0안 묶음보기" + aList0);//14개의 주소값 나옴 
		System.out.println("배열리스트 aList0 묶음의 개수 >>> : " + aList0.size());
		for(int i=0; i < aList0.size(); i++){//aList.size());// 배열리스트묶음의 개수(길이) //14번돌아가 0~13
			EmpVO evo0 = (EmpVO)aList0.get(i);
			System.out.print("A>aList"+i+">>> : " + evo0.getEmpno());
			System.out.println(" " + evo0.getEname());			
		}//for끝
		System.out.println("★★★★★★★★★★★★★★★★★ 1번 ot4.selectEmp()함수로 조회한 데이터베이스 출력완료★★★★★★★★★★★★★★★★★ ");
		
		System.out.println(" ");
		System.out.println("");
		System.out.println(" ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆ 2번 ot4.searchEmp()함수로 데이터베이스 조회 및 출력 과정 시작☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆ ");
		
		//2번 키워드검색 searchEmp
		ArrayList aList1 = ot4.searchEmp(7369,"SMITH"); //매개변수가 있는 경우
		System.out.println("DAOImp에서 데이터 추가되어 리턴받은 배열통 aList1안 묶음보기" + aList1); //1묶음있음
		System.out.println("배열리스트 aList1 묶음의 개수 >>> : " + aList1.size()); //갯수1개
		for(int i =0; i< aList1.size();i++){ //aList.size()); 배열리스트묶음의 개수(길이) //aList의 size함수로 길이구하기 (static없음; 리턴값int;매개변수()없음) 
			EmpVO evo1 = (EmpVO)aList1.get(i); //ArrayList클래스의 get함수를 이용하여 첨자(i)번째의 데이터를 출력하기// 첨자가 0부터 배열의 길이값까지 1씩증가하며 반복수행
			System.out.print("B>aList"+i+">>> : " + evo1.getEmpno());
			System.out.println(" " + evo1.getEname());	
		}//for문 끝
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆ 2번 ot4.searchEmp()함수로 조회한 데이터베이스 출력완료☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆ ");
		
		
		System.out.println(" ");
		System.out.println("");
		System.out.println(" ");
		System.out.println("★★★★★★★★★★★★★★★★★ 3번 ot4.likesearchEmp()함수로 데이터베이스 조회 및 출력 과정 시작★★★★★★★★★★★★★★★★★ ");
		
		//C번 like 검색
		ArrayList aList2 = ot4.likeSearchEmp("S");
		System.out.println("DAOImp에서 데이터 추가되어 리턴받은 배열통 aList2안 묶음보기" + aList2); //묶음있음
		System.out.println("배열리스트 aList2 묶음의 개수 >>> : " + aList2.size()); //갯수
		for(int i =0; i< aList2.size();i++){ //aList.size()); 배열리스트묶음의 개수(길이) //aList의 size함수로 길이구하기 (static없음; 리턴값int;매개변수()없음) 
			EmpVO evo2 = (EmpVO)aList2.get(i); //ArrayList클래스의 get함수를 이용하여 첨자(i)번째의 데이터를 출력하기// 첨자가 0부터 배열의 길이값까지 1씩증가하며 반복수행
			System.out.print("C>aList"+i+">>> : " + evo2.getEmpno());
			System.out.println(" " + evo2.getEname());	
		}//for문 끝
		System.out.println("★★★★★★★★★★★★★★★★★ 3번 ot4.likesearchEmp()함수로 데이터베이스 출력완료★★★★★★★★★★★★★★★★★ ");
		
		
	}//메인함수끝

}//OracleTest_4 클래스 끝
