package bitcamp.java142.ch3;

public abstract class AB { //�߻�Ŭ���� abstract����
	
	//�߻�Ŭ������ �Ϲ��Լ�, �߻��Լ� ��� �����ϴ� �߻��Լ��ִ�.
	//cf. �������̽��� �߻��Լ��� �´�. �Ϲ��Լ��� ���´�.
	
	public static String commonMethod(){
		//Ư���� ���� ����
		//�߻�Ŭ�������� ���ν��Ͻ��������ϰ�  (new Ű���� ���Ұ�)
		//static�ٿ��� Ŭ����.�Լ�()�̿��ϵ��� 
		//�Լ��̸��� �״�� ��������
		return "���� ������ �Լ��̴�! �ν��Ͻ��ؼ� �����������";
	}
	
	//�Ϲ��Լ�
	//�����:public void ab() �� 
	//������:{System.out.println("ab() >>> : AB");}�� ������ �ִ�.
	public void ab(){ 
		System.out.println("ab() >>> : AB");
	}
	
	//�߻��Լ�
	//����θ� ���� : public abstract void abAbstract();
	//�����δ� ������������
	public abstract void abAbstract();  
		
	
}//ABŬ���� ��
