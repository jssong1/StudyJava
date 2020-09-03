package bitcamp.java142.ch3;

public class AA extends BB {
	public AA(){
		System.out.println("AA()생성자");
	}
	
	// 오버라이딩 : 조상클래스로부터 상속받은 매서드의 내용을 변경하는 것 (생성자는 오버라이딩 안함)
	// BB 클래스에 있는 bb() 함수를 
	// AA 클래스로 오버라이딩(overriding)했다.
	public void bb(){
		System.out.println("bb()함수 >>> : AA");
	}
	
//	public void bb(String str){
//		System.out.println("bb(String str)함수 >>> : AA" +str);
//	} //오버라이딩해서 오버로딩하지않도록 //상속은 한번만하기
	
}//AA클래스끝
