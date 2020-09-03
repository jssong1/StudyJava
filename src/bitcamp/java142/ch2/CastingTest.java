package bitcamp.java142.ch2;

import java.math.BigDecimal;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 120;
		System.out.println("b>>> : " + Integer.toBinaryString(b));// �ٷξ��°� ����
		
		String sb = Integer.toBinaryString(b);
		//(int)�����Ȱ� ����������ȯ Integer.toBinaryString((int)b), api ���ϱ� ���ϰ� string�̶� ����
		System.out.println("sb>>> : " + sb); 
		
		int i = 20;
		System.out.println("i>>> : " + Integer.toBinaryString(i));
		String si= Integer.toBinaryString(i);
		System.out.println("si>>> : " + si);
		
		
		//b = i; //���ڴ� ������ ������Ÿ���� �� ū�Ŷ� �ȸ¾Ƽ� ������
		b = (byte)i; //():ĳ���ÿ�����-�̸� ����Ʈ�� �ٲٽÿ� :����� ����ȯ(explicit casting)
		System.out.println("b>>> : " + b);
		
		i = b; //����Ʈ�� 8��Ʈ���� 32��Ʈ�� ������ ����ȯ(implicit casting) i=(int)b;�� ������ ĳ���ÿ����� �����Ȱ�
		System.out.println("i>>> : " + i);
		
		double d = 23.4; //�¿쵿ġ
		//int iS = d; //������
		//�Ǽ� -> ����
		int iS = (int)d;
		System.out.println("iS>>> : " + iS);
		System.out.println("d>>> : " + d);
		
		// �ڹٴ� �Ǽ� ������ ���������� ��������. ����Ϸ��� ���ڿ��Ἥ BigDecimal(java.math��Ű��)�� ���
		double d1 = 707.4;
		double d2 = 226.2;
		double d3 = d1 + d2; //���� 933.6
		System.out.println("d3>>> : " + d3);// ���� ���Ⱚ 933.5999999999999
		String s = "707.4";//������ ������ذ� 
		BigDecimal b1 = new BigDecimal(s);//���ڿ��� ����� string������ ����
		BigDecimal b2 = new BigDecimal("226.2");
		BigDecimal b3 = b1.add(b2); //BigDecimal�� add,multiply ���� �̿��� ������
		System.out.println("b3>>> : " + b3);
		
		BigDecimal bb1 = new BigDecimal(707.4);//���ڿ��� �Ⱦ��� double������ ����
		BigDecimal bb2 = new BigDecimal(226.2);
		BigDecimal bb3 = bb1.add(bb2);
		System.out.println("bb3>>> : " + bb3);//���� �޶���
		
		// int -> char, char -> int 
		char c = 65; //(char)65; ĳ���ÿ����ڻ��� //char�� ASCII�ڵ�� ġȯ
		System.out.println("c>>> : " + c);
		int iC = 'A'; // (int)'A'; ĳ���ÿ����ڻ���
		System.out.println("iC>>> : " + iC);
		int ii = '@'; 
		System.out.println("ii>>> : " + ii);
	}

}

/*
b>>> : 1111000
sb>>> : 1111000
i>>> : 10100
si>>> : 10100
b>>> : 20
i>>> : 20
iS>>> : 23
d>>> : 23.4
d3>>> : 933.5999999999999
b3>>> : 933.6
bb3>>> : 933.59999999999996589394868351519107818603515625
c>>> : A
iC>>> : 65
ii>>> : 64
*/