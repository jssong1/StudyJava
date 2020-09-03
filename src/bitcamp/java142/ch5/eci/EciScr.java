package bitcamp.java142.ch5.eci;

import java.util.ArrayList;

import bitcamp.java142.ch5.eci.dao.EciDAO;
import bitcamp.java142.ch5.eci.dao.EciDAOImpl;
import bitcamp.java142.ch5.eci.vo.EciVO;
import bitcamp.java142.ch5.eci.vo.EciVO2;
import bitcamp.java142.ch5.vo.EmpVO;

public class EciScr {
	
	//insert
	public boolean insertEci(String enumm, 
							 String ename, 
							 String eage, 
							 String ehp, 
							 String eaddr){
		
		System.out.println("--A>>EciScr.insertEci 함수 START>>>>>");
		
		EciDAO edao = new EciDAOImpl();
		
		EciVO evo = null;
		evo = new EciVO();
		evo.setEnumm(enumm);
		evo.setEname(ename);
		evo.setEage(eage);
		evo.setEhp(ehp);
		evo.setEaddr(eaddr);
		
		boolean bFlag = edao.insertEci(evo);
		System.out.println("EciDAOImpl.insertEci에서 리턴된 값 보기>>>>>" +bFlag);
		System.out.println("--A>>EciScr.insertEci 함수 END>>>>>");
		return bFlag;
	}
	
	
	//update
	public boolean updateEci(String enumm,
								String ehp){
		
		System.out.println("--B>>EciScr.updateEci 함수 START>>>>>");
		EciDAO edao = new EciDAOImpl();
		
		EciVO evo = null;
		evo = new EciVO();
		evo.setEnumm(enumm);
		evo.setEhp(ehp);

		boolean bFlag = edao.updateEci(evo);
		System.out.println("EciDAOImpl.updateEci에서 리턴된 값 보기>>>>>" +bFlag);
		System.out.println("--B>>EciScr.updateEci 함수 END>>>>>");
		
		return bFlag;
	}
	
	//delete
	public boolean deleteEci(String enumm){
		System.out.println("--C>>EciScr.deleteEci 함수 START>>>>>");
		EciDAO edao = new EciDAOImpl();
		
		EciVO evo = null;
		evo = new EciVO();
		evo.setEnumm(enumm);
		
		boolean bFlag = edao.deleteEci(evo);
		System.out.println("EciDAOImpl.deleteEci에서 리턴된 값 보기>>>>>" +bFlag);
		System.out.println("--C>>EciScr.deleteEci 함수 END>>>>>");
		return bFlag;
	}
	
	//전체조회
	public ArrayList<EciVO> selectEci(){
		System.out.println("--D>>EciScr.selectEci 함수 START>>>>>");
		
		EciDAO edao = new EciDAOImpl();
		ArrayList<EciVO> aList = edao.selectEci();
		
		System.out.println("EciDAOImpl.selectEci에서 리턴된 값 보기>>>>>" +aList);
		System.out.println("--D>>EciScr.selectEci 함수 END>>>>>");
		return aList;
	} 
	
	//키워드검색
	public ArrayList<EciVO> searchEci(String sVal){
		
		System.out.println("--E>>EciScr.searchEci 함수 START>>>>>");
		System.out.println(" EclScr.searchEci(String sVal) 매개변수 sVal 받음  >>> 확인 : " + sVal);
		EciDAO edao = new EciDAOImpl();
		
		EciVO can0 = null;// 매개변수가 낱개로 다니지 않게 import한 깡통EmpVO클래스를 can0변수명으로 초기화 
		can0 = new EciVO();// 매개변수깡통쓰기위해 인스턴스 
		can0.setEnumm(sVal);//ename깡통에 바인딩한 매개변수 "이새미" set담기
		System.out.println("EciVO.ename()깡통에  iVal 담았음 확인>>>>>: "+can0.getEnumm());
		System.out.println("깡통에 안담은 Ename은 뭐나올까: "+can0.getEname());
		
		ArrayList<EciVO> aList = edao.searchEci(can0);		
		System.out.println("EciDAOImpl.searchEci에서 리턴된 값 보기>>>>>" +aList);
		System.out.println("--E>>EciScr.searchEci 함수 END>>>>>");
		return aList;
	}
	
