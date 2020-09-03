package bitcamp.java142.ch4;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//jdk 1.5이전
		Double db = new Double(2.59);
		double db1 = db.doubleValue(); //인스턴스해서 형변환으로 
		System.out.println("db >>> : " + db);
		System.out.println("db1 >>> : " + db1);
		
		int i = 2;//기본형 int2
		Integer it = new Integer(11);//참조형 11
		int sum = i + it.intValue(); //기본형과 참조형끼리는 덧셈하려면 참조형(Integer객체였던)을 intValue()함수를 이용하여 int타입의 값으로 변환
		int it1 = it.intValue();//intValue(): Integer객체를 int타입의 값으로 변환
		int sum1 = i + it1;
		System.out.println("sum >>> : " + sum);//그럼 int+int
		System.out.println("it1은 int로 바뀜 sum1 >>> : " + sum1);//그럼 int+int
		
	
		int it2 = new Integer(11).intValue();
		int it21 = 10 + it2;
		
		int it3 = Integer.parseInt("11");
		int it31 = 2 + it3;
		
		int it4 = (int)Integer.valueOf("11"); //static Integer - valueOf(String s): Returns an Integer object holding the value of the specified String. 
		int it41 = 4 + it4;
		
		System.out.println("it >>> : " + i + it);
		System.out.println(i + it1);
		System.out.println("it21 = 10 + it2 >>> : " + it21);
		System.out.println( "2 + it3 >>> : "+ it31);
		System.out.println("4 + it4 >>> : " + it41);
		//기본데이터형에 대입하려면 
		
		//
		//1. 기초자료형에 대입
		//2. 레퍼클래스 이용 -> 참조변수이용하기위해 뉴인스턴스필요 ->기초자료형에 대입하려면 참조변수에 Value()함수로 치환했어야함//1.5이후는 오토박싱 가능
		//jdk 1.5부터
		Double d = 2.59; //참조변수d ; boxing했다 //생성자생략됨//1.5버전이후에는 뉴인스턴스안하고 바로 대입
		System.out.println("d >>> : " + d);
		double d1 = d; //일반변수d1; unboxing했다
		System.out.println("d1 >>> : " + d1);
	}

}
