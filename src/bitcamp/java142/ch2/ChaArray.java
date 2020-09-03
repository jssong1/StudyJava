package bitcamp.java142.ch2;

public class ChaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스트링 클래스의 문자열은 char 배열이다.
		// String 클래스 데이터 타입의 참조변수 str을 문자열 "abc"초기화
		String str = "abc"; //String str = new String ("abc");랑 같은거
		System.out.println("str >>> : " +str);
		
		//[] : 배열 연산자
		//배열의 참조변수 strData선언하여 1차원char배열로 공간3개를 만들어 각각'a','b','c'로 초기화
		char strData[] = { 'a', 'b', 'c' }; // new char 생략 
		//char 배열의 길이를 length 필드로 구할수있다
		/*length 필드라고 부름 : 배열의 길이를 구하는 필드
		 * strData.length : strData는 배열의 참조변수*/
		int strDataLength = strData.length; // strData의 배열길이값을 int데이터 타입으로 초기화한다. 
		System.out.println("strDataLength >>> :" + strDataLength);
		// 참조변수, 클래스데이터타입이 String인 변수명 str1을 선언하여 초기화, 매개변수는 배열의 참조변수 strData 
		String str1 = new String(strData);
		System.out.println("Str1 >>> : " + str1); //배열의 참조변수 strData를 문자열로 인출
		
		
		
		//다 같은거 데이터타입cha 변수명 c,data1,data []배열연산자 =대입연산자 인스턴스한다 
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		char data1[] = new char [] {'a','b','c'};
		char data[] = {'a','b','c'}; //data란 참조변수 선언
		int cLength = c.length;// lenghth 필드로 변수c의 배열길이값을 int데이터 타입으로 초기화한다.
		int data1Length = data1.length;// length필드로 변수data1의 배열길이값을 int 데이터타입으로 바인딩한다. 변수명은 data1Length
		int dataLength = data.length;// length필드로 변수data의 배열길이값을 int데이터타입으로 바인딩한다. 변수명은 dataLength
		System.out.println("cLength >>> :" + cLength);
		System.out.println("data1Length >>> :" + data1Length);
		System.out.println("dataLength >>> :" + dataLength);
		
	}//end of main 함수

} // end of class

//String의 문자열길이는 length() 함수로 구하고, 배열의 길이는 length 필드로 구함
/*
 str >>> : abc
strDataLength >>> :3
Str1 >>> : abc
cLength >>> :3
data1Length >>> :3
dataLength >>> :3
 */
 