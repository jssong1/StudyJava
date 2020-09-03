package bitcamp.java142.ch4;

import java.util.Scanner;

public class StringEquals {

	public static Boolean stringEquals(String str, String strL, int divNum){ //static�� ���� BooleanŸ���� ����������Լ�stringEquals()/�Ű������� String,Stirn,intŸ��
		System.out.println("stringEquals()�Լ��� ���� �Ű����� str >>> : " + str);
		System.out.println("stringEquals()�Լ��� ���� �Ű����� str���� >>> : " + str.length());
		System.out.println("stringEquals()�Լ��� ���� �Ű����� strL >>> : " + strL);
		System.out.println("stringEquals()�Լ��� ���� �Ű����� strL���� >>> : " + strL.length());
		System.out.println("�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : " + divNum);
		
		boolean bool = false; //�������� boolean�ʱ�ȭ
		
		if (divNum ==1){//����if������; 1�� ������ ���� if�� ���� 
			if(str.equals(strL)){bool = true;}else{bool = false;}//equals()�Լ��� �̿��Ͽ� ���ڿ� str�� ���ڿ� strL�� ������ bool���� true�ƴϸ� false
		}
		if (divNum ==2){//����if������; 2�� ������ ���� if�� ���� 
			if(str.equals(strL.trim())){bool = true;}else{bool=false;}//trim()�Լ��� ���� ���ڿ� strL�� �糡 ������ ���ְ� ; equals()�Լ��� ���� ���ڿ� str�� strL�� ������ bool���� true�ƴϸ� false
		}
		if(divNum == 3){//����if������; 3�� ������ ���� if�� ���� 
			if(str.equalsIgnoreCase(strL.trim())){bool = true;}else{bool=false;}//trim()�Լ��� ���� ���ڿ� strL�� �糡 ������ ���ְ� ; equalsIgnoreCase()�Լ��� ���� ��ҹ������ϰ� ���ڿ� str�� strL�� ������ bool���� true�ƴϸ� false
		}
		if(divNum == 4){//����if������; 4�� ������ ���� if�� ���� 
			if(str.equals(strL.toLowerCase().trim())){bool = true;}else{bool=false;}//���ڿ� strL�� ;toLowerCase()�Լ��̿��Ͽ� �ҹ��ڷ� ��ȯ; trim()�Լ��� ���� �糡 ������ ���ְ� ; ���ڿ� str�� strL�� ������ bool���� true�ƴϸ� false
		}
		if(divNum == 5){//����if������; 5�� ������ ���� if�� ���� 
			if(str.equals(strL.toUpperCase().trim())){bool = true;}else{bool=false;}//���ڿ� strL�� ;toLowerCase()�Լ��̿��Ͽ� �빮�ڷ� ��ȯ; trim()�Լ��� ���� �糡 ������ ���ְ� ; ���ڿ� str�� strL�� ������ bool���� true�ƴϸ� false
		}		
	
	return bool;		
		
	}//�Լ���
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abc"; //��������; StringŸ���� ���� str�� �����Ͽ� "abc"�ʱ�ȭ
		String strL = " ABC";//��������; StringŸ���� ���� strL�� �����Ͽ� "ABC"�ʱ�ȭ
		int stopNum =0;//��������; ������Ÿ���� int�� ������ stopNum�� 0���� �ʱ�ȭ
		do{ //do������
		System.out.println("���ڸ� �Է��Ͻÿ� >>> : "); 
		Scanner sc = new Scanner(System.in); //�ֿܼ� �Է��� �����͸� ��ĳ���Լ��� �ν��Ͻ��Ѵ�. (����Ʈ�ϱ�)
		int divNum = sc.nextInt();// �ֿܼ� �Է��� ���ڸ� int������Ÿ���� ����divNum�� ���� 
		
		boolean bool = StringEquals.stringEquals(str,strL,divNum); //�Ҹ���Ÿ���� ����bool�� �����Ͽ� StringEqualsŬ�������ִ� stringEquals()�Լ��� ȣ���Ѵ�/�Ű�����3������ġ
		System.out.println("bool >>> : " +bool);//�Լ����� ���� ���ϰ��� ���
		System.out.println("���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������");//
		Scanner scc = new Scanner(System.in);
	
		stopNum = sc.nextInt();
		}//do��
		while(stopNum==9);//while����
		
	}//main��

}//StringEqualsŬ���� ��


/*
���ڸ� �Է��Ͻÿ� >>> : 
1
stringEquals()�Լ��� ���� �Ű����� str >>> : abc
stringEquals()�Լ��� ���� �Ű����� str���� >>> : 3
stringEquals()�Լ��� ���� �Ű����� strL >>> :  ABC
stringEquals()�Լ��� ���� �Ű����� strL���� >>> : 4
�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : 1
bool >>> : false
���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������
9
���ڸ� �Է��Ͻÿ� >>> : 
2
stringEquals()�Լ��� ���� �Ű����� str >>> : abc
stringEquals()�Լ��� ���� �Ű����� str���� >>> : 3
stringEquals()�Լ��� ���� �Ű����� strL >>> :  ABC
stringEquals()�Լ��� ���� �Ű����� strL���� >>> : 4
�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : 2
bool >>> : false
���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������
9
���ڸ� �Է��Ͻÿ� >>> : 
3
stringEquals()�Լ��� ���� �Ű����� str >>> : abc
stringEquals()�Լ��� ���� �Ű����� str���� >>> : 3
stringEquals()�Լ��� ���� �Ű����� strL >>> :  ABC
stringEquals()�Լ��� ���� �Ű����� strL���� >>> : 4
�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : 3
bool >>> : true
���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������
9
���ڸ� �Է��Ͻÿ� >>> : 
4
stringEquals()�Լ��� ���� �Ű����� str >>> : abc
stringEquals()�Լ��� ���� �Ű����� str���� >>> : 3
stringEquals()�Լ��� ���� �Ű����� strL >>> :  ABC
stringEquals()�Լ��� ���� �Ű����� strL���� >>> : 4
�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : 4
bool >>> : true
���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������
9
���ڸ� �Է��Ͻÿ� >>> : 
5
stringEquals()�Լ��� ���� �Ű����� str >>> : abc
stringEquals()�Լ��� ���� �Ű����� str���� >>> : 3
stringEquals()�Լ��� ���� �Ű����� strL >>> :  ABC
stringEquals()�Լ��� ���� �Ű����� strL���� >>> : 4
�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : 5
bool >>> : false
���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������
9
���ڸ� �Է��Ͻÿ� >>> : 
6
stringEquals()�Լ��� ���� �Ű����� str >>> : abc
stringEquals()�Լ��� ���� �Ű����� str���� >>> : 3
stringEquals()�Լ��� ���� �Ű����� strL >>> :  ABC
stringEquals()�Լ��� ���� �Ű����� strL���� >>> : 4
�ֿܼ� �Է��Ͽ� �Լ��ε��� �Ű����� divNum >>> : 6
bool >>> : false
���α׷��� ����ϰ������ 9�� ��������. ���α׷��� �ߴ��ϰ������ �ƹ��ų� ��������
2
*/