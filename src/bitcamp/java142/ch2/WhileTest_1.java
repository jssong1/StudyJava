package bitcamp.java142.ch2;

import java.util.Scanner;

public class WhileTest_1 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0; //지역변수; int 데이터타입의 변수명num을0으로 초기화/책에는 while안에서 따로 초기화하기때문에 0으로 초기화 안했지만 지역변수는 무조건 디폴트값으로 초기화하깅 
		int sum = 0; // 지역변수 int데이터타입의 변수명 sum을 0으로 초기화
		boolean flag = true; //지역변수; boolean 데이터의 변수명 flag를 선언하여 true값을 설정  
		Scanner sc = new Scanner(System.in); // Scanner 클래스를 이용하여 scanner로 받은 데이터를/ importjava.util.Scanner;필요
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)"); 
		while(flag) { //while의 조건문이 true일 때 반복수행된다
			System.out.print(">>"); 
			String tmp = sc.nextLine(); //String타입의 변수명 tmp를 선언하여 콘솔에 입력한 데이터값을 다음라인에 문자열로 출력한다
			try{ // "1.0"이나 "삼백"같은 형식을 넣으면 오류가 나기 때 문에 try-catch로 오류거르기
				num = Integer.parseInt(tmp); //변수 num에 tmp의 문자숫자를 숫자로 변환하는 함수를 이용하여 바인딩하기  
				
				if (num!=0) { // num이 0이 아니라면 
					sum += num; // sum = sum + num;
				}else{
					flag = false; // num이 0이라면 falg값을 flase로 변경
				}//else끝
			}catch(NumberFormatException e){
				System.out.println("에러가 >>> : " + e );
				flag = false; //에러면 false로 변경해서 나가서 합계출력하삼 
			}
		
		}//while 끝
		
		System.out.println("합계:" + sum);
		
	}//main함수 끝
}//WhileTest class 끝

/*
합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)
>>111
>>223
>>0
합계:334


합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)
>>200
>>2.3
에러가 >>> : java.lang.NumberFormatException: For input string: "2.3"
합계:200

*/
