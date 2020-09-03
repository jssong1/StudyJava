package bitcamp.java142.ch2;

public class ChaCasting1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char의 디폴트값은 널문자, 아스키코드 10진수로 하면 32나타남
		char ccc = ' ';
		System.out.println("char 빈문자열 2진수 >>> : " + Integer.toBinaryString(ccc));
		//api보면 Integer.toBinaryString(int i)므로 int값넣어야하는데 ccc는 char므로 암묵적 형변환이뤄진거 알수있음
		//char가 int보다 작으니까	암묵적형변환가능
		//Integer.toBinaryString((int)ccc)
		System.out.println("char 빈문자열 10진수 >>> : " + (int)ccc); //문자를 아스키코드 숫자10진수로 형변환
		System.out.println("char 빈문자열 8진수 >>> : 0" + Integer.toOctalString(ccc));
		System.out.println("char 빈문자열 16진수 >>> : 0x" + Integer.toHexString(ccc));
		

		
		
		
		// String의 문자열길이는 length() 함수로 구하고, 배열의 길이는 length 필드로 구함
		// 스트링 클래스의 문자열은 char 배열이다.
		String str = "abc"; //String str = new String ("ab c ");
		//이걸 배열 char데이터타입의 cc변수명으로 선언가능
		char cc[]= new char[]{'a', 'b', ' ', 'c', ' '}; 
		System.out.println("str >>> : " + str);
		System.out.println("cc >>> : " + cc); //주소값나옴 출력에서[는 배열값을 의미
		//String 클래스 api에서 length 함수보니까 리턴형은 int고 static없으니까 참조변수명.함수명()으로
		int strLength = str.length();
		System.out.println("strLength >>> : "+ strLength); //str이 "ab c "라면 값은 5나옴, for의2진수출력도 5줄나옴
		String str1 = "";
		int str1Length = str1.length();
		System.out.println("str1Length >>> : "+ str1Length);
		
		if (strLength > 0){ //str1Length 넣으면 아무것도 출력안됨ㅋㅋ
			for (int i=0; i < strLength; i++){
				char cValue = str.charAt(i);
				System.out.print("2진수 >>> :" + Integer.toBinaryString(cValue));
				System.out.print(" : 10진수 >>> : " + (int)cValue);
				System.out.print(" : 8진수 >>> : 0" + Integer.toOctalString(cValue));
				System.out.println(" : 16진수 >>> : 0x" + Integer.toHexString(cValue));
			}
		}
	
		
		//b찾기
		/*String 클래스 api에서 charAt 함수 보니까 리턴형은 char고 static은 없어서 참조변수명.함수명()
		 * 매개변수는 int index로 String문자열의 각 첨자이용 = b의 index첨자는 1*/
		//리턴형 char값을 갖는 변수명 cVal을 선언 
		char cVal0 = str.charAt(0);
		char cVal1 = str.charAt(1);
		char cVal2 = str.charAt(2);
		System.out.println("cVal0 >>> : " + cVal0);
		System.out.println("cVal1 >>> : " + cVal1);
		System.out.println("cVal2 >>> : " + cVal2);
		//형변환되어 아스키코드로 표현됨 10진수
		int iCval0 = cVal0;
		int iCval1 = cVal1;
		int iCval2 = cVal2;
		System.out.println("iVal0 >>> : " + iCval0);
		System.out.println("iVal1 >>> : " + iCval1);
		System.out.println("iVal2 >>> : " + iCval2);
		//10진수를 각각 2진수 8진수 16진수로 표현
		/*Integer 클래스 api보면 각각
		2진수-> static 있음/ 리턴값 : String/ toBinaryString(매개변수: int i) 
		8진수-> static 있음/ 리턴값 : String/ toOctalString(매개변수: int i) 
		16진수-> static 있음/ 리턴값 : String/ toHexString(매개변수 : int i)  
		static있으므로 wrapper클래스명.함수명();
		*/
		
		//리턴값이 String인 iCVal102 변수명 선언한다
		//매개변수 iCVal10값을 Integer클래스의 함수 toBinaryString으로 호출한다.
		String iCval02 = Integer.toBinaryString(iCval0);
		String iCval12 = Integer.toBinaryString(iCval1);
		String iCval22 = Integer.toBinaryString(iCval2);
		String iCval08 = Integer.toOctalString(iCval0);
		String iCval18 = Integer.toOctalString(iCval1);
		String iCval28 = Integer.toOctalString(iCval2);
		String iCval016 = Integer.toHexString(iCval0);
		String iCval116 = Integer.toHexString(iCval1);
		String iCval126 = Integer.toHexString(iCval2);
		
		System.out.println("2진수 >>> : " + iCval02 
				+ " : " + iCval12 + " : " + iCval22);
		System.out.println("8진수 >>> : 0" + iCval08 
				+ " : 0" + iCval18 
				+ " : 0" + iCval28);
		System.out.println("16진수 >>> : 0x" + iCval016 
				+ " : 0X" + iCval116 
				+ " : 0x" + iCval126);
		//8진수는 앞에 "0"을 붙여서 표현 16진수는 앞에 "0x"나 "0X"를 붙여서 표현
	}//end of main 함수

} // end of class


/*
char 빈문자열 2진수 >>> : 100000
char 빈문자열 10진수 >>> : 32
char 빈문자열 8진수 >>> : 040
char 빈문자열 16진수 >>> : 0x20
str >>> : abc
cc >>> : [C@15db9742
strLength >>> : 3
str1Length >>> : 0
2진수 >>> :1100001 : 10진수 >>> : 97 : 8진수 >>> : 0141 : 16진수 >>> : 0x61
2진수 >>> :1100010 : 10진수 >>> : 98 : 8진수 >>> : 0142 : 16진수 >>> : 0x62
2진수 >>> :1100011 : 10진수 >>> : 99 : 8진수 >>> : 0143 : 16진수 >>> : 0x63
cVal0 >>> : a
cVal1 >>> : b
cVal2 >>> : c
iVal0 >>> : 97
iVal1 >>> : 98
iVal2 >>> : 99
2진수 >>> : 1100001 : 1100010 : 1100011
8진수 >>> : 0141 : 0142 : 0143
16진수 >>> : 0x61 : 0X62 : 0x63

*/