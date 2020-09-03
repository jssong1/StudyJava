package bitcamp.java142.ch3;

public class ThrowTest {
//Throw : 개발자가 예외를 인위적으로 발생시키는거
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
		Exception e = new Exception("예외를 고의로 발생시킴");//Exception클래스에서 Exception(String message) 쓴거임 :Constructs a new exception with the specified detail message. (api참고)		
		throw e; //throw new Exception("예외를 고의로 발생시킴"); 한줄로쓸수있음 
		}catch(Exception e){
			System.out.println("에러메시지 >>> : " + e.getMessage()); //getMessage함수 에러메세지뜨게
//			e.printStackTrace();//가능하면사용하지말것 왜냐하면 메모리를 많이 쓰기 때문에
		}
		System.out.println("프로그램 정상 종료 : " );
	}//main()끝

}

/* e.printStackTrace();까지 출력했을시

에러메시지 >>> : 예외를 고의로 발생시킴
java.lang.Exception: 예외를 고의로 발생시킴
	at bitcamp.java142.ch3.ThrowTest.main(ThrowTest.java:12)
프로그램 정상 종료 : 
*/
/* e.printStackTrace(); 생략했을 때
 
 에러메시지 >>> : 예외를 고의로 발생시킴
 프로그램 정상 종료 : 
*/