package bitcamp.java142.ch2;

import java.util.Scanner;

//����(�����Ǽ�)���ϴ� ��Ģ
public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("1�� 100������ ������ �Է��Ͻÿ�. >>> : ");
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�. >>> : ");
				
			}else if (input < answer){
				System.out.println("�� ū ���� �Է��Ͻÿ�. >>> : ");
			}
		}while(input != answer);
		
		System.out.println("�����Դϴ�. >>> : ");
		
		
//		double answer = Math.random(); //random() �Լ��� �����Լ�����Ѵ�; 0.0~1.0������ �Ҽ����� ������ �߻���Ŵ
//		System.out.println("answer >>> : "+answer);
//		answer = Math.random()*100;
//		System.out.println("answer >>> : "+answer);
//		int answerV = (int)(Math.random()*100); //������ �����ðž�
//		System.out.println("answerV >>> : "+answerV); 
//		int answerVs = (int)(Math.random()*100+1); //1~100������ ������ ���� ��! 1���Ͱ���������
//		System.out.println("answerVs >>> : "+answerVs);
//		
//		
//		do{ //do���� while���� �� ������ �ѹ� �����
//			System.out.print(">>>>");
//			
//		}while(1<0);
//		
//		
	}//main�Լ� ��

}//DoWhileTest Ŭ���� �� 


/*
1�� 100������ ������ �Է��Ͻÿ�. >>> : 
50
�� ���� ���� �Է��Ͻÿ�. >>> : 
1�� 100������ ������ �Է��Ͻÿ�. >>> : 
25
�� ���� ���� �Է��Ͻÿ�. >>> : 
1�� 100������ ������ �Է��Ͻÿ�. >>> : 
12
�� ū ���� �Է��Ͻÿ�. >>> : 
1�� 100������ ������ �Է��Ͻÿ�. >>> : 
18
�� ū ���� �Է��Ͻÿ�. >>> : 
1�� 100������ ������ �Է��Ͻÿ�. >>> : 
20
�� ���� ���� �Է��Ͻÿ�. >>> : 
1�� 100������ ������ �Է��Ͻÿ�. >>> : 
19
�����Դϴ�. >>> : 
*/