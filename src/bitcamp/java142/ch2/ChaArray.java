package bitcamp.java142.ch2;

public class ChaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��Ʈ�� Ŭ������ ���ڿ��� char �迭�̴�.
		// String Ŭ���� ������ Ÿ���� �������� str�� ���ڿ� "abc"�ʱ�ȭ
		String str = "abc"; //String str = new String ("abc");�� ������
		System.out.println("str >>> : " +str);
		
		//[] : �迭 ������
		//�迭�� �������� strData�����Ͽ� 1����char�迭�� ����3���� ����� ����'a','b','c'�� �ʱ�ȭ
		char strData[] = { 'a', 'b', 'c' }; // new char ���� 
		//char �迭�� ���̸� length �ʵ�� ���Ҽ��ִ�
		/*length �ʵ��� �θ� : �迭�� ���̸� ���ϴ� �ʵ�
		 * strData.length : strData�� �迭�� ��������*/
		int strDataLength = strData.length; // strData�� �迭���̰��� int������ Ÿ������ �ʱ�ȭ�Ѵ�. 
		System.out.println("strDataLength >>> :" + strDataLength);
		// ��������, Ŭ����������Ÿ���� String�� ������ str1�� �����Ͽ� �ʱ�ȭ, �Ű������� �迭�� �������� strData 
		String str1 = new String(strData);
		System.out.println("Str1 >>> : " + str1); //�迭�� �������� strData�� ���ڿ��� ����
		
		
		
		//�� ������ ������Ÿ��cha ������ c,data1,data []�迭������ =���Կ����� �ν��Ͻ��Ѵ� 
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		char data1[] = new char [] {'a','b','c'};
		char data[] = {'a','b','c'}; //data�� �������� ����
		int cLength = c.length;// lenghth �ʵ�� ����c�� �迭���̰��� int������ Ÿ������ �ʱ�ȭ�Ѵ�.
		int data1Length = data1.length;// length�ʵ�� ����data1�� �迭���̰��� int ������Ÿ������ ���ε��Ѵ�. �������� data1Length
		int dataLength = data.length;// length�ʵ�� ����data�� �迭���̰��� int������Ÿ������ ���ε��Ѵ�. �������� dataLength
		System.out.println("cLength >>> :" + cLength);
		System.out.println("data1Length >>> :" + data1Length);
		System.out.println("dataLength >>> :" + dataLength);
		
	}//end of main �Լ�

} // end of class

//String�� ���ڿ����̴� length() �Լ��� ���ϰ�, �迭�� ���̴� length �ʵ�� ����
/*
 str >>> : abc
strDataLength >>> :3
Str1 >>> : abc
cLength >>> :3
data1Length >>> :3
dataLength >>> :3
 */
 