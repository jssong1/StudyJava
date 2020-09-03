package bitcamp.java142.ch5;

import java.util.ArrayList;

import bitcamp.java142.ch5.dao.EmpDAO;
import bitcamp.java142.ch5.dao.EmpDAOImpl;
import bitcamp.java142.ch5.vo.EmpVO;

public class OracleTest_4 {
	
	//**�迭�ϴ� �� arraylistŸ���� ������Ÿ�԰������ (element object) //�����ѵ�����Ÿ�Ծƴ϶� �ٵ�
	
	//��ü��ȸ
	public ArrayList selectEmp(){//ArrayList�� ����Ÿ���� ��������� selectEmp()�Լ� ����
		System.out.println("-----------------------------------------------------A�� OracleTest_4---selectEmp()�Լ�����");
		EmpDAO edao = new EmpDAOImpl(); //�θ��������̽�Ŭ���� EmpDAO�� ������ edao�� ����Ͽ� �ڽ�Ŭ���� EmpDAOImpl()�� �ν��Ͻ��Ѵ�. 
		ArrayList aList = edao.selectEmp();//�迭�� ArrayList�� ������ aList�� ����Ͽ� �ν��Ͻ��� edao���ִ� selectEmp()�Լ��� ȣ���Ѵ�.
		System.out.println("edao.selectEmp()���� ���ϵ� aList>>>>>: "+aList);
		System.out.println("------------------------------------------------------A�� OracleTest_4---selectEmp()�Լ���");
		
		return aList; //�������̽��� ���Ĺ��� ����� aList�� ���ο� ���ϰ����� �������� 
	}//OracleTest_4; selectEmp()�Լ���
	
