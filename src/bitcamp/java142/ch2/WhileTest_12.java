package bitcamp.java142.ch2;
//whileTest_1�� 
//0�϶����ƾ����������� ���ڻ���������޾Ƽ� �Լ��α��� �Լ��� ������ �޾� �����ֿܼ��� ���� ���
//�����Ѱ�
import java.util.Scanner;

public class WhileTest_12 {

	
	public void whileT (int num){
		int sum = 0;
		boolean flag;
				
				if (num!=0) { // num�� 0�� �ƴ϶�� 
					sum += num; // sum = sum + num;
				}else{
					flag = false; // num�� 0�̶�� falg���� flase�� ����
				}//else��


		return;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0; //��������; int ������Ÿ���� ������num��0���� �ʱ�ȭ/å���� while�ȿ��� ���� �ʱ�ȭ�ϱ⶧���� 0���� �ʱ�ȭ �������� ���������� ������ ����Ʈ������ �ʱ�ȭ�ϱ� 
		int sum = 0; // �������� int������Ÿ���� ������ sum�� 0���� �ʱ�ȭ
		boolean flag = true; //��������; boolean �������� ������ flag�� �����Ͽ� true���� ����  
		Scanner sc = new Scanner(System.in); // Scanner Ŭ������ �̿��Ͽ� �ֿܼ� �Է��� �����Ͱ��� �ҷ����� / importjava.util.Scanner;�ʿ�
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)"); 
		
		while(flag) { //while�� ���ǹ��� true�� �� �ݺ�����ȴ�
			WhileTest_12 wt = new WhileTest_12();
			System.out.print(">>"); 
			String tmp = sc.nextLine(); //StringŸ���� ������ tmp�� �����Ͽ� scanner�� ���� �����͸� �������ο� ���ڿ��� ����Ѵ�	
			try{ // "1.0"�̳� "���"���� ������ ������ ������ ���� �� ���� try-catch�� �����Ÿ���
				num =Integer.parseInt(tmp); //���� num�� tmp�� ���ڼ��ڸ� ���ڷ� ��ȯ�ϴ� �Լ��� �̿��Ͽ� ���ε��ϱ�  
				wt.whileT(num);
			}catch(NumberFormatException e){
				System.out.println("������ >>> : " + e );
				flag = false; //������ false�� �����ؼ� ������ �հ�����ϻ� 
			}
		

		}//while��
		System.out.println("�հ�:" + sum);
	} //main�Լ���

}//class��
