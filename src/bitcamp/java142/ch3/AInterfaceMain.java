package bitcamp.java142.ch3;

public class AInterfaceMain implements AInterface, BInterface { //2개이상 -> 다중상속!!

	//인터페이스는 추상클래스와같이 무조건 추상함수를 오버라이딩해야함/ 다중상속받은 클래스에있는 추상함수모두!! 하나라도 빠지면 에러남
	//인터페이스는 키워드만 인터페이스지 파일확장명은 .class로저장임
	
	@Override
	public void b_aMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void b_bMethod() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public void aMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dMethod() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
