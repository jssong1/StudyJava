package bitcamp.java142.ch3;


public class ParentClass extends Object{ //extends (java.lang.)Object{
		
	public ParentClass(){ //�Ű����� ���� ������
		System.out.println("ParentClass() ������ >>> : ");
	}

	public ParentClass(String strV ){ //�Ű������� ���ڿ��� ���� ������
		System.out.println("ParentClass(String strV) ������ >>> : " +strV);
	}
}

	//javac -d . C*.java P*.java /ChildClass,ParentClass���� �������ϴ¹�
