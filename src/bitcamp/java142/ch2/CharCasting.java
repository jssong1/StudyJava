package bitcamp.java142.ch2;

public class CharCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		char data[] = {'a','b','c'}; //data�� �������� ����
		char data1[] = new char [] {'a','b','c'};
		
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		
		System.out.println("str >>> : " + str);
		System.out.println(data);
		System.out.println("data >>>: "+ data); //�ּҰ�����/ [<--�迭���� �ǹ�
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
		 * [] : �迭 ������
		 * char �迭�� ����µ�
		 * char �����Ͱ� �� ������ 3�� ����ÿ�
		 * [3] -> ��(����)3���� ����ÿ�
		 * �迭�� �ν��Ͻ��ϸ� ������Ʈ�� �ȴ�
		 * [0],[1],[2] <- ���� 0,1,2 �� ÷�� Ȥ�� �ε������ �θ���.
		 * */
		
	} //end of main �Լ�

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
