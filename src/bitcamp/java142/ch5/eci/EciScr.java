package bitcamp.java142.ch5.eci;

import java.util.ArrayList;

import bitcamp.java142.ch5.eci.dao.EciDAO;
import bitcamp.java142.ch5.eci.dao.EciDAOImpl;
import bitcamp.java142.ch5.eci.vo.EciVO;
import bitcamp.java142.ch5.eci.vo.EciVO2;
import bitcamp.java142.ch5.vo.EmpVO;

public class EciScr {
	
	//insert
	public boolean insertEci(String enumm, 
							 String ename, 
							 String eage, 
							 String ehp, 
							 String eaddr){
		
		System.out.println("--A>>EciScr.insertEci �Լ� START>>>>>");
		
		EciDAO edao = new EciDAOImpl();
		
		EciVO evo = null;
		evo = new EciVO();
		evo.setEnumm(enumm);
		evo.setEname(ename);
		evo.setEage(eage);
		evo.setEhp(ehp);
		evo.setEaddr(eaddr);
		
		boolean bFlag = edao.insertEci(evo);
		System.out.println("EciDAOImpl.insertEci���� ���ϵ� �� ����>>>>>" +bFlag);
		System.out.println("--A>>EciScr.insertEci �Լ� END>>>>>");
		return bFlag;
	}
	
	
	//update
	public boolean updateEci(String enumm,
								String ehp){
		
		System.out.println("--B>>EciScr.updateEci �Լ� START>>>>>");
		EciDAO edao = new EciDAOImpl();
		
		EciVO evo = null;
		evo = new EciVO();
		evo.setEnumm(enumm);
		evo.setEhp(ehp);

		boolean bFlag = edao.updateEci(evo);
		System.out.println("EciDAOImpl.updateEci���� ���ϵ� �� ����>>>>>" +bFlag);
		System.out.println("--B>>EciScr.updateEci �Լ� END>>>>>");
		
		return bFlag;
	}
	
	//delete
	public boolean deleteEci(String enumm){
		System.out.println("--C>>EciScr.deleteEci �Լ� START>>>>>");
		EciDAO edao = new EciDAOImpl();
		
		EciVO evo = null;
		evo = new EciVO();
		evo.setEnumm(enumm);
		
		boolean bFlag = edao.deleteEci(evo);
		System.out.println("EciDAOImpl.deleteEci���� ���ϵ� �� ����>>>>>" +bFlag);
		System.out.println("--C>>EciScr.deleteEci �Լ� END>>>>>");
		return bFlag;
	}
	
	//��ü��ȸ
	public ArrayList<EciVO> selectEci(){
		System.out.println("--D>>EciScr.selectEci �Լ� START>>>>>");
		
		EciDAO edao = new EciDAOImpl();
		ArrayList<EciVO> aList = edao.selectEci();
		
		System.out.println("EciDAOImpl.selectEci���� ���ϵ� �� ����>>>>>" +aList);
		System.out.println("--D>>EciScr.selectEci �Լ� END>>>>>");
		return aList;
	} 
	
	//Ű����˻�
	public ArrayList<EciVO> searchEci(String sVal){
		
		System.out.println("--E>>EciScr.searchEci �Լ� START>>>>>");
		System.out.println(" EclScr.searchEci(String sVal) �Ű����� sVal ����  >>> Ȯ�� : " + sVal);
		EciDAO edao = new EciDAOImpl();
		
		EciVO can0 = null;// �Ű������� ������ �ٴ��� �ʰ� import�� ����EmpVOŬ������ can0���������� �ʱ�ȭ 
		can0 = new EciVO();// �Ű��������뾲������ �ν��Ͻ� 
		can0.setEnumm(sVal);//ename���뿡 ���ε��� �Ű����� "�̻���" set���
		System.out.println("EciVO.ename()���뿡  iVal ����� Ȯ��>>>>>: "+can0.getEnumm());
		System.out.println("���뿡 �ȴ��� Ename�� �����ñ�: "+can0.getEname());
		
		ArrayList<EciVO> aList = edao.searchEci(can0);		
		System.out.println("EciDAOImpl.searchEci���� ���ϵ� �� ����>>>>>" +aList);
		System.out.println("--E>>EciScr.searchEci �Լ� END>>>>>");
		return aList;
	}
	
