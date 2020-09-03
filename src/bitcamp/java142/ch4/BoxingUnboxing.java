package bitcamp.java142.ch4;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//jdk 1.5����
		Double db = new Double(2.59);
		double db1 = db.doubleValue(); //�ν��Ͻ��ؼ� ����ȯ���� 
		System.out.println("db >>> : " + db);
		System.out.println("db1 >>> : " + db1);
		
		int i = 2;//�⺻�� int2
		Integer it = new Integer(11);//������ 11
		int sum = i + it.intValue(); //�⺻���� ������������ �����Ϸ��� ������(Integer��ü����)�� intValue()�Լ��� �̿��Ͽ� intŸ���� ������ ��ȯ
		int it1 = it.intValue();//intValue(): Integer��ü�� intŸ���� ������ ��ȯ
		int sum1 = i + it1;
		System.out.println("sum >>> : " + sum);//�׷� int+int
		System.out.println("it1�� int�� �ٲ� sum1 >>> : " + sum1);//�׷� int+int
		
	
		int it2 = new Integer(11).intValue();
		int it21 = 10 + it2;
		
		int it3 = Integer.parseInt("11");
		int it31 = 2 + it3;
		
		int it4 = (int)Integer.valueOf("11"); //static Integer - valueOf(String s): Returns an Integer object holding the value of the specified String. 
		int it41 = 4 + it4;
		
		System.out.println("it >>> : " + i + it);
		System.out.println(i + it1);
		System.out.println("it21 = 10 + it2 >>> : " + it21);
		System.out.println( "2 + it3 >>> : "+ it31);
		System.out.println("4 + it4 >>> : " + it41);
		//�⺻���������� �����Ϸ��� 
		
		//
		//1. �����ڷ����� ����
		//2. ����Ŭ���� �̿� -> ���������̿��ϱ����� ���ν��Ͻ��ʿ� ->�����ڷ����� �����Ϸ��� ���������� Value()�Լ��� ġȯ�߾����//1.5���Ĵ� ����ڽ� ����
		//jdk 1.5����
		Double d = 2.59; //��������d ; boxing�ߴ� //�����ڻ�����//1.5�������Ŀ��� ���ν��Ͻ����ϰ� �ٷ� ����
		System.out.println("d >>> : " + d);
		double d1 = d; //�Ϲݺ���d1; unboxing�ߴ�
		System.out.println("d1 >>> : " + d1);
	}

}
