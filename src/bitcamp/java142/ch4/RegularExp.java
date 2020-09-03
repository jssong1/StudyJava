package bitcamp.java142.ch4;

public class RegularExp {
// 숫자가 있는지 체크하는함수
	
	public static boolean checkNum(String strV){
		
		boolean bool = false;
		char charInput = ' ';
		int nCnt = 0;
		
		for (int i=0; i < strV.length(); i++){
			charInput = strV.charAt(i);
			//if(charInput >= 0x30 && charInput <= 0x39){//숫자 0~9 //숫자가아니면 카운팅
			//if(charInput >= 0x61 && charInput <= 0x7A){//소문자 a~z //소문자안걸리면카운팅
			if(charInput >= 0x41 && charInput <= 0x5A){//대문자 A~Z //소문자안걸리면카운팅
			//if(charInput >=  && charInput <= ){//특수기호 @#$%&!체크하기	
			}else{
				nCnt++;
				System.out.println("nCnt >>> : " + nCnt);
			}//if else끝
		}//for끝
		if (nCnt > 0){bool = false;}else{bool = true;}
		return bool;
	}//함수끝
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정규식 : Regular Expression
		// Validation
		String str = "abc2d";
		boolean bool = RegularExp.checkNum(str);
		System.out.println("bool >>> : "+bool);
		
	}

}
