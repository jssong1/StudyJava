package bitcamp.java142.ch2;

import java.util.Scanner;

public class SwitchTest {
// case������ ������ ������ �ʴ´�?
	//1~12�ܿ����� �ȳ����� �ض�
	
	
	public void switchTest(int month){
		System.out.println("switchTest �Լ� ����>>>");
		int monthVal = month;
		
		switch (monthVal){ //case���� ���� ���� ����� �����ϸ�, �ߺ����� �ʾƾ� �Ѵ�.
			case 3:
			case 4:
			case 5:
				System.out.println("���� ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("���� ������ �����Դϴ�.");
				break;
//			case 12: case 1: case2:
//				System.out.println("���� ������ �ܿ��Դϴ�.");
//				break;
			default:
				System.out.println("���� ������ �ܿ��Դϴ�.");
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �Է��Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		int month  = sc.nextInt();
		Boolean monBool1 = month <=12;
		Boolean monBool2 = month >=1;
		System.out.println("monBool1 : "+ monBool1 + " & monBool2 : " +monBool2 );
		
		if (monBool1 && monBool2){
			System.out.println("if�� ����>>>");
		switch (month){ //swich���� ���ǽ� ����� �����Ǵ� ���ڿ��̾���Ѵ�.
			case 1:
				System.out.println("1���Դϴ�.");
				break;
			case 2:
				System.out.println("2���Դϴ�.");
				break;
			case 3:
				System.out.println("3���Դϴ�.");
				break;
			case 4:
				System.out.println("4���Դϴ�.");
				break;
			case 5:
				System.out.println("5���Դϴ�.");
				break;
			case 6:
				System.out.println("6���Դϴ�.");
				break;
			case 7:
				System.out.println("7���Դϴ�.");
				break;
			case 8:
				System.out.println("8���Դϴ�.");
				break;
			case 9:
				System.out.println("9���Դϴ�.");
				break;
			case 10:
				System.out.println("10���Դϴ�.");
				break;
			case 11:
				System.out.println("11���Դϴ�.");
				break;		
			case 12:
				System.out.println("12���Դϴ�.");
				break;

		}//swich�� ��
		
		SwitchTest st = new SwitchTest();
		st.switchTest(month); 
		
		System.out.println("<<< switchTest �Լ� ����");
		System.out.println("if�� ����>>>");
		
		}else{
			System.out.println(">>>>>>>>>>month�� 1~12 �Է°����մϴ�.");
		}
	}//main�Լ�()��

}//SwichTest Ŭ���� ��


/*
���� ���� �Է��Ͻÿ� >>> : 
12
monBool1 : true & monBool2 : true
if�� ����>>>
12���Դϴ�.
switchTest �Լ� ����>>>
���� ������ �ܿ��Դϴ�.
<<< switchTest �Լ� ����
if�� ����>>>
*/