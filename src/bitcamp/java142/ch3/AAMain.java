package bitcamp.java142.ch3;

public class AAMain {

	//생성자 오버로딩
	public AAMain(){
		System.out.println("AAmain()생성자");
	}
	public AAMain(String str){ //매개변수로 문자열을 가진 생성자
		System.out.println("AAmain(String str)생성자");
	}
	public AAMain(String str, int i){ //매개변수로 문자열과 int데이터타입을 가진 생성자
		System.out.println("AAmain(String str, int i)생성자");
	}
	
	//같은 클래스에서 함수이름과 리턴형이 같고
	//매개변수(파라미터)가 다른 함수가 있으면
	//함수 오버로딩(overlodading)이라고 한다  // cf.오버라이딩은 상속관계에서 일어나는거
	
	public void bb(){
		System.out.println("bb()함수 >>> : AAmain");
	}//AAmain클래스는 인스턴스 하지않았으니까 출력되지않음. 자원이다른겨	
	
	public void bb(String str){
		System.out.println("bb(String str)함수 >>> : AAmain >>> " +str);
	}
	
	public void bb(String str, int i){
		System.out.println("bb(String str, int i)함수 >>> : AAmain >>> " + str + " & " + i);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA aa = new AA();//public이 접근자인 클래스 AA를 인스턴스하면 상속관계있는 BB클래스까지 인스턴스되어 쓸수있다.
		//클래스가 메모리에 올라가면서 생성자도 생성되어 올라간다. BB클래스 -> AA클래스 부모자식순으로/ 따라서 BB생성자, AA생성자 순으로 출력된다.	
		aa.bb();//인스턴스 된 aa클래스의 bb()함수 호출/자신부터 찾으니까 AA클래스에있는 함수 bb가 출력됨/ AA클래스에 함수bb가 없다면 상속관계있는 BB클래스의 함수bb출력
		
		AAMain aam = new AAMain();
		aam.bb(); //이름은 같지만 별개자원인 bb()함수임
		aam.bb("song");//AAMain클래스의 bb(String)함수를 호출 매개변수데이터는 song으로 대입해서 출력
		aam.bb("song",1); 
		AAMain aam_1 = new AAMain("정송원"); 
		AAMain aam_2 = new AAMain("정송원",77);
	}//main함수끝
}//AAMain끝

/*
BB()생성자
AA()생성자
bb()함수 >>> : AA
AAmain()생성자
bb()함수 >>> : AAmain
bb(String str)함수 >>> : AAmain >>> song
bb(String str, int i)함수 >>> : AAmain >>> song & 1
AAmain(String str)생성자
AAmain(String str, int i)생성자
*/
