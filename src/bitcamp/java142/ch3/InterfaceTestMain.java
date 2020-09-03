package bitcamp.java142.ch3;

public class InterfaceTestMain implements InterfaceTest {

	@Override
	public void interfaceTest() {  //부모인터페이스에서 가져온 추상함수껍데기를 자식클래스에서 오버라이딩(필수)
		// TODO Auto-generated method stub
		System.out.println("InterfaceTest()>>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 클래스는 인스턴스할수없음
//		InterfaceTest it = new InterfaceTest();
		InterfaceTestMain itm = new InterfaceTestMain(); //자식인스턴스해서 오버라이딩된 함수가져오기//구현부를 직접쓰지마;값은 나오겠지만 인터페이스 제대로이용한게아니야 
		itm.interfaceTest();
		
		//인터페이스는 추상함수있어야함/ 인터페이스는 구현부가 꼭 있어야함 / 갯수는 상관없음
		InterfaceTest ift = new InterfaceTestMain(); //인터페이스제대로사용하는거/부모인터페이스클래스 선언,부모참조변수가지고 자식인스턴스해서 구현부 사용
		//인스턴스방법 : 인터페이스클래스 참조변수 = new 자식클래스
		ift.interfaceTest();
		
	}//main함수() 끝
}//InterfaceTestMain 클래스 끝

/*
InterfaceTest()>>> : 
InterfaceTest()>>> : 
*/


