package bitcamp.java142.ch4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자를 문자로 만들때는 조심해야해 메모리자꾸 쓰면 안됨
		String str0= "abc";
		String str1= "def";
		String str2= str0 + str1;
		String str3= 1+"2";//숫자 + 문자열 =문자열
		System.out.println("str3 >>> : " +str3);
		String str4 = 11+ "";
		System.out.println("str4 >>> : " +str4);
		System.out.println("str4-1 >>> : " +1+2);//문자열부터 계산되어(왼쪽에서 오른쪽으로 연산) (cf 반대는 대입연산,증감연산자, 캐스팅연산 등)  
		System.out.println("str4-2 >>> : " +(1+2));//괄호안 수부터 연산됨
		String str5= String.valueOf(11);
		int i = 123;
		String str6= String.valueOf(121);
		String str7= String.valueOf(i);
		
		System.out.println("str5 >>> : "+str5 );
		System.out.println("str6 >>> : "+str6 );
		System.out.println("str7 >>> : "+str7 );
		
	}//main끝

}//StringTest클래스 끝
//** ValueOf()함수 : 문자열 만드는 함수 /Static유 String리턴값/매개변수 타입 다양함9가지


/*
str3 >>> : 12
str4 >>> : 11
str4-1 >>> : 12
str4-2 >>> : 3
str5 >>> : 11
str6 >>> : 121
str7 >>> : 123
*/