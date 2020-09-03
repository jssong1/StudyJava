package bitcamp.java142.ch5.eci;

import java.util.ArrayList;


import bitcamp.java142.ch5.eci.dao.EciDAO2;
import bitcamp.java142.ch5.eci.dao.EciDAOImpl2;
import bitcamp.java142.ch5.eci.vo.EciVO;
import bitcamp.java142.ch5.eci.vo.EciVO2;
import bitcamp.java142.common.ChaeBunClass;
import bitcamp.java142.common.ChaeBunClass2;

public class EciScr2 {
	
	//insert
	public boolean insertEci(String ename, 
							 String eage, 
							 String ehp, 
							 String eaddr){
		
		System.out.println("--A>>EciScr2.insertEci �Լ� START>>>>>");
		
		EciDAO2 edao = new EciDAOImpl2();
		
		EciVO2 evo = null;
		evo = new EciVO2();

		evo.setEname(ename);
		evo.setEage(eage);
		evo.setEhp(ehp);
		evo.setEaddr(eaddr);
		
		boolean bFlag = edao.insertEci(evo);
		System.out.println("EciDAOImpl2.insertEci���� ���ϵ� �� ����>>>>>" +bFlag);
		System.out.println("--A>>EciScr2.insertEci �Լ� END>>>>>");
		return bFlag;
	}
	
	
	//update
	public boolean updateEci(String enumm,
								String eaddr){
		
		System.out.println("--B>>EciScr2.updateEci �Լ� START>>>>>");
		EciDAO2 edao = new EciDAOImpl2();
		
		EciVO2 evo = null;
		evo = new EciVO2();
		evo.setEnumm(enumm);
		evo.setEaddr(eaddr);

		boolean bFlag = edao.updateEci(evo);
		System.out.println("EciDAOImpl2.updateEci���� ���ϵ� �� ����>>>>>" +bFlag);
		System.out.println("--B>>EciScr2.updateEci �Լ� END>>>>>");
		
		return bFlag;
	}
	
	//delete
	public boolean deleteEci(String enumm){
		System.out.println("--C>>EciScr2.deleteEci �Լ� START>>>>>");
		EciDAO2 edao = new EciDAOImpl2();
		
		EciVO2 evo = null;
		evo = new EciVO2();
		evo.setEnumm(enumm);
		
		boolean bFlag = edao.deleteEci(evo);
		System.out.println("EciDAOImpl2.deleteEci���� ���ϵ� �� ����>>>>>" +bFlag);
		System.out.println("--C>>EciScr2.deleteEci �Լ� END>>>>>");
		return bFlag;
	}
	
	//��ü��ȸ
	public ArrayList<EciVO2> selectEci(){
		System.out.println("--D>>EciScr2.selectEci �Լ� START>>>>>");
		
		EciDAO2 edao = new EciDAOImpl2();
		ArrayList<EciVO2> aList = edao.selectEci();
		
		System.out.println("EciDAOImpl2.selectEci���� ���ϵ� �� ����>>>>>" +aList);
		System.out.println("--D>>EciScr2.selectEci �Լ� END>>>>>");
		return aList;
	} 
	
	//Ű����˻�
	public ArrayList<EciVO2> searchEci(String sVal){
		
		System.out.println("--E>>EciScr2.searchEci �Լ� START>>>>>");
		System.out.println(" EclScr2.searchEci(String sVal) �Ű����� sVal ����  >>> Ȯ�� : " + sVal);
		EciDAO2 edao = new EciDAOImpl2();
		
		EciVO2 can0 = null;// �Ű������� ������ �ٴ��� �ʰ� import�� ����EmpVOŬ������ can0���������� �ʱ�ȭ 
		can0 = new EciVO2();// �Ű��������뾲������ �ν��Ͻ� 
		can0.setEnumm(sVal);//ename���뿡 ���ε��� �Ű����� "�̻���" set���
		System.out.println("EciVO2.ename()���뿡  iVal ����� Ȯ��>>>>>: "+can0.getEnumm());
		System.out.println("���뿡 �ȴ��� Ename�� �����ñ�: "+can0.getEname());
		
		ArrayList<EciVO2> aList = edao.searchEci(can0);		
		System.out.println("EciDAOImpl2.searchEci���� ���ϵ� �� ����>>>>>" +aList);
		System.out.println("--E>>EciScr2.searchEci �Լ� END>>>>>");
		return aList;
	}
	
