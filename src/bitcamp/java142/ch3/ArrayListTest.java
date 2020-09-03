package bitcamp.java142.ch3;


import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//리턴값boolean; add함수(매개변수:E e)
		//java.util의 ArrayList import하기 
		//배열하는 통arraylist는 데이터타입관계없이 (element object) //동일한데이터타입아니라도 다들어감
			ArrayList aList = new ArrayList();// aList 변수명을 선언하여 Arraylist를 인스턴스 한다.
			aList.add("정송원");//add()함수를 사용하여 aList배열에 문자 "정송원"을 추가 출력
			boolean bool0 = aList.add("쏭");//add함수의 리턴값이 불리안이니까 매개변수가 트루라면 값이 출력되어 aList에 데이터가 붙여진다
			System.out.println("bool0 >>> : " + bool0);
			aList.add(77);//데이터타입이 int도 가능하네
			aList.add(10.22);//더블 데이터타입도 가능하넹
			aList.add(aList); //인스턴스한 자신 클래스를 입력하니까 this Collection으로 추가되넹
			aList.add(new Integer(79));// 
			aList.add(new ArrayListTest());//
			System.out.println("aList >>> : " +aList);
			int aListSize= aList.size();
			System.out.println("aListSize >>> : " +aListSize);
			for (int i=0; i< aListSize; i++){
				System.out.println("aList.get("+i+") >>> : " + aList.get(i));
			}
			
			//ArrayList는 implements List<E>인터페이스를 상속한거니까
			//인터페이스List의 참조변수이용하여 ArrayList클래스 add구현부 사용하기 (제대로사용한거임권장)
			//length 필드대신 size()함수로 배열의길이구함
			List list = new ArrayList();
			list.add("정송원");
			list.add(77);//인트
			list.add(11.222);//더블
			list.add(list); //인스턴스한 자신 클래스를 입력하니까 this Collection으로 추가되넹
			list.add(new Integer(10));// add함수안에 Integer클래스로 새로운 생성자를인스턴스하여 데이터출력
			list.add(new ArrayListTest());//
			System.out.println("list >>> : " +list);
			int listSize= list.size(); //list클래스의 size함수로 길이구하기 (static없음; 리턴값int;매개변수()없음)
			System.out.println("listSize >>> : " +listSize);
			for (int i=0; i< listSize; i++){ //list클래스의 get함수를 이용하여 첨자(i)번째의 데이터를 출력하기// 첨자가 0부터 배열의 길이값까지 1씩증가하며 반복수행
				System.out.println("list.get("+i+") >>> : " + list.get(i));
			}//for문 끝
	}//main()끝
}//클래스 끝


/*
bool0 >>> : true
aList >>> : [정송원, 쏭, 77, 10.22, (this Collection), 79, bitcamp.java142.ch3.ArrayListTest@15db9742]
aListSize >>> : 7
aList.get(0) >>> : 정송원
aList.get(1) >>> : 쏭
aList.get(2) >>> : 77
aList.get(3) >>> : 10.22
aList.get(4) >>> : [정송원, 쏭, 77, 10.22, (this Collection), 79, bitcamp.java142.ch3.ArrayListTest@15db9742]
aList.get(5) >>> : 79
aList.get(6) >>> : bitcamp.java142.ch3.ArrayListTest@15db9742
list >>> : [정송원, 77, 11.222, (this Collection), 10, bitcamp.java142.ch3.ArrayListTest@6d06d69c]
listSize >>> : 6
list.get(0) >>> : 정송원
list.get(1) >>> : 77
list.get(2) >>> : 11.222
list.get(3) >>> : [정송원, 77, 11.222, (this Collection), 10, bitcamp.java142.ch3.ArrayListTest@6d06d69c]
list.get(4) >>> : 10
list.get(5) >>> : bitcamp.java142.ch3.ArrayListTest@6d06d69c
*/