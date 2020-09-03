package bitcamp.java142.ch5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.sql.EmpSqlQueryMap;
import bitcamp.java142.ch5.vo.EmpVO;
import bitcamp.java142.common.ConnProperty;

public class EmpDAOImpl4_0 implements EmpDAO4_0 {

	
	// 전체조회 
	@Override
	public ArrayList selectEmp() {
		// TODO Auto-generated method stub

		// EmpDAOlmpl.selectEmp() Start
		System.out.println("EmpDAOlmpl.selectEmp() Start >>>");

		// 지역변수를 선언 한다.
		// 필요한 객체를  null 초기화 한다.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		EmpVO evo = null;

		// 로직 구현 
		// try catch
		try {
			
			// Connection 구하기 
			// session 하는 만들었다.(thread)
			// getConnection() 으로 연결
			con = ConnProperty.getConnection();
			System.out.println("con >>> " + con);

			// 데이터베이스에 전달한 sql 질의문 세팅하기 
			pstmt = con.prepareStatement(EmpSqlQueryMap.getSelectQuery());
			System.out.println("pstmt >>> " + pstmt);

			// 쿼리 확인
			System.out.println("SELECT >>> " + EmpSqlQueryMap.getSelectQuery());

			// executeQuery() 사용해서 다음 결과 리턴 (DB까지 갔다옴)
			// pstmt.execyteQuery()함수 시작으로 sql 질의문을 전달하기 시작 
			// sql 질의문이 DataBase 전달 되고 
			// 데이터베이스에서 sql 질의문을 수행해서 결과를 만들면 
			// 다시 ResultSet 인터페이스에 전달하고 이것을 rsRs 참조변수로 참조한다
			rsRs = pstmt.executeQuery();
			System.out.println("rsRs >>> " + rsRs);

			// 데이터가 있으며 일을 해야 한다.
			if (rsRs != null) {
				
				aList = new ArrayList();
				
				while (rsRs.next()) {
					// 변수 선언
					evo = new EmpVO();
					// set으로 리턴
					evo.setEmpno(rsRs.getInt("EMPNO"));
					evo.setEname(rsRs.getString("ENAME"));
//					evo = new EmpVO( rsRs.getInt("EMPNO")
//			        ,rsRs.getString("ENAME"));
//					evo.setEmpno(rsRs.getInt(1));
//					evo.setEname(rsRs.getString(2));
					
					// aList에 담기
					// aList 참조변수에 add 함수를 이용해서 
					// evo 참조변수를 담는다. 
					aList.add(evo);
//					System.out.println("aList.size() >>> : " + aList.size());
					System.out.println("aList >>> : " + aList);
				}//while끝
				System.out.println("aList.size() >>> : " + aList.size());
			}else{
				System.out.println("데이터가 없는 이유를 ~~~ ");
			}
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null;
			
		} catch (Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			try{
				if (rsRs !=null) try {rsRs.close(); rsRs = null;} catch(Exception ex){}
				if (pstmt !=null) try {pstmt.close(); pstmt = null;} catch(Exception ex){}
				if (con !=null) try {rsRs.close(); con = null;} catch(Exception ex){}
			}catch(Exception e2){
				System.out.println("에러가 >>> : " + e2.getMessage());
			}
		}
		// EmpDAOlmpl.selectEmp() End
		System.out.println("EmpDAOlmpl.selectEmp() End >>>");

		// return 받는 값 = aList
		return aList;
	}// end of EmpDAOImpl.selectEmp()

	@Override
	public ArrayList searchEmp(EmpVO evo_1) {
		// TODO Auto-generated method stub
		// EmpDAOlmpl.searchEmp(EmpVO evo_1) Start
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) Start >>>");
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) Start >>>" + evo_1.getEmpno());
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) Start >>>" + evo_1.getEname());
		
		// evo_1.getEmpno(), evo_1.getEname() Validation 을 해야 한다. 
		int empno = evo_1.getEmpno();
		String ename = evo_1.getEname();
		
		// 데이터 유무 확인
