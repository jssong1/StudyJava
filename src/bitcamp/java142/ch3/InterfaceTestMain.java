package bitcamp.java142.ch3;

public class InterfaceTestMain implements InterfaceTest {

	@Override
	public void interfaceTest() {  //�θ��������̽����� ������ �߻��Լ������⸦ �ڽ�Ŭ�������� �������̵�(�ʼ�)
		// TODO Auto-generated method stub
		System.out.println("InterfaceTest()>>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� Ŭ������ �ν��Ͻ��Ҽ�����
//		InterfaceTest it = new InterfaceTest();
		InterfaceTestMain itm = new InterfaceTestMain(); //�ڽ��ν��Ͻ��ؼ� �������̵��� �Լ���������//�����θ� ����������;���� ���������� �������̽� ������̿��ѰԾƴϾ� 
		itm.interfaceTest();
		
		//�������̽��� �߻��Լ��־����/ �������̽��� �����ΰ� �� �־���� / ������ �������
		InterfaceTest ift = new InterfaceTestMain(); //�������̽�����λ���ϴ°�/�θ��������̽�Ŭ���� ����,�θ��������������� �ڽ��ν��Ͻ��ؼ� ������ ���
		//�ν��Ͻ���� : �������̽�Ŭ���� �������� = new �ڽ�Ŭ����
		ift.interfaceTest();
		
	}//main�Լ�() ��
}//InterfaceTestMain Ŭ���� ��

/*
InterfaceTest()>>> : 
InterfaceTest()>>> : 
*/


