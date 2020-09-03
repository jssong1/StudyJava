package bitcamp.java142.ch5.eci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.eci.sql.EciSqlQueryMap2;
import bitcamp.java142.ch5.eci.vo.EciVO2;

import bitcamp.java142.common.ChaeBunClass2;
import bitcamp.java142.common.ConnProperty;

public class EciDAOImpl2 implements EciDAO2 {

	
	//인서트->메모리 /롤백->메모리에있는거지워져
	//커밋->파일로넘어가
	
	@Override
	public boolean insertEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- 입력건수 nCnt초기화 //count로 리턴해
		
		System.out.println("-------------------------------A-----EciDAOImpl.insertEci 함수 START>>>>>");
		//로직 구현
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>insertEci_con연결된 주소값 >>> : " + con);
			
			System.out.println("----2.5>con.getAutoCommit() >>> : " + con.getAutoCommit());
			con.setAutoCommit(false);//-------?
			
			
			pstmt = con.prepareStatement(EciSqlQueryMap2.getInsertQuery());
			System.out.println("--3>insertEci_EciSqlQueryMap2.getInsertQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getInsertQuery());
			System.out.println("--4>insertEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
			
//			pstmt.setString(1, _evo.getEnumm());
			pstmt.setString(1, ChaeBunClass2.ymdNum());//getEnumm 대신에 ChaeBunClass에서 자동으로 인덱스배정
			
			pstmt.setString(2, _evo.getEname());
			pstmt.setString(3, _evo.getEage());
			pstmt.setString(4, _evo.getEhp());
			pstmt.setString(5, _evo.getEaddr());
			pstmt.setString(6, "Y");
			nCnt = pstmt.executeUpdate();//select조회랑 차이점 ResultSet=>rsRs=pstmt.executeQuery();
			
			
			//데이터가 있으면 일하기; 단, ConnectionPool을 사용할 때는 사용하지 않는다.
			boolean b = !con.getAutoCommit();
			System.out.println("b >>> : " + b);
			if(!con.getAutoCommit()) con.commit(); // db commit!!!! 밀어넣기)
			System.out.println("--5>insertEci_nCnt잘 들어갔는가 몇 건? >>>> " + nCnt);
			
			ConnProperty.conClose(con,pstmt);
							
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt);
		}// try-catch-finally끝
		
		System.out.println("-------------------------------A-----EciDAOImpl.insertEci 함수 END>>>>>");
		if (nCnt == 0) return false;
		return true;
	}//insertEci(EciVO _evo)끝

	@Override
	public boolean updateEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- 입력건수 nCnt초기화 //count로 리턴해
		
		System.out.println("-------------------------------B-----EciDAOImpl.updateEci 함수 START>>>>>");
		
		//로직 구현
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>updateEci_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getUpdateQuery());
			System.out.println("--3>updateEci_EciSqlQueryMap2.getUpdateQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getUpdateQuery());
			System.out.println("--4>updateEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEaddr());
			pstmt.setString(2, _evo.getEnumm());
			nCnt = pstmt.executeUpdate();
			System.out.println("플레이스홀더에 바인딩할 매개변수깡통 데이터 >>>> 1번 :" + _evo.getEaddr() +" 2번 : " + _evo.getEnumm());
			
			// 단. ConnectionPool을 사용할 때는 사용하지 않는다. 	
			boolean b = !con.getAutoCommit();//------?
			System.out.println("b >>> : " + b);
			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! 밀어넣기
            System.out.println("--5>updateEci_nCnt update 잘 되었음/몇 건? >>>> " + nCnt);
			
            ConnProperty.conClose(con,pstmt);
			
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt);
		}//try-catch-finally끝
		
		System.out.println("-------------------------------B-----EciDAOImpl.updateEci 함수 END>>>>>");
		if (nCnt == 0) return false;
		return true;
	}//updateEci(EciVO _evo)끝

	@Override
	public boolean deleteEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- 입력건수 nCnt초기화 //count로 리턴해
		
		System.out.println("-------------------------------C-----EciDAOImpl2.deleteEci 함수 START>>>>>");
		
		//로직구현 
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>deleteEci_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getDeleteQuery());
			System.out.println("--3>deleteEci_EciSqlQueryMap2.getDeleteQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getDeleteQuery());
			System.out.println("--4>deleteEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEnumm());
			nCnt = pstmt.executeUpdate();
			
			//데이터가 있으면 일하기; 단, ConnectionPool을 사용할 때는 사용하지 않는다.
			boolean b = !con.getAutoCommit();//------?
			System.out.println("b >>> : " + b);
			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! 밀어넣기
            System.out.println("--5>deleteEci_nCnt Delete 잘 되었음/몇 건? >>>> " + nCnt);
			
            ConnProperty.conClose(con,pstmt);
			
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt); 	
		}//try-catch-finally끝
		
		System.out.println("-------------------------------C-----EciDAOImpl2.deleteEci 함수 END>>>>>");
		if (nCnt == 0) return false;
		return true;
		
	}//deleteEci(EciVO _evo)끝

