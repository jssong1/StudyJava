package bitcamp.java142.ch2;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i = 0;
		boolean bFlag = true;
		
		while (bFlag){
			
			
			if(sum>100){
				break; //break�� ���� ���⼭ ��� �ߴ�
//				bFlag = false; // break��� false��� i=15�� sum120���� ���
			}
			i++;
			sum += i;
			
		}//while��
		System.out.println("i= " + i);
		System.out.println("sum= " + sum);
	}//main��
}//class��

/*
i= 14
sum= 105

break ��� false �������� ���
i= 15
sum= 120

*/
