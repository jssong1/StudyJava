package bitcamp.java142.ch2;
public class ForTest_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=0; i<5; i++){ //���� ����� �ٱ����� 
//			for (int j=0; j<i; j++){ //�����λ���� 
//				System.out.print("��");
//			} //for j��
//			System.out.println();
//		} //for i��
		
		for (int i=0; i<5; i++){ //���� ����� �ٱ����� 
			for (int j=0; j<3; j++){ //�����λ���� 
				System.out.print("��");
			} //for j��
		System.out.println();
	} //for i��	
		
		for (int i=0; i<5; i++){ //���� ����� �ٱ����� 
//			System.out.print("����");
//			System.out.print("��");
			for (int j=0; j<3; j++){ //�����λ���� 
//				System.out.print("��");
				System.out.print("("+i+","+j+")");
//				System.out.print("*");
			} //for j��			
//			System.out.print("��");
			System.out.println();
		} //for i��		
	} //main�Լ�()��
}//ForTest_2 Ŭ���� ��
/*

�ڡڡ�
�ڡڡ�
�ڡڡ�
�ڡڡ�
�ڡڡ�
(0,0)(0,1)(0,2)
(1,0)(1,1)(1,2)
(2,0)(2,1)(2,2)
(3,0)(3,1)(3,2)
(4,0)(4,1)(4,2)

*/