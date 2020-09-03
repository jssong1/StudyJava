package bitcamp.java142.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		hm.put("이름", "정송원");	//해쉬맵에서 데이터 담을 땐 put이용/ key는 동일하면 안됨
		hm.put("나이", "71");
		hm.put("직업", "특급엔지니어");
		
		HashMap hm1 = new HashMap();
		hm1.put("이름", "정송투");	
		hm1.put("나이", "72");
		hm1.put("직업", "엔지니어");
		
		HashMap hm2 = new HashMap();
		hm2.put("이름", "정송삼");	
		hm2.put("나이", "73");
		hm2.put("직업", "지니어");
		
		HashMap hm3 = new HashMap();
		hm3.put("이름", "정송사");	
		hm3.put("나이", "74");
		hm3.put("직업", "니어");
		
		
		
		ArrayList aList = new ArrayList(); //깡통클래스이용하기싫을때 hashmap에담아서 쓰면됨
		aList.add(hm);
		aList.add(hm1);
		aList.add(hm2);
		aList.add(hm3);
		
		HashMap ham = (HashMap)aList.get(0);
		String name = (String)ham.get("이름");//한줄로쓴거
		Object age = ham.get("나이"); //두줄로쓴거
		String age0 = (String)age;
		
		String job = (String)ham.get("직업");
			
		System.out.println(ham + " : " + name + " : " + age+ " : " + age0);
		
		HashMap ham1 = (HashMap)aList.get(1);
		String name1 = (String)ham1.get("이름");//한줄로쓴거
		Object age1 = ham1.get("나이"); //두줄로쓴거
		String age10 = (String)age1;
		String job1 = (String)ham1.get("직업");
		System.out.println(ham1 + " : " + name1 + " : " + age1+ " : " + age10);
		
		HashMap ham2 = (HashMap)aList.get(2);
		String name2 = (String)ham2.get("이름");//한줄로쓴거
		Object age2 = ham2.get("나이"); //두줄로쓴거
		String age20 = (String)age2;
		String job2 = (String)ham2.get("직업");
		System.out.println(ham2 + " : " + name2 + " : " + age2+ " : " + age20);
		
		HashMap ham3 = (HashMap)aList.get(3);
		String name3 = (String)ham3.get("이름");//한줄로쓴거
		Object age3 = ham3.get("나이"); //두줄로쓴거
		String age30 = (String)age3;
		String job3 = (String)ham3.get("직업");
		System.out.println(ham3 + " : " + name3 + " : " + age3+ " : " + age30);
		
		System.out.println("aList.size()"+ aList.size());
		//for문으로 돌리기
		for(int i=0;i <aList.size();i++){
			HashMap h = (HashMap)aList.get(i);
			String hname =(String)h.get("이름");
			String hage = (String)h.get("나이");
			String hjob = (String)h.get("직업");
			System.out.println( "aList[" + i +"] : " + hname + " : " + hage+ " : " + hjob);

		}
	}//main끝

}//클래스끝
