package bitcamp.java142.ch2;
//�׻� ������ �ٴϱ�
public class ObjectNullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���������� ����ϴ� ��� ��ü�� �׻� null�� �ʱ�ȭ�ؾ��Ѵ�.
		
		String strV = null; //����� 
//		String strV;
//		cf) String StrV1=""; �������ִ°�! ���̱��ϸ� 0���´�
		System.out.println("strV >>> : " +strV); 
//		System.out.println("strV.length() >>> : " +strV.length()); //null�ʱ�ȭ�� �������� ���̾��� ������/java.lang.NullPointerException(�������������� �����¿���)
		
		strV = "abc";
		//������Ʈ�� ������Ÿ�԰� �������������Ͽ�  �η� �ʱ�ȭ�ϸ� ���������� �����Ͱ� ���� ������ ����Ҽ� ���� �׷��ϱ� ���������ϱ����� �����͹ٲ�����
		
		if (strV !=null && strV.length() > 0){} //�����Ͱ��ִٴ¶�! String�� �ڵ鸵�Ҷ� �ɾ���� ����/ �����Ͱ��־����! Ʈ��ų�false�� ���߹���
		
		try{
		}catch(Exception e){
		}finally{
			if(strV != null){
				strV=null;//���۰� ���� null�� �ʱ�ȭ�ؾ��ϱ⶧���� finally�� ����//������ ���󵵵����� ���߿��� ��ӽ����..?! 
			}
		}
	}// main��
}//class��


/*
strV >>> : null
*/