//	@Override
//	public boolean updateChaeBun(EciVO2 _evo) {
//		// TODO Auto-generated method stub
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		int nCnt=0;	//insert count- 입력건수 nCnt초기화 //count로 리턴해
//		
//		System.out.println("-------------------------------UC-----EciDAOImpl.updateChaebun 함수 START>>>>>");
//		
//		//로직 구현
//		try{
//			con = ConnProperty.getConnection();
//			System.out.println("--2>updateEci_con연결된 주소값 >>> : " + con);
//			pstmt = con.prepareStatement(EciSqlQueryMap2.getUpdateQuery2());
//			System.out.println("--3>updateEci_EciSqlQueryMap2.getUpdateQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getUpdateQuery2());
//			System.out.println("--4>updateEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
//			
//			pstmt.setString(2, _evo.getEnumm());
//			nCnt = pstmt.executeUpdate();
//			System.out.println("플레이스홀더에 바인딩할 매개변수깡통 데이터 >>>> 1번 :" + _evo.getEaddr() +" 2번 : " + _evo.getEnumm());
//			
//			// 단. ConnectionPool을 사용할 때는 사용하지 않는다. 	
//			boolean b = !con.getAutoCommit();//------?
//			System.out.println("b >>> : " + b);
//			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! 밀어넣기
//            System.out.println("--5>updateEci_nCnt update 잘 되었음/몇 건? >>>> " + nCnt);
//			
//            ConnProperty.conClose(con,pstmt);
//			
//		}catch(Exception e){
//			System.out.println("에러가 >>> : " + e.getMessage());
//		}finally{
//			ConnProperty.conClose(con, pstmt);
//		}//try-catch-finally끝
//		
//		System.out.println("-------------------------------UC-----EciDAOImpl.updateChaebun 함수 END>>>>>");
//		if (nCnt == 0) return false;
//		return true;
//	}

	@Override
	public ArrayList<EciVO2> selectEci() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------D-----EciDAOImpl2.selectEci 함수 START>>>>>");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO2> aList = null;
		EciVO2 evo = null;
				
		//로직 구현
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>selectEci_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getSelectQuery());
			System.out.println("--3>selectEci_EciSqlQueryMap.getSelectQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getSelectQuery());
			System.out.println("--4>selectEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
			rsRs = pstmt.executeQuery();
			System.out.println("--5>selctEmp_rsRs실행된 주소값 >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO2>();
				while(rsRs.next()){
					evo = new EciVO2();
					evo.setEnumm(rsRs.getString("ENUM"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setEage(rsRs.getString("EAGE"));
					evo.setEhp(rsRs.getString("EHP"));
					evo.setEaddr(rsRs.getString(5));
					evo.setEdeleteYN(rsRs.getString(6));
					evo.setEinsertdate(rsRs.getString(7));
					evo.setEupdatedate(rsRs.getString(8));
					aList.add(evo);
					System.out.println("{log) while돌면서 aList에 add되는 주소값들 >>> : " + aList);
				}
				System.out.println("(log) 배열리스트 aList 묶음의 개수 >>>"+aList.size());
			}else{
				System.out.println("데이터가 없는 이유를~~ ?");
			}//if-else 끝
			ConnProperty.conClose(con, pstmt, rsRs);		
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt, rsRs);
		}//try-catch-finally끝
		
		System.out.println("-------------------------------D-----EciDAOImpl2.selectEci 함수 END>>>>>");
		return aList;
	}//selectEci()끝

	@Override
	public ArrayList<EciVO2> searchEci(EciVO2 _can0) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------E-----EciDAOImpl2.searchEci 함수 START>>>>>");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO2> aList = null;
		EciVO2 evo = null;
		
		//로직구현
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>searchEci_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getSearchQuery());
			System.out.println("--3>searchEci_EciSqlQueryMap.getSearchQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getSearchQuery());
			System.out.println("--4>searchEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
			
			
			//매개변수 셋팅 (실행을 위한 바인딩 필요)
			//쿼리문에 있는 물음표(?:플레이스홀더)갯수가2개니까 바인딩넘버링 순차대로 셋팅
			System.out.println("플레이스홀더에 바인딩할 매개변수깡통 데이터 >>>> :" +_can0.getEnumm());
			pstmt.setString(1, _can0.getEnumm());
			
			rsRs = pstmt.executeQuery();
			System.out.println("--5>searchEmp_rsRs실행된 주소값 >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO2>();
				while(rsRs.next()){
					evo = new EciVO2();
					evo.setEnumm(rsRs.getString("ENUM"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setEage(rsRs.getString("EAGE"));
					evo.setEhp(rsRs.getString("EHP"));
					evo.setEaddr(rsRs.getString(5));
					evo.setEdeleteYN(rsRs.getString(6));
					evo.setEinsertdate(rsRs.getString(7));
					evo.setEupdatedate(rsRs.getString(8));
					aList.add(evo);
					System.out.println("{log) while돌면서 aList에 add되는 주소값들 >>> : " + aList);
				}
				System.out.println("(log) 배열리스트 aList 묶음의 개수 >>>"+aList.size());
			}else{
				System.out.println("데이터가 없는 이유를~~ ?");
			}//if-else 끝
			ConnProperty.conClose(con, pstmt, rsRs);			
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt, rsRs);
		}//try-catch-finally끝
		
		System.out.println("-------------------------------E-----EciDAOImpl2.searchEci 함수 END>>>>>");
		return aList;
	}//searchEci(EciVO _can0)끝

	@Override
	public ArrayList<EciVO2> likeSearchEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------F-----EciDAOImpl2.likesearchEci 함수 START>>>>>");

		System.out.println("_evo.getEname() >>> : " + _evo.getEname());
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO2> aList = null;
		EciVO2 evo = null;
		
		
		//로직구현
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>likeSearchEci_con연결된 주소값 >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getLikeSearchQuery());
			System.out.println("--3>likeSearchEci_EciSqlQueryMap2.getLikeSearchQuery()로그 찍어보기>>> :"+ EciSqlQueryMap2.getLikeSearchQuery());
			System.out.println("--4>likeSearchEci_pstmt쿼리돌았지, pstmt 주소값 >>> : " + pstmt);
			
			
			//매개변수 셋팅 (실행을 위한 바인딩 필요)
			//쿼리문에 있는 물음표(?:플레이스홀더)갯수가2개니까 바인딩넘버링 순차대로 셋팅
			System.out.println("플레이스홀더에 바인딩할 매개변수깡통 데이터 >>>> :" +_evo.getEname());
			pstmt.setString(1, _evo.getEname());
			
			rsRs = pstmt.executeQuery();
			System.out.println("--5>likeSearchEmp_rsRs실행된 주소값 >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO2>();
				while(rsRs.next()){
					evo = new EciVO2();
					evo.setEnumm(rsRs.getString("ENUM"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setEage(rsRs.getString("EAGE"));
					evo.setEhp(rsRs.getString("EHP"));
					evo.setEaddr(rsRs.getString(5));
					evo.setEdeleteYN(rsRs.getString(6));
					evo.setEinsertdate(rsRs.getString(7));
					evo.setEupdatedate(rsRs.getString(8));
					aList.add(evo);
					System.out.println("{log) while돌면서 aList에 add되는 주소값들 >>> : " + aList);
				}
				System.out.println("(log) 배열리스트 aList 묶음의 개수 >>>"+aList.size());
			}else{
				System.out.println("데이터가 없는 이유를~~ ?");
			}//if-else 끝
			ConnProperty.conClose(con, pstmt, rsRs);			
		}catch(Exception e){
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt, rsRs);
		}//try-catch-finally끝
		
		System.out.println("-------------------------------F-----EciDAOImpl2.likesearchEci 함수 END>>>>>");
		return aList;
	}//likesearchEci(EciVO _evo)끝



}
