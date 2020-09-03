package bitcamp.java142.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap3을 제너릭써서 다시 
		
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("이름", "정송원");	//해쉬맵에서 데이터 담을 땐 put이용/ key는 동일하면 안됨
		hm.put("나이", "71");
		hm.put("직업", "특급엔지니어");
		
		HashMap<String,String> hm1 = new HashMap<String, String>();
		hm1.put("이름", "정송투");	
		hm1.put("나이", "72");
		hm1.put("직업", "엔지니어");
		
		HashMap <String,String>hm2 = new  HashMap<String, String>();
		hm2.put("이름", "정송삼");	
		hm2.put("나이", "73");
		hm2.put("직업", "지니어");
		
		HashMap <String,String>hm3 = new  HashMap<String, String>();
		hm3.put("이름", "정송사");	
		hm3.put("나이", "74");
		hm3.put("직업", "니어");
		
		
		
		ArrayList<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>(); //깡통클래스이용하기싫을때 hashmap에담아서 쓰면됨
		aList.add(hm);
		aList.add(hm1);
		aList.add(hm2);
		aList.add(hm3);
				
		System.out.println("aList.size()"+ aList.size());
		//for문으로 돌리기
		for(int i=0;i <aList.size();i++){
			HashMap<String, String> h = (HashMap<String, String>) aList.get(i);
			String hname =(String)h.get("이름");
			String hage = (String)h.get("나이");
			String hjob = (String)h.get("직업");
			System.out.println( "aList[" + i +"] : " + hname + " : " + hage+ " : " + hjob);
		}//for끝
		
		//iterator로 접근해서 한번에 뽑기->키값얻어서 value하나하나출력하도록 숙제
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
		}//while끝	
		
		//키값(이름,나이,직업)아니까 (내가입력) 		
		Iterator its = aList.iterator();
		while(its.hasNext()){
			Object obj = its.next();
			System.out.println("obj >>> : " + obj );
			
			HashMap hmm = (HashMap)obj;
			System.out.println(hmm.get("이름")+ " : " + hmm.get("나이") + " : " + hmm.get("직업"));		
		}
//			HashMap<String, String> h = (HashMap<String, String>) aList.get(i);
//			HashMap<String, String> key = it.next(); //next() : 다음 요소를 읽어온다
//			String value = h.get(key);//형변환필요
//			System.out.println(key+" : " + value); // "hashmap을 iterator했다"
		
		//키값모를 때 유용
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
		}//while끝	
		
	}//main끝

}//클래스끝

/*
 * hashmap 만들기
 * arraylist 담기
 * iterator로 arraylist꺼내고 hashmap 4개 데이터도꺼내기
 */