//		boolean bool = evo_1 != null;
//		System.out.println("bool >>> " + bool);

		// connection 세션 마다 따로따로, 연결정보는 같이사용
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		EmpVO evo = null;
		if (evo_1 != null) {
			// EmpDAOlmpl.searchEmp(EmpVO evo_1) if절 진입
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) if절 진입");
			try {
				// 연결
				con = ConnProperty.getConnection();
				System.out.println("con >>> " + con);

				// 쿼리 가져오기
				pstmt = con.prepareStatement(EmpSqlQueryMap.getSearchQuery());
				System.out.println("pstmt >>> " + pstmt);

				// 쿼리 확인
				System.out.println("SELECT >>> " + EmpSqlQueryMap.getSearchQuery());

				// setting
				pstmt.setInt(1, empno);
				pstmt.setString(2, ename);

				// 결과값
				rsRs = pstmt.executeQuery();
				System.out.println("rsRs >>> " + rsRs);

				if (rsRs != null) {
					// new 연산자 사용해서 ArrayList 인스턴스
					aList = new ArrayList();
					// true일때 돌아가는 while문
					while (rsRs.next()) {
						// new 연산자 사용해서 ValueObject 인스턴스
						evo = new EmpVO();
						// set,get 으로 값 리턴받기, get 다음에는 데이터타입
						evo.setEmpno(rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString("ENAME"));
						// aList에 데이터들 담기
						aList.add(evo);
					}
				}

			} catch (Exception e) {
				System.out.println("DB연결 또는 Query 등에서 문제가 발생 >>> " + e);
			}

			// EmpDAOlmpl.searchEmp(EmpVO evo_1) if절 끝
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) if절 끝");
		} else {
			// EmpDAOlmpl.searchEmp(EmpVO evo_1) else절 진입
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) else절 진입");

			System.out.println("Error");

			// EmpDAOlmpl.searchEmp(EmpVO evo_1) else절 끝
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) else절 끝");
		}
		// EmpDAOlmpl.searchEmp(EmpVO evo_1) End
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) End >>>");
		return aList;

	}// end of EmpDAOImpl.searchEmp()

	@Override
	public ArrayList likeSearchEmp(EmpVO evo_1) {
		// TODO Auto-generated method stub
		// OracleTest_4.likeSearchEmp(EmpVO evo_1) Start
		System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) Start >>>");		
		System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) Start >>>" + evo_1.getEname());
		
		// evo_1.getEmpno(), evo_1.getEname() Validation 을 해야 한다. 
		int empno = evo_1.getEmpno();
		String ename = evo_1.getEname();

/*		// 데이터 유무 확인
		boolean bool = evo_1 != null;
		System.out.println("bool >>> " + bool);*/

		// connection 세션 마다 따로따로, 연결정보는 같이사용
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		EmpVO evo = null;

		if (evo_1 != null) {
			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if절 진입
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if절 진입");
			try {
				// 연결
				con = ConnProperty.getConnection();
				System.out.println("con >>> " + con);
				// 쿼리 가져오기
				pstmt = con.prepareStatement(EmpSqlQueryMap.getLikeSearchQuery());
				System.out.println("pstmt >>> " + pstmt);
				// 쿼리 확인
				System.out.println("SELECT >>> \n" + EmpSqlQueryMap.getLikeSearchQuery());
				// setting
				pstmt.setString(1, evo_1.getEname());

				// 결과값
				rsRs = pstmt.executeQuery();
				System.out.println("rsRs >>> " + rsRs);

				if (rsRs != null) {
					// aList 인스턴스
					aList = new ArrayList();
					while (rsRs.next()) {
						// ValueObject 인스턴스
						evo = new EmpVO();
						// set,get 이용해서 받아오기
						evo.setEmpno(rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString("ENAME"));
						// aList에 담기
						aList.add(evo);
					}
				}

			} catch (Exception e) {
				System.out.println("DB연결 또는 Query 등에서 문제가 발생 >>> " + e);
			}
			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if절 끝
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if절 끝");
		} else {
			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else절 진입
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else절 진입");

			System.out.println("Error");

			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else절 진입
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else절 진입");
		}
		
		// OracleTest_4.likeSearchEmp(EmpVO evo_1) End
		System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) End >>>");
		return aList;
	}// end of OracleTest_4.likeSearchEmp(EmpVO evo_1)

}// end of EmpDAOOImpl class