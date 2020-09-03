package bitcamp.java142.ch5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.sql.EmpSqlQueryMap;
import bitcamp.java142.ch5.vo.EmpVO;
import bitcamp.java142.common.ConnProperty;

public class EmpDAOImpl implements EmpDAO {

	@Override
	public ArrayList selectEmp() {
		// TODO Auto-generated method stub
		System.out.println("A>�������̵� EmpDAOImpl.selectEmp()�߻��Լ� ���� ------------------------------------------");
		Connection con = null; 			//������ ���� �������Connection�ʱ�ȭ
		PreparedStatement pstmt = null;	//������ �б����� PreparedStatement �ʱ�ȭ
		ResultSet rsRs = null;			//������������ ResultSet�ʱ�ȭ
		EmpVO evo = null; 				//������ ������ ���� ����(ValueObject) �ʱ�ȭ
		ArrayList aList = null;			//������ �����͸� ���뿡��� �� ������ �߰��� �迭�� ArrayList �ʱ�ȭ
		 
		
		try{
				
			//Connection ���ϱ� 
			//session(�����ϴ�����) ������� (= thread�� ����ƴ�)
			con = ConnProperty.getConnection();//����
			System.out.println("--2>selctEmp_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EmpSqlQueryMap.getSelectQuery());//���� �ҷ���(EmpSqlQueryMap.getSelectQuery()�������ư�)//�� 2��������??�α��������ѹ������ư�
			System.out.println("--3>selctEmp_SELECT�α� ����>>> : " + EmpSqlQueryMap.getSelectQuery());//�α�����//��ȸ �ΰ����߳�(��������ü��2��) �Լ������ϰ� ����̵ǳ�...?
			System.out.println("--4>selctEmp_pstmt���������� >>> : " + pstmt);
			
			//�Ű������� �����ϱ� ������ ���� ���ε�����(get)�� ������
			rsRs=pstmt.executeQuery(); //���� ���� (DB���� ���ٿ�)
			System.out.println("--5>selctEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
				if(rsRs != null){  //���� ���������� �����Ͱ� null�̾ƴ϶��  
					aList = new ArrayList(); //???�� �ν��Ͻ���¡ import�� ArrayListŬ������ ������ �޸𸮿ø��°ǰ�?  ->���� if�ΰɷ����� ������������ ���ڴ�!!
					while (rsRs.next()){// 1���̶� ��Ģ ����ȭ�� ���� while���� ���� //while������ true�϶� �����//����- next()�Լ�(Ŀ���Լ�): �������־�?������true ������false; �ܹ������θ�����
//						evo = new EmpVO(); //���� �����ʹ��� ����EmpVo�� ������ evo�� �ν��Ͻ�   
//						evo.setEmpno(rsRs.getInt("EMPNO")); //���뿡 ���  //���������� ��ȸ�� �÷� EMPNO��get�ؼ� evo���뿡set
//						evo.setEname(rsRs.getString(2));//���������� ��ȸ�� 2���÷� ���ڿ����� get�ؼ� evo������ ename(�÷��ε���2��)�� ���
						evo = new EmpVO(rsRs.getInt("EMPNO"), rsRs.getString(2));//�������̿��ؼ� �ν��Ͻ�; ��, EmpVO.java�� �������߰�;
						
						aList.add(evo); //�÷� 2���� ��ȸ����; ������ ���� evo������ �迭�� aList���������� add()�Լ��̿��ؼ� �߰��ϱ� (�ο������)
						System.out.println("while���鼭 aList�� add�Ǵ� �ּҰ��� >>> : " + aList);
					}//while��
				}//if��
				
			//��ӵ��ư����ʰ� ���ݾ��ֱ�. �𸣴°�ó�� null �ʱ�ȭ���� ����	
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null; //������������ ���������״ϱ� finally�� ����ֱ�
			
		}catch(Exception e){
			System.out.println("A>DB���� �Ǵ� ���� ��� ������ �߻� >>> : " + e);
		}//try-catch��		
		System.out.println("A>�������̵� EmpDAOImpl.selectEmp()�߻��Լ� �� ------------------------------------------");
		return aList; //������ �߰��� �迭�� aList����
	}//ArrayList selectEmp() �������̵���

	@Override
	public ArrayList searchEmp(EmpVO canEvo ) {//OracleTest_4---searchEmp()���� �Ű����� �޾����ϱ� ����������Ȯ���ؼ� �������� �����ϱ�
		// TODO Auto-generated method stub
		System.out.println("B>�������̵� EmpDAOImpl.searchEmp(EmpVO canEvo)�߻��Լ� ���� ------------------------------------------");
		Connection con = null; 			//������ ���� �������Connection�ʱ�ȭ
		PreparedStatement pstmt = null;	//������ �б����� PreparedStatement �ʱ�ȭ
		ResultSet rsRs = null;			//������������ ResultSet�ʱ�ȭ
		EmpVO evo = null; 				//������ ������ ���� ����(ValueObject) �ʱ�ȭ
		ArrayList aList = null;			//������ �����͸� ���뿡��� �� ������ �߰��� �迭�� ArrayList �ʱ�ȭ
		
		try{
			con = ConnProperty.getConnection();//����
			System.out.println("--2>searchEmp_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EmpSqlQueryMap.getSearchQuery());//���� �ҷ���
			System.out.println("--3>searchEmp_SELECT�α� ����>>> : " + EmpSqlQueryMap.getSearchQuery());//�α�����
			System.out.println("--4>searchEmp_pstmt���������� >>> : " + pstmt);
			
			//�Ű����� ���� (������ ���� ���ε� �ʿ�)
			//�������� �ִ� ����ǥ(?:�÷��̽�Ȧ��)������2���ϱ� ���ε��ѹ��� ������� ����
			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> :" + "1�� : " + canEvo.getEmpno()+  " / 2�� : "+canEvo.getEname());
			pstmt.setInt(1, canEvo.getEmpno());//pstmt.setString(parameterIndex, x);
			pstmt.setString(2, canEvo.getEname());
			
			rsRs=pstmt.executeQuery(); //���� ���� (DB���� ���ٿ�)
			System.out.println("--5>searchEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
				if(rsRs !=null){
					aList = new ArrayList(); //�迭�� �ν��Ͻ�
					while(rsRs.next()){
						evo = new EmpVO();// 1���̶� ��Ģ ����ȭ�� ���� while���� ����
						evo.setEmpno(rsRs.getInt("EMPNO"));
						System.out.println("���� " + rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString(2));
						aList.add(evo); //������ ���� ������ �迭�� aList�� �߰��ϱ�
						System.out.println("while���鼭 aList�� add�Ǵ� �ּҰ��� >>> : " + aList);
					}//while��
				}//if��
				
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null; 
						
		}catch(Exception e){
			System.out.println("B>DB���� �Ǵ� ���� ��� ������ �߻� >>> : " + e);
		}//try-catch��
		System.out.println("B>�������̵� EmpDAOImpl.searchEmp(EmpVO canEvo)�߻��Լ� �� ------------------------------------------");
		return aList;
	}//searchEmp()�Լ���

	@Override
	public ArrayList likeSearchEmp(EmpVO canEvo) {
		// TODO Auto-generated method stub
		System.out.println("C>�������̵� EmpDAOImpl.likesearchEmp(EmpVO canEvo)�߻��Լ� ���� ------------------------------------------");
		Connection con = null; 			//������ ���� �������Connection�ʱ�ȭ
		PreparedStatement pstmt = null;	//������ �б����� PreparedStatement �ʱ�ȭ
		ResultSet rsRs = null;			//������������ ResultSet�ʱ�ȭ
		EmpVO evo = null; 				//������ ������ ���� ����(ValueObject) �ʱ�ȭ
		ArrayList aList = null;			//������ �����͸� ���뿡��� �� ������ �߰��� �迭�� ArrayList �ʱ�ȭ
		
		try{		
			con = ConnProperty.getConnection();//����
			System.out.println("--2>likesearchEmp_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EmpSqlQueryMap.getLikeSearchQuery());//���� �ҷ���
			System.out.println("--3>likesearchEmp_SELECT�α� ����>>> : " + EmpSqlQueryMap.getLikeSearchQuery());//�α�����
			System.out.println("--4>likesearchEmp_pstmt���������� >>> : " + pstmt);
			
			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> :" + canEvo.getEname());
			pstmt.setString(1, canEvo.getEname());
//			pstmt.setString(2, canEvo.getEname());//????��1���� : ����ǥ(�÷��̽�Ȧ��)������1���ݾ�
//			? (placeholder, �Ű����� ���ε� ����):preparestatement������ select�Ҷ� �Ű����� ��� ����,�ѹ����� where�ִ�?��1�� ename2��
//			?, ? :  �÷��̽� Ȧ���� ��������Ģ�� ���´�. ���������� �� ���� ����Ǵ�?�� 1������ ������ ������?���� ���������� ��ȣ�� �ο��ȴ�.
//			?�� ���ε��ϱ� : psmt.setXXX(���ε��ѹ���, ��); :set������Ÿ�Կ� ���� �Լ� ��� ex) DB�� NUMBER => setInt() ; DB�� VARCHAR2 => setString()�Լ� ���
			rsRs=pstmt.executeQuery(); //���� ���� (DB���� ���ٿ�)
			System.out.println("--5>likesearchEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
				if(rsRs !=null){
					aList = new ArrayList(); //�迭�� �ν��Ͻ�
					while(rsRs.next()){
						evo = new EmpVO();// 1���̶� ��Ģ ����ȭ�� ���� while���� ����
						evo.setEmpno(rsRs.getInt("EMPNO"));
						System.out.println("��ȸ�� " + rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString(2));
						aList.add(evo); //������ ���� ������ �迭�� aList�� �߰��ϱ�
						System.out.println("while���鼭 aList�� add�Ǵ� �ּҰ��� >>> : " + aList);
					}//while��
				}//if��
			
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null; 
			
		}catch(Exception e){
			System.out.println("B>DB���� �Ǵ� ���� ��� ������ �߻� >>> : " + e);
		}//try-catch��
		System.out.println("C>�������̵� EmpDAOImpl.likesearchEmp(EmpVO canEvo)�߻��Լ� �� ------------------------------------------");
		return aList;
	}


}
