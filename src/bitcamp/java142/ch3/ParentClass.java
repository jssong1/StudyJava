package bitcamp.java142.ch3;


public class ParentClass extends Object{ //extends (java.lang.)Object{
		
	public ParentClass(){ //매개변수 없는 생성자
		System.out.println("ParentClass() 생성자 >>> : ");
	}

	public ParentClass(String strV ){ //매개변수로 문자열을 가진 생성자
		System.out.println("ParentClass(String strV) 생성자 >>> : " +strV);
	}
}

	//javac -d . C*.java P*.java /ChildClass,ParentClass같이 컴파일하는법