	//Ű���� ��ȸ
	public ArrayList searchEmp(int iVal, String sVal){ //������Ÿ�Ը��߱�
		System.out.println("-----------------------------------------------------B�� OracleTest_4---searchEmp()�Լ�����");
		System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) �Ű����� iVal ����  >>> Ȯ�� : " + iVal);
		System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) �Ű����� sVal ����  >>> Ȯ�� : " + sVal);
		EmpDAO edao = new EmpDAOImpl(); //�θ𼱾� �ڽ��ν��Ͻ�
		
		//�Ű����������ϱ� �Ű������� ������ �ٴ��� �ʰ� ����VO�� ��°����ʿ�  
		//���뿡 ��Ƽ� edao�� �ѱ�� 
		EmpVO can0 = null;// �Ű������� ������ �ٴ��� �ʰ� import�� ����EmpVOŬ������ can0���������� �ʱ�ȭ 
		can0 = new EmpVO();// �Ű��������뾲������ �ν��Ͻ� 
		can0.setEmpno(iVal);//import&�ν��Ͻ��� EmpVO���� �Լ�setEmpno()���뿡 ���ε��� �Ű����� 7369 set���   //���⼭ ������Ÿ�Ը������ǰ�
		can0.setEname(sVal);//ename���뿡 ���ε��� �Ű����� SMITH set���
		System.out.println("EmpVO.empno()���뿡 7369 ����� Ȯ�� >>>>>: "+can0.getEmpno());
		System.out.println("EmpVO.ename()���뿡 SMITH ����� Ȯ��>>>>>: "+can0.getEname());
		
		ArrayList aList = edao.searchEmp(can0);//�迭�� ArrayList�� ������ aList�� ����Ͽ�; ȣ��� edao���ִ� searchEmp()�Լ��� �Ű��������� can0�� ���ε� ;searchEmp()�Լ��Ǹ�������  ArrayList
		System.out.println("edao.searchEmp()���� ���ϵ� aList>>>>>: "+aList);
		System.out.println("-----------------------------------------------------B�� OracleTest_4---searchEmp()�Լ���");
		
		return aList;//�������̽��� ���Ĺ��� ����� aList�� ���ο� ���ϰ����� �������� 
	}
	
	public ArrayList likeSearchEmp(String sVal){
		System.out.println("-----------------------------------------------------C�� OracleTest_4---likesearchEmp()�Լ�����");
		System.out.println("OracleTest_4.likesearchEmp(String sVal) �Ű����� sVal ����  >>> Ȯ�� : " + sVal);
		EmpDAO edao = new EmpDAOImpl(); //�θ𼱾� �ڽ��ν��Ͻ�
		//�������̿��غ���
		EmpVO can1 = null;// �Ű������� ������ �ٴ��� �ʰ� import�� ����EmpVOŬ������ can1���������� �ʱ�ȭ
		can1 = new EmpVO(sVal);//EmpVO.java�� ������Ÿ�Ը´� ������ ���� ���� �÷��־���
		ArrayList aList = edao.likeSearchEmp(can1);//�迭�� ArrayList�� ������ aList�� ����Ͽ�; ȣ��� (edao��ġ��) likeSearchEmp()�Լ��� �Ű��������� can1�� ���ε� ;likeSearchEmp()�Լ��Ǹ�������  ArrayList
		System.out.println(">>>>>: "+aList);
		System.out.println("-----------------------------------------------------C�� OracleTest_4---likesearchEmp()�Լ���");
		
		return aList;//�������̽��� ���Ĺ��� ����� aList�� ���ο� ���ϰ����� �������� 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_4 ot4 = new OracleTest_4();// OracleTest_4 Ŭ���� ot4 ���������� �ν��Ͻ�(��üȭ, �޸𸮿� �ø�)
		

//		if equals�� �κ���ȸ�ϸ� ���� ������ Ŭ�����ν��Ͻ��ʿ�
		
		//1�� ��ü��ȸ selectEmp
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� 1�� ot4.selectEmp()�Լ��� �����ͺ��̽� ��ȸ �� ��� ���� ���ۡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ");
		ArrayList aList0 = ot4.selectEmp();//ArrayListŬ���� ������ Ÿ���� ����������; ������ aList0�������Ͽ�; ot4Ŭ�������ִ� �Լ� selectEmp()�� ���ϰ��� ���ε��Ѵ�//���������ϱ� Ŭ������ArrayList��(�Ϲݺ����鵥����Ÿ��int����)
		System.out.println("DAOImp���� ������ �߰��Ǿ� ���Ϲ��� �迭�� aList0�� ��������" + aList0);//14���� �ּҰ� ���� 
		System.out.println("�迭����Ʈ aList0 ������ ���� >>> : " + aList0.size());
		for(int i=0; i < aList0.size(); i++){//aList.size());// �迭����Ʈ������ ����(����) //14�����ư� 0~13
			EmpVO evo0 = (EmpVO)aList0.get(i);
			System.out.print("A>aList"+i+">>> : " + evo0.getEmpno());
			System.out.println(" " + evo0.getEname());			
		}//for��
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� 1�� ot4.selectEmp()�Լ��� ��ȸ�� �����ͺ��̽� ��¿Ϸ�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ");
		
		System.out.println(" ");
		System.out.println("");
		System.out.println(" ");
		System.out.println("�١١١١١١١١١١١١١١١١� 2�� ot4.searchEmp()�Լ��� �����ͺ��̽� ��ȸ �� ��� ���� ���ۡ١١١١١١١١١١١١١١١١� ");
		
		//2�� Ű����˻� searchEmp
		ArrayList aList1 = ot4.searchEmp(7369,"SMITH"); //�Ű������� �ִ� ���
		System.out.println("DAOImp���� ������ �߰��Ǿ� ���Ϲ��� �迭�� aList1�� ��������" + aList1); //1��������
		System.out.println("�迭����Ʈ aList1 ������ ���� >>> : " + aList1.size()); //����1��
		for(int i =0; i< aList1.size();i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
			EmpVO evo1 = (EmpVO)aList1.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
			System.out.print("B>aList"+i+">>> : " + evo1.getEmpno());
			System.out.println(" " + evo1.getEname());	
		}//for�� ��
		System.out.println("�١١١١١١١١١١١١١١١١� 2�� ot4.searchEmp()�Լ��� ��ȸ�� �����ͺ��̽� ��¿Ϸ�١١١١١١١١١١١١١١١١� ");
		
		
		System.out.println(" ");
		System.out.println("");
		System.out.println(" ");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� 3�� ot4.likesearchEmp()�Լ��� �����ͺ��̽� ��ȸ �� ��� ���� ���ۡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ");
		
		//C�� like �˻�
		ArrayList aList2 = ot4.likeSearchEmp("S");
		System.out.println("DAOImp���� ������ �߰��Ǿ� ���Ϲ��� �迭�� aList2�� ��������" + aList2); //��������
		System.out.println("�迭����Ʈ aList2 ������ ���� >>> : " + aList2.size()); //����
		for(int i =0; i< aList2.size();i++){ //aList.size()); �迭����Ʈ������ ����(����) //aList�� size�Լ��� ���̱��ϱ� (static����; ���ϰ�int;�Ű�����()����) 
			EmpVO evo2 = (EmpVO)aList2.get(i); //ArrayListŬ������ get�Լ��� �̿��Ͽ� ÷��(i)��°�� �����͸� ����ϱ�// ÷�ڰ� 0���� �迭�� ���̰����� 1�������ϸ� �ݺ�����
			System.out.print("C>aList"+i+">>> : " + evo2.getEmpno());
			System.out.println(" " + evo2.getEname());	
		}//for�� ��
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� 3�� ot4.likesearchEmp()�Լ��� �����ͺ��̽� ��¿Ϸ�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ");
		
		
	}//�����Լ���

}//OracleTest_4 Ŭ���� ��
