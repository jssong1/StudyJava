package bitcamp.java142.ch4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڸ� ���ڷ� ���鶧�� �����ؾ��� �޸��ڲ� ���� �ȵ�
		String str0= "abc";
		String str1= "def";
		String str2= str0 + str1;
		String str3= 1+"2";//���� + ���ڿ� =���ڿ�
		System.out.println("str3 >>> : " +str3);
		String str4 = 11+ "";
		System.out.println("str4 >>> : " +str4);
		System.out.println("str4-1 >>> : " +1+2);//���ڿ����� ���Ǿ�(���ʿ��� ���������� ����) (cf �ݴ�� ���Կ���,����������, ĳ���ÿ��� ��)  
		System.out.println("str4-2 >>> : " +(1+2));//��ȣ�� ������ �����
		String str5= String.valueOf(11);
		int i = 123;
		String str6= String.valueOf(121);
		String str7= String.valueOf(i);
		
		System.out.println("str5 >>> : "+str5 );
		System.out.println("str6 >>> : "+str6 );
		System.out.println("str7 >>> : "+str7 );
		
	}//main��

}//StringTestŬ���� ��
//** ValueOf()�Լ� : ���ڿ� ����� �Լ� /Static�� String���ϰ�/�Ű����� Ÿ�� �پ���9����


/*
str3 >>> : 12
str4 >>> : 11
str4-1 >>> : 12
str4-2 >>> : 3
str5 >>> : 11
str6 >>> : 121
str7 >>> : 123
*/