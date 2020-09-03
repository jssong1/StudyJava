package bitcamp.java142.ch4;

import java.util.Scanner;

public class StringEquals {

	public static Boolean stringEquals(String str, String strL, int divNum){ //static이 붙은 Boolean타입의 사용자정의함수stringEquals()/매개변수는 String,Stirn,int타입
		System.out.println("stringEquals()함수에 들어온 매개변수 str >>> : " + str);
		System.out.println("stringEquals()함수에 들어온 매개변수 str길이 >>> : " + str.length());
		System.out.println("stringEquals()함수에 들어온 매개변수 strL >>> : " + strL);
		System.out.println("stringEquals()함수에 들어온 매개변수 strL길이 >>> : " + strL.length());
		System.out.println("콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : " + divNum);
		
		boolean bool = false; //지역변수 boolean초기화
		
		if (divNum ==1){//이중if문시작; 1을 들어오면 다음 if문 실행 
			if(str.equals(strL)){bool = true;}else{bool = false;}//equals()함수를 이용하여 문자열 str과 문자열 strL이 같으면 bool값이 true아니면 false
		}
		if (divNum ==2){//이중if문시작; 2을 들어오면 다음 if문 실행 
			if(str.equals(strL.trim())){bool = true;}else{bool=false;}//trim()함수를 통해 문자열 strL의 양끝 공백을 없애고 ; equals()함수를 통해 문자열 str과 strL비교 같으면 bool값이 true아니면 false
		}
		if(divNum == 3){//이중if문시작; 3을 들어오면 다음 if문 실행 
			if(str.equalsIgnoreCase(strL.trim())){bool = true;}else{bool=false;}//trim()함수를 통해 문자열 strL의 양끝 공백을 없애고 ; equalsIgnoreCase()함수를 통해 대소문무시하고 문자열 str과 strL비교 같으면 bool값이 true아니면 false
		}
		if(divNum == 4){//이중if문시작; 4을 들어오면 다음 if문 실행 
			if(str.equals(strL.toLowerCase().trim())){bool = true;}else{bool=false;}//문자열 strL을 ;toLowerCase()함수이용하여 소문자로 변환; trim()함수를 통해 양끝 공백을 없애고 ; 문자열 str과 strL비교 같으면 bool값이 true아니면 false
		}
		if(divNum == 5){//이중if문시작; 5을 들어오면 다음 if문 실행 
			if(str.equals(strL.toUpperCase().trim())){bool = true;}else{bool=false;}//문자열 strL을 ;toLowerCase()함수이용하여 대문자로 변환; trim()함수를 통해 양끝 공백을 없애고 ; 문자열 str과 strL비교 같으면 bool값이 true아니면 false
		}		
	
	return bool;		
		
	}//함수끝
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abc"; //지역변수; String타입의 변수 str을 선언하여 "abc"초기화
		String strL = " ABC";//지역변수; String타입의 변수 strL을 선언하여 "ABC"초기화
		int stopNum =0;//지역변수; 데이터타입이 int인 변수명 stopNum을 0으로 초기화
		do{ //do문시작
		System.out.println("숫자를 입력하시오 >>> : "); 
		Scanner sc = new Scanner(System.in); //콘솔에 입력한 데이터를 스캐너함수로 인스턴스한다. (임포트하기)
		int divNum = sc.nextInt();// 콘솔에 입력한 숫자를 int데이터타입의 변수divNum에 선언 
		
		boolean bool = StringEquals.stringEquals(str,strL,divNum); //불리안타입의 변수bool을 선언하여 StringEquals클래스에있는 stringEquals()함수를 호출한다/매개변수3가지일치
		System.out.println("bool >>> : " +bool);//함수에서 받은 리턴값을 출력
		System.out.println("프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용");//
		Scanner scc = new Scanner(System.in);
	
		stopNum = sc.nextInt();
		}//do끝
		while(stopNum==9);//while문끝
		
	}//main끝

}//StringEquals클래스 끝


/*
숫자를 입력하시오 >>> : 
1
stringEquals()함수에 들어온 매개변수 str >>> : abc
stringEquals()함수에 들어온 매개변수 str길이 >>> : 3
stringEquals()함수에 들어온 매개변수 strL >>> :  ABC
stringEquals()함수에 들어온 매개변수 strL길이 >>> : 4
콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : 1
bool >>> : false
프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용
9
숫자를 입력하시오 >>> : 
2
stringEquals()함수에 들어온 매개변수 str >>> : abc
stringEquals()함수에 들어온 매개변수 str길이 >>> : 3
stringEquals()함수에 들어온 매개변수 strL >>> :  ABC
stringEquals()함수에 들어온 매개변수 strL길이 >>> : 4
콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : 2
bool >>> : false
프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용
9
숫자를 입력하시오 >>> : 
3
stringEquals()함수에 들어온 매개변수 str >>> : abc
stringEquals()함수에 들어온 매개변수 str길이 >>> : 3
stringEquals()함수에 들어온 매개변수 strL >>> :  ABC
stringEquals()함수에 들어온 매개변수 strL길이 >>> : 4
콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : 3
bool >>> : true
프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용
9
숫자를 입력하시오 >>> : 
4
stringEquals()함수에 들어온 매개변수 str >>> : abc
stringEquals()함수에 들어온 매개변수 str길이 >>> : 3
stringEquals()함수에 들어온 매개변수 strL >>> :  ABC
stringEquals()함수에 들어온 매개변수 strL길이 >>> : 4
콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : 4
bool >>> : true
프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용
9
숫자를 입력하시오 >>> : 
5
stringEquals()함수에 들어온 매개변수 str >>> : abc
stringEquals()함수에 들어온 매개변수 str길이 >>> : 3
stringEquals()함수에 들어온 매개변수 strL >>> :  ABC
stringEquals()함수에 들어온 매개변수 strL길이 >>> : 4
콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : 5
bool >>> : false
프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용
9
숫자를 입력하시오 >>> : 
6
stringEquals()함수에 들어온 매개변수 str >>> : abc
stringEquals()함수에 들어온 매개변수 str길이 >>> : 3
stringEquals()함수에 들어온 매개변수 strL >>> :  ABC
stringEquals()함수에 들어온 매개변수 strL길이 >>> : 4
콘솔에 입력하여 함수로들어온 매개변수 divNum >>> : 6
bool >>> : false
프로그램을 계속하고싶으면 9를 누르세요. 프로그램을 중단하고싶으면 아무거나 누르세용
2
*/