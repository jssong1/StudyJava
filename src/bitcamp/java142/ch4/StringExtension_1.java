package bitcamp.java142.ch4;

import bitcamp.java142.common.CommonUtils;

public class StringExtension_1 {

	//
	public static String extensionMethod(String fullName){//String타입의  함수 extensionMethod()를 인스턴스한다.매개변수는 String타입의 fullName을 받아온다
		String extens = ""; //String타입의 extens를 초기화 디폴트값null
		if (fullName != null && fullName.length()>0){ //if의 조건문 : 매개변수 fullName이 널이 아니고 길이가0보다 길면 다음을 실행한다. (String데이터가 있다면)
			int index = fullName.indexOf('.'); // indexOf()함수를 이용하여 문자'.'에 해당하는 첨자를 int타입의 변수 index에 바인딩한다
			extens = fullName.substring(index+1);
		}//if끝
		return extens;
	}//함수끝
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String fullName = "Hello.doc";
		String fullName = "Hello.java";
		
		String extens = StringExtension_1.extensionMethod(fullName);
		if ("java".equals(extens)){
			System.out.println("확장자 >>> :"+extens);
		}
		if ("doc".equals(extens)){
			System.out.println("확장자 >>> :"+extens);
			System.out.println("ms doc MINE TYPE : application/msword");
		}
		
		String extens1 = CommonUtils.extensionMethod(fullName);
		if ("java".equals(extens1)){
			System.out.println("CommonUtils에서 불러온 함수의 확장자 >>> :"+extens1);
		}
		if ("doc".equals(extens1)){
			System.out.println("CommonUtils에서 불러온 함수의 확장자 >>> :"+extens1);
			System.out.println("ms doc MINE TYPE : application/msword");
		}
	
	}//main끝

}//클래스끝


/*
 int indexOf(int ch) : 주어진 문자ch가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못찾으면 -1리턴 /리턴형int
 */

/*String fullName = "Hello.doc";일때
확장자 >>> :doc
ms doc MINE TYPE : application/msword
CommonUtils에서 불러온 함수의 확장자 >>> :doc
ms doc MINE TYPE : application/msword
*/

/*	String fullName = "Hello.java";일때
 확장자 >>> :java
CommonUtils에서 불러온 함수의 확장자 >>> :java
 */

 