package bitcamp.java142.ch3;

public class AAABBBClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)자식클래스만 인스턴스
		//부모거에 주소값주면
		System.out.println("1-1번================================");
		AAA a = new AAA();// 부모클래스BBB를 상속받은 AAA의 클래스를 변수명 a로 선언하여 AAA자식클래스만 인스턴스 
		a.water(); //자식 클래스 자기안에 있는 함수이므로 출력
		System.out.println("a.color >>> : " + a.color);// 자식클래스에는 상속받은 부모AAA클래스의함수가 모두 있는것과 같으므로 String color의 디폴트값 null출력
		System.out.println("a.door >>> : " + a.door);// 자식클래스에는 상속받은 부모AAA클래스의함수가 모두 있는것과 같으므로 int door의 디폴트 값인 0 출력
		a.drive(); //자식클래스에는 상속받은 부모AAA클래스의함수가 모두 있는것과 같으므로 BBB에서 상속되어진 AAA클래스의 함수drive()가 invoke되어 "drive"출력
		a.stop(); //자식클래스에는 상속받은 부모AAA클래스의함수가 모두 있는것과 같으므로 BBB에서 상속되어진 AAA클래스의 함수stop()이 invoke되어 "stop"출력
				
		System.out.println("1-2번================================");
		BBB b = null; // 클래스 BBB를 참조변수명 b를 선언하여 null로 초기화
		b = a; // b = (BBB) a; //b에 AAA클래스를 인스턴스한 a를 형변환하여 대입 (묵시적형변환이 일어남?? BBB>AAA)
		b.drive(); // 참조변수를 부모클래스BBB에게 옮겨진것과 같아 BBB클래스의 함수drive()가 invoke되어 "drive"출력
		b.stop(); // 참조변수를 부모클래스BBB에게 옮겨진것과 같아 BBB클래스의 함수stop()이 invoke되어 "stop"출력
		System.out.println("b.color >>> : " + b.color); //참조변수를 부모클래스BBB에게 옮겨진것과 같아 BBB클래스의 String color이 invoke되어  String 디폴트값 null출력
		System.out.println("b.door >>> : " + b.door); //참조변수를 부모클래스BBB에게 옮겨진것과 같아 BBB클래스의 int door이 invoke되어 int 디폴트값 0출력
		//b.water(); //참조변수를 부모클래스에 옮겨진 것과 같아 자식AAA클래스에 있는 water()함수는 쓸수 없음
				
		System.out.println("1-3번================================");
		//A는 자식거쓸수있어 근ㄷ ㅔ 캐스팅필요
		AAA a1 = (AAA)b; // b를 다시 (AAA클래스에 맞추어)형변환하여 변수명 a1에 바인딩 
		a1.water();// 참조변수를 자식AAA클래스에 맞추어 형변환했기때문에 AAA클래스에 있는 water()함수 출력가능 
		System.out.println("a : " + a); //AAA클래스를 인스턴스한 a의 주소값
		System.out.println("b : " + b); // AAA클래스를 인스턴스한 a를 형변환하여 b에 바인딩한 주소값
		System.out.println("a1 : " + a1);// b를 다시 AAA클래스에 맞추어 형변환하여 a1에 바인딩한 주소값  
		
		//--------------------------------
		//2)부모클래스 부모= new 자식클래스();
		//부모클래스선언해서 자식인스턴스 우리가연습하고있는거
		System.out.println("2번================================");
		BBB b1 = new AAA(); // 부모BBB클래스를 선언하여 변수명 b1에 자식AAA클래스를 인스턴스한다. 
		System.out.println("b1.color >>>"+ b1.color); // 인스턴스한 자식AAA클래스의 String color의 디폴트값 null출력(상속받은 BBB클래스에 있는 함수 쓴거)
		System.out.println("b1.door >>>"+ b1.door);// 인스턴스한 자식 AAA클래스의 int door의 디폴트 값인 0 출력 (상속받은 BBB클래스에 있는 함수 쓴거)
//자기참조변수가됨
		b1.drive(); //인스턴스한 자식AAA클래스의 함수drive()가 invoke되어 "drive"출력 (상속받은 BBB클래스에 있는 함수 쓴거)
		b1.stop(); //인스턴스한 자식AAA클래스의 함수drive()가 invoke되어 "stop"출력 (상속받은 BBB클래스에 있는 함수 쓴거)
		//b1.water(); //부모클래스를 선언하여 자식클래스를 인스턴스했다면 자식클래스의 함수를 쓰기 위해 부모클래스의 형변환 필요
		
		AAA a2 = (AAA)b1;//참조변수사용방법; 부모자식간에도 형변환필요 (자식클래스를 선언하여 또다른 참조변수를 선언하여 형변환한거 바인딩)
		a2.water();	//자식클래스의 함수 사용가능  
	
		
		System.out.println("3번================================");
		//--------------------------------------------
		//3) 부모클래스 부모1 = new 부모클래스();
		//부모자신인스턴스하는건고려대상아니야자식과관련없음
		BBB b2 = new BBB(); 
		System.out.println("b2.color >>>"+ b2.color);
		System.out.println("b2.door >>>"+ b2.door);
		b2.drive();
		b2.stop();
		//b2.water(); //자식거니까 못씀 다른클래스의 다른함수
			
		//------------------------------------------------
		//4) 자식클래스 자식1 = (자식클래스)new 부모클래스(); 
		//자식선언해서 부모캐스팅하는건 성립안해 에러남 이렇게형변환안써 
		//AAA a3 = (AAA) new BBB(); // 에러남 
		//a3.water();

		//1)2)만 연구하기

	}//main함수 끝
}//클래스 끝

/*
1-1번================================
water
a.color >>> : null
a.door >>> : 0
drive
stop
1-2번================================
drive
stop
b.color >>> : null
b.door >>> : 0
1-3번================================
water
a : bitcamp.java142.ch3.AAA@15db9742
b : bitcamp.java142.ch3.AAA@15db9742
a1 : bitcamp.java142.ch3.AAA@15db9742
2번================================
b1.color >>>null
b1.door >>>0
drive
stop
water
3번================================
b2.color >>>null
b2.door >>>0
drive
stop
*/