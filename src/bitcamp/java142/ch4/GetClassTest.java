package bitcamp.java142.ch4;

public class GetClassTest { //extends java.lang.Object가 생략된것과 같음 사용자정의 클래스는 기본적으로 조상 Object클래스를 상속받으니까

	public void aMethod(){
		System.out.println("GetClassTest.aMethod 함수입니당");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetClassTest cct = new GetClassTest(); //자기자신데이터쓰려고 인스턴스->기본생성자만들어짐
		System.out.println("----------참조변수 cct 주소값 >>> : "+cct);
		System.out.println("cct.getClass() >>> : "+cct.getClass());//object클래스의getclass()함수//리턴형은 Class<T> 그 클래스 이름을 리턴하는거
		System.out.println("cct.getClass().getName() >>> : "+cct.getClass().getName());//


		Object obj = new GetClassTest(); //부모클래스(Object클래스)를 선언해서 자식클래스(GetClassTest) 인스턴스
		GetClassTest cct1 = (GetClassTest)obj;//자식거 꺼내서 형변환
		System.out.println("----------참조변수 cct1 주소값 >>> : "+cct1);
		System.out.println("cct1.getClass() >>> : "+cct1.getClass());//object클래스의getclass()함수//리턴형은 Class<T> //실행되는 클래스를 리턴
		System.out.println("cct1.getClass().getName() >>> : "+cct1.getClass().getName());//그 클래스 이름을 리턴하는거
		
		
		Class cla = obj.getClass(); //Class 클래스인 cla변수명을 선언하여 obt  
		System.out.println("1. 참조변수 cla >>> : "+cla);
		
		Object obj1 = new Object(); // 
		Class cla1 = obj1.getClass();
		System.out.println("참조변수 cla1 >>> : "+cla1);
		
		try{
		Class cla2 = Class.forName("bitcamp.java142.ch4.GetClassTest"); //패키지.클래스명이 bitcamp.java142.ch4.GetClassTest를 찾아서 클래스리턴
		System.out.println("참조변수 cla2 >>> : "+cla2); //리턴된 [class 패키지명.클래스명]출력
	
		}catch (ClassNotFoundException e){
			
		}
		
		/* 클래스를 메모리에 올리는(객체화 하는) 방법
		 1. new 연산자를 이용해서 생성자 사용하는 방법
		 2. 상속하는 방법
		 3. 추상클래스(obstract class)를 getInstance()함수로 이용하는 방법
 		 4. Class.forName("패키지명.클래스이름")함수를 이용해서 
 		 	패키지명.클래스이름으로 클래스 찾은 후 newInstatnce()함수 이용하는 방법
		 */
		
		try{
		Class cla3 = Class.forName("bitcamp.java142.ch4.GetClassTest"); //이 클래스를 찾아서
		System.out.println("----------참조변수 cla3 >>> : "+cla3); //리턴된 [class 패키지명.클래스명]출력
		GetClassTest cct2 = (GetClassTest)cla3.newInstance();
		System.out.println("newInstance의 리턴값은 t/cct2의 리턴값은? >>>> :"+cct2); //주소값나옴
		cct.aMethod();
		}
		catch (ClassNotFoundException e){}
		catch (InstantiationException e){}
		catch (IllegalAccessException e){}
	}//메인끝	
}//GetClassTest 클래스 끝

/*
**getClass()함수 //Class<?> //Oject클래스안
	Returns the runtime class of this Object.
**getName()함수 //public String //Class<T>안에
	Returns the name of the entity (class, interface, array class,primitive type, or void) represented by this Class object,as a String. 
**forName(String className)함수//리턴: static Class<?> 
Returns the Class object associated with the class orinterface with the given string name. 
**newInstance() 함수 // 리턴값 : T //Class클래스안
Creates a new instance of the class represented by this Classobject. 
**T - the type of the class modeled by this Class object. 
	For example, the type of String.class is Class<String>. Use Class<?> if the class being modeled is unknown.
*/
/*
----------참조변수 cct 주소값 >>> : bitcamp.java142.ch4.GetClassTest@15db9742
cct.getClass() >>> : class bitcamp.java142.ch4.GetClassTest
cct.getClass().getName() >>> : bitcamp.java142.ch4.GetClassTest
----------참조변수 cct1 주소값 >>> : bitcamp.java142.ch4.GetClassTest@6d06d69c
cct1.getClass() >>> : class bitcamp.java142.ch4.GetClassTest
cct1.getClass().getName() >>> : bitcamp.java142.ch4.GetClassTest
1. 참조변수 cla >>> : class bitcamp.java142.ch4.GetClassTest
참조변수 cla1 >>> : class java.lang.Object
참조변수 cla2 >>> : class bitcamp.java142.ch4.GetClassTest
----------참조변수 cla3 >>> : class bitcamp.java142.ch4.GetClassTest
newInstance의 리턴값은 t/cct2의 리턴값은? >>>> :bitcamp.java142.ch4.GetClassTest@7852e922
GetClassTest.aMethod 함수입니당
*/