package bitcamp.java142.ch3;

public class A extends B {

	public A(){
		System.out.println("A()������");
	}
	
	public void b(){
		System.out.println("b()�Լ� >>> : A");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();// Ŭ���� A�� �ν��Ͻ��ϸ� ��Ӱ����ִ� BŬ������ �� ��Ӱ��� Object���� �ν��Ͻ��Ǿ� �����ִ�.
		//Ŭ������ �޸𸮿� �ö󰡸鼭 �����ڵ� �����Ǿ� �ö󰣴�. Object -> BŬ���� -> AŬ���� ������/ ���� B������, A������ ������ ��µȴ�.		
		
		a.b();//aŬ������ b()�Լ� ȣ��/ ���ź���ã���ϱ� AŬ�������ִ� �Լ� b�� ��µ�/ AŬ������ �Լ�b�����ٸ� ��Ӱ����ִ� BŬ������ �Լ�b���,������ Object�����ö�..
		
	}//main()�Լ� ��
}//AŬ���� ��

/*
B()������
A()������
b()�Լ� >>> : A
*/