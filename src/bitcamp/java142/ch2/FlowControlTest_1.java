package bitcamp.java142.ch2;

import java.util.Scanner;

public class FlowControlTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//String str0 = args[0];
		//System.out.println("str0 >>> : " + str0);
		//이클립스 : run - configuration - arguments 값입력해서 출력
		//도스창에서는 자바실행할 때 뒤에 값입력해서 출력
			
		// java.util패키지에 Scanner클래스의 nextLine()함수 사용 (static과 매개변수없음)콘솔외부에서 데이터받아오는클래스
		// 지역변수값은 무조건 초기화, int인 데이터타입의 변수명 inVal을 값0으로 초기화
		// 참조변수, Scanner를 변수명sc를 선언하여 인스턴스한다.매개변수는 System.in(콘솔에서 입력한 데이터를 받아오는 통로 in필드)
		// String이 데이터 타입인 변수명 inTmp를 선언 ,static없으므로 참조변수이용.함수명();
		int inVal = 0;
			
		System.out.println("숫자를 하나 입력하세요 >>> : ");
		Scanner sc = new Scanner(System.in);
		
		String inTmp = sc.nextLine();
		//int inTmp1 = sc.nextInt();
		System.out.println("inTmp >>> : "+ inTmp);
		
		// 현재 나온 문자숫자를 숫자로 변환하여 숫자4와 비교 후 true값 산출기대 
		// Integer.parseInt(inTmp);
		// parseInt() 함수 : 문자숫자를 숫자로 변환하는 함수
		inVal = Integer.parseInt(inTmp);
		if (4 == inVal){
			System.out.println("입력한 숫자는 4입니다.");
		}
		boolean b2 = 4 != inVal; //not연산자
		System.out.println("b2 >>> : " + b2);
		if (4 != inVal){
			System.out.println("입력한 숫자는 4가 아닙니다.");
		}else{
			System.out.printf("입력한 숫자는 %d입니다.", inVal);
		}
		
		
		//printf : 프린트포맷함수, %d:10진수
		//static int - parseInt(String s)  :integer클래스
	}

}

/*
 숫자를 하나 입력하세요 >>> : 
4
inTmp >>> : 4
입력한 숫자는 4입니다.
b2 >>> : false
입력한 숫자는 4입니다.

숫자를 하나 입력하세요 >>> : 
5
inTmp >>> : 5
b2 >>> : true
입력한 숫자는 4가 아닙니다.
 */

