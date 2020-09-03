package bitcamp.java142.ch3;

public class A extends B {

	public A(){
		System.out.println("A()생성자");
	}
	
	public void b(){
		System.out.println("b()함수 >>> : A");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();// 클래스 A를 인스턴스하면 상속관계있는 B클래스와 그 상속관계 Object까지 인스턴스되어 쓸수있다.
		//클래스가 메모리에 올라가면서 생성자도 생성되어 올라간다. Object -> B클래스 -> A클래스 순으로/ 따라서 B생성자, A생성자 순으로 출력된다.		
		
		a.b();//a클래스의 b()함수 호출/ 내거부터찾으니까 A클래스에있는 함수 b가 출력됨/ A클래스에 함수b가없다면 상속관계있는 B클래스의 함수b출력,없으면 Object까지올라가..
		
	}//main()함수 끝
}//A클래스 끝

/*
B()생성자
A()생성자
b()함수 >>> : A
*/