package bitcamp.java142.ch3;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageInterface mi = new MessageEn();//�������̽���������! �θ�������������/�°������Ŭ����������/�߰�,�����Ҷ������� �׸��� �߰��ѰŸ��������ϸ��
		mi.sayHello("JEONG");
		MessageInterface mi1 = new MessageKor();//�������̽�����λ���ϴ°�/�θ��������̽�Ŭ���� ����,�θ��������������� �ڽ��ν��Ͻ��ؼ� ������ ���
		mi1.sayHello("��");
		
		
//		MessageKor mk = new MessageKor();
//		mk.sayHello("��"); //���� ���������� �������̽� ������̿��ѰԾƴϾ� 
		
		//�������̽��� �߻��Լ��־����/ �������̽��� �����ΰ� �� �־���� / ������ �������
		//�������̽� Ŭ������ �ν��Ͻ��Ҽ�����
		//�ν��Ͻ���� : �θ��������̽�Ŭ���� �������� = new �ڽ�Ŭ����
		//��������.�߻��Լ�(�Ű�����);
	}

}


/*
 Hello Ms.JEONG
 �ȳ��ϼ���~ ����!!!
 */
