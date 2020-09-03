package bitcamp.java142.ch3;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageInterface mi = new MessageEn();//인터페이스먼저선언! 부모참조변수생겨/걔가상속한클래스선택함/추가,변경할때도쉬움 그리고 추가한거만컴파일하면됨
		mi.sayHello("JEONG");
		MessageInterface mi1 = new MessageKor();//인터페이스제대로사용하는거/부모인터페이스클래스 선언,부모참조변수가지고 자식인스턴스해서 구현부 사용
		mi1.sayHello("정");
		
		
//		MessageKor mk = new MessageKor();
//		mk.sayHello("이"); //값은 나오겠지만 인터페이스 제대로이용한게아니야 
		
		//인터페이스는 추상함수있어야함/ 인터페이스는 구현부가 꼭 있어야함 / 갯수는 상관없음
		//인터페이스 클래스는 인스턴스할수없음
		//인스턴스방법 : 부모인터페이스클래스 참조변수 = new 자식클래스
		//참조변수.추상함수(매개변수);
	}

}


/*
 Hello Ms.JEONG
 안녕하세요~ 정씨!!!
 */
