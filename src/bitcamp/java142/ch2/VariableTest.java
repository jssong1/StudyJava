package bitcamp.java142.ch2;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		i = 2;
		System.out.println("i >>> : " + i);
		i = i + 3;
		System.out.println("i >>> : " + i);
		i = 0;
		System.out.println("i >>> : " + i);
		{
			i = 11; //��밡��
			System.out.println("i >>> : " + i);
			int ii = 22; //���⼭ �����Ͽ����Ƿ� �� ���߾ȿ����� ��밡��
		}
		System.out.println("i >>> : " + i); // �극�̽� �ۿ��� �����ߴٸ� �ֱٰ����� ������ (11������)
		//System.out.println("i >>> : " + ii); //�ۿ� ���ü������Ƿ� ������
	} //end of main �Լ�

} // end of class

/*
i >>> : 2
i >>> : 5
i >>> : 0
i >>> : 11
i >>> : 11
*/