package bitcamp.java142.ch2;

public class CharCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		char data[] = {'a','b','c'}; //data란 참조변수 선언
		char data1[] = new char [] {'a','b','c'};
		
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		
		System.out.println("str >>> : " + str);
		System.out.println(data);
		System.out.println("data >>>: "+ data); //주소값나옴/ [<--배열값을 의미
		System.out.println("data[0] >>>: " + data[0]);
		System.out.println("data[2] >>>: " + data[1]);
		System.out.println("data[3] >>>: " + data[2]);
		System.out.println(data1);
		System.out.println("data1 >>>: " + data1);
		System.out.println("data1[0] >>>: " + data1[0]);
		System.out.println("data1[1] >>>: " + data1[1]);
		System.out.println("data1[2] >>>: " + data1[2]);
		System.out.println(c);
		System.out.println("c >>>: " + c);
		System.out.println("c[0] >>>: " + c[0]);
		System.out.println("c[1] >>>: " + c[1]);
		System.out.println("c[2] >>>: " + c[2]);
		
		/*
		 * [] : 배열 연산자
		 * char 배열을 만드는데
		 * char 데이터가 들어갈 공간을 3개 만드시오
		 * [3] -> 방(공간)3개를 만드시오
		 * 배열을 인스턴스하면 오브젝트가 된다
		 * [0],[1],[2] <- 숫자 0,1,2 를 첨자 혹은 인덱스라고 부른다.
		 * */
		
	} //end of main 함수

} // end of class

/*
 * str >>> : abc
abc
data >>>: [C@15db9742
data[0] >>>: a
data[2] >>>: b
data[3] >>>: c
abc
data1 >>>: [C@6d06d69c
data1[0] >>>: a
data1[1] >>>: b
data1[2] >>>: c
abc
c >>>: [C@7852e922
c[0] >>>: a
c[1] >>>: b
c[2] >>>: c
*/
