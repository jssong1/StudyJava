package bitcamp.java142.ch2;

public class FlowControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if문 키워드임, 블럭을 가지고있음, true일때만 돌아
		//if문 블럭(스콥scope:브레이스부분)은 true일때만 돈다
		//if문()에 연산 결과가 true일 때만 수행된다.
		
		
		boolean bool = false;
//		bool = true;
		//비교연산자는 결과 값을 논리값을 리턴한다.
		boolean b1 = 3 < 0;
		System.out.println("b1 >>> : " + b1 );
		if (bool){ //bool=false,bool=true,3>0(true),3<0(false)각각 결과확인
			System.out.println("if절 ");
		}else{
			System.out.println("else절 ");
		}
		System.out.println(""); //if스콥에 걸리지 않음 인터프린트로 빈줄 인출됨
		
		//String클래스에 있는 equals()함수는 문자열을 비교해서 논리값(boolean value:true,false)를 리턴한다 
		//static없어서 참조변수.함수명쓴거임/ 리턴값은 boolean
		String str1 = "abc";
		boolean b2 = str1.equals("abc"); //일치, " abc "인 경우 일치하지않음->else절 출력
		System.out.println("b2 >>> : "+ b2);
		if(b2){
			System.out.println("if절 str1.equals('abc')");
		}else{
			System.out.println("else절");
		}
		
		// ==상등 연산자 (등가 연산자)
		// 숫자를 비교하는 연산자로 연산결과를 논리값으로 리턴한다.
		int iVal =10; //데이터타입이 int인 변수명 iVal을 숫자10으로 초기화
		boolean b3 = iVal == 10; //boolean 데이터타입으로 하는 변수b3를 선언하여 iVal과 10숫자를 비교하여 논리값을 산출->일치 true
		System.out.println("b3>>> : " +b3); //값이 일치하므로 true값 인출, b3을 13이라고 하면 false 출력
		if (b3){ 
			System.out.println("if절 iVal == 10");
		}else{
			System.out.println("else절");
		}
		
/*이부분강사님이지움		//String을 데이터 타입으로 하는 변수명 s1을 선언하여 문자열 "aaa"로 초기화한다.
		String s1 = "aaa";
		//boolean 데이터타입으로 하는 변수명 b4를 선언하여 문자열 변수 s1과 문자열 "aaa"가 일치하는지 비교해 논리값을 산출
		boolean b4 = s1 == "aaa"; 
		System.out.println("b4 >>> : " +b4);
		if(b4){ //값이 일치하므로 true 
			System.out.println("if 절 s1 == 'aaa'");
		}else{
			System.out.println("else절");
		}  삭제*/
		
		int x = 80; //int를 데이터타입으로 하는 변수명 x를 선언하여 값80으로 초기화 한다.
		boolean b5 = 90 <= x; //boolean을 데이터타입으로하는 변수명 b5를 선언하여 숫자90과 변수x를 비교하여 논리값을 산출  
		System.out.println("b5 >>> : " + b5); //90<=80 false
		boolean b6 = x <= 100; //boolean을 데이터타입으로하는 변수명 b6를 선언하여 숫자100과 변수x를 비교하여 논리값을 산출  
		System.out.println("b6 >>> : " + b6); //80<=100 true
		boolean b7 = 90 <= x && x <= 100; //boolean을 데이터타입으로하는 변수명 b7를 선언하여 변수x가 90보다크거나같고100보다작거나같은지 논리값 출력  
		System.out.println("b7 >>> :" + b7); // 90<=80<=100 false 
		if(b7){
			System.out.println("if절 90 <= x && x <= 100");
		}else{
			System.out.println("else절");
		}
		System.out.println("if-else 다음 라인"); //if스콥에 걸리지 않음 인터프린트로 인출됨
	} //end of main 함수

}// end of FlowControlTest class


/*
b1 >>> : false
else절 

b2 >>> : true
if절 str1.equals('abc')
b3>>> : true
if절 iVal == 10
b5 >>> : false
b6 >>> : true
b7 >>> :false
else절
if-else 다음 라인
*/
