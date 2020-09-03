package bitcamp.java142.ch2;

import java.math.BigDecimal;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 120;
		System.out.println("b>>> : " + Integer.toBinaryString(b));// 바로쓰는거 지양
		
		String sb = Integer.toBinaryString(b);
		//(int)생략된거 묵시적형변환 Integer.toBinaryString((int)b), api 보니까 리턴값 string이라서 선언
		System.out.println("sb>>> : " + sb); 
		
		int i = 20;
		System.out.println("i>>> : " + Integer.toBinaryString(i));
		String si= Integer.toBinaryString(i);
		System.out.println("si>>> : " + si);
		
		
		//b = i; //숫자는 작지만 데이터타입이 더 큰거라 안맞아서 에러남
		b = (byte)i; //():캐스팅연산자-미리 바이트로 바꾸시오 :명시적 형변환(explicit casting)
		System.out.println("b>>> : " + b);
		
		i = b; //바이트가 8비트에서 32비트로 묵시적 형변환(implicit casting) i=(int)b;랑 같은말 캐스팅연산자 생략된거
		System.out.println("i>>> : " + i);
		
		double d = 23.4; //좌우동치
		//int iS = d; //에러남
		//실수 -> 정수
		int iS = (int)d;
		System.out.println("iS>>> : " + iS);
		System.out.println("d>>> : " + d);
		
		// 자바는 실수 가지고 연산하지마 오차생김. 사용하려면 문자열써서 BigDecimal(java.math패키지)로 계산
		double d1 = 707.4;
		double d2 = 226.2;
		double d3 = d1 + d2; //예상값 933.6
		System.out.println("d3>>> : " + d3);// 실제 산출값 933.5999999999999
		String s = "707.4";//생성자 만들어준거 
		BigDecimal b1 = new BigDecimal(s);//문자열로 써야해 string생성자 들어옴
		BigDecimal b2 = new BigDecimal("226.2");
		BigDecimal b3 = b1.add(b2); //BigDecimal은 add,multiply 등을 이용해 연산함
		System.out.println("b3>>> : " + b3);
		
		BigDecimal bb1 = new BigDecimal(707.4);//문자열로 안쓰면 double생성자 들어옴
		BigDecimal bb2 = new BigDecimal(226.2);
		BigDecimal bb3 = bb1.add(bb2);
		System.out.println("bb3>>> : " + bb3);//값이 달라져
		
		// int -> char, char -> int 
		char c = 65; //(char)65; 캐스팅연산자생략 //char는 ASCII코드로 치환
		System.out.println("c>>> : " + c);
		int iC = 'A'; // (int)'A'; 캐스팅연산자생략
		System.out.println("iC>>> : " + iC);
		int ii = '@'; 
		System.out.println("ii>>> : " + ii);
	}

}

/*
b>>> : 1111000
sb>>> : 1111000
i>>> : 10100
si>>> : 10100
b>>> : 20
i>>> : 20
iS>>> : 23
d>>> : 23.4
d3>>> : 933.5999999999999
b3>>> : 933.6
bb3>>> : 933.59999999999996589394868351519107818603515625
c>>> : A
iC>>> : 65
ii>>> : 64
*/