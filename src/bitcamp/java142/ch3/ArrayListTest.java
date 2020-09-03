package bitcamp.java142.ch3;


import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���ϰ�boolean; add�Լ�(�Ű�����:E e)
		//java.util�� ArrayList import�ϱ� 
		//�迭�ϴ� ��arraylist�� ������Ÿ�԰������ (element object) //�����ѵ�����Ÿ�Ծƴ϶� �ٵ�
			ArrayList aList = new ArrayList();// aList �������� �����Ͽ� Arraylist�� �ν��Ͻ� �Ѵ�.
			aList.add("���ۿ�");//add()�Լ��� ����Ͽ� aList�迭�� ���� "���ۿ�"�� �߰� ���
			boolean bool0 = aList.add("��");//add�Լ��� ���ϰ��� �Ҹ����̴ϱ� �Ű������� Ʈ���� ���� ��µǾ� aList�� �����Ͱ� �ٿ�����
			System.out.println("bool0 >>> : " + bool0);
			aList.add(77);//������Ÿ���� int�� �����ϳ�
			aList.add(10.22);//���� ������Ÿ�Ե� �����ϳ�
			aList.add(aList); //�ν��Ͻ��� �ڽ� Ŭ������ �Է��ϴϱ� this Collection���� �߰��ǳ�
			aList.add(new Integer(79));// 
			aList.add(new ArrayListTest());//
			System.out.println("aList >>> : " +aList);
			int aListSize= aList.size();
			System.out.println("aListSize >>> : " +aListSize);
			for (int i=0; i< aListSize; i++){
				System.out.println("aList.get("+i+") >>> : " + aList.get(i));
			}
			
			//ArrayList�� implements List<E>�������̽��� ����ѰŴϱ�
			//�������̽�List�� ���������̿��Ͽ� ArrayListŬ���� add������ ����ϱ� (����λ���Ѱ��ӱ���)
			//length �ʵ��� size()�Լ��� �迭�Ǳ��̱���
			List list = new ArrayList();
			list.add("���ۿ�");
			list.add(77);//��Ʈ
			list.add(11.222);//����
			list.add(list); //�ν��Ͻ��� �ڽ� Ŭ������ �Է��ϴϱ� this Collection���� �߰��ǳ�
			list.add(new Integer(10));// add�Լ��ȿ� IntegerŬ������ ���ο� �����ڸ��ν��Ͻ��Ͽ� ���������
			list.add(new ArrayListTest());//
			System.out.println("list >>> : " +list);
			int listSize= list.size(); //listŬ������ size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����)
			System.out.println("listSize >>> : " +listSize);
			for (int i=0; i< listSize; i++){ //listŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
				System.out.println("list.get("+i+") >>> : " + list.get(i));
			}//for�� ��
	}//main()��
}//Ŭ���� ��


/*
bool0 >>> : true
aList >>> : [���ۿ�, ��, 77, 10.22, (this Collection), 79, bitcamp.java142.ch3.ArrayListTest@15db9742]
aListSize >>> : 7
aList.get(0) >>> : ���ۿ�
aList.get(1) >>> : ��
aList.get(2) >>> : 77
aList.get(3) >>> : 10.22
aList.get(4) >>> : [���ۿ�, ��, 77, 10.22, (this Collection), 79, bitcamp.java142.ch3.ArrayListTest@15db9742]
aList.get(5) >>> : 79
aList.get(6) >>> : bitcamp.java142.ch3.ArrayListTest@15db9742
list >>> : [���ۿ�, 77, 11.222, (this Collection), 10, bitcamp.java142.ch3.ArrayListTest@6d06d69c]
listSize >>> : 6
list.get(0) >>> : ���ۿ�
list.get(1) >>> : 77
list.get(2) >>> : 11.222
list.get(3) >>> : [���ۿ�, 77, 11.222, (this Collection), 10, bitcamp.java142.ch3.ArrayListTest@6d06d69c]
list.get(4) >>> : 10
list.get(5) >>> : bitcamp.java142.ch3.ArrayListTest@6d06d69c
*/