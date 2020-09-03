package bitcamp.java142.ch6;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest2 {
//HashMapTest을 제너릭반영해서 다시 Hashmap<K,V> -> <String,String> 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key&value로 Hashmap에 데이터담기
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("hm >>> : " + hm);
		hm.put("이름", "정송원");	//해쉬맵에서 데이터 담을 땐 put이용/ key는 동일하면 안됨
		System.out.println("hm >>> : " + hm);
		hm.put("나이", "77");
		System.out.println("hm >>> : " + hm);
		hm.put("직업", "특급엔지니어");
		System.out.println("hm >>> : " + hm);
		
		//put넣은건 object니까 String형변환필요
		//key값이 일치하지않을 떄 value는 null로나옴
		String name = hm.get("이름");
		System.out.println("name >>> : " + name);
		String name1 = hm.get("a");
		System.out.println("name1 >>> : " + name1);
		String age = hm.get("나이");
		System.out.println("age >>> : " + age);
		String job = hm.get("직업");
		System.out.println("job >>> : " + job);
		
		System.out.println("키 Key >>> : " + hm.keySet());//참조변수이용 key이름모를때 유용
		System.out.println("값 Value >>> : " + hm.values());
		
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()){ //hasNext() : 읽어 올 요소가 남아있는지 있으면 true
			String key = keys.next(); //next() : 다음 요소를 읽어온다
			String value = hm.get(key);//형변환필요
			System.out.println(key+" : " + value); // "hashmap을 iterator했다"
			
		}
	}//main끝

}//클래스끝
