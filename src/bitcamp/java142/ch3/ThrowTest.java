package bitcamp.java142.ch3;

public class ThrowTest {
//Throw : �����ڰ� ���ܸ� ���������� �߻���Ű�°�
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
		Exception e = new Exception("���ܸ� ���Ƿ� �߻���Ŵ");//ExceptionŬ�������� Exception(String message) ������ :Constructs a new exception with the specified detail message. (api����)		
		throw e; //throw new Exception("���ܸ� ���Ƿ� �߻���Ŵ"); ���ٷξ������� 
		}catch(Exception e){
			System.out.println("�����޽��� >>> : " + e.getMessage()); //getMessage�Լ� �����޼����߰�
//			e.printStackTrace();//�����ϸ����������� �ֳ��ϸ� �޸𸮸� ���� ���� ������
		}
		System.out.println("���α׷� ���� ���� : " );
	}//main()��

}

/* e.printStackTrace();���� ���������

�����޽��� >>> : ���ܸ� ���Ƿ� �߻���Ŵ
java.lang.Exception: ���ܸ� ���Ƿ� �߻���Ŵ
	at bitcamp.java142.ch3.ThrowTest.main(ThrowTest.java:12)
���α׷� ���� ���� : 
*/
/* e.printStackTrace(); �������� ��
 
 �����޽��� >>> : ���ܸ� ���Ƿ� �߻���Ŵ
 ���α׷� ���� ���� : 
*/