package bitcamp.java142.ch3;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(0/0);
		}
		catch(ArithmeticException e){ //catch ���� ���� ������ ���� �ִ�/ �׷��� ������ ���������� ���� 
			System.out.println("e <<< :" + e);
		}
		catch(Exception e){//�������� �ֻ��� Exception�̹Ƿ� �̰Ÿ� �ᵵ �ȴ� (�ȵǴ°͵��ֱ���)
			System.out.println("e >>> :" +e);
		}finally{
			System.out.println("���� ��");
		}
		System.out.println("���� ��");

	}//���γ�

}//Ŭ������
/*
 e <<< :java.lang.ArithmeticException: / by zero
���� ��
���� ��
*/