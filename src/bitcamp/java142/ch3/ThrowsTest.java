package bitcamp.java142.ch3;

public class ThrowsTest {

	
//	throwsŰ���� �Լ��ڿ��ٰ� ���ܸ� �����ؼ� ���ܴ����ڴ�. ����ȣ���Ѱ����ٰ�(����ó�������ʰ�..!!//ó��,������ ���������� �����ؼ��ذ�try-catch)
	
//	public void bMethod(){
//		System.out.println("bMethod() �Լ� ����");
//		try {
//			System.out.println(0/0);
//		}catch(Exception e){
//			System.out.println("������ " + e);
//		}
//		System.out.println("bMethod() �Լ� ��");
//	}
	/*->��°��	//(8~25����)�̷��� ¥��ȵȴ� //����: try-catch���Լ����پ��ٸ� �޸𸮸� ��û���⵵�ϰ�/ throwsException�� �̿��Ͽ� ���ο��� ������Ҽ��ֵ����Ѵ�.
	aMethod()�Լ�
	bMethod()�Լ� ����
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at bitcamp.java142.ch3.ThrowsTest.bMethod(ThrowsTest.java:9)
		at bitcamp.java142.ch3.ThrowsTest.aMethod(ThrowsTest.java:15)
		at bitcamp.java142.ch3.ThrowsTest.main(ThrowsTest.java:23) (�������� �����̴ϱ� ���� �����̰�¡) 
	���� ȣ���� �ݴ������ ���ܸ� ������ ��Ÿ��
	*/

		
	public void bMethod() throws Exception{
			System.out.println("bMethod() �Լ� ����");
			System.out.println(0/0);
		}
	public void aMethod() throws Exception{
		System.out.println("aMethod() �Լ�");
		bMethod();
	}
	
	//main()�Լ��� �ܼ־����� �������̴�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { //���ο� throws Exception���� ��� try-catch�� �Ἥ ���ܹ޴� ���� �������Ѵ�. ���α������� ��� ���� ���߻��ߴ��� �˼��ְ� �������ִ�
		ThrowsTest tt = new ThrowsTest();
		tt.aMethod();
		}catch(Exception e){
		System.out.println("�����Լ� e " + e); // (exception�� ȣ���� �ݴ������ ������/ �������� �����̴ϱ� ���ܸ� �޴°��� ������ ���̰�¡) 
		}
		System.out.println("main()�Լ� ��");
	}//���γ�

}
/* �Լ����� ���ܸ� ������ ���ο����� try-catch�Ἥ �������
aMethod() �Լ�
bMethod() �Լ� ����
�����Լ� e java.lang.ArithmeticException: / by zero
main()�Լ� ��
*/
