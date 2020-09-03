package bitcamp.java142.ch2;
//교재 p154 혼자해보기
import java.util.Scanner;

public class FlowEx10 {

	
	public void feScore(int score){
		System.out.println(">>>>>>>함수 feScore 시작");
		int feSco = score;
		char grade = ' ';
		
		try{
		switch(feSco/10){
			case 10:
			case 9:
				grade = 'A';
				System.out.printf("당신의 학점은 %c입니다. %n", grade);
				break;
			case 8:
				grade = 'B';
				System.out.printf("당신의 학점은 %c입니다. %n", grade);
				break;
			case 7:
				grade = 'C';
				System.out.printf("당신의 학점은 %c입니다. %n", grade);
				break;
			default :
				grade = 'F';
				System.out.printf("당신의 학점은 %c입니다. %n", grade);
			
			} //스위치 끝
		}catch(ArithmeticException a){
			System.out.println("에러가 :" + a);
		}finally{}


	}//feScore 함수끝
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int score = 0;

		System.out.println("당신의 점수를 입력하세요>>> : ");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		
		Boolean scoBool1 = score >=0;
		Boolean scoBool2 = score <= 100;
		System.out.println("scoBool1 논리값 : " + scoBool1+ " && scoBool2 논리값 : " + scoBool2);
		
		if (scoBool1 && scoBool2){
			System.out.println(">>>>>>>>>>>>main함수의 if문 시작");
			FlowEx10 fe = new FlowEx10();
			fe.feScore(score); //static 없으면 참조변수 이용 참조변수.함수명()

					
		}else{//if끝
			System.out.println("점수는 1~100사이의 수를 입력하시오");
		}
			System.out.println("main함수의 if문 끝<<<<<<<<<<<<<<");
	}//main함수 끝 

}// FlowEx10 끝


/*
당신의 점수를 입력하세요>>> : 
97
scoBool1 논리값 : true && scoBool2 논리값 : true
>>>>>>>>>>>>main함수의 if문 시작
>>>>>>>함수 feScore 시작
당신의 학점은 A입니다. 
main함수의 if문 끝<<<<<<<<<<<<<<
*/