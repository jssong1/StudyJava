package bitcamp.java142.ch2;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] abc = {'A','B','C','D'}; //�� 4�� �迭�Ǳ���4 //new char[]�����Ȱ�
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};// new char[]�����Ȱ�
		System.out.println("abc.length >>> : " + abc.length);
		System.out.println("num.length >>> : " + num.length);
		System.out.println("abc >>> : " + abc); // ���ڿ��� �ٿ����� �ּҰ�����
		System.out.println("num >>> : " + num); 
		System.out.println(abc); //���������� ������
		System.out.println(num); 
		
		int abcN = abc.length; //length�ʵ带 �̿��Ͽ� abc�� �迭���̸� int������Ÿ���� ������ abcN�� �����Ͽ� ���ε��Ѵ�.
		int numN = num.length; //length�ʵ带 �̿��Ͽ� num�� �迭���̸� int������Ÿ���� ������ numN�� �����Ͽ� ���ε��Ѵ�.
		
		char[] result = new char[abc.length + num.length];//���̰� abc.length + num.length (14)�� char�� �迭�� ������  result�� �����Ѵ�.
		char[] result_1 = new char[4 + 10];//���̰� 14�� char�� �迭�� ������ result_1�� �����Ͽ� �����Ѵ�.
		char[] result_2 = new char[abcN + numN]; //
//		System.out.println(result); 

//		Object src��,int srcPos������, Object dest��,int destPos�����ٰ�,int length���̸�ŭ����
//		System.arraycopy(Object src,int srcPos, Object dest,int destPos,int length) //return���� void! static�پ������ϱ� Ŭ������.�Լ���();
		System.arraycopy(abc,0,result,0,abc.length);//�迭 abc�� ÷��0��°����/ ���̰� 14�� result��/ 0��°�����/abc�迭�� ���̸�ŭ (��ü����)/����ä���   (abc�迭�� 0��°����, result ������, 0��°���ٰ�, abc.length��ŭ �����Ѵ�.)
		System.arraycopy(num,0,result,abc.length,num.length);//0��°���� result���ٰ� �̹� ���� abc������ ������ �����Ŵϱ� abc���̹�°���� num�� ��ü�����͸� �����ҰŴϱ� num�迭�� ���̸�ŭ �����Ѵ�.
		System.out.println(result);
		
		System.arraycopy(abc,0,num,0,abc.length);//abc�迭�� 0������ num�迭�� 0������ abc���� ��ü�� �ٿ��ִ´�.		
		System.arraycopy(abc,0,num,6,3);// ���: abc�迭�� 0������/��ġ: num�� 6������ /����3���� �ٿ��ִ´�.
		System.out.println(num);
	}//main �Լ� ��
}// ArrayTest class ��

/*
abc.length >>> : 4
num.length >>> : 10
abc >>> : [C@15db9742
num >>> : [C@6d06d69c
ABCD
0123456789
ABCD0123456789
ABCD45ABC9
*/