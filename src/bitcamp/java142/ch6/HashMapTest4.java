package bitcamp.java142.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap3�� ���ʸ��Ἥ �ٽ� 
		
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("�̸�", "���ۿ�");	//�ؽ��ʿ��� ������ ���� �� put�̿�/ key�� �����ϸ� �ȵ�
		hm.put("����", "71");
		hm.put("����", "Ư�޿����Ͼ�");
		
		HashMap<String,String> hm1 = new HashMap<String, String>();
		hm1.put("�̸�", "������");	
		hm1.put("����", "72");
		hm1.put("����", "�����Ͼ�");
		
		HashMap <String,String>hm2 = new  HashMap<String, String>();
		hm2.put("�̸�", "���ۻ�");	
		hm2.put("����", "73");
		hm2.put("����", "���Ͼ�");
		
		HashMap <String,String>hm3 = new  HashMap<String, String>();
		hm3.put("�̸�", "���ۻ�");	
		hm3.put("����", "74");
		hm3.put("����", "�Ͼ�");
		
		
		
		ArrayList<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>(); //����Ŭ�����̿��ϱ������ hashmap����Ƽ� �����
		aList.add(hm);
		aList.add(hm1);
		aList.add(hm2);
		aList.add(hm3);
				
		System.out.println("aList.size()"+ aList.size());
		//for������ ������
		for(int i=0;i <aList.size();i++){
			HashMap<String, String> h = (HashMap<String, String>) aList.get(i);
			String hname =(String)h.get("�̸�");
			String hage = (String)h.get("����");
			String hjob = (String)h.get("����");
			System.out.println( "aList[" + i +"] : " + hname + " : " + hage+ " : " + hjob);
		}//for��
		
		//iterator�� �����ؼ� �ѹ��� �̱�->Ű���� value�ϳ��ϳ�����ϵ��� ����
		Iterator<HashMap<String, String>> it = aList.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println("obj >>> : " + obj );	
			
			Iterator keys = ((HashMap<String, String>) obj).keySet().iterator();
			while (keys.hasNext()){
				String key = (String) keys.next();
				String value = (String) ((HashMap<String,String>) obj).get(key);
				System.out.println(key+" : " + value);				
			}
		}//while��	
		
		//Ű��(�̸�,����,����)�ƴϱ� (�����Է�) 		
		Iterator its = aList.iterator();
		while(its.hasNext()){
			Object obj = its.next();
			System.out.println("obj >>> : " + obj );
			
			HashMap hmm = (HashMap)obj;
			System.out.println(hmm.get("�̸�")+ " : " + hmm.get("����") + " : " + hmm.get("����"));		
		}
//			HashMap<String, String> h = (HashMap<String, String>) aList.get(i);
//			HashMap<String, String> key = it.next(); //next() : ���� ��Ҹ� �о�´�
//			String value = h.get(key);//����ȯ�ʿ�
//			System.out.println(key+" : " + value); // "hashmap�� iterator�ߴ�"
		
		//Ű���� �� ����
		Iterator<HashMap<String, String>> itss = aList.iterator();
		while(itss.hasNext()){
			Object obj = itss.next();
			System.out.println("obj >>> : " + obj );	
			
			HashMap hm_ =(HashMap)obj;
			Iterator keys = hm_.keySet().iterator();
			while (keys.hasNext()){
				String key = (String) keys.next();
				String value = (String) hm_.get(key);
				System.out.println(key+" : " + value);				
			}
		}//while��	
		
	}//main��

}//Ŭ������

/*
 * hashmap �����
 * arraylist ���
 * iterator�� arraylist������ hashmap 4�� �����͵�������
 */
