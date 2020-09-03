package bitcamp.java142.ch2;
//교재 p155 혼자해보기
import java.util.Scanner;

public class FlowEx11 {
	//상수
	public static final String GENDER_M_1 = "당신은 2000년 이전에 출생한 남자입니다.";
	public static final String GENDER_M_3 = "당신은 2000년 이후에 출생한 남자입니다.";
	public static final String GENDER_F_2 = "당신은 2000년 이전에 출생한 여자입니다.";
	public static final String GENDER_F_4 = "당신은 2000년 이후에 출생한 여자입니다.";
	//클래스명.상수로 불러오기
	
	public void Flowgender(char gender){
		char flowGen = gender;
		switch(flowGen){
//			case '1': case '3':
//				switch(flowGen){
				case'1':
					System.out.println("" + FlowEx11.GENDER_M_1);
					break;
				case'3':
					System.out.println("" + FlowEx11.GENDER_M_3);
					break;
//				}
//			break;
//			default:
//				switch(flowGen){
				case'2':
					System.out.println("" + FlowEx11.GENDER_F_2);
					break;
				case'4':
					System.out.println("" + FlowEx11.GENDER_F_4);
					break;
//				}
		
		}//스위치 끝
		
		
	}//함수끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("당신의 주민번호 앞7자리를 입력하시오 >>> (ex.123456-2): "); 
		Scanner sc = new Scanner(System.in); //Scanner를 이용하여 콘솔에서 데이터를 받아온다 
		String genNo = sc.nextLine();//String타입의 변수를 선언하여 nextLine()함수를 이용 문자열 전체 입력 받기 (입력값에 공백을 받는다)
	
		char gender = genNo.charAt(7);//charAt()함수를 이용하여 
		
		System.out.println("입력한 주민번호 확인 >>> : "+ genNo);
		System.out.println("뒷번호의 첫번째 자리 확인 >>> :"+ gender);
		
//		Boolean genBool1 = gender =='1';
//		Boolean genBool2 = gender =='2';
//		Boolean genBool3 = gender =='3';
//		Boolean genBool4 = gender =='4';
//		System.out.println("1인가? : "+genBool1);
//		System.out.println("2인가? : "+genBool2);
//		System.out.println("3인가? : "+genBool3);
//		System.out.println("4인가? : "+genBool4);

		Boolean genBool10 = gender=='1'||gender=='2'||gender=='3'||gender=='4';
		System.out.println("genBool10 >>> : "+genBool10);	
		
		if(genBool10){
			System.out.println(">>>>>>>>>>>>main함수의 if문 시작");
			FlowEx11 fe11 = new FlowEx11();
			fe11.Flowgender(gender);
		}else{
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		
	}//main함수끝

}//클래스끝

/*
당신의 주민번호 앞7자리를 입력하시오 >>> (ex.123456-2): 
154697-1
입력한 주민번호 확인 >>> : 154697-1
뒷번호의 첫번째 자리 확인 >>> :1
genBool10 >>> : true
>>>>>>>>>>>>main함수의 if문 시작
당신은 2000년 이전에 출생한 남자입니다.
*/