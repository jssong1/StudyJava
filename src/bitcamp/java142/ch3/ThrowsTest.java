package bitcamp.java142.ch3;

public class ThrowsTest {

	
//	throws키워드 함수뒤에다가 예외를 선언해서 예외던지겠다. 나를호출한곳에다가(내가처리하지않고..!!//처리,보정은 마지막점인 메인해서해결try-catch)
	
//	public void bMethod(){
//		System.out.println("bMethod() 함수 시작");
//		try {
//			System.out.println(0/0);
//		}catch(Exception e){
//			System.out.println("에러가 " + e);
//		}
//		System.out.println("bMethod() 함수 끝");
//	}
	/*->출력결과	//(8~25라인)이렇게 짜면안된대 //이유: try-catch를함수마다쓴다면 메모리를 엄청쓰기도하고/ throwsException을 이용하여 메인에서 디버깅할수있도록한다.
	aMethod()함수
	bMethod()함수 시작
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at bitcamp.java142.ch3.ThrowsTest.bMethod(ThrowsTest.java:9)
		at bitcamp.java142.ch3.ThrowsTest.aMethod(ThrowsTest.java:15)
		at bitcamp.java142.ch3.ThrowsTest.main(ThrowsTest.java:23) (시작점이 메인이니까 끝이 메인이겠징) 
	나를 호출한 반대순서로 예외를 던져서 나타나
	*/

		
	public void bMethod() throws Exception{
			System.out.println("bMethod() 함수 시작");
			System.out.println(0/0);
		}
	public void aMethod() throws Exception{
		System.out.println("aMethod() 함수");
		bMethod();
	}
	
	//main()함수는 콘솔어플의 시작점이다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { //메인에 throws Exception적는 대신 try-catch를 써서 예외받는 것을 마무리한다. 메인까지가서 어디가 예외 가발생했는지 알수있게 받을수있다
		ThrowsTest tt = new ThrowsTest();
		tt.aMethod();
		}catch(Exception e){
		System.out.println("메인함수 e " + e); // (exception은 호출한 반대순서로 던져짐/ 시작점이 메인이니까 예외를 받는것은 메인이 끝이겠징) 
		}
		System.out.println("main()함수 끝");
	}//메인끝

}
/* 함수마다 예외를 던져서 메인에서만 try-catch써서 받은결과
aMethod() 함수
bMethod() 함수 시작
메인함수 e java.lang.ArithmeticException: / by zero
main()함수 끝
*/
