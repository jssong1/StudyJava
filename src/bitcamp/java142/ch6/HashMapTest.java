package bitcamp.java142.ch6;

import java.util.HashMap;
import java.util.Iterator;


public class HashMapTest {
//���ʸ�?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key&value�� Hashmap�� �����ʹ��
		HashMap hm = new HashMap();
		System.out.println("hm >>> : " + hm);
		hm.put("�̸�", "���ۿ�");	//�ؽ��ʿ��� ������ ���� �� put�̿�/ key�� �����ϸ� �ȵ�
		System.out.println("hm >>> : " + hm);
		hm.put("����", "77");
		System.out.println("hm >>> : " + hm);
		hm.put("����", "Ư�޿����Ͼ�");
		System.out.println("hm >>> : " + hm);
		
		//put������ object�ϱ� String����ȯ�ʿ�
		//key���� ��ġ�������� �� value�� null�γ���
		String name = (String)hm.get("�̸�");
		System.out.println("name >>> : " + name);
		String name1 = (String)hm.get("a");
		System.out.println("name1 >>> : " + name1);
		String age = (String)hm.get("����");
		System.out.println("age >>> : " + age);
		String job = (String)hm.get("����");
		System.out.println("job >>> : " + job);
		
		System.out.println("Ű Key >>> : " + hm.keySet());//���������̿� key�̸��𸦶� ����
		System.out.println("�� Value >>> : " + hm.values());
		
		
		Iterator keys = hm.keySet().iterator();
		while (keys.hasNext()){ //hasNext() : �о� �� ��Ұ� �����ִ��� ������ true
			String key = (String)keys.next(); //next() : ���� ��Ҹ� �о�´�
			String value = (String)hm.get(key);//����ȯ�ʿ�
			System.out.println(key+" : " + value); // "hashmap�� iterator�ߴ�"
			
		}
	}//main��

}//Ŭ������
