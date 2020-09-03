package bitcamp.java142.ch4;

class Value {
	int value; // �������; ��������� ValueŬ������ int������Ÿ���� value�������� �����Ͽ� �ʱ�ȭ .

	// public Value(){ //int�� ������Ÿ���� �Ű������� �޴� ������
	// System.out.println("value>>> : " + value);
	// }

	public Value(int value) { // int�� ������Ÿ���� �Ű������� �޴� ������
		this.value = value;//
		System.out.println("this.value>>> : " + this.value);
	}

} // Value Ŭ���� ��

public class EqualsTest {


	public static void main(String[] args) {		// Ŭ���� ���������� �������ִ� Ŭ������ public�� ���� ���ϸ� �����ִ� Ŭ���������� �σm
		// TODO Auto-generated method stub

		Value v1 = new Value(10);// ��������� Ŭ���� Value�� ������ ���ڴ�/v1������/ =���Կ�����/�Ű�������
									// int�� ������ �ҷ��ͼ� ��������� 10���� �ʱ�ȭ
		Value v2 = new Value(10);// ��������� Ŭ���� Value�� ������ ���ڴ�/v2������/ =���Կ�����/�Ű�������
									// int�� ������ �ҷ��ͼ� ��������� 10���� �ʱ�ȭ
		System.out.println("�������� v1 �ּҰ�" + v1);
		System.out.println("�������� v2 �ּҰ�" + v2);

		if (v1.equals(v2)) { // ObjectŬ������ equals()�Լ�
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		} // if��

		v2 = v1;// v2�� v1���� ���ε� ���� ��������
		System.out.println("�������� v1 �ּҰ�" + v1);
		System.out.println("�������� v2 �ּҰ�" + v2);
		if (v1.equals(v2)) {// ObjectŬ������ equals()�Լ�
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴٴٴٴٴٴ�.");
		} // if��

		String sV = "abc";
		String sV1 = "abc";
		if (sV.equals(sV1)) {// StringŬ������ equals()�Լ� ; ���ڿ��� ��, �������� ObjectŬ������
								// equals()�Լ�
			System.out.println("sV�� sV1�� �����ϴ�.");
		} else {
			System.out.println("sV�� sV1�� �ٸ��ϴ�.");
		} // if ��

	} // main ��
}// EqualsTest class ��


/*
this.value>>> : 10
this.value>>> : 10
�������� v1 �ּҰ�bitcamp.java142.ch4.Value@15db9742
�������� v2 �ּҰ�bitcamp.java142.ch4.Value@6d06d69c
v1�� v2�� �ٸ��ϴ�.
�������� v1 �ּҰ�bitcamp.java142.ch4.Value@15db9742
�������� v2 �ּҰ�bitcamp.java142.ch4.Value@15db9742
v1�� v2�� �����ϴ�.
sV�� sV1�� �����ϴ�.
*/