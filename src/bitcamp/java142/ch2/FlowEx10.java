package bitcamp.java142.ch2;
//���� p154 ȥ���غ���
import java.util.Scanner;

public class FlowEx10 {

	
	public void feScore(int score){
		System.out.println(">>>>>>>�Լ� feScore ����");
		int feSco = score;
		char grade = ' ';
		
		try{
		switch(feSco/10){
			case 10:
			case 9:
				grade = 'A';
				System.out.printf("����� ������ %c�Դϴ�. %n", grade);
				break;
			case 8:
				grade = 'B';
				System.out.printf("����� ������ %c�Դϴ�. %n", grade);
				break;
			case 7:
				grade = 'C';
				System.out.printf("����� ������ %c�Դϴ�. %n", grade);
				break;
			default :
				grade = 'F';
				System.out.printf("����� ������ %c�Դϴ�. %n", grade);
			
			} //����ġ ��
		}catch(ArithmeticException a){
			System.out.println("������ :" + a);
		}finally{}


	}//feScore �Լ���
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int score = 0;

		System.out.println("����� ������ �Է��ϼ���>>> : ");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		
		Boolean scoBool1 = score >=0;
		Boolean scoBool2 = score <= 100;
		System.out.println("scoBool1 ���� : " + scoBool1+ " && scoBool2 ���� : " + scoBool2);
		
		if (scoBool1 && scoBool2){
			System.out.println(">>>>>>>>>>>>main�Լ��� if�� ����");
			FlowEx10 fe = new FlowEx10();
			fe.feScore(score); //static ������ �������� �̿� ��������.�Լ���()

					
		}else{//if��
			System.out.println("������ 1~100������ ���� �Է��Ͻÿ�");
		}
			System.out.println("main�Լ��� if�� ��<<<<<<<<<<<<<<");
	}//main�Լ� �� 

}// FlowEx10 ��


/*
����� ������ �Է��ϼ���>>> : 
97
scoBool1 ���� : true && scoBool2 ���� : true
>>>>>>>>>>>>main�Լ��� if�� ����
>>>>>>>�Լ� feScore ����
����� ������ A�Դϴ�. 
main�Լ��� if�� ��<<<<<<<<<<<<<<
*/