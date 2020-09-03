package bitcamp.java142.ch4;

import java.util.regex.*;


public class RegularEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "HP:011-111-111, Home:02-999-9999";
		String pattern = "(0\\d{1,2}) - (\\d{3,4}) - (\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		int i = 0;
		while(m.find()){
			System.out.println(++i + ":" + m.group() + "->" +m.group(1) + ", " +m.group(2) + ", " + m.group(3));
		} //while��
	}//���γ�

}//RegularEx3Ŭ���� ��