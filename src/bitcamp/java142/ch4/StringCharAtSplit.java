package bitcamp.java142.ch4;

import java.util.StringTokenizer;

public class StringCharAtSplit {


	//����()���� ���� �Լ��� ��������� �Լ��� ������ 
	//���������� void�� ���� �Լ��� �ҷ��ö� Ŭ������.�Լ�(�Ű�����)�� �ϸ� ��
	//String strs = StringCharAtSplit.splitMethod(strV);�� �Լ��� ���ϰ� return strs; ���������
	//��������� �Լ��� ��Ʈ�������͸� �����ö��� if������ �����Ͱ��ִ��� �ɷ��ִ°� ������
	//
	
	public static void splitMethod(String strV) { 
		if (strV != null && strV.length()>0){ // ���� strV�� �����Ͱ� �ִ��� Ȯ��; ������ true�� ������ ����
			String strs[] = strV.split("@");// ������ (delimiter) // String �������� strs[]�迭�� ����; split�Լ��� ����Ͽ� �и���@�� �������� strV���ڿ��迭�� ������
			for (int i = 0; i < strs.length; i++) { //for�� int i�� 0���� �ʱ�ȭ �Ͽ� strs ���̱��� ���� 
				System.out.println("splitMethod strs[" + i + "] >>> : " + strs[i]);
			}//for��
		}//if��
	}//splitMethod()��

	public static void tokenMethod(String strV) {	
		if (strV != null && strV.length()>0){
			StringTokenizer stt = new StringTokenizer(strV, "@"); // util��Ű��
			while (stt.hasMoreElements()) {// ���� ���� �Լ�
				System.out.println("tokenMethod stt >>> : " + stt.nextToken());
			}//while��
		}//if��
	}//tokenMethod()��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strV = "abc,def,ghi,jkl";
		System.out.println("strV >>> : " + strV);
		
		strV = strV.replace(',', '@');
		System.out.println("replace()�Լ��� ,�� @�̷� ��ġ strV >>> : " + strV);
		strV = strV.replace('a', 'A');
		System.out.println("replace()�Լ��� �ҹ���a�빮�ڷ� ��ġ strV >>> : " + strV);
		
		String str[] = strV.split("@");// ������ (delimiter)
		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] >>> : " + str[i]);
		}
		
		StringTokenizer st = new StringTokenizer(strV, "@"); // util��Ű��
		while (st.hasMoreElements()) {// ���� ���� �Լ�
			System.out.println(">>> : " + st.nextToken());
		}
		
		StringCharAtSplit.splitMethod(strV);
		StringCharAtSplit.tokenMethod(strV);
	}// ���γ�

}// Ŭ������
