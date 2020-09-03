package bitcamp.java142.ch3;

public class ChildClass extends ParentClass{

	public ChildClass(){
//		super();//매개변수없으면 그냥 호출/ this;같은역할
		super("상속한 클래스 생성자 호출");//대신매개변수같은거찾음/ super함수()는 상속해준클래스의(부모클래스)생성자의 호출한다 
		//그런데 super함수의 매개변수(파라미터)의 타입과 개수순서가 맞는 생성자를 호출한다.
		//super함수는 부모클래스의 생성자를 호출하는 자바규칙에의해 정해진기능을 수행할떄는 항상생성자 바로첫라인에 적는다 
		// 생성자 선언부와 super함수 중간에는 어떤것도 올수없다.
		System.out.println("ChildClass() 생성자 >>> : ");	
	}
		
//	public String toString(){ //java.lang패키지object클래스에서 toString()가져와서 내가 변경한거야 (부모거가져와서맘대로써도됨 재사용)
//		return "난 Object 클래스에 있는 toString()함수입니다. >>>:";
//	}

	public String toString(){ //java.lang패키지object클래스에서 toString()가져와서 내가 변경한거야 (부모거가져와서맘대로써도됨)
		return "난 Object 클래스에 있는 toString()함수재정의했음 >>>:";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ChildClass main()함수");
		ChildClass cc = new ChildClass();
		System.out.println("cc>>>" + cc);//주소값나옴	--> cc.toString()을 쓰자 달라짐
		System.out.println("cc>>>" + cc.toString());//parents클래스인 Object클래스에있는 toString()함수데려와서 바꾼거야 그럼위에cc도 주소값에서 함수결과로 달라져
		//위에 함수재설정안하면 object에서 toString가져오니까 주소값2개나옴
	}//main 끝

}//ChildClass끝

/*
D:\00.BITCAMP\00.JExam\ch3>java bitcamp.java142.ch3.ChildClass
ChildClass main()함수
ParentClass(String strV) 생성자 >>> : 상속한 클래스 생성자호출
ChildClass() 생성자 >>> :

D:\00.BITCAMP\00.JExam\ch3>javap bitcamp.java142.ch3.ChildClass
Compiled from "ChildClass.java"
public class bitcamp.java142.ch3.ChildClass extends bitcamp.java142.ch3.ParentClass {
  public bitcamp.java142.ch3.ChildClass();
  public static void main(java.lang.String[]);
}

ChildClass main()함수
ParentClass(String strV) 생성자 >>> : 상속한 클래스 생성자호출
ChildClass() 생성자 >>> : 
cc>>>난 Object 클래스에 있는 toString()함수재정의했음 >>>:
cc>>>난 Object 클래스에 있는 toString()함수재정의했음 >>>:


*/
