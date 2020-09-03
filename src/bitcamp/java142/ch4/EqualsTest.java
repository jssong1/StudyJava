package bitcamp.java142.ch4;

class Value {
	int value; // 멤버변수; 사용자정의 Value클래스의 int데이터타입인 value변수명을 선언하여 초기화 .

	// public Value(){ //int의 데이터타입을 매개변수로 받는 생성자
	// System.out.println("value>>> : " + value);
	// }

	public Value(int value) { // int의 데이터타입을 매개변수로 받는 생성자
		this.value = value;//
		System.out.println("this.value>>> : " + this.value);
	}

} // Value 클래스 끝

public class EqualsTest {


	public static void main(String[] args) {		// 클래스 여러개가능 메인이있는 클래스에 public을 적고 파일명도 메인있는 클래스명으로 하긩
		// TODO Auto-generated method stub

		Value v1 = new Value(10);// 사용자정의 클래스 Value의 데이터 쓰겠다/v1변수명/ =대입연산자/매개변수가
									// int인 생성자 불러와서 멤버변수를 10으로 초기화
		Value v2 = new Value(10);// 사용자정의 클래스 Value의 데이터 쓰겠다/v2변수명/ =대입연산자/매개변수가
									// int인 생성자 불러와서 멤버변수를 10으로 초기화
		System.out.println("참조변수 v1 주소값" + v1);
		System.out.println("참조변수 v2 주소값" + v2);

		if (v1.equals(v2)) { // Object클래스의 equals()함수
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니당.");
		} // if끝

		v2 = v1;// v2에 v1값을 바인딩 값이 같아진다
		System.out.println("참조변수 v1 주소값" + v1);
		System.out.println("참조변수 v2 주소값" + v2);
		if (v1.equals(v2)) {// Object클래스의 equals()함수
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다다다다다다.");
		} // if끝

		String sV = "abc";
		String sV1 = "abc";
		if (sV.equals(sV1)) {// String클래스의 equals()함수 ; 문자열만 비교, 나머지는 Object클래스의
								// equals()함수
			System.out.println("sV와 sV1은 같습니다.");
		} else {
			System.out.println("sV와 sV1는 다릅니다.");
		} // if 끝

	} // main 끝
}// EqualsTest class 끝


/*
this.value>>> : 10
this.value>>> : 10
참조변수 v1 주소값bitcamp.java142.ch4.Value@15db9742
참조변수 v2 주소값bitcamp.java142.ch4.Value@6d06d69c
v1과 v2는 다릅니당.
참조변수 v1 주소값bitcamp.java142.ch4.Value@15db9742
참조변수 v2 주소값bitcamp.java142.ch4.Value@15db9742
v1과 v2는 같습니다.
sV와 sV1은 같습니다.
*/