package bitcamp.java142.ch3;

public abstract class AB { //추상클래스 abstract붙음
	
	//추상클래스는 일반함수, 추상함수 모두 가능하다 추상함수있다.
	//cf. 인터페이스는 추상함수만 온다. 일반함수는 못온다.
	
	public static String commonMethod(){
		//특별한 공통 로직
		//추상클래스에서 뉴인스턴스하지못하게  (new 키워드 사용불가)
		//static붙여서 클래스.함수()이용하도록 
		//함수이름은 그대로 가져가기
		return "나는 공통기능 함수이다! 인스턴스해서 사용하지마삼";
	}
	
	//일반함수
	//선언부:public void ab() 와 
	//구현부:{System.out.println("ab() >>> : AB");}를 가지고 있다.
	public void ab(){ 
		System.out.println("ab() >>> : AB");
	}
	
	//추상함수
	//선언부만 있음 : public abstract void abAbstract();
	//구현부는 존재하지않음
	public abstract void abAbstract();  
		
	
}//AB클래스 끝