	//like�˻�
	public ArrayList<EciVO2> likeSearchEci(String sVal){
		
		System.out.println("--F>>EciScr2.likesearchEci �Լ� START>>>>>");
		System.out.println(" EclScr2.searchEci(String sVal) �Ű����� sVal ����  >>> Ȯ�� : " + sVal);
		EciDAO2 edao = new EciDAOImpl2();
		
		
		EciVO2 evo = null;
		evo = new EciVO2();
		evo.setEname(sVal);
		
		ArrayList<EciVO2> aList = edao.likeSearchEci(evo);		
		System.out.println("EciDAOImpl2.likesearchEci���� ���ϵ� �� ����>>>>>" +aList);
		System.out.println("--F>>EciScr2.lkiesearchEci �Լ� END>>>>>");
		return aList;
	}
	
	
	public static void displayFun(ArrayList<EciVO2> aList){
		
		int aListSize = aList.size();
		for(int i =0; i<aListSize;i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
			EciVO2 evo1 = (EciVO2)aList.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
			System.out.print(""+i+"��° for >>> : " + evo1.getEnumm());	
			System.out.print(" " + evo1.getEname());
			System.out.print(" " + evo1.getEage());
			System.out.print(" " + evo1.getEhp());
			System.out.print(" " + evo1.getEaddr());
			System.out.print(" " + evo1.getEdeleteYN());
			System.out.print(" " + evo1.getEinsertdate());
			System.out.println(" " + evo1.getEupdatedate());
		}//for�� ��	
	}

	
//	public boolean updateChaeBun(String enumm, String enumm2){
//		
//		System.out.println("--UC>>EciScr2.updateEci �Լ� START>>>>>");
//		EciDAO2 edao = new EciDAOImpl2();
//		
//		EciVO2 evo = null;
//		evo = new EciVO2();
//		evo.setEnumm(enumm);
//		evo.setEnumm(enumm2);
//		
//		System.out.println("setEnumm �����?"+ evo.getEnumm());
//	
//		boolean bFlag = edao.updateChaeBun(evo);
//		System.out.println("EciDAOImpl2.updateChaeBun���� ���ϵ� �� ����>>>>>" +bFlag);
//		System.out.println("--UC>>EciScr2.updateEci �Լ� END>>>>>");
//		
//		return bFlag;
//	};
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sFlag = "I";
		
		//insert
		if ("I".equals(sFlag)){
			System.out.println("-A--INSERT ���� �Լ� START>>>>>");
//			String enumm = "4"; 
			String ename = "���ۿ�";
			String eage = "75";
			String ehp = "01046653356";
			String eaddr = "��� ��õ�� �ΰ";
			
			EciScr2 es = new EciScr2();
			boolean bFlag = es.insertEci(ename, eage, ehp, eaddr);
			
			if (bFlag){
				System.out.println("�����Ͱ� �� �Է� �Ǿ����ϴ� >>> : ");
				
				EciScr2 es0 = new EciScr2();//�Է��ߵǾ����ϱ� ��ü��ȸ�� ���� �ٽ� �ν��Ͻ�����ؼ� ����غ���
				ArrayList<EciVO2> aList = es0.selectEci();
				int aListSize = aList.size();
				if(aListSize > 0){
					EciScr2.displayFun(aList);
				}
				
			}else{
				System.out.println("�����Ͱ� �� �Է� ���� �ʾҽ��ϴ� >>> : ");				
			}// ���if-else ��
			
			System.out.println("-A--INSERT ���� �Լ� END>>>>>");
		}//insert if��
		
		//update
		if("U".equals(sFlag)){
			System.out.println("-B--UPDATE ���� �Լ� START>>>>>");
			String enumm = "E003";
			String eaddr = "���� ���ʱ� ������";
			
			EciScr2 es = new EciScr2();
			boolean bFlag = es.updateEci(enumm,eaddr);
			
			if (bFlag){
				System.out.println("�����Ͱ� �� �����Ǿ����ϴ� >>>");
				
				EciScr2 es0 = new EciScr2();//�����Ⱥκ� ��ü��ȸ�� ����ؼ� Ȯ���ϱ� 
				ArrayList<EciVO2> aList = es0.selectEci();
				int aListSize = aList.size();
				if(aListSize > 0){
					EciScr2.displayFun(aList);
				}
			}else{
				System.out.println("�����Ͱ� �� �������� �ʾҽ��ϴ� >>>");
			}
			
			System.out.println("-B--UPDATE ���� �Լ� END>>>>>");
		}//update if��	
			
