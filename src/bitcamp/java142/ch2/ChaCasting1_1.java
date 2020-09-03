package bitcamp.java142.ch2;

public class ChaCasting1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char�� ����Ʈ���� �ι���, �ƽ�Ű�ڵ� 10������ �ϸ� 32��Ÿ��
		char ccc = ' ';
		System.out.println("char ���ڿ� 2���� >>> : " + Integer.toBinaryString(ccc));
		//api���� Integer.toBinaryString(int i)�Ƿ� int���־���ϴµ� ccc�� char�Ƿ� �Ϲ��� ����ȯ�̷����� �˼�����
		//char�� int���� �����ϱ�	�Ϲ�������ȯ����
		//Integer.toBinaryString((int)ccc)
		System.out.println("char ���ڿ� 10���� >>> : " + (int)ccc); //���ڸ� �ƽ�Ű�ڵ� ����10������ ����ȯ
		System.out.println("char ���ڿ� 8���� >>> : 0" + Integer.toOctalString(ccc));
		System.out.println("char ���ڿ� 16���� >>> : 0x" + Integer.toHexString(ccc));
		

		
		
		
		// String�� ���ڿ����̴� length() �Լ��� ���ϰ�, �迭�� ���̴� length �ʵ�� ����
		// ��Ʈ�� Ŭ������ ���ڿ��� char �迭�̴�.
		String str = "abc"; //String str = new String ("ab c ");
		//�̰� �迭 char������Ÿ���� cc���������� ���𰡴�
		char cc[]= new char[]{'a', 'b', ' ', 'c', ' '}; 
		System.out.println("str >>> : " + str);
		System.out.println("cc >>> : " + cc); //�ּҰ����� ��¿���[�� �迭���� �ǹ�
		//String Ŭ���� api���� length �Լ����ϱ� �������� int�� static�����ϱ� ����������.�Լ���()����
		int strLength = str.length();
		System.out.println("strLength >>> : "+ strLength); //str�� "ab c "��� ���� 5����, for��2������µ� 5�ٳ���
		String str1 = "";
		int str1Length = str1.length();
		System.out.println("str1Length >>> : "+ str1Length);
		
		if (strLength > 0){ //str1Length ������ �ƹ��͵� ��¾ȵʤ���
			for (int i=0; i < strLength; i++){
				char cValue = str.charAt(i);
				System.out.print("2���� >>> :" + Integer.toBinaryString(cValue));
				System.out.print(" : 10���� >>> : " + (int)cValue);
				System.out.print(" : 8���� >>> : 0" + Integer.toOctalString(cValue));
				System.out.println(" : 16���� >>> : 0x" + Integer.toHexString(cValue));
			}
		}
	
		
		//bã��
		/*String Ŭ���� api���� charAt �Լ� ���ϱ� �������� char�� static�� ��� ����������.�Լ���()
		 * �Ű������� int index�� String���ڿ��� �� ÷���̿� = b�� index÷�ڴ� 1*/
		//������ char���� ���� ������ cVal�� ���� 
		char cVal0 = str.charAt(0);
		char cVal1 = str.charAt(1);
		char cVal2 = str.charAt(2);
		System.out.println("cVal0 >>> : " + cVal0);
		System.out.println("cVal1 >>> : " + cVal1);
		System.out.println("cVal2 >>> : " + cVal2);
		//����ȯ�Ǿ� �ƽ�Ű�ڵ�� ǥ���� 10����
		int iCval0 = cVal0;
		int iCval1 = cVal1;
		int iCval2 = cVal2;
		System.out.println("iVal0 >>> : " + iCval0);
		System.out.println("iVal1 >>> : " + iCval1);
		System.out.println("iVal2 >>> : " + iCval2);
		//10������ ���� 2���� 8���� 16������ ǥ��
		/*Integer Ŭ���� api���� ����
		2����-> static ����/ ���ϰ� : String/ toBinaryString(�Ű�����: int i) 
		8����-> static ����/ ���ϰ� : String/ toOctalString(�Ű�����: int i) 
		16����-> static ����/ ���ϰ� : String/ toHexString(�Ű����� : int i)  
		static�����Ƿ� wrapperŬ������.�Լ���();
		*/
		
		//���ϰ��� String�� iCVal102 ������ �����Ѵ�
		//�Ű����� iCVal10���� IntegerŬ������ �Լ� toBinaryString���� ȣ���Ѵ�.
		String iCval02 = Integer.toBinaryString(iCval0);
		String iCval12 = Integer.toBinaryString(iCval1);
		String iCval22 = Integer.toBinaryString(iCval2);
		String iCval08 = Integer.toOctalString(iCval0);
		String iCval18 = Integer.toOctalString(iCval1);
		String iCval28 = Integer.toOctalString(iCval2);
		String iCval016 = Integer.toHexString(iCval0);
		String iCval116 = Integer.toHexString(iCval1);
		String iCval126 = Integer.toHexString(iCval2);
		
		System.out.println("2���� >>> : " + iCval02 
				+ " : " + iCval12 + " : " + iCval22);
		System.out.println("8���� >>> : 0" + iCval08 
				+ " : 0" + iCval18 
				+ " : 0" + iCval28);
		System.out.println("16���� >>> : 0x" + iCval016 
				+ " : 0X" + iCval116 
				+ " : 0x" + iCval126);
		//8������ �տ� "0"�� �ٿ��� ǥ�� 16������ �տ� "0x"�� "0X"�� �ٿ��� ǥ��
	}//end of main �Լ�

} // end of class


/*
char ���ڿ� 2���� >>> : 100000
char ���ڿ� 10���� >>> : 32
char ���ڿ� 8���� >>> : 040
char ���ڿ� 16���� >>> : 0x20
str >>> : abc
cc >>> : [C@15db9742
strLength >>> : 3
str1Length >>> : 0
2���� >>> :1100001 : 10���� >>> : 97 : 8���� >>> : 0141 : 16���� >>> : 0x61
2���� >>> :1100010 : 10���� >>> : 98 : 8���� >>> : 0142 : 16���� >>> : 0x62
2���� >>> :1100011 : 10���� >>> : 99 : 8���� >>> : 0143 : 16���� >>> : 0x63
cVal0 >>> : a
cVal1 >>> : b
cVal2 >>> : c
iVal0 >>> : 97
iVal1 >>> : 98
iVal2 >>> : 99
2���� >>> : 1100001 : 1100010 : 1100011
8���� >>> : 0141 : 0142 : 0143
16���� >>> : 0x61 : 0X62 : 0x63

*/