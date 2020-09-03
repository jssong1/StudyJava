package bitcamp.java142.ch2;
//교재 p154 쌤버전
import java.util.Scanner;
public class SwitchTest_2 {
	
	//상수로 올려서 쓰기 -> 계속 인스턴스하고 가져오는거보다 상수로 만들어놓고 가져오는게 나음
	public static final String GENDER_M_1 = "당신은 2000년 이전에 출생한 남자입니다.";
	public static final String GENDER_M_3 = "당신은 2000년 이후에 출생한 남자입니다.";
	public static final String GENDER_F_2 = "당신은 2000년 이전에 출생한 여자입니다.";
	public static final String GENDER_F_4 = "당신은 2000년 이전에 출생한 여자입니다.";
	//클래스명.상수로 불러오기
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("주민번호를 입력하시오 >>> : 123456-1");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		int regNoLen = regNo.length();
		if(regNoLen==8){
			System.out.println("regNoLen >>> : " + regNoLen);
			char gender = regNo.charAt(7);
			System.out.println("gender >>> : " + gender);
			//참조변수로 함수 호출
		}else{
			
			
		}
		
	}//main 함수끝

}//클래스 끝
