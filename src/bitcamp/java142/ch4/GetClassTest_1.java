package bitcamp.java142.ch4;

import a.b.c.HelloEclipse;//���� �������Ŭ������������ 

public class GetClassTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����ϴ����
//		HelloEclipse he =new HelloEclipse();
//		he.hello();

		
		//������ newInstatnce()�Լ� �Ẹ�� �Ź� new�Ҽ��� �����ϱ� 
		try{
			Class cla = Class.forName("a.b.c.HelloEclipse");//
			System.out.println("�������� cla3 >>> : " + cla);
			HelloEclipse he = (HelloEclipse)cla.newInstance();
			he.hello();
		}
//		catch(Exception e){}//������ �̰��ϳ��� ���������
		catch (ClassNotFoundException e){}
		catch (InstantiationException e){}
		catch (IllegalAccessException e){}
		
		
	}//main��

}//GetClassTest_1 Ŭ������

/*
�������� cla3 >>> : class a.b.c.HelloEclipse
��� ��Ŭ����!!
*/