package bitcamp.java142.ch2;

import java.util.Scanner;
//p142������ �Լ��� �̿��Ͽ� �����

public class IfTest_1 {

	public char scoreTest(int score){ //��������; void�������Ƿ� ������ ����; �Լ��� scoreTest; �Ű������� ������Ÿ����int�� score
		System.out.println("scoreTest �Լ� ���� !");
		System.out.println("�����Լ����� �ҷ��� score������ Ȯ�� >>>  " + score);
		char grade = ' '; //������Ÿ���� char�� ������ grade�� �����Ͽ� ������� �ʱ�ȭ
		int scoreVal = score; // ������ Ÿ���� int�� ������ scoreVal�� �����Ͽ� ������� �ʱ�ȭ

		if (scoreVal >= 90){ //if�� ����
			System.out.println("�Լ�scoreTest�� 90���̻� if�� ����! ");
			grade = 'A';
		}else if(scoreVal >= 80){
			System.out.println("�Լ�scoreTest�� 80���̻� else if�� ����! ");
			grade = 'B';
		}else if(scoreVal >= 70){
			System.out.println("�Լ�scoreTest�� 70���̻� else if�� ����! ");
			grade = 'C';
		}else{
			System.out.println("�Լ�scoreTest��  else�� ����! ");
			grade = 'D';
			
		}//else��
		System.out.println("scoreTest �Լ� ��~ ");
		return grade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IfTest_1.main �Լ� ���� ! ");
		int score = 0;
		
		System.out.println("������ �Է��ϼ��� >>>>>>>> : ");
		Scanner sc = new Scanner(System.in);
		// nextInt() : ���� ������ ���� �ޱ�
		score = sc.nextInt();
		
		//��ȿ��������
		boolean b1 = 0 <= score;
		System.out.println("b1 >>> : " +b1 );
		boolean b2 = 100 >= score;
		System.out.println("b2 >>> : " +b2 );
		
		if (0 <= score && score <= 100){
			System.out.println("IfTest_1.main �Լ��� if�� ����>>> : ");
			IfTest_1 it_1 = new IfTest_1();
//			System.out.println("grade ������ Ȯ�� >>> : " + grade); //Ȯ�ξȵ� �����;��� charŸ������
//			System.out.println("scoreVal ������ Ȯ�� >>> : " + scoreVal); //Ȯ�ξȵ�
			char grade = it_1.scoreTest(score); //���������� �Լ��� invoke�ϱ����ؼ��� �Լ��Ǹ��ϰ���Ÿ������ ���� ������ �����Ͽ� Ŭ������.�Լ�(�Ű�����)�� ���ε��Ѵ�
			System.out.println(">>>>>>>>>>>>>>>����� ������ " + grade + "�Դϴ�.<<<<<<<<<<<<<<<<<<");		
			System.out.println("IfTest_1.main �Լ��� if��  ��~ ");
		}else{
			System.out.println("else��  ���� >>> : ");
			System.out.println("������ 0���� 100���� �Դϴ�. ");
		} //else�� ��		
		
	} // main()�Լ���

}// IfTest_1 Ŭ������

/*Scanner Ŭ���� �Լ� �߿���
next() : ���� ������ ���ڿ� �ޱ�
nextInt() : ���� ������ ���� �ޱ�
nextDouble() : ���� ������ �Ǽ� �ޱ�
nextLine() : ���ڿ� ��ü �Է� �ޱ� (�Է°��� ������ �޴´�)
hasNextInt() : �Է��� ���� int���� �ƴϸ� false, int���̸� true

IfTest_1.main �Լ� ���� ! 
������ �Է��ϼ��� >>>>>>>> : 
77
b1 >>> : true
b2 >>> : true
IfTest_1.main �Լ��� if�� ����>>> : 
scoreTest �Լ� ���� !
�����Լ����� �ҷ��� score������ Ȯ�� >>>  77
�Լ�scoreTest�� 70���̻� else if�� ����! 
scoreTest �Լ� ��~ 
>>>>>>>>>>>>>>>����� ������ C�Դϴ�.<<<<<<<<<<<<<<<<<<
IfTest_1.main �Լ��� if��  ��~ 


*/
