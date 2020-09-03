package bitcamp.java142.ch6;

import java.util.HashMap;
import java.util.Iterator;


public class HashMapTest {
//제너릭?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key&value로 Hashmap에 데이터담기
		HashMap hm = new HashMap();
		System.out.println("hm >>> : " + hm);
		hm.put("이름", "정송원");	//해쉬맵에서 데이터 담을 땐 put이용/ key는 동일하면 안됨
		System.out.println("hm >>> : " + hm);
		hm.put("나이", "77");
		System.out.println("hm >>> : " + hm);
		hm.put("직업", "특급엔지니어");
		System.out.println("hm >>> : " + hm);
		
		//put넣은건 object니까 String형변환필요
		//key값이 일치하지않을 떄 value는 null로나옴
		String name = (String)hm.get("이름");
		System.out.println("name >>> : " + name);
		String name1 = (String)hm.get("a");
		System.out.println("name1 >>> : " + name1);
		String age = (String)hm.get("나이");
		System.out.println("age >>> : " + age);
		String job = (String)hm.get("직업");
		System.out.println("job >>> : " + job);
		
		System.out.println("키 Key >>> : " + hm.keySet());//참조변수이용 key이름모를때 유용
		System.out.println("값 Value >>> : " + hm.values());
		
		
		Iterator keys = hm.keySet().iterator();
		while (keys.hasNext()){ //hasNext() : 읽어 올 요소가 남아있는지 있으면 true
			String key = (String)keys.next(); //next() : 다음 요소를 읽어온다
			String value = (String)hm.get(key);//형변환필요
			System.out.println(key+" : " + value); // "hashmap을 iterator했다"
			
		}
	}//main끝

}//클래스끝
