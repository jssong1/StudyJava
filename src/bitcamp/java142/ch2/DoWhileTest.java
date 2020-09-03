package bitcamp.java142.ch2;

import java.util.Scanner;

//난수(임의의수)구하는 규칙
public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("1과 100사이의 정수를 입력하시오. >>> : ");
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수를 입력하시오. >>> : ");
				
			}else if (input < answer){
				System.out.println("더 큰 수를 입력하시오. >>> : ");
			}
		}while(input != answer);
		
		System.out.println("정답입니다. >>> : ");
		
		
//		double answer = Math.random(); //random() 함수는 난수함수라고한다; 0.0~1.0사이의 소수점을 난수로 발생시킴
//		System.out.println("answer >>> : "+answer);
//		answer = Math.random()*100;
//		System.out.println("answer >>> : "+answer);
//		int answerV = (int)(Math.random()*100); //정수만 가져올거얌
//		System.out.println("answerV >>> : "+answerV); 
//		int answerVs = (int)(Math.random()*100+1); //1~100사이의 난수를 구한 것! 1부터가져오려궁
//		System.out.println("answerVs >>> : "+answerVs);
//		
//		
//		do{ //do블럭은 while가기 전 무조건 한번 실행됨
//			System.out.print(">>>>");
//			
//		}while(1<0);
//		
//		
	}//main함수 끝

}//DoWhileTest 클래스 끝 


/*
1과 100사이의 정수를 입력하시오. >>> : 
50
더 작은 수를 입력하시오. >>> : 
1과 100사이의 정수를 입력하시오. >>> : 
25
더 작은 수를 입력하시오. >>> : 
1과 100사이의 정수를 입력하시오. >>> : 
12
더 큰 수를 입력하시오. >>> : 
1과 100사이의 정수를 입력하시오. >>> : 
18
더 큰 수를 입력하시오. >>> : 
1과 100사이의 정수를 입력하시오. >>> : 
20
더 작은 수를 입력하시오. >>> : 
1과 100사이의 정수를 입력하시오. >>> : 
19
정답입니다. >>> : 
*/