package bitcamp.java142.ch2;

import java.util.Scanner;
//p142예제를 함수를 이용하여 만들기

public class IfTest_1 {

	public char scoreTest(int score){ //전역변수; void가없으므로 리턴형 있음; 함수명 scoreTest; 매개변수는 데이터타입이int인 score
		System.out.println("scoreTest 함수 시작 !");
		System.out.println("메인함수에서 불러온 score데이터 확인 >>>  " + score);
		char grade = ' '; //데이터타입이 char인 변수명 grade를 선언하여 멤버변수 초기화
		int scoreVal = score; // 데이터 타입이 int인 변수명 scoreVal를 선언하여 멤버변수 초기화

		if (scoreVal >= 90){ //if문 실행
			System.out.println("함수scoreTest의 90점이상 if문 진입! ");
			grade = 'A';
		}else if(scoreVal >= 80){
			System.out.println("함수scoreTest의 80점이상 else if문 진입! ");
			grade = 'B';
		}else if(scoreVal >= 70){
			System.out.println("함수scoreTest의 70점이상 else if문 진입! ");
			grade = 'C';
		}else{
			System.out.println("함수scoreTest의  else문 진입! ");
			grade = 'D';
			
		}//else끝
		System.out.println("scoreTest 함수 끝~ ");
		return grade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IfTest_1.main 함수 시작 ! ");
		int score = 0;
		
		System.out.println("점수를 입력하세요 >>>>>>>> : ");
		Scanner sc = new Scanner(System.in);
		// nextInt() : 공백 이전의 정수 받기
		score = sc.nextInt();
		
		//유효범위설정
		boolean b1 = 0 <= score;
		System.out.println("b1 >>> : " +b1 );
		boolean b2 = 100 >= score;
		System.out.println("b2 >>> : " +b2 );
		
		if (0 <= score && score <= 100){
			System.out.println("IfTest_1.main 함수의 if문 시작>>> : ");
			IfTest_1 it_1 = new IfTest_1();
//			System.out.println("grade 데이터 확인 >>> : " + grade); //확인안됨 가져와야해 char타입으로
//			System.out.println("scoreVal 데이터 확인 >>> : " + scoreVal); //확인안됨
			char grade = it_1.scoreTest(score); //리턴형없는 함수를 invoke하기위해서는 함수의리턴값을타입으로 가진 변수를 선언하여 클래스명.함수(매개변수)로 바인딩한다
			System.out.println(">>>>>>>>>>>>>>>당신의 학점은 " + grade + "입니다.<<<<<<<<<<<<<<<<<<");		
			System.out.println("IfTest_1.main 함수의 if문  끝~ ");
		}else{
			System.out.println("else문  시작 >>> : ");
			System.out.println("점수는 0부터 100까지 입니다. ");
		} //else문 끝		
		
	} // main()함수끝

}// IfTest_1 클래스끝

/*Scanner 클래스 함수 중에서
next() : 공백 이전의 문자열 받기
nextInt() : 공백 이전의 정수 받기
nextDouble() : 공백 이전의 실수 받기
nextLine() : 문자열 전체 입력 받기 (입력값에 공백을 받는다)
hasNextInt() : 입력한 값이 int형이 아니면 false, int형이면 true

IfTest_1.main 함수 시작 ! 
점수를 입력하세요 >>>>>>>> : 
77
b1 >>> : true
b2 >>> : true
IfTest_1.main 함수의 if문 시작>>> : 
scoreTest 함수 시작 !
메인함수에서 불러온 score데이터 확인 >>>  77
함수scoreTest의 70점이상 else if문 진입! 
scoreTest 함수 끝~ 
>>>>>>>>>>>>>>>당신의 학점은 C입니다.<<<<<<<<<<<<<<<<<<
IfTest_1.main 함수의 if문  끝~ 


*/
