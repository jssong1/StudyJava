package bitcamp.java142.ch2;

public class FlowControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if�� Ű������, ���� ����������, true�϶��� ����
		//if�� ��(����scope:�극�̽��κ�)�� true�϶��� ����
		//if��()�� ���� ����� true�� ���� ����ȴ�.
		
		
		boolean bool = false;
//		bool = true;
		//�񱳿����ڴ� ��� ���� ������ �����Ѵ�.
		boolean b1 = 3 < 0;
		System.out.println("b1 >>> : " + b1 );
		if (bool){ //bool=false,bool=true,3>0(true),3<0(false)���� ���Ȯ��
			System.out.println("if�� ");
		}else{
			System.out.println("else�� ");
		}
		System.out.println(""); //if���߿� �ɸ��� ���� ��������Ʈ�� ���� �����
		
		//StringŬ������ �ִ� equals()�Լ��� ���ڿ��� ���ؼ� ����(boolean value:true,false)�� �����Ѵ� 
		//static��� ��������.�Լ�������/ ���ϰ��� boolean
		String str1 = "abc";
		boolean b2 = str1.equals("abc"); //��ġ, " abc "�� ��� ��ġ��������->else�� ���
		System.out.println("b2 >>> : "+ b2);
		if(b2){
			System.out.println("if�� str1.equals('abc')");
		}else{
			System.out.println("else��");
		}
		
		// ==��� ������ (� ������)
		// ���ڸ� ���ϴ� �����ڷ� �������� �������� �����Ѵ�.
		int iVal =10; //������Ÿ���� int�� ������ iVal�� ����10���� �ʱ�ȭ
		boolean b3 = iVal == 10; //boolean ������Ÿ������ �ϴ� ����b3�� �����Ͽ� iVal�� 10���ڸ� ���Ͽ� ������ ����->��ġ true
		System.out.println("b3>>> : " +b3); //���� ��ġ�ϹǷ� true�� ����, b3�� 13�̶�� �ϸ� false ���
		if (b3){ 
			System.out.println("if�� iVal == 10");
		}else{
			System.out.println("else��");
		}
		
/*�̺κа����������		//String�� ������ Ÿ������ �ϴ� ������ s1�� �����Ͽ� ���ڿ� "aaa"�� �ʱ�ȭ�Ѵ�.
		String s1 = "aaa";
		//boolean ������Ÿ������ �ϴ� ������ b4�� �����Ͽ� ���ڿ� ���� s1�� ���ڿ� "aaa"�� ��ġ�ϴ��� ���� ������ ����
		boolean b4 = s1 == "aaa"; 
		System.out.println("b4 >>> : " +b4);
		if(b4){ //���� ��ġ�ϹǷ� true 
			System.out.println("if �� s1 == 'aaa'");
		}else{
			System.out.println("else��");
		}  ����*/
		
		int x = 80; //int�� ������Ÿ������ �ϴ� ������ x�� �����Ͽ� ��80���� �ʱ�ȭ �Ѵ�.
		boolean b5 = 90 <= x; //boolean�� ������Ÿ�������ϴ� ������ b5�� �����Ͽ� ����90�� ����x�� ���Ͽ� ������ ����  
		System.out.println("b5 >>> : " + b5); //90<=80 false
		boolean b6 = x <= 100; //boolean�� ������Ÿ�������ϴ� ������ b6�� �����Ͽ� ����100�� ����x�� ���Ͽ� ������ ����  
		System.out.println("b6 >>> : " + b6); //80<=100 true
		boolean b7 = 90 <= x && x <= 100; //boolean�� ������Ÿ�������ϴ� ������ b7�� �����Ͽ� ����x�� 90����ũ�ų�����100�����۰ų������� ���� ���  
		System.out.println("b7 >>> :" + b7); // 90<=80<=100 false 
		if(b7){
			System.out.println("if�� 90 <= x && x <= 100");
		}else{
			System.out.println("else��");
		}
		System.out.println("if-else ���� ����"); //if���߿� �ɸ��� ���� ��������Ʈ�� �����
	} //end of main �Լ�

}// end of FlowControlTest class


/*
b1 >>> : false
else�� 

b2 >>> : true
if�� str1.equals('abc')
b3>>> : true
if�� iVal == 10
b5 >>> : false
b6 >>> : true
b7 >>> :false
else��
if-else ���� ����
*/
