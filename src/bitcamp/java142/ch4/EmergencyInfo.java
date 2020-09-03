
package bitcamp.java142.ch4;
//Emergency Contact Information
//1. 데이터 : 이름,나이,전화번호(HP),주소(도로명,우편번호)
//2. 데이터는 ArrayList 담는다, InforVO
//3. 데이터를 받는 방법 : Scanner클래스 이용
//4. 클래스 
//	InforVO : 데이터 담는 통 
//	EmergencyInfo : 데이터 받는 클래스
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bitcamp.java142.ch3.InsertDataVO;

public class EmergencyInfo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("이름은? >>> : ");
		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = null;
		String strV0 = sc1.nextLine();
		InforVO ifVo = new InforVO();
		ifVo.setName(strV0);
		
		System.out.println("나이는?");
		sc1 = new Scanner(System.in);
		String strV1 = sc1.nextLine();
		ifVo.setAge(strV1);
	
		
		System.out.println("폰번호는?");
		sc1 = new Scanner(System.in);
		String strV2 = sc1.nextLine();
		ifVo.setHp(strV2);
		
		System.out.println("주소는?");
		sc1 = new Scanner(System.in);
		String strV3 = sc1.nextLine();
		ifVo.setAddr(strV3);
		
//		System.out.println("ifVo.getName() >>> : " + ifVo.getName() );
//		System.out.println("ifVo.getAge() >>> : " + ifVo.getAge() );
//		System.out.println("ifVo.getHp() >>> : " + ifVo.getHp() );
//		System.out.println("ifVo.getAddr() >>> : " + ifVo.getAddr() );
		
//		new EmergencyInfo().inforDatea();
		List aList = null; 
		aList = new ArrayList();
		aList.add(ifVo.getName()); 
		aList.add(ifVo.getAge());
		aList.add(ifVo.getHp());
		aList.add(ifVo.getAddr());
		System.out.println(""+aList);
		
//		for (int i=0; i<10;i++){ 
//		//참조변수idVo를 선언하여 IsertDataVO에서 은닉화한 데이터를 setter 함수를 이용하여 데이터를사용한다.
//		
//		ifVo.setAge(""+sc1);
//		ifVo.setHp(""+sc1);
//		ifVo.setAddr(""+sc1);
//		}
//		
		
		
	//들고다닐소스
//		if (sc1.hasNext()){ //boolean hasNext() : Returns true if this scanner has another token in its input 
//			System.out.println("sc1 : "+sc1.hasNext());
//			String strV = sc1.nextLine();
//			System.out.println("strV >>> : " + strV);
//			
//			sc2 = new Scanner(strV).useDelimiter(" ");
////			System.out.println("while전 sc2 : "+sc2);
//			while (sc2.hasNext()){ //boolean hasNext() : Returns true if this scanner has another token in its input 
//				System.out.println("sc2 : "+sc2.hasNext());
//				String str = sc2.next(); //String next() : Finds and returns the next complete token from this scanner 
//				System.out.println("str >>> : " +str);
//				if (!sc2.hasNext()) break;
//			}//while끝
//			
//		}//if끝

			
	}//메인끝

}//클래스끝
