package bitcamp.java142.ch3;

public class MessageKor implements MessageInterface {//MessageInterface �������̽��� ��ӹ��� MessageKor Ŭ���� 

	@Override //�������̽��� �߻��Լ��� �ʼ��� �����ε��ؾ��Ѵ�. �߻��Լ��� ������ �ϼ� (�������)
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���~ "+name + "��!!!");
	}

}