		//delete	
		if("D".equals(sFlag)){
			System.out.println("-C--DELETE ���� �Լ� START>>>>>");
			String enumm = "2";
			
			EciScr2 es = new EciScr2();
			boolean bFlag = es.deleteEci(enumm);
			
			if (bFlag){
				System.out.println("�����Ͱ� �� �����Ǿ����ϴ� >>>");
			}else{
				System.out.println("�����Ͱ� �� �������� �ʾҽ��ϴ� >>>");
			}
			
			System.out.println("-C--DELETE ���� �Լ� END>>>>>");
		}//delete if��
			
			
		//��ü��ȸ
		if ("SALL".equals(sFlag)){
			System.out.println("---��ü��ȸ SELECT ALL ���� �Լ� START>>>>>");
			EciScr2 es = new EciScr2();
			ArrayList<EciVO2> aList = es.selectEci();
			int aListSize = aList.size();
			if (aListSize > 0){
				
				for(int i =0; i<  aListSize; i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
					EciVO2 evo = aList.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
					System.out.print("��ü��ȸ>aList"+i+">>> : " + evo.getEnumm());
					System.out.print(" " + evo.getEname());
					System.out.print(" " + evo.getEage());
					System.out.print(" " + evo.getEhp());
					System.out.print(" " + evo.getEaddr());
					System.out.print(" " + evo.getEdeleteYN());
					System.out.print(" " + evo.getEinsertdate());
					System.out.println(" " + evo.getEupdatedate());
				}//for�� ��
				System.out.println("---��ü��ȸ SELECT ALL ���� �Լ�END>>>>>");
			}//if��
			
		}// select if��	
			
		//Ű���� �˻�
		if ("SSER".equals(sFlag)){
			System.out.println("---Ű���� �˻� SEARCH ���� �Լ� START>>>>>");
			EciScr2 es = new EciScr2();
			
			ArrayList<EciVO2> aList = es.searchEci("4");
			int aListSize = aList.size();
			System.out.println("DAOImp���� ������ �߰��Ǿ� ���Ϲ��� �迭�� aList1�� ��������" + aList); //1��������
			System.out.println("�迭����Ʈ aList1 ������ ���� >>> : " + aList.size()); //����1��
			for(int i =0; i<aListSize;i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
				EciVO2 evo1 = (EciVO2)aList.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
				System.out.print("Ű����˻�>aList1"+i+">>> : " + evo1.getEnumm());	
				System.out.print(" " + evo1.getEname());
				System.out.print(" " + evo1.getEage());
				System.out.print(" " + evo1.getEhp());
				System.out.print(" " + evo1.getEaddr());
				System.out.print(" " + evo1.getEdeleteYN());
				System.out.print(" " + evo1.getEinsertdate());
				System.out.println(" " + evo1.getEupdatedate());
			}//for�� ��	
			System.out.println("---Ű���� �˻� SEARCH ���� �Լ� END>>>>>");
		}// Ű����˻� if��
		
		
		//like �˻� 
		if ("SLIK".equals(sFlag)){
			String ename = "��";
			
			EciScr2 es = new EciScr2();
			ArrayList<EciVO2> aList = es.likeSearchEci(ename);
			int aListSize = aList.size();
			if(aListSize > 0){
				EciScr2.displayFun(aList);
			}//if ��		
		}//like�˻� if��
		
		
//		//ChaeBun ������Ʈ
//		if("UC".equals(sFlag)){
//			System.out.println("-CU--UPDATE ���� �Լ� START>>>>>");
//			String enumm = "E003";
//			String enumm2 = ChaeBunClass2.ymdFormats(enumm);
//			EciScr2 es = new EciScr2();
//			
//			boolean bFlag = es.updateChaeBun(enumm,enumm2);
//			
//			if (bFlag){
//				System.out.println("�����Ͱ� �� �����Ǿ����ϴ� >>>");
//				
//				EciScr2 es0 = new EciScr2();//�����Ⱥκ� ��ü��ȸ�� ����ؼ� Ȯ���ϱ� 
//				ArrayList<EciVO2> aList = es0.selectEci();
//				int aListSize = aList.size();
//				if(aListSize > 0){
//					EciScr2.displayFun(aList);
//				}
//			}else{
//				System.out.println("�����Ͱ� �� �������� �ʾҽ��ϴ� >>>");
//			}
//			
//			System.out.println("-B--UPDATE ���� �Լ� END>>>>>");
//		}//ChaeBun ������Ʈ if��	

	}//main��

}//Ŭ������
