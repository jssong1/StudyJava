package bitcamp.java142.ch3;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(0/0);
		}
		catch(ArithmeticException e){ //catch 예외 절은 여러개 쓸수 있다/ 그러나 쓸때는 하위절부터 쓴다 
			System.out.println("e <<< :" + e);
		}
		catch(Exception e){//예외절의 최상위 Exception이므로 이거만 써도 된다 (안되는것도있긴혀)
			System.out.println("e >>> :" +e);
		}finally{
			System.out.println("실행 됨");
		}
		System.out.println("실행 끝");

	}//메인끝

}//클래스끝
/*
 e <<< :java.lang.ArithmeticException: / by zero
실행 됨
실행 끝
*/