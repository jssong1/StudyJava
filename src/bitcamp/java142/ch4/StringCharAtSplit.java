package bitcamp.java142.ch4;

import java.util.StringTokenizer;

public class StringCharAtSplit {


	//메인()에서 만들어본 함수를 사용자정의 함수로 만들어보기 
	//리턴형없는 void로 만든 함수는 불러올때 클래스명.함수(매개변수)로 하면 됨
	//String strs = StringCharAtSplit.splitMethod(strV);는 함수에 리턴값 return strs; 적어줘야함
	//사용자정의 함수로 스트링데이터를 가져올때는 if문에서 데이터가있는지 걸러주는거 잊지망
	//
	
	public static void splitMethod(String strV) { 
		if (strV != null && strV.length()>0){ // 들어온 strV의 데이터가 있는지 확인; 있으면 true로 다음을 실행
			String strs[] = strV.split("@");// 구분자 (delimiter) // String 데이터의 strs[]배열을 선언; split함수를 사용하여 분리자@을 기준으로 strV문자열배열을 나눈다
			for (int i = 0; i < strs.length; i++) { //for문 int i를 0으로 초기화 하여 strs 길이까지 실행 
				System.out.println("splitMethod strs[" + i + "] >>> : " + strs[i]);
			}//for끝
		}//if끝
	}//splitMethod()끝

	public static void tokenMethod(String strV) {	
		if (strV != null && strV.length()>0){
			StringTokenizer stt = new StringTokenizer(strV, "@"); // util패키지
			while (stt.hasMoreElements()) {// 많이 쓰는 함수
				System.out.println("tokenMethod stt >>> : " + stt.nextToken());
			}//while끝
		}//if끝
	}//tokenMethod()끝

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strV = "abc,def,ghi,jkl";
		System.out.println("strV >>> : " + strV);
		
		strV = strV.replace(',', '@');
		System.out.println("replace()함수로 ,를 @이로 대치 strV >>> : " + strV);
		strV = strV.replace('a', 'A');
		System.out.println("replace()함수로 소문자a대문자로 대치 strV >>> : " + strV);
		
		String str[] = strV.split("@");// 구분자 (delimiter)
		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] >>> : " + str[i]);
		}
		
		StringTokenizer st = new StringTokenizer(strV, "@"); // util패키지
		while (st.hasMoreElements()) {// 많이 쓰는 함수
			System.out.println(">>> : " + st.nextToken());
		}
		
		StringCharAtSplit.splitMethod(strV);
		StringCharAtSplit.tokenMethod(strV);
	}// 메인끝

}// 클래스끝