	//like�˻�
	public ArrayList likesearchEci(String sVal){
		
//		System.out.println("--F>>EciScr.likesearchEci �Լ� START>>>>>");
//		System.out.println(" EclScr.searchEci(String sVal) �Ű����� sVal ����  >>> Ȯ�� : " + sVal);
//		EciDAO edao = new EciDAOImpl();
//		
//		
//		
//		ArrayList<EciVO> aList = edao.searchEci(can1);		
//		System.out.println("EciDAOImpl.likesearchEci���� ���ϵ� �� ����>>>>>" +aList);
//		System.out.println("--F>>EciScr.lkiesearchEci �Լ� END>>>>>");
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sFlag = "SSER";
		
		//insert
		if ("I".equals(sFlag)){
			System.out.println("-A--INSERT ���� �Լ� START>>>>>");
			String enumm = "4";
			String ename = "�̻���";
			String eage = "17";
			String ehp = "01023115455";
			String eaddr = "���� ���ſ��� ";
			
			EciScr es = new EciScr();
			boolean bFlag = es.insertEci(enumm, ename, eage, ehp, eaddr);
			
			if (bFlag){
				System.out.println("�����Ͱ� �� �Է� �Ǿ����ϴ� >>> : ");
				
//				EciScr es0 = new EciScr();
//				ArrayList<EciVO> aList = es0.selectEci();
//				int aListSize = aList.size();
//				if(aListSize > 0){
//					EciScr.displayFun(aList);
//				}
				
			}else{
				System.out.println("�����Ͱ� �� �Է� ���� �ʾҽ��ϴ� >>> : ");				
			}// ���if-else ��
			
			System.out.println("-A--INSERT ���� �Լ� END>>>>>");
		}//insert if��
		
		//update
		if("U".equals(sFlag)){
			System.out.println("-B--UPDATE ���� �Լ� START>>>>>");
			String enumm = "4";
			String ehp = "01045458888";
			
			EciScr es = new EciScr();
			boolean bFlag = es.updateEci(enumm,ehp);
			
			if (bFlag){
				System.out.println("�����Ͱ� �� �����Ǿ����ϴ� >>>");
			}else{
				System.out.println("�����Ͱ� �� �������� �ʾҽ��ϴ� >>>");
			}
			
			System.out.println("-B--UPDATE ���� �Լ� END>>>>>");
		}//update if��	
			
		//delete	
		if("D".equals(sFlag)){
			System.out.println("-C--DELETE ���� �Լ� START>>>>>");
			String enumm = "2";
			
			EciScr es = new EciScr();
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
			EciScr es = new EciScr();
			ArrayList<EciVO> aList = es.selectEci();
			int aListSize = aList.size();
			if (aListSize > 0){
				
				for(int i =0; i<  aListSize; i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
					EciVO evo = aList.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
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
			EciScr es = new EciScr();
			
			ArrayList<EciVO> aList1 = es.searchEci("4");
			int aListSize = aList1.size();
			System.out.println("DAOImp���� ������ �߰��Ǿ� ���Ϲ��� �迭�� aList1�� ��������" + aList1); //1��������
			System.out.println("�迭����Ʈ aList1 ������ ���� >>> : " + aList1.size()); //����1��
			for(int i =0; i<aListSize;i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
				EciVO evo1 = (EciVO)aList1.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
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
		
		
		if ("SLIK".equals(sFlag)){
			
		}	
			
			
			
			

	}//main��

}//Ŭ������
