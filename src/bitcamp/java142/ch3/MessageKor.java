package bitcamp.java142.ch3;

public class MessageKor implements MessageInterface {//MessageInterface 인터페이스를 상속받은 MessageKor 클래스 

	@Override //인터페이스의 추상함수를 필수로 오버로드해야한다. 추상함수의 구현부 완성 (영어버전)
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요~ "+name + "씨!!!");
	}

}
