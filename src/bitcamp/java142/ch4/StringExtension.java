package bitcamp.java142.ch4;

public class StringExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fullName = "Hello.java";
		int index = fullName.indexOf('.');//char2����Ʈ�ϱ� int�� ������ ����ȯ
		System.out.println("index >>> :"+index);
		
		String fileName= fullName.substring(0,index);
		System.out.println("�����̸� >>> : " +fileName);
		
		String extensions = fullName.substring(index+1);
		System.out.println("Ȯ���� >>> : " +extensions);
		for (int i=0; i<fullName.length();i++){
			System.out.println("fullName.charAt("+i+")>>> : " +fullName.charAt(i));
		}//for����
		
	}//���γ�

}//class ��


/*
index >>> :5
�����̸� >>> : Hello
Ȯ���� >>> : java
fullName.charAt(0)>>> : H
fullName.charAt(1)>>> : e
fullName.charAt(2)>>> : l
fullName.charAt(3)>>> : l
fullName.charAt(4)>>> : o
fullName.charAt(5)>>> : .
fullName.charAt(6)>>> : j
fullName.charAt(7)>>> : a
fullName.charAt(8)>>> : v
fullName.charAt(9)>>> : a
*/