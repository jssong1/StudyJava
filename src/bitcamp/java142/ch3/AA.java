package bitcamp.java142.ch3;

public class AA extends BB {
	public AA(){
		System.out.println("AA()������");
	}
	
	// �������̵� : ����Ŭ�����κ��� ��ӹ��� �ż����� ������ �����ϴ� �� (�����ڴ� �������̵� ����)
	// BB Ŭ������ �ִ� bb() �Լ��� 
	// AA Ŭ������ �������̵�(overriding)�ߴ�.
	public void bb(){
		System.out.println("bb()�Լ� >>> : AA");
	}
	
//	public void bb(String str){
//		System.out.println("bb(String str)�Լ� >>> : AA" +str);
//	} //�������̵��ؼ� �����ε������ʵ��� //����� �ѹ����ϱ�
	
}//AAŬ������
