package bitcamp.java142.ch6;

import java.util.Scanner;

public class IOTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�׽�Ʈ");
		Scanner sc = new Scanner(System.in);
		String strData = sc.nextLine();
		System.out.println("strData >>> : " + strData);
		for (int i=0; i<strData.length(); i++){
			char charStr = strData.charAt(i);//�ƽ�Ű�ڵ�
//			System.out.println("binar : " + charStr + " : " + (byte)charStr +" : "+ Integer.toBinaryString((byte)charStr));//Integer.toBinaryString((byte)charStr) : �ƽ�Ű�ڵ��� �������� ����
			System.out.print(Integer.toBinaryString((byte)charStr));//������ �Ϸķ� ����
		}
				
	}

}
