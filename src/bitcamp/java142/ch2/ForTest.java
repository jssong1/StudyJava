package bitcamp.java142.ch2;

public class ForTest {
	//넘길때는변수만~받을때는배열표시
	public void forTest(String str[]){
		System.out.println(">>>>>>>>>>>>>>forTest()함수시작");
		int strLen = str.length; //메인함수에서 받은 데이터 str배열의 길이를 int데이터타입을 가진 변수 strLen선언하여 forTest함수의 지역변수로 초기화
		
		//for문은 순차적인 데이터 처리할 때 사용한다.
		for (int i=0; i<strLen; i++){  //int타입의 변수i의 값을 0으로 초기화 첨자가 0부터시작이기때문; i가 strLen길이수까지 1씩증가하면서 for문 반복수행
			
			System.out.println("str["+i+"] >>> : "+str[i]); //i를 반복수행하며 각첨자에 해당하는 str문자열을 인출
			for (int j=0; j<str[i].length();j++){ //이중for문사용 //int타입의 변수 j의 값을 0으로 초기화;j가 1씩증가하면서 변수str의각배열문자열의 길이수까지 반복수행
				System.out.println("str["+i+"].charAt("+j+") >>> : " +str[i].charAt(j));// str스트링배열에 첨자i의 문자열 중 그 문자열배열첨자j번째 문자를 출력
			
//				if(str[i].charAt(j) =='b'){
				if(str[i].charAt(j) == 0x65){ //아스키코드 16진수로 0x62는 소문자 b와 같음 0x65는 e
					System.out.println(">>"); 
					break;// str[i].charAt(j) >>> : e이면 >>적고 나간다 : f출력이 안됨(이중for문끝) 그러나 첫번째 for문시작으로 ghi배열시작
				
				}
			}	
		}
		System.out.println("forTest()함수끝<<<<<<<<<<<<<<<<<");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str[] = {"abc","def","ghi"}; : 스트링 배열
		//"abc" : 문자열 배열 , 즉 배열안에 배열이 있는거
		// 배열의 길이는 length필드로
		String str[] = {"abc","def","ghi"};
		
		
		ForTest ft = new ForTest();
		//배열 데이터를 넘길 때는 배열의 참조변수로 넘긴다.
		ft.forTest(str); //데열 데이터를 함수에 넘길때는 배열의 참조변수로만 넘긴다! 받는함수파라미터에서 데이터타입과 배열표시
		
		
		
		
		
		int strLen = str.length;
		System.out.println("strLen >>> :" + strLen);
		String str0 = str[0];
		System.out.println("str0 >>> : " + str0);
		System.out.println("str0.length() >>> : " + str0.length()); //배열아니니까 length()함수로 길이구함
		System.out.println("str[0].charAt(0) >>> : " + str[0].charAt(0));//charAt(index)함수를 이용하여 str배열의 0번째 문자열중 0번째 문자만 가져오기
		System.out.println("str[0].charAt(1) >>> : " + str[0].charAt(1));
		System.out.println("str[0].charAt(2) >>> : " + str[0].charAt(2));
		System.out.println("str0.charAt(0) >>> : " + str0.charAt(0));//17라인과 같은 의미지만 변수쓴거 활용한것
		System.out.println("str0.charAt(1) >>> : " + str0.charAt(1));
		System.out.println("str0.charAt(2) >>> : " + str0.charAt(2));
		
		String str1 = str[1];
		System.out.println("str1 >>> : " + str1); //str배열중 첨자번호가 1인 데이터를 바인딩
		System.out.println("str1.length() >>> : " + str1.length()); //str1은 String타입이며 배열이없는 참조변수이므로 length()함수로 문자열의길이를 구함
		System.out.println("str1 >>> : " + str[1].charAt(0));// 
		System.out.println("str1 >>> : " + str1.charAt(0));
		String str2 = str[2];
		System.out.println("str2 >>> : " + str2);
		System.out.println("str2.length() >>> : " + str2.length()); 
		System.out.println("str2 >>> : " + str[2].charAt(2));
		System.out.println("str2 >>> : " + str2.charAt(2));
		
		

	}//main함수()끝

}//클래스끝
/*
>>>>>>>>>>>>>>forTest()함수시작
str[0] >>> : abc
str[0].charAt(0) >>> : a
str[0].charAt(1) >>> : b
str[0].charAt(2) >>> : c
str[1] >>> : def
str[1].charAt(0) >>> : d
str[1].charAt(1) >>> : e
>>
str[2] >>> : ghi
str[2].charAt(0) >>> : g
str[2].charAt(1) >>> : h
str[2].charAt(2) >>> : i
forTest()함수끝<<<<<<<<<<<<<<<<<
strLen >>> :3
str0 >>> : abc
str0.length() >>> : 3
str[0].charAt(0) >>> : a
str[0].charAt(1) >>> : b
str[0].charAt(2) >>> : c
str0.charAt(0) >>> : a
str0.charAt(1) >>> : b
str0.charAt(2) >>> : c
str1 >>> : def
str1.length() >>> : 3
str1 >>> : d
str1 >>> : d
str2 >>> : ghi
str2.length() >>> : 3
str2 >>> : i
str2 >>> : i
*/