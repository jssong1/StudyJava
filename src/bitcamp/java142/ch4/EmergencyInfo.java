
package bitcamp.java142.ch4;
//Emergency Contact Information
//1. ������ : �̸�,����,��ȭ��ȣ(HP),�ּ�(���θ�,�����ȣ)
//2. �����ʹ� ArrayList ��´�, InforVO
//3. �����͸� �޴� ��� : ScannerŬ���� �̿�
//4. Ŭ���� 
//	InforVO : ������ ��� �� 
//	EmergencyInfo : ������ �޴� Ŭ����
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bitcamp.java142.ch3.InsertDataVO;

public class EmergencyInfo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("�̸���? >>> : ");
		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = null;
		String strV0 = sc1.nextLine();
		InforVO ifVo = new InforVO();
		ifVo.setName(strV0);
		
		System.out.println("���̴�?");
		sc1 = new Scanner(System.in);
		String strV1 = sc1.nextLine();
		ifVo.setAge(strV1);
	
		
		System.out.println("����ȣ��?");
		sc1 = new Scanner(System.in);
		String strV2 = sc1.nextLine();
		ifVo.setHp(strV2);
		
		System.out.println("�ּҴ�?");
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
//		//��������idVo�� �����Ͽ� IsertDataVO���� ����ȭ�� �����͸� setter �Լ��� �̿��Ͽ� �����͸�����Ѵ�.
//		
//		ifVo.setAge(""+sc1);
//		ifVo.setHp(""+sc1);
//		ifVo.setAddr(""+sc1);
//		}
//		
		
		
	//���ٴҼҽ�
//		if (sc1.hasNext()){ //boolean hasNext() : Returns true if this scanner has another token in its input 
//			System.out.println("sc1 : "+sc1.hasNext());
//			String strV = sc1.nextLine();
//			System.out.println("strV >>> : " + strV);
//			
//			sc2 = new Scanner(strV).useDelimiter(" ");
////			System.out.println("while�� sc2 : "+sc2);
//			while (sc2.hasNext()){ //boolean hasNext() : Returns true if this scanner has another token in its input 
//				System.out.println("sc2 : "+sc2.hasNext());
//				String str = sc2.next(); //String next() : Finds and returns the next complete token from this scanner 
//				System.out.println("str >>> : " +str);
//				if (!sc2.hasNext()) break;
//			}//while��
//			
//		}//if��

			
	}//���γ�

}//Ŭ������
