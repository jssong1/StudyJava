package bitcamp.java142.ch2;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] abc = {'A','B','C','D'}; //방 4개 배열의길이4 //new char[]생략된거
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};// new char[]생략된거
		System.out.println("abc.length >>> : " + abc.length);
		System.out.println("num.length >>> : " + num.length);
		System.out.println("abc >>> : " + abc); // 문자열에 붙였더니 주소값나옴
		System.out.println("num >>> : " + num); 
		System.out.println(abc); //참조변수의 데이터
		System.out.println(num); 
		
		int abcN = abc.length; //length필드를 이용하여 abc의 배열길이를 int데이터타입의 변수명 abcN을 선언하여 바인딩한다.
		int numN = num.length; //length필드를 이용하여 num의 배열길이를 int데이터타입의 변수명 numN을 선언하여 바인딩한다.
		
		char[] result = new char[abc.length + num.length];//길이가 abc.length + num.length (14)인 char형 배열을 변수명  result로 생성한다.
		char[] result_1 = new char[4 + 10];//길이가 14인 char형 배열을 변수명 result_1를 선언하여 생성한다.
		char[] result_2 = new char[abcN + numN]; //
//		System.out.println(result); 

//		Object src의,int srcPos번부터, Object dest의,int destPos번에다가,int length길이만큼복사
//		System.arraycopy(Object src,int srcPos, Object dest,int destPos,int length) //return형은 void! static붙어있으니까 클래스명.함수명();
		System.arraycopy(abc,0,result,0,abc.length);//배열 abc의 첨자0번째부터/ 길이가 14인 result의/ 0번째방부터/abc배열의 길이만큼 (전체복사)/방을채운다   (abc배열의 0번째부터, result 변수의, 0번째에다가, abc.length만큼 복사한다.)
		System.arraycopy(num,0,result,abc.length,num.length);//0번째부터 result에다가 이미 들어온 abc데이터 다음에 넣을거니까 abc길이번째부터 num의 전체데이터를 복사할거니까 num배열의 길이만큼 복사한다.
		System.out.println(result);
		
		System.arraycopy(abc,0,num,0,abc.length);//abc배열의 0번부터 num배열의 0번부터 abc길이 전체를 붙여넣는다.		
		System.arraycopy(abc,0,num,6,3);// 대상: abc배열의 0번부터/위치: num의 6번부터 /길이3개를 붙여넣는다.
		System.out.println(num);
	}//main 함수 끝
}// ArrayTest class 끝

/*
abc.length >>> : 4
num.length >>> : 10
abc >>> : [C@15db9742
num >>> : [C@6d06d69c
ABCD
0123456789
ABCD0123456789
ABCD45ABC9
*/