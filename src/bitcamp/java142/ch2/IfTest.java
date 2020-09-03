package bitcamp.java142.ch2;

public class IfTest {
	//상수 
	public static final String ID_TEST = "ssong"; //전역변수형태, static, 멤버변수, 참조변수(상수)
	public static final String PW_TEST = "won777";//전역변수형태, static, 멤버변수, 참조변수(상수)
	
	
	//로그인함수만들기
	public boolean loginTest (String id, String pw){
		String idVal =id;
		String pwVal =pw;
		boolean boolLogin = false;
		
		if (ID_TEST.equals(idVal)&& PW_TEST.equals(pwVal)){
			boolLogin = true;
		}
		
		return boolLogin;
	}
	
	//콘솔 외부데이터 불러오는 방법 1.명령행인수 사용 2.Scanner클래스 사용
	//java bitcamp.java142.ch2.IfTest ssong wong777 //널문자 빈칸하나 넣어서 입력하면 배열이 생성
	//String[] args: 명령행 인수 : 스트링배열
	//String args[]={"ssong", "won777"}; // 콘솔에서 입력한 데이터가 들어와서 배열생성

	public static void main(String[] args) {  //[]연산자 //args변수명
		// TODO Auto-generated method stub
		System.out.println("IfTest.main()함수 시작");
		if(args.length == 2){ //배열의길이는 length필드 //
			System.out.println("If 진입 >>> ");
			String id = args[0]; //지역변수; String타입의 변수명id선언; 변수 args의 배열첨자가 0인 값을 바인딩한다 
			String pw = args[1]; //지역변수; String타입의 변수명pw선언; 변수 args의 배열첨자가 1인 값을 바인딩한다
			System.out.println(id + " : " + pw);
			//로그인로직
			IfTest it = new IfTest(); //사용자정의 
			boolean bool = it.loginTest(id,pw);
			if (bool){
				System.out.println("If 진입 >>> ");
				System.out.println("로그인 완료");
			}else{
				System.out.println("else 진입 >>> ");
				System.out.println("로그인 실패");
				}
		}else{ //if(args.length == 2)끝
			System.out.println("두개를 입력하시오");
		}//else끝
	}

} //함수끝


/*
 * IfTest.main()함수 시작
If 진입 >>> 
ssong : won777
If 진입 >>> 
로그인 완료
*/
 