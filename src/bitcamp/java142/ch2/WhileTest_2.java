package bitcamp.java142.ch2;
//whileTest_1�� 
//0�϶����ƾ����������� ���ڻ���������޾Ƽ� �Լ��α��� �Լ��� ������ �޾� �����ֿܼ��� ���� ���
//�����Ѱ�
import java.util.Scanner;

public class WhileTest_2 {
	
	public int whileTest_2(Scanner sc, int num){
		int numV = num;
		int sum = 0;
		boolean bFlag = true;
		
		while (bFlag){
			System.out.print(">>> : " );
			String tmp =  sc.nextLine();
			
			try{
				numV=Integer.parseInt(tmp);
				if(numV != 0){
					sum += numV; 
				}else{
					bFlag = false;
				}//else��
			}catch(NumberFormatException e){
				System.out.println("������ >>> : " + e );
				bFlag = false;
			}//catch��
			
		} //while��
		return sum;
	} //�Լ� whileTest_2��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)"); 
		
		WhileTest_2 wt_2 =new WhileTest_2();
		int sum = wt_2.whileTest_2(sc,num);
		
		System.out.println("�հ谡 : " +sum);
	}

}

/*
�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)
>>> : 200
>>> : 123
>>> : 10
>>> : 0
�հ谡 : 333

�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)
>>> : ���
������ >>> : java.lang.NumberFormatException: For input string: "���"
�հ谡 : 0

*/
