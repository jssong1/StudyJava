package bitcamp.java142.ch2;
//���� p154 �ܹ���
import java.util.Scanner;
public class SwitchTest_2 {
	
	//����� �÷��� ���� -> ��� �ν��Ͻ��ϰ� �������°ź��� ����� �������� �������°� ����
	public static final String GENDER_M_1 = "����� 2000�� ������ ����� �����Դϴ�.";
	public static final String GENDER_M_3 = "����� 2000�� ���Ŀ� ����� �����Դϴ�.";
	public static final String GENDER_F_2 = "����� 2000�� ������ ����� �����Դϴ�.";
	public static final String GENDER_F_4 = "����� 2000�� ������ ����� �����Դϴ�.";
	//Ŭ������.����� �ҷ�����
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ֹι�ȣ�� �Է��Ͻÿ� >>> : 123456-1");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		int regNoLen = regNo.length();
		if(regNoLen==8){
			System.out.println("regNoLen >>> : " + regNoLen);
			char gender = regNo.charAt(7);
			System.out.println("gender >>> : " + gender);
			//���������� �Լ� ȣ��
		}else{
			
			
		}
		
	}//main �Լ���

}//Ŭ���� ��
