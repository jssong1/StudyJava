package bitcamp.java142.ch2;

public class ForTest_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int sum = 0;//��������
		for (int i=1; i<=10; i++){
			sum += i; // sum =sum+i;
			System.out.printf("1���� %2d������ �� : %2d%n",i, sum);	// %2d 10������ 2�ڸ��� �������� ǥ��  %n:�ٹٲ�		
		}	
		String sV[] = {"abc","def","ghi"};
		//for������ ����ϴٰ� "def"�� �� ��� �ߴ��ϱ�

		for (int i=0; i< sV.length ; i++){
			System.out.println("sV["+i+"] >>> : " +sV[i]);
			//���ڿ� �񱳴� equals()�Լ��� �̿��Ұ�
			if ("def".equals(sV[i])){ //�Լ��ϱ�==���� �ȵ�
 //			if ("def"==sV[i]){
				break;
			}			
		}		
		char cV[] = {'a','b','c','d','e'};
		//for������ ����ϴٰ� 'd'�� �� ��� �ߴ��ϱ�
		
		for (int j=0; j<cV.length; j++){
			System.out.println("cV["+j+"] >>> : "+cV[j]);
			
			//if(0X64==cV[j]{
			if ('d'==cV[j]){
				break;
			}			
		}		
		//int iV[] = new int[]{1, 2, 3, 4, 5};
		int iV[] = {1, 2, 3, 4, 5}; //iV�� ���������̸鼭 ���������� new int[]�� �����Ȱ�
		//iV�����͸� �ֿܼ� ���
		for(int i =0; i<iV.length; i++){			
			//3�϶� ���߱�
//			if (3 == iV[i]){
//				break;//3,4,5�� ��¾ȵ�
//			}			
			System.out.println("<<<iV["+i+"]>>> :"+iV[i]);
			
			//3�϶� ���߱�
			if (3 == iV[i]){
				break;//4,5�� ��¾ȵ�
			}			
		}		
		//iV�����͸� �ֿܼ� ���
//		System.out.println(">>> : "+iV[0]);
//		System.out.println(">>> : "+iV[1]);
//		System.out.println(">>> : "+iV[2]);
//		System.out.println(">>> : "+iV[3]);
//		System.out.println(">>> : "+iV[4]);		
	} //main�Լ�()��

}// ForTest_1Ŭ����

/*
1����  1������ �� :  1
1����  2������ �� :  3
1����  3������ �� :  6
1����  4������ �� : 10
1����  5������ �� : 15
1����  6������ �� : 21
1����  7������ �� : 28
1����  8������ �� : 36
1����  9������ �� : 45
1���� 10������ �� : 55
sV[0] >>> : abc
sV[1] >>> : def
cV[0] >>> : a
cV[1] >>> : b
cV[2] >>> : c
cV[3] >>> : d
<<<iV[0]>>> :1
<<<iV[1]>>> :2
<<<iV[2]>>> :3

*/