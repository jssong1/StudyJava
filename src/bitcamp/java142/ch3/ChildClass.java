package bitcamp.java142.ch3;

public class ChildClass extends ParentClass{

	public ChildClass(){
//		super();//�Ű����������� �׳� ȣ��/ this;��������
		super("����� Ŭ���� ������ ȣ��");//��ŸŰ�����������ã��/ super�Լ�()�� �������Ŭ������(�θ�Ŭ����)�������� ȣ���Ѵ� 
		//�׷��� super�Լ��� �Ű�����(�Ķ����)�� Ÿ�԰� ���������� �´� �����ڸ� ȣ���Ѵ�.
		//super�Լ��� �θ�Ŭ������ �����ڸ� ȣ���ϴ� �ڹٱ�Ģ������ ����������� �����ҋ��� �׻������ �ٷ�ù���ο� ���´� 
		// ������ ����ο� super�Լ� �߰����� ��͵� �ü�����.
		System.out.println("ChildClass() ������ >>> : ");	
	}
		
//	public String toString(){ //java.lang��Ű��objectŬ�������� toString()�����ͼ� ���� �����Ѱž� (�θ�Ű����ͼ�����νᵵ�� ����)
//		return "�� Object Ŭ������ �ִ� toString()�Լ��Դϴ�. >>>:";
//	}

	public String toString(){ //java.lang��Ű��objectŬ�������� toString()�����ͼ� ���� �����Ѱž� (�θ�Ű����ͼ�����νᵵ��)
		return "�� Object Ŭ������ �ִ� toString()�Լ����������� >>>:";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ChildClass main()�Լ�");
		ChildClass cc = new ChildClass();
		System.out.println("cc>>>" + cc);//�ּҰ�����	--> cc.toString()�� ���� �޶���
		System.out.println("cc>>>" + cc.toString());//parentsŬ������ ObjectŬ�������ִ� toString()�Լ������ͼ� �ٲ۰ž� �׷�����cc�� �ּҰ����� �Լ������ �޶���
		//���� �Լ��缳�����ϸ� object���� toString�������ϱ� �ּҰ�2������
	}//main ��

}//ChildClass��

/*
D:\00.BITCAMP\00.JExam\ch3>java bitcamp.java142.ch3.ChildClass
ChildClass main()�Լ�
ParentClass(String strV) ������ >>> : ����� Ŭ���� ������ȣ��
ChildClass() ������ >>> :

D:\00.BITCAMP\00.JExam\ch3>javap bitcamp.java142.ch3.ChildClass
Compiled from "ChildClass.java"
public class bitcamp.java142.ch3.ChildClass extends bitcamp.java142.ch3.ParentClass {
  public bitcamp.java142.ch3.ChildClass();
  public static void main(java.lang.String[]);
}

ChildClass main()�Լ�
ParentClass(String strV) ������ >>> : ����� Ŭ���� ������ȣ��
ChildClass() ������ >>> : 
cc>>>�� Object Ŭ������ �ִ� toString()�Լ����������� >>>:
cc>>>�� Object Ŭ������ �ִ� toString()�Լ����������� >>>:


*/
