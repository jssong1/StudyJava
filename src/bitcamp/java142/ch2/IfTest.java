package bitcamp.java142.ch2;

public class IfTest {
	//��� 
	public static final String ID_TEST = "ssong"; //������������, static, �������, ��������(���)
	public static final String PW_TEST = "won777";//������������, static, �������, ��������(���)
	
	
	//�α����Լ������
	public boolean loginTest (String id, String pw){
		String idVal =id;
		String pwVal =pw;
		boolean boolLogin = false;
		
		if (ID_TEST.equals(idVal)&& PW_TEST.equals(pwVal)){
			boolLogin = true;
		}
		
		return boolLogin;
	}
	
	//�ܼ� �ܺε����� �ҷ����� ��� 1.������μ� ��� 2.ScannerŬ���� ���
	//java bitcamp.java142.ch2.IfTest ssong wong777 //�ι��� ��ĭ�ϳ� �־ �Է��ϸ� �迭�� ����
	//String[] args: ����� �μ� : ��Ʈ���迭
	//String args[]={"ssong", "won777"}; // �ֿܼ��� �Է��� �����Ͱ� ���ͼ� �迭����

	public static void main(String[] args) {  //[]������ //args������
		// TODO Auto-generated method stub
		System.out.println("IfTest.main()�Լ� ����");
		if(args.length == 2){ //�迭�Ǳ��̴� length�ʵ� //
			System.out.println("If ���� >>> ");
			String id = args[0]; //��������; StringŸ���� ������id����; ���� args�� �迭÷�ڰ� 0�� ���� ���ε��Ѵ� 
			String pw = args[1]; //��������; StringŸ���� ������pw����; ���� args�� �迭÷�ڰ� 1�� ���� ���ε��Ѵ�
			System.out.println(id + " : " + pw);
			//�α��η���
			IfTest it = new IfTest(); //��������� 
			boolean bool = it.loginTest(id,pw);
			if (bool){
				System.out.println("If ���� >>> ");
				System.out.println("�α��� �Ϸ�");
			}else{
				System.out.println("else ���� >>> ");
				System.out.println("�α��� ����");
				}
		}else{ //if(args.length == 2)��
			System.out.println("�ΰ��� �Է��Ͻÿ�");
		}//else��
	}

} //�Լ���


/*
 * IfTest.main()�Լ� ����
If ���� >>> 
ssong : won777
If ���� >>> 
�α��� �Ϸ�
*/
 