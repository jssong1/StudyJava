package bitcamp.java142.ch2;

import java.util.Scanner;

public class FlowControlTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//String str0 = args[0];
		//System.out.println("str0 >>> : " + str0);
		//��Ŭ���� : run - configuration - arguments ���Է��ؼ� ���
		//����â������ �ڹٽ����� �� �ڿ� ���Է��ؼ� ���
			
		// java.util��Ű���� ScannerŬ������ nextLine()�Լ� ��� (static�� �Ű���������)�ֿܼܺο��� �����͹޾ƿ���Ŭ����
		// ������������ ������ �ʱ�ȭ, int�� ������Ÿ���� ������ inVal�� ��0���� �ʱ�ȭ
		// ��������, Scanner�� ������sc�� �����Ͽ� �ν��Ͻ��Ѵ�.�Ű������� System.in(�ֿܼ��� �Է��� �����͸� �޾ƿ��� ��� in�ʵ�)
		// String�� ������ Ÿ���� ������ inTmp�� ���� ,static�����Ƿ� ���������̿�.�Լ���();
		int inVal = 0;
			
		System.out.println("���ڸ� �ϳ� �Է��ϼ��� >>> : ");
		Scanner sc = new Scanner(System.in);
		
		String inTmp = sc.nextLine();
		//int inTmp1 = sc.nextInt();
		System.out.println("inTmp >>> : "+ inTmp);
		
		// ���� ���� ���ڼ��ڸ� ���ڷ� ��ȯ�Ͽ� ����4�� �� �� true�� ������ 
		// Integer.parseInt(inTmp);
		// parseInt() �Լ� : ���ڼ��ڸ� ���ڷ� ��ȯ�ϴ� �Լ�
		inVal = Integer.parseInt(inTmp);
		if (4 == inVal){
			System.out.println("�Է��� ���ڴ� 4�Դϴ�.");
		}
		boolean b2 = 4 != inVal; //not������
		System.out.println("b2 >>> : " + b2);
		if (4 != inVal){
			System.out.println("�Է��� ���ڴ� 4�� �ƴմϴ�.");
		}else{
			System.out.printf("�Է��� ���ڴ� %d�Դϴ�.", inVal);
		}
		
		
		//printf : ����Ʈ�����Լ�, %d:10����
		//static int - parseInt(String s)  :integerŬ����
	}

}

/*
 ���ڸ� �ϳ� �Է��ϼ��� >>> : 
4
inTmp >>> : 4
�Է��� ���ڴ� 4�Դϴ�.
b2 >>> : false
�Է��� ���ڴ� 4�Դϴ�.

���ڸ� �ϳ� �Է��ϼ��� >>> : 
5
inTmp >>> : 5
b2 >>> : true
�Է��� ���ڴ� 4�� �ƴմϴ�.
 */