	//like검색
	public ArrayList likesearchEci(String sVal){
		
//		System.out.println("--F>>EciScr.likesearchEci 함수 START>>>>>");
//		System.out.println(" EclScr.searchEci(String sVal) 매개변수 sVal 받음  >>> 확인 : " + sVal);
//		EciDAO edao = new EciDAOImpl();
//		
//		
//		
//		ArrayList<EciVO> aList = edao.searchEci(can1);		
//		System.out.println("EciDAOImpl.likesearchEci에서 리턴된 값 보기>>>>>" +aList);
//		System.out.println("--F>>EciScr.lkiesearchEci 함수 END>>>>>");
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sFlag = "SSER";
		
		//insert
		if ("I".equals(sFlag)){
			System.out.println("-A--INSERT 메인 함수 START>>>>>");
			String enumm = "4";
			String ename = "이새미";
			String eage = "17";
			String ehp = "01023115455";
			String eaddr = "서울 성신여대 ";
			
			EciScr es = new EciScr();
			boolean bFlag = es.insertEci(enumm, ename, eage, ehp, eaddr);
			
			if (bFlag){
				System.out.println("데이터가 잘 입력 되었습니다 >>> : ");
				
//				EciScr es0 = new EciScr();
//				ArrayList<EciVO> aList = es0.selectEci();
//				int aListSize = aList.size();
//				if(aListSize > 0){
//					EciScr.displayFun(aList);
//				}
				
			}else{
				System.out.println("데이터가 잘 입력 되지 않았습니다 >>> : ");				
			}// 출력if-else 끝
			
			System.out.println("-A--INSERT 메인 함수 END>>>>>");
		}//insert if끝
		
		//update
		if("U".equals(sFlag)){
			System.out.println("-B--UPDATE 메인 함수 START>>>>>");
			String enumm = "4";
			String ehp = "01045458888";
			
			EciScr es = new EciScr();
			boolean bFlag = es.updateEci(enumm,ehp);
			
			if (bFlag){
				System.out.println("데이터가 잘 수정되었습니다 >>>");
			}else{
				System.out.println("데이터가 잘 수정되지 않았습니다 >>>");
			}
			
			System.out.println("-B--UPDATE 메인 함수 END>>>>>");
		}//update if끝	
			
		//delete	
		if("D".equals(sFlag)){
			System.out.println("-C--DELETE 메인 함수 START>>>>>");
			String enumm = "2";
			
			EciScr es = new EciScr();
			boolean bFlag = es.deleteEci(enumm);
			
			if (bFlag){
				System.out.println("데이터가 잘 삭제되었습니다 >>>");
			}else{
				System.out.println("데이터가 잘 삭제되지 않았습니다 >>>");
			}
			
			System.out.println("-C--DELETE 메인 함수 END>>>>>");
		}//delete if끝
			
			
		//전체조회
		if ("SALL".equals(sFlag)){
			System.out.println("---전체조회 SELECT ALL 메인 함수 START>>>>>");
			EciScr es = new EciScr();
			ArrayList<EciVO> aList = es.selectEci();
			int aListSize = aList.size();
			if (aListSize > 0){
				
				for(int i =0; i<  aListSize; i++){ //aList.size()); 배열리스트묶음의 개수(길이) //aList의 size함수로 길이구하기 (static없음; 리턴값int;매개변수()없음) 
					EciVO evo = aList.get(i); //ArrayList클래스의 get함수를 이용하여 첨자(i)번째의 데이터를 출력하기// 첨자가 0부터 배열의 길이값까지 1씩증가하며 반복수행
					System.out.print("전체조회>aList"+i+">>> : " + evo.getEnumm());
					System.out.print(" " + evo.getEname());
					System.out.print(" " + evo.getEage());
					System.out.print(" " + evo.getEhp());
					System.out.print(" " + evo.getEaddr());
					System.out.print(" " + evo.getEdeleteYN());
					System.out.print(" " + evo.getEinsertdate());
					System.out.println(" " + evo.getEupdatedate());
				}//for문 끝
				System.out.println("---전체조회 SELECT ALL 메인 함수END>>>>>");
			}//if끝
			
		}// select if끝	
			
		//키워드 검색
		if ("SSER".equals(sFlag)){
			System.out.println("---키워드 검색 SEARCH 메인 함수 START>>>>>");
			EciScr es = new EciScr();
			
			ArrayList<EciVO> aList1 = es.searchEci("4");
			int aListSize = aList1.size();
			System.out.println("DAOImp에서 데이터 추가되어 리턴받은 배열통 aList1안 묶음보기" + aList1); //1묶음있음
			System.out.println("배열리스트 aList1 묶음의 개수 >>> : " + aList1.size()); //갯수1개
			for(int i =0; i<aListSize;i++){ //aList.size()); 배열리스트묶음의 개수(길이) //aList의 size함수로 길이구하기 (static없음; 리턴값int;매개변수()없음) 
				EciVO evo1 = (EciVO)aList1.get(i); //ArrayList클래스의 get함수를 이용하여 첨자(i)번째의 데이터를 출력하기// 첨자가 0부터 배열의 길이값까지 1씩증가하며 반복수행
				System.out.print("키워드검색>aList1"+i+">>> : " + evo1.getEnumm());	
				System.out.print(" " + evo1.getEname());
				System.out.print(" " + evo1.getEage());
				System.out.print(" " + evo1.getEhp());
				System.out.print(" " + evo1.getEaddr());
				System.out.print(" " + evo1.getEdeleteYN());
				System.out.print(" " + evo1.getEinsertdate());
				System.out.println(" " + evo1.getEupdatedate());
			}//for문 끝	
			System.out.println("---키워드 검색 SEARCH 메인 함수 END>>>>>");
		}// 키워드검색 if끝
		
		
		if ("SLIK".equals(sFlag)){
			
		}	
			
			
			
			

	}//main끝

}//클래스끝
