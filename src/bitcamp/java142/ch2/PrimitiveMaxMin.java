package bitcamp.java142.ch2;

public class PrimitiveMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*byte 타입의 MAX, MIN Value 구하기
		 * byte 키워드, Data Type으로 사용
		 * 1. Byte Wrapper 클래스, 상수 값
		 * 2. java.lang.Byte : import 안해도 된다
		 * 3. byte 상수 값을 가져와야하는데
		 * 	  Byte Wrapper 클래스 byte 상수의 변수명, 리턴형을 확인 해야함
		 * 4. 필드에 static 키워드가 있는지 확인 
		 *    있으면 : 클래스이름.필드명
		 *    없으면 : 참조변수명.필드명 <- 상수는 무조건 static이기 때문에 이 공식은 성립되지 않음
		 * 
		 * 
		 * -> Byte Wrapper 클래스, 상수값;
		 * static, 리턴형
		 * 상수의 리턴타입을 받아서 콘솔에 출력하시오
		 * 
		 * */
		
		//public static final byte MAX_VALUE;
		//api보니까 리턴타입이 바이트임, MAX_VALUE의 Modifier and Type은 static byte임
		//static이 붙었으니까 return값은 클래스명 필드명
		byte bMax = Byte.MAX_VALUE;
		//타입이 바이트니까 선언 , 변수명 bMax선언 // wrapper class명 Byte. 상수값은 다 대문자 
		//java.lang.Byte.MAX_VALUE의 java.lang.생략
		System.out.println("bMax >>> : " + bMax);
		//리턴값으로 bMax를 인출
		byte bMin = Byte.MIN_VALUE;
		System.out.println("bMin >>> : " + bMin);
		
		
		// short타입의 MAX, MIN Value 구하기
		// MAX_VALUE의  Modifier and Type은 static short임
		// static이 붙어있으니까 return값은 참조변수 이용필요없음
		short sMax = Short.MAX_VALUE;
		//데이터타입short선언 변수명sMax선언 = Wrapper class명 Short.필드 상수값은 다 대문자
		short sMin = Short.MIN_VALUE;
		System.out.println("sMax : sMin >>> : " + sMax + " : " + sMin);
		
		
		// int 타입의  MAX, MIN Value 구하기
		int iMax = Integer.MAX_VALUE;
		int iMin = Integer.MIN_VALUE;
		System.out.println("iMax : iMin >>> : " + iMax + " : " + iMin);
		// long 타입의 MAX, MIN Value 구하기
		float lMax = Long.MAX_VALUE;
		float lMin = Long.MIN_VALUE;
		System.out.println("lMax : lMin >>> : " + lMax + " : " + lMin);
		
		
		// float 타입의  MAX, MIN Value 구하기
		float fMax = Float.MAX_VALUE;
		float fMin = Float.MIN_VALUE;
		System.out.println("fMax : fMin >>> : " + fMax + " : " + fMin);
		// double 타입의 MAX, MIN Value 구하기
		double dMax = Double.MAX_VALUE;
		double dMin = Double.MIN_VALUE;
		System.out.println("dMax : dMin >>> : " + dMax + " : " + dMin);
	} //end of main 함수

}// end of class

/*
 bMax >>> : 127
bMin >>> : -128
sMax : sMin >>> : 32767 : -32768
iMax : iMin >>> : 2147483647 : -2147483648
lMax : lMin >>> : 9.223372E18 : -9.223372E18
fMax : fMin >>> : 3.4028235E38 : 1.4E-45
dMax : dMin >>> : 1.7976931348623157E308 : 4.9E-324
*/
