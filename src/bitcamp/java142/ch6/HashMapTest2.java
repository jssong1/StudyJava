package bitcamp.java142.ch6;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest2 {
//HashMapTest�� ���ʸ��ݿ��ؼ� �ٽ� Hashmap<K,V> -> <String,String> 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key&value�� Hashmap�� �����ʹ��
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("hm >>> : " + hm);
		hm.put("�̸�", "���ۿ�");	//�ؽ��ʿ��� ������ ���� �� put�̿�/ key�� �����ϸ� �ȵ�
		System.out.println("hm >>> : " + hm);
		hm.put("����", "77");
		System.out.println("hm >>> : " + hm);
		hm.put("����", "Ư�޿����Ͼ�");
		System.out.println("hm >>> : " + hm);
		
		//put������ object�ϱ� String����ȯ�ʿ�
		//key���� ��ġ�������� �� value�� null�γ���
		String name = hm.get("�̸�");
		System.out.println("name >>> : " + name);
		String name1 = hm.get("a");
		System.out.println("name1 >>> : " + name1);
		String age = hm.get("����");
		System.out.println("age >>> : " + age);
		String job = hm.get("����");
		System.out.println("job >>> : " + job);
		
		System.out.println("Ű Key >>> : " + hm.keySet());//���������̿� key�̸��𸦶� ����
		System.out.println("�� Value >>> : " + hm.values());
		
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()){ //hasNext() : �о� �� ��Ұ� �����ִ��� ������ true
			String key = keys.next(); //next() : ���� ��Ҹ� �о�´�
			String value = hm.get(key);//����ȯ�ʿ�
			System.out.println(key+" : " + value); // "hashmap�� iterator�ߴ�"
			
		}
	}//main��

}//Ŭ������
