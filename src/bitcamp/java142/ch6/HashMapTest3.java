package bitcamp.java142.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		hm.put("�̸�", "���ۿ�");	//�ؽ��ʿ��� ������ ���� �� put�̿�/ key�� �����ϸ� �ȵ�
		hm.put("����", "71");
		hm.put("����", "Ư�޿����Ͼ�");
		
		HashMap hm1 = new HashMap();
		hm1.put("�̸�", "������");	
		hm1.put("����", "72");
		hm1.put("����", "�����Ͼ�");
		
		HashMap hm2 = new HashMap();
		hm2.put("�̸�", "���ۻ�");	
		hm2.put("����", "73");
		hm2.put("����", "���Ͼ�");
		
		HashMap hm3 = new HashMap();
		hm3.put("�̸�", "���ۻ�");	
		hm3.put("����", "74");
		hm3.put("����", "�Ͼ�");
		
		
		
		ArrayList aList = new ArrayList(); //����Ŭ�����̿��ϱ������ hashmap����Ƽ� �����
		aList.add(hm);
		aList.add(hm1);
		aList.add(hm2);
		aList.add(hm3);
		
		HashMap ham = (HashMap)aList.get(0);
		String name = (String)ham.get("�̸�");//���ٷξ���
		Object age = ham.get("����"); //���ٷξ���
		String age0 = (String)age;
		
		String job = (String)ham.get("����");
			
		System.out.println(ham + " : " + name + " : " + age+ " : " + age0);
		
		HashMap ham1 = (HashMap)aList.get(1);
		String name1 = (String)ham1.get("�̸�");//���ٷξ���
		Object age1 = ham1.get("����"); //���ٷξ���
		String age10 = (String)age1;
		String job1 = (String)ham1.get("����");
		System.out.println(ham1 + " : " + name1 + " : " + age1+ " : " + age10);
		
		HashMap ham2 = (HashMap)aList.get(2);
		String name2 = (String)ham2.get("�̸�");//���ٷξ���
		Object age2 = ham2.get("����"); //���ٷξ���
		String age20 = (String)age2;
		String job2 = (String)ham2.get("����");
		System.out.println(ham2 + " : " + name2 + " : " + age2+ " : " + age20);
		
		HashMap ham3 = (HashMap)aList.get(3);
		String name3 = (String)ham3.get("�̸�");//���ٷξ���
		Object age3 = ham3.get("����"); //���ٷξ���
		String age30 = (String)age3;
		String job3 = (String)ham3.get("����");
		System.out.println(ham3 + " : " + name3 + " : " + age3+ " : " + age30);
		
		System.out.println("aList.size()"+ aList.size());
		//for������ ������
		for(int i=0;i <aList.size();i++){
			HashMap h = (HashMap)aList.get(i);
			String hname =(String)h.get("�̸�");
			String hage = (String)h.get("����");
			String hjob = (String)h.get("����");
			System.out.println( "aList[" + i +"] : " + hname + " : " + hage+ " : " + hjob);

		}
	}//main��

}//Ŭ������
