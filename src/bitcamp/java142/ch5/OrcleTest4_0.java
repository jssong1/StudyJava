package bitcamp.java142.ch5;

import java.util.ArrayList;

import bitcamp.java142.ch5.dao.EmpDAO4_0;
import bitcamp.java142.ch5.dao.EmpDAOImpl4_0;
import bitcamp.java142.ch5.vo.EmpVO;

//----- 단위별로 순서대로 -----
	// 함수 껍데기, 메인 인서트 후 순서대로 작성 후 다시 돌아와서 세부내용 작성

	public class OrcleTest4_0 {

		// 2. 함수 껍데기 먼저 만들기 return type : 객체는 null | 문자는 "" | 숫자는 0 | 실수는 0.0 |
		// boolean은 false
		
		
		// 전체조회
		public ArrayList selectEmp() {
			// OracleTest_4.selectEmp() Start
			System.out.println("OracleTest_4.selectEmp() Start >>>");

			// 2-1 interface EmpDAO , 2-2 Implement EmpDAOImpl
			// EmpDAO 인터페이스 클래스를 edao 참조변수로 선언 
			// EmpDAO 인터페이스 클래스를 구현한(실현한, implimentaion) 한 
			// EmpDAOImpl() 클래스를 생성함(인스턴스함, 객체화, 메모리에 올림 etc.)
			EmpDAO4_0 edao = new EmpDAOImpl4_0();
			
			// working
			// edao 참조변수로 EmpDAO 인터페이스 클래스에 있는 
			// 추상함수 selectEmp() 를 호출(invoke) 하면
			// 실제로는 EmpDAO 인터페이스 클래스를 implemention 한 
			// EmpDAOImpl() 클래스의 selectEmp() 함수가 호출 된다.
			// selectEmp() 함수의 리턴형은 ArrayList 이다.
			ArrayList aList = edao.selectEmp();
			// OracleTest_4.selectEmp() End
			System.out.println("OracleTest_4.selectEmp() End >>>");

			// return 받을 값
			// edao.selectEmp() 함수에서 리턴한 
			// ArrayList 참조변수 aList를 리턴함 
			return aList;
		}// end of OracleTest_4.selectEmp()

		
		// 키워드 검색
		public ArrayList searchEmp(int iVal, String sVal) {
			// OracleTest_4.searchEmp(int iVal, String sVal) Start
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) Start >>>");
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) Start >>>" + iVal);
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) Start >>>" + sVal);

			EmpDAO4_0 edao = new EmpDAOImpl4_0();

			// ValueObject 초기화
			EmpVO evo = null;
			// EmpVO에 해당 매개변수 생성자 생성필요
			// 매개변수 2개
			evo = new EmpVO(iVal, sVal);

			// 매개 변수 2개 통에 담기
			// evo.setEmpno(iVal);
			// evo.setEname(sVal);

			// DAO에서 VO 사용 시 낱개로 들고 다니면 안되고, 무조건 통에 넣어야 한다.
			// 잘못된 예 : ArrayList aList = edao.searchEmp(iVal, sVal) XXXXXXXXXXXXX
			// 매개변수 2개 담은 통을 사용해서 aList에 넣기
			ArrayList aList = edao.searchEmp(evo);

			// OracleTest_4.searchEmp(int iVal, String sVal) End
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) End >>>");

			return aList;
		}// end of OracleTest_4.searchEmp(int iVal, String sVal)

		// like 검색 
		public ArrayList likeSearchEmp(String sVal) {

			// OracleTest_4.likeSearchEmp(String sVal) Start
			System.out.println("OracleTest_4.likeSearchEmp(String sVal) Start >>>");
			System.out.println("OracleTest_4.likeSearchEmp(int iVal, String sVal) Start >>>" + sVal);

			// 부모선언 자식인스턴스
			EmpDAO4_0 edao = new EmpDAOImpl4_0();

			// ValueObject 초기화
			EmpVO evo = null;

			// 매개변수 1개
			evo = new EmpVO(sVal);

			// 매개변수 1개 통에 담기
			// evo.setEname(sVal);

			// 매개변수 담은 통을 사용해서 aList에 넣기
			ArrayList aList = edao.likeSearchEmp(evo);

			// OracleTest_4.likeSearchEmp(String sVal) End
			System.out.println("OracleTest_4.likeSearchEmp(String sVal) End >>>");

			return aList;
		}// end of OracleTest_4.likiSearchEmp(String sVal)

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// OracleTest_4.main() Start
			System.out.println("OracleTest_4.main() Start >>>");

			// if절은 true일 때 도니까 변수랑 매치되야 돔 ( 블럭별로 돌리기)
			String sVal = "3";

			if (sVal.equals("1")) {

				System.out.println("OralceTest_4().main() 전체조회 시작 >>> ");

				// 지역변수 선언
				int empno = 0;
				String ename = "";

				// OralceTest_4 클래스 ot4 참조변수로 인스턴스(객체화, 메모리에 올림)
				// ot4 참조변수로 selectEmp() 함수 호출(invoke)
				// selectEmp() 함수 리턴형은 ArrayList 이다. 
				OrcleTest4_0 ot_4 = new OrcleTest4_0();
				
				// 3. Arraylist로 받아서 함수호출
				ArrayList aList_1 = ot_4.selectEmp();
				System.out.println("aList.size() >>> " + aList_1.size());
				System.out.println("main() aList >>> : " + aList_1);
				
				// 화면에 출력 
				int aList_1Size = aList_1.size();

				// ArrayList Casting 이용해서 데이터 하나씩 꺼내기
				if (aList_1 != null && 0 <= aList_1Size) {
					// int i=0으로 초기화, i는 aList_1 길이보다 작을 때, 하나씩 증가하라
					for (int i = 0; i < aList_1Size; i++) {
						// evo_1 = (데이터통)aList_1.get(i) <- 하나씩 꺼내기
						EmpVO evo_1 = (EmpVO) aList_1.get(i);
						empno = evo_1.getEmpno();
						ename = evo_1.getEname();
						// evo_1에 있는 Empno 가져오기
						System.out.print("aList_1 >>> " + empno);
						// evo_1에 있는 Ename 가져오기
						System.out.println(" " + ename);
					}
				} else {
					System.out.println("Error >>> ");
				}
				System.out.println("OralceTest_4().main() 전체조회 끝 >>> ");
			}

			
			// 키워드 검색
			if (sVal.equals("2")) {

				int empno = 0;
				String ename = "";

				OrcleTest4_0 ot_4 = new OrcleTest4_0();

				ArrayList aList_2 = ot_4.searchEmp(7782, "CLARK");
				int aList_2Size = aList_2.size();

				if (aList_2 != null && 0 <= aList_2Size) {
					// ArrayList Casting 이용해서 데이터 하나씩 꺼내기
					for (int i = 0; i < aList_2Size; i++) {
						EmpVO evo_2 = (EmpVO) aList_2.get(i);
						empno = evo_2.getEmpno();
						ename = evo_2.getEname();
						// evo_2에 있는 Empno 가져오기
						System.out.print("aList_2 >>> " + empno);
						// evo_2에 있는 Ename 가져오기
						System.out.println(" " + ename);
					}
				} else {
					System.out.println("Error >>> ");
				}

			}

			
			// like 검색 
			if (sVal.equals("3")) {

				int empno = 0;
				String ename = "";

				// 각각 세션별 인스턴스
				OrcleTest4_0 ot_4 = new OrcleTest4_0();
				ArrayList aList_3 = ot_4.likeSearchEmp("A");
				int aList_3Size = aList_3.size();

				if (aList_3 != null && 0 < aList_3Size) {
					// ArrayList Casting 이용해서 데이터 하나씩 꺼내기
					for (int i = 0; i < aList_3Size; i++) {
						// casting
						EmpVO evo_3 = (EmpVO) aList_3.get(i);
						empno = evo_3.getEmpno();
						ename = evo_3.getEname();
						// evo_3에 있는 Empno/Ename 리턴
						System.out.print("aList_3 >>> " + empno);
						System.out.println(" " + ename);
					}
				}

			}

			// OracleTest_4.main() End
			System.out.println("OracleTest_4.main() End >>>");

		} // end of OracleTest_4.main()

	}// end of OracleTest_4 class

