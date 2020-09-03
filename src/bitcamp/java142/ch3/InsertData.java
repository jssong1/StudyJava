package bitcamp.java142.ch3;

import java.util.ArrayList;
import java.util.List;

public class InsertData {
	List aList = null; //인터페이스 List를 참조변수를 이용하여 초기화하였다
	
	public void insertDatea(){ //사용자정의 InsertData클래스 안에 insertDatea함수를 생성 
		
		aList = new ArrayList(); // 인터페이스 List를 이용하여 ArrayList클래스를 인스턴스
		
		
		for (int i=0; i<10;i++){ 
			InsertDataVO idVo = new InsertDataVO(); //참조변수idVo를 선언하여 IsertDataVO에서 은닉화한 데이터를 setter 함수를 이용하여 데이터를사용한다.
			System.out.println("aList에 추가될 idVo"+i+" 주소값 >>> : " + idVo);
			idVo.setStr0("A"+i);
			idVo.setStr1("B"+i);
			idVo.setStr2("C"+i);
			idVo.setStr3("D"+i);
			idVo.setStr4("E"+i);
			idVo.setStr5("F"+i);
						
			aList.add(idVo); //idVo.setStr0~5 6개의 get데이터를 하나의 배열리스트로 묶어올린다.(배열리스트묶음추가)-> i가 10까지이므로 10번반복수행
			System.out.println("aList"+i+">>> : " + aList); //그 하나의 새로운 배열리스트가 추가된 배열리스트출력 (주소값으로 보임)
			System.out.println("aList"+i+".size>>> : " + aList.size());// 배열리스트묶음의 개수(길이)
			
		}//for끝
		System.out.println("=====================");
		System.out.println("aList.size>>> : "+ aList.size());
		System.out.println("=====================");
//		System.out.println(aList);
		
		for (int i=0;i< aList.size();i++){
			InsertDataVO id = (InsertDataVO)aList.get(i);
			System.out.print("id.getStr0() >>> : " + id.getStr0() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr1() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr2() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr3() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr4() + ":");
			System.out.println("id.getStr0() >>> : " + id.getStr5() + ":");
		}
	}//insertDatea()끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertData().insertDatea(); //참조변수없넹 한번만쓸경우 참조변수안써도돼//for문 한번 돌 때마다 인스턴스
		
	}//main함수끝

}//클래스끝

/*
aList에 추가될 idVo0 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@15db9742
aList0>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742]
aList0.size>>> : 1
aList에 추가될 idVo1 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@6d06d69c
aList1>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c]
aList1.size>>> : 2
aList에 추가될 idVo2 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@7852e922
aList2>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922]
aList2.size>>> : 3
aList에 추가될 idVo3 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@4e25154f
aList3>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f]
aList3.size>>> : 4
aList에 추가될 idVo4 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@70dea4e
aList4>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e]
aList4.size>>> : 5
aList에 추가될 idVo5 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@5c647e05
aList5>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05]
aList5.size>>> : 6
aList에 추가될 idVo6 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@33909752
aList6>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752]
aList6.size>>> : 7
aList에 추가될 idVo7 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@55f96302
aList7>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752, bitcamp.java142.ch3.InsertDataVO@55f96302]
aList7.size>>> : 8
aList에 추가될 idVo8 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@3d4eac69
aList8>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752, bitcamp.java142.ch3.InsertDataVO@55f96302, bitcamp.java142.ch3.InsertDataVO@3d4eac69]
aList8.size>>> : 9
aList에 추가될 idVo9 주소값 >>> : bitcamp.java142.ch3.InsertDataVO@42a57993
aList9>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752, bitcamp.java142.ch3.InsertDataVO@55f96302, bitcamp.java142.ch3.InsertDataVO@3d4eac69, bitcamp.java142.ch3.InsertDataVO@42a57993]
aList9.size>>> : 10
=====================
aList.size>>> : 10
=====================
id.getStr0() >>> : A0:id.getStr0() >>> : B0:id.getStr0() >>> : C0:id.getStr0() >>> : D0:id.getStr0() >>> : E0:id.getStr0() >>> : F0:
id.getStr0() >>> : A1:id.getStr0() >>> : B1:id.getStr0() >>> : C1:id.getStr0() >>> : D1:id.getStr0() >>> : E1:id.getStr0() >>> : F1:
id.getStr0() >>> : A2:id.getStr0() >>> : B2:id.getStr0() >>> : C2:id.getStr0() >>> : D2:id.getStr0() >>> : E2:id.getStr0() >>> : F2:
id.getStr0() >>> : A3:id.getStr0() >>> : B3:id.getStr0() >>> : C3:id.getStr0() >>> : D3:id.getStr0() >>> : E3:id.getStr0() >>> : F3:
id.getStr0() >>> : A4:id.getStr0() >>> : B4:id.getStr0() >>> : C4:id.getStr0() >>> : D4:id.getStr0() >>> : E4:id.getStr0() >>> : F4:
id.getStr0() >>> : A5:id.getStr0() >>> : B5:id.getStr0() >>> : C5:id.getStr0() >>> : D5:id.getStr0() >>> : E5:id.getStr0() >>> : F5:
id.getStr0() >>> : A6:id.getStr0() >>> : B6:id.getStr0() >>> : C6:id.getStr0() >>> : D6:id.getStr0() >>> : E6:id.getStr0() >>> : F6:
id.getStr0() >>> : A7:id.getStr0() >>> : B7:id.getStr0() >>> : C7:id.getStr0() >>> : D7:id.getStr0() >>> : E7:id.getStr0() >>> : F7:
id.getStr0() >>> : A8:id.getStr0() >>> : B8:id.getStr0() >>> : C8:id.getStr0() >>> : D8:id.getStr0() >>> : E8:id.getStr0() >>> : F8:
id.getStr0() >>> : A9:id.getStr0() >>> : B9:id.getStr0() >>> : C9:id.getStr0() >>> : D9:id.getStr0() >>> : E9:id.getStr0() >>> : F9:

 */

