package bitcamp.java142.ch2;

import java.util.Scanner;

public class IfTest_12 {
	public String scoreTest1(int score){
		System.out.println(">> ScoreTest.main 함수 시작 ! ");
		
		String grade = "";
		String opt = ""; 
		int scoreVal = score;
		
		if (scoreVal >=90){
			grade = "A";
			if (scoreVal >=98){
				opt = "+";
//				grade = grade+opt;
			}else if (scoreVal <= 94){
				opt = "-";
//				grade = grade+opt;
			}
		}else if(scoreVal >= 80){
			grade = "B";
			if (scoreVal >=88){
				opt = "+";
//				grade = grade+opt;
			}else if (scoreVal <= 84){
				opt = "-";
//				grade = grade+opt;
		}else {
			grade = "C";
//			grade = grade+opt;
			}
		}
		
		System.out.println("ScoreTest.main 함수 끝! << ");
		grade = grade+opt;
		return grade;
//		return grade = grade+opt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("> IfTest_12.main 함수 시작 ! ");
		
		int score = 0;
		
		System.out.println("점수를 입력하세요 >>>>>>>> : ");
		Scanner sc = new Scanner(System.in);
	    score = sc.nextInt(); 
		
		//유효범위설정
		boolean b1 = 0 <= score;
		System.out.println("b1 >>> : " +b1 );
		boolean b2 = 100 >= score;
		System.out.println("b2 >>> : " +b2 );
		
		if (0 <= score && score <=100){
			System.out.println(">>>>>유효범위에 들어왔다면 main함수의 if문 시작");
			
			IfTest_12 it = new IfTest_12(); 
			String grade = it.scoreTest1(score);
//			String opt = it.scoreTest1(score);
			
			System.out.printf("당신의 점수는 %d입니다. %n", score);
			System.out.printf("당신의 학점은 %s입니다. %n", grade);
			System.out.println("main함수의 if문 끝 <<<<<");
		}else{
			System.out.println("else문: 점수는 0~100까지 입력하세요 <<<<<");
		}//else문 끝
		
		System.out.println("IfTest_12.main 함수 끝 ! <");
	}//main함수 끝

}//IfTest_12클래스 끝


/*
> IfTest_12.main 함수 시작 ! 
점수를 입력하세요 >>>>>>>> : 
87
b1 >>> : true
b2 >>> : true
>>>>>유효범위에 들어왔다면 main함수의 if문 시작
>> ScoreTest.main 함수 시작 ! 
ScoreTest.main 함수 끝! << 
당신의 점수는 87입니다. 
당신의 학점은 C입니다. 
main함수의 if문 끝 <<<<<
IfTest_12.main 함수 끝 ! <
*/