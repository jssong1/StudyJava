package bitcamp.java142.ch2;
//���� p155 ȥ���غ���
import java.util.Scanner;

public class FlowEx11 {
	//���
	public static final String GENDER_M_1 = "����� 2000�� ������ ����� �����Դϴ�.";
	public static final String GENDER_M_3 = "����� 2000�� ���Ŀ� ����� �����Դϴ�.";
	public static final String GENDER_F_2 = "����� 2000�� ������ ����� �����Դϴ�.";
	public static final String GENDER_F_4 = "����� 2000�� ���Ŀ� ����� �����Դϴ�.";
	//Ŭ������.����� �ҷ�����
	
	public void Flowgender(char gender){
		char flowGen = gender;
		switch(flowGen){
//			case '1': case '3':
//				switch(flowGen){
				case'1':
					System.out.println("" + FlowEx11.GENDER_M_1);
					break;
				case'3':
					System.out.println("" + FlowEx11.GENDER_M_3);
					break;
//				}
//			break;
//			default:
//				switch(flowGen){
				case'2':
					System.out.println("" + FlowEx11.GENDER_F_2);
					break;
				case'4':
					System.out.println("" + FlowEx11.GENDER_F_4);
					break;
//				}
		
		}//����ġ ��
		
		
	}//�Լ���
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("����� �ֹι�ȣ ��7�ڸ��� �Է��Ͻÿ� >>> (ex.123456-2): "); 
		Scanner sc = new Scanner(System.in); //Scanner�� �̿��Ͽ� �ֿܼ��� �����͸� �޾ƿ´� 
		String genNo = sc.nextLine();//StringŸ���� ������ �����Ͽ� nextLine()�Լ��� �̿� ���ڿ� ��ü �Է� �ޱ� (�Է°��� ������ �޴´�)
	
		char gender = genNo.charAt(7);//charAt()�Լ��� �̿��Ͽ� 
		
		System.out.println("�Է��� �ֹι�ȣ Ȯ�� >>> : "+ genNo);
		System.out.println("�޹�ȣ�� ù��° �ڸ� Ȯ�� >>> :"+ gender);
		
//		Boolean genBool1 = gender =='1';
//		Boolean genBool2 = gender =='2';
//		Boolean genBool3 = gender =='3';
//		Boolean genBool4 = gender =='4';
//		System.out.println("1�ΰ�? : "+genBool1);
//		System.out.println("2�ΰ�? : "+genBool2);
//		System.out.println("3�ΰ�? : "+genBool3);
//		System.out.println("4�ΰ�? : "+genBool4);

		Boolean genBool10 = gender=='1'||gender=='2'||gender=='3'||gender=='4';
		System.out.println("genBool10 >>> : "+genBool10);	
		
		if(genBool10){
			System.out.println(">>>>>>>>>>>>main�Լ��� if�� ����");
			FlowEx11 fe11 = new FlowEx11();
			fe11.Flowgender(gender);
		}else{
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
	}//main�Լ���

}//Ŭ������

/*
����� �ֹι�ȣ ��7�ڸ��� �Է��Ͻÿ� >>> (ex.123456-2): 
154697-1
�Է��� �ֹι�ȣ Ȯ�� >>> : 154697-1
�޹�ȣ�� ù��° �ڸ� Ȯ�� >>> :1
genBool10 >>> : true
>>>>>>>>>>>>main�Լ��� if�� ����
����� 2000�� ������ ����� �����Դϴ�.
*/