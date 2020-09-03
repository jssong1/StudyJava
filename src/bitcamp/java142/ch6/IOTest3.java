package bitcamp.java142.ch6;

import java.util.Scanner;

public class IOTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("테스트");
		Scanner sc = new Scanner(System.in);
		String strData = sc.nextLine();
		System.out.println("strData >>> : " + strData);
		for (int i=0; i<strData.length(); i++){
			char charStr = strData.charAt(i);//아스키코드
//			System.out.println("binar : " + charStr + " : " + (byte)charStr +" : "+ Integer.toBinaryString((byte)charStr));//Integer.toBinaryString((byte)charStr) : 아스키코드의 이진수로 전송
			System.out.print(Integer.toBinaryString((byte)charStr));//갈때는 일렬로 간당
		}
				
	}

}
