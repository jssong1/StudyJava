package bitcamp.java142.ch2;

//p414
//public char switchTest_1(){
//	
//	return ' ';
//}

public class SwitchTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("1");
			System.out.println("���� ó�� ���� >>>:");
		//try catch() finally ����ó�� ����
			try{
				System.out.println("2");
				System.out.println(10/0); //���ܸ� ��Ƽ� catch���̵�
				System.out.println("3");
			}catch(ArithmeticException a){
				// ArithmetixException ���� Ŭ����
				// a : ��������
				// catch ���� ���ܰ� �߻����� ���� ����ȴ�.
				System.out.println("4");
				System.out.println("������ >>> : "+ a);
				System.out.println("5");
							}//catch��			
	
//			finally{
//				//finally ������ ���� �����ϴ�.
//				System.out.println("6");
//				System.out.println("try catch �������� �׻� (���ܰ� �ֵ� ������) ����Ǵ� ��");
//				System.out.println("7");
//			}
	}//main�Լ���

}//Ŭ������


/*
1
���� ó�� ���� >>>:
2
4
������ >>> : java.lang.ArithmeticException: / by zero
5
*/