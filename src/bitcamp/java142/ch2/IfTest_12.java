package bitcamp.java142.ch2;

import java.util.Scanner;

public class IfTest_12 {
	public String scoreTest1(int score){
		System.out.println(">> ScoreTest.main �Լ� ���� ! ");
		
		String grade = "";
		String opt = ""; 
		int scoreVal = score;
		
		if (scoreVal >=90){
			grade = "A";
			if (scoreVal >=98){
				opt = "+";
//				grade = grade+opt;
			}else if (scoreVal <= 94){
				opt = "-";
//				grade = grade+opt;
			}
		}else if(scoreVal >= 80){
			grade = "B";
			if (scoreVal >=88){
				opt = "+";
//				grade = grade+opt;
			}else if (scoreVal <= 84){
				opt = "-";
//				grade = grade+opt;
		}else {
			grade = "C";
//			grade = grade+opt;
			}
		}
		
		System.out.println("ScoreTest.main �Լ� ��! << ");
		grade = grade+opt;
		return grade;
//		return grade = grade+opt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("> IfTest_12.main �Լ� ���� ! ");
		
		int score = 0;
		
		System.out.println("������ �Է��ϼ��� >>>>>>>> : ");
		Scanner sc = new Scanner(System.in);
	    score = sc.nextInt(); 
		
		//��ȿ��������
		boolean b1 = 0 <= score;
		System.out.println("b1 >>> : " +b1 );
		boolean b2 = 100 >= score;
		System.out.println("b2 >>> : " +b2 );
		
		if (0 <= score && score <=100){
			System.out.println(">>>>>��ȿ������ ���Դٸ� main�Լ��� if�� ����");
			
			IfTest_12 it = new IfTest_12(); 
			String grade = it.scoreTest1(score);
//			String opt = it.scoreTest1(score);
			
			System.out.printf("����� ������ %d�Դϴ�. %n", score);
			System.out.printf("����� ������ %s�Դϴ�. %n", grade);
			System.out.println("main�Լ��� if�� �� <<<<<");
		}else{
			System.out.println("else��: ������ 0~100���� �Է��ϼ��� <<<<<");
		}//else�� ��
		
		System.out.println("IfTest_12.main �Լ� �� ! <");
	}//main�Լ� ��

}//IfTest_12Ŭ���� ��


/*
> IfTest_12.main �Լ� ���� ! 
������ �Է��ϼ��� >>>>>>>> : 
87
b1 >>> : true
b2 >>> : true
>>>>>��ȿ������ ���Դٸ� main�Լ��� if�� ����
>> ScoreTest.main �Լ� ���� ! 
ScoreTest.main �Լ� ��! << 
����� ������ 87�Դϴ�. 
����� ������ C�Դϴ�. 
main�Լ��� if�� �� <<<<<
IfTest_12.main �Լ� �� ! <
*/