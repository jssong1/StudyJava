package bitcamp.java142.ch3;

import java.util.ArrayList;
import java.util.List;

public class InsertData {
	List aList = null; //�������̽� List�� ���������� �̿��Ͽ� �ʱ�ȭ�Ͽ���
	
	public void insertDatea(){ //��������� InsertDataŬ���� �ȿ� insertDatea�Լ��� ���� 
		
		aList = new ArrayList(); // �������̽� List�� �̿��Ͽ� ArrayListŬ������ �ν��Ͻ�
		
		
		for (int i=0; i<10;i++){ 
			InsertDataVO idVo = new InsertDataVO(); //��������idVo�� �����Ͽ� IsertDataVO���� ����ȭ�� �����͸� setter �Լ��� �̿��Ͽ� �����͸�����Ѵ�.
			System.out.println("aList�� �߰��� idVo"+i+" �ּҰ� >>> : " + idVo);
			idVo.setStr0("A"+i);
			idVo.setStr1("B"+i);
			idVo.setStr2("C"+i);
			idVo.setStr3("D"+i);
			idVo.setStr4("E"+i);
			idVo.setStr5("F"+i);
						
			aList.add(idVo); //idVo.setStr0~5 6���� get�����͸� �ϳ��� �迭����Ʈ�� ����ø���.(�迭����Ʈ�����߰�)-> i�� 10�����̹Ƿ� 10���ݺ�����
			System.out.println("aList"+i+">>> : " + aList); //�� �ϳ��� ���ο� �迭����Ʈ�� �߰��� �迭����Ʈ��� (�ּҰ����� ����)
			System.out.println("aList"+i+".size>>> : " + aList.size());// �迭����Ʈ������ ����(����)
			
		}//for��
		System.out.println("=====================");
		System.out.println("aList.size>>> : "+ aList.size());
		System.out.println("=====================");
//		System.out.println(aList);
		
		for (int i=0;i< aList.size();i++){
			InsertDataVO id = (InsertDataVO)aList.get(i);
			System.out.print("id.getStr0() >>> : " + id.getStr0() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr1() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr2() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr3() + ":");
			System.out.print("id.getStr0() >>> : " + id.getStr4() + ":");
			System.out.println("id.getStr0() >>> : " + id.getStr5() + ":");
		}
	}//insertDatea()��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertData().insertDatea(); //������������ �ѹ�������� ���������Ƚᵵ��//for�� �ѹ� �� ������ �ν��Ͻ�
		
	}//main�Լ���

}//Ŭ������

/*
aList�� �߰��� idVo0 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@15db9742
aList0>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742]
aList0.size>>> : 1
aList�� �߰��� idVo1 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@6d06d69c
aList1>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c]
aList1.size>>> : 2
aList�� �߰��� idVo2 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@7852e922
aList2>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922]
aList2.size>>> : 3
aList�� �߰��� idVo3 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@4e25154f
aList3>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f]
aList3.size>>> : 4
aList�� �߰��� idVo4 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@70dea4e
aList4>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e]
aList4.size>>> : 5
aList�� �߰��� idVo5 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@5c647e05
aList5>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05]
aList5.size>>> : 6
aList�� �߰��� idVo6 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@33909752
aList6>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752]
aList6.size>>> : 7
aList�� �߰��� idVo7 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@55f96302
aList7>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752, bitcamp.java142.ch3.InsertDataVO@55f96302]
aList7.size>>> : 8
aList�� �߰��� idVo8 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@3d4eac69
aList8>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752, bitcamp.java142.ch3.InsertDataVO@55f96302, bitcamp.java142.ch3.InsertDataVO@3d4eac69]
aList8.size>>> : 9
aList�� �߰��� idVo9 �ּҰ� >>> : bitcamp.java142.ch3.InsertDataVO@42a57993
aList9>>> : [bitcamp.java142.ch3.InsertDataVO@15db9742, bitcamp.java142.ch3.InsertDataVO@6d06d69c, bitcamp.java142.ch3.InsertDataVO@7852e922, bitcamp.java142.ch3.InsertDataVO@4e25154f, bitcamp.java142.ch3.InsertDataVO@70dea4e, bitcamp.java142.ch3.InsertDataVO@5c647e05, bitcamp.java142.ch3.InsertDataVO@33909752, bitcamp.java142.ch3.InsertDataVO@55f96302, bitcamp.java142.ch3.InsertDataVO@3d4eac69, bitcamp.java142.ch3.InsertDataVO@42a57993]
aList9.size>>> : 10
=====================
aList.size>>> : 10
=====================
id.getStr0() >>> : A0:id.getStr0() >>> : B0:id.getStr0() >>> : C0:id.getStr0() >>> : D0:id.getStr0() >>> : E0:id.getStr0() >>> : F0:
id.getStr0() >>> : A1:id.getStr0() >>> : B1:id.getStr0() >>> : C1:id.getStr0() >>> : D1:id.getStr0() >>> : E1:id.getStr0() >>> : F1:
id.getStr0() >>> : A2:id.getStr0() >>> : B2:id.getStr0() >>> : C2:id.getStr0() >>> : D2:id.getStr0() >>> : E2:id.getStr0() >>> : F2:
id.getStr0() >>> : A3:id.getStr0() >>> : B3:id.getStr0() >>> : C3:id.getStr0() >>> : D3:id.getStr0() >>> : E3:id.getStr0() >>> : F3:
id.getStr0() >>> : A4:id.getStr0() >>> : B4:id.getStr0() >>> : C4:id.getStr0() >>> : D4:id.getStr0() >>> : E4:id.getStr0() >>> : F4:
id.getStr0() >>> : A5:id.getStr0() >>> : B5:id.getStr0() >>> : C5:id.getStr0() >>> : D5:id.getStr0() >>> : E5:id.getStr0() >>> : F5:
id.getStr0() >>> : A6:id.getStr0() >>> : B6:id.getStr0() >>> : C6:id.getStr0() >>> : D6:id.getStr0() >>> : E6:id.getStr0() >>> : F6:
id.getStr0() >>> : A7:id.getStr0() >>> : B7:id.getStr0() >>> : C7:id.getStr0() >>> : D7:id.getStr0() >>> : E7:id.getStr0() >>> : F7:
id.getStr0() >>> : A8:id.getStr0() >>> : B8:id.getStr0() >>> : C8:id.getStr0() >>> : D8:id.getStr0() >>> : E8:id.getStr0() >>> : F8:
id.getStr0() >>> : A9:id.getStr0() >>> : B9:id.getStr0() >>> : C9:id.getStr0() >>> : D9:id.getStr0() >>> : E9:id.getStr0() >>> : F9:

 */

