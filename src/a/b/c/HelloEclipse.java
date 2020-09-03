package a.b.c;
/* 
 * 사용자 정의 클래스를 새로 만들면
 * Default로 java.lang.Object 클래스를 상속하고 있다.
 * 상용자 정의 클래스에서는 java.lang.Object 클래스에 있는 자원을
 * 생성자 및 함수를 참조변수 없이 사용할 수 있으며 또는 
 * Object 클래스를 인스턴스해서 참조 변수를 이용해서 사용해도 관계없다.
 * 
 * extends 키워드 : 클래스 상속 키워드
 * */
public class HelloEclipse {

	public void hello(){
		System.out.println("헬로 이클립스!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hello Eclipse!! ");
	}

}


