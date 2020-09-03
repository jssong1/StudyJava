package bitcamp.java142.ch2;

//p414
//public char switchTest_1(){
//	
//	return ' ';
//}

public class SwitchTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("1");
			System.out.println("예외 처리 배우기 >>>:");
		//try catch() finally 예외처리 구문
			try{
				System.out.println("2");
				System.out.println(10/0); //예외를 잡아서 catch로이동
				System.out.println("3");
			}catch(ArithmeticException a){
				// ArithmetixException 예외 클래스
				// a : 참조변수
				// catch 블럭은 예외가 발생됐을 때만 수행된다.
				System.out.println("4");
				System.out.println("에러가 >>> : "+ a);
				System.out.println("5");
							}//catch끝			
	
//			finally{
//				//finally 구문은 생략 가능하다.
//				System.out.println("6");
//				System.out.println("try catch 구문에서 항상 (예외가 있든 없든지) 실행되는 블럭");
//				System.out.println("7");
//			}
	}//main함수끝

}//클래스끝


/*
1
예외 처리 배우기 >>>:
2
4
에러가 >>> : java.lang.ArithmeticException: / by zero
5
*/