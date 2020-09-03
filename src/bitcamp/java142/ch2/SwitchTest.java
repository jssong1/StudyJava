package bitcamp.java142.ch2;

import java.util.Scanner;

public class SwitchTest {
// case에서는 로직을 만들지 않는다?
	//1~12외에수면 안나오게 해라
	
	
	public void switchTest(int month){
		System.out.println("switchTest 함수 진입>>>");
		int monthVal = month;
		
		switch (monthVal){ //case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
//			case 12: case 1: case2:
//				System.out.println("현재 계절은 겨울입니다.");
//				break;
			default:
				System.out.println("현재 계절은 겨울입니다.");
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재 월을 입력하시오 >>> : ");
		Scanner sc = new Scanner(System.in);
		int month  = sc.nextInt();
		Boolean monBool1 = month <=12;
		Boolean monBool2 = month >=1;
		System.out.println("monBool1 : "+ monBool1 + " & monBool2 : " +monBool2 );
		
		if (monBool1 && monBool2){
			System.out.println("if문 진입>>>");
		switch (month){ //swich문의 조건식 결과는 정수또는 문자열이어야한다.
			case 1:
				System.out.println("1월입니다.");
				break;
			case 2:
				System.out.println("2월입니다.");
				break;
			case 3:
				System.out.println("3월입니다.");
				break;
			case 4:
				System.out.println("4월입니다.");
				break;
			case 5:
				System.out.println("5월입니다.");
				break;
			case 6:
				System.out.println("6월입니다.");
				break;
			case 7:
				System.out.println("7월입니다.");
				break;
			case 8:
				System.out.println("8월입니다.");
				break;
			case 9:
				System.out.println("9월입니다.");
				break;
			case 10:
				System.out.println("10월입니다.");
				break;
			case 11:
				System.out.println("11월입니다.");
				break;		
			case 12:
				System.out.println("12월입니다.");
				break;

		}//swich문 끝
		
		SwitchTest st = new SwitchTest();
		st.switchTest(month); 
		
		System.out.println("<<< switchTest 함수 종료");
		System.out.println("if문 종료>>>");
		
		}else{
			System.out.println(">>>>>>>>>>month는 1~12 입력가능합니다.");
		}
	}//main함수()끝

}//SwichTest 클래스 끝


/*
현재 월을 입력하시오 >>> : 
12
monBool1 : true & monBool2 : true
if문 진입>>>
12월입니다.
switchTest 함수 진입>>>
현재 계절은 겨울입니다.
<<< switchTest 함수 종료
if문 종료>>>
*/