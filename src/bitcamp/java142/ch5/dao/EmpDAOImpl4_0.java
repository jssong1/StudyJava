package bitcamp.java142.ch5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.sql.EmpSqlQueryMap;
import bitcamp.java142.ch5.vo.EmpVO;
import bitcamp.java142.common.ConnProperty;

public class EmpDAOImpl4_0 implements EmpDAO4_0 {

	
	// ��ü��ȸ 
	@Override
	public ArrayList selectEmp() {
		// TODO Auto-generated method stub

		// EmpDAOlmpl.selectEmp() Start
		System.out.println("EmpDAOlmpl.selectEmp() Start >>>");

		// ���������� ���� �Ѵ�.
		// �ʿ��� ��ü��  null �ʱ�ȭ �Ѵ�.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		EmpVO evo = null;

		// ���� ���� 
		// try catch
		try {
			
			// Connection ���ϱ� 
			// session �ϴ� �������.(thread)
			// getConnection() ���� ����
			con = ConnProperty.getConnection();
			System.out.println("con >>> " + con);

			// �����ͺ��̽��� ������ sql ���ǹ� �����ϱ� 
			pstmt = con.prepareStatement(EmpSqlQueryMap.getSelectQuery());
			System.out.println("pstmt >>> " + pstmt);

			// ���� Ȯ��
			System.out.println("SELECT >>> " + EmpSqlQueryMap.getSelectQuery());

			// executeQuery() ����ؼ� ���� ��� ���� (DB���� ���ٿ�)
			// pstmt.execyteQuery()�Լ� �������� sql ���ǹ��� �����ϱ� ���� 
			// sql ���ǹ��� DataBase ���� �ǰ� 
			// �����ͺ��̽����� sql ���ǹ��� �����ؼ� ����� ����� 
			// �ٽ� ResultSet �������̽��� �����ϰ� �̰��� rsRs ���������� �����Ѵ�
			rsRs = pstmt.executeQuery();
			System.out.println("rsRs >>> " + rsRs);

			// �����Ͱ� ������ ���� �ؾ� �Ѵ�.
			if (rsRs != null) {
				
				aList = new ArrayList();
				
				while (rsRs.next()) {
					// ���� ����
					evo = new EmpVO();
					// set���� ����
					evo.setEmpno(rsRs.getInt("EMPNO"));
					evo.setEname(rsRs.getString("ENAME"));
//					evo = new EmpVO( rsRs.getInt("EMPNO")
//			        ,rsRs.getString("ENAME"));
//					evo.setEmpno(rsRs.getInt(1));
//					evo.setEname(rsRs.getString(2));
					
					// aList�� ���
					// aList ���������� add �Լ��� �̿��ؼ� 
					// evo ���������� ��´�. 
					aList.add(evo);
//					System.out.println("aList.size() >>> : " + aList.size());
					System.out.println("aList >>> : " + aList);
				}//while��
				System.out.println("aList.size() >>> : " + aList.size());
			}else{
				System.out.println("�����Ͱ� ���� ������ ~~~ ");
			}
			rsRs.close(); rsRs = null;
			pstmt.close(); pstmt = null;
			con.close(); con = null;
			
		} catch (Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			try{
				if (rsRs !=null) try {rsRs.close(); rsRs = null;} catch(Exception ex){}
				if (pstmt !=null) try {pstmt.close(); pstmt = null;} catch(Exception ex){}
				if (con !=null) try {rsRs.close(); con = null;} catch(Exception ex){}
			}catch(Exception e2){
				System.out.println("������ >>> : " + e2.getMessage());
			}
		}
		// EmpDAOlmpl.selectEmp() End
		System.out.println("EmpDAOlmpl.selectEmp() End >>>");

		// return �޴� �� = aList
		return aList;
	}// end of EmpDAOImpl.selectEmp()

	@Override
	public ArrayList searchEmp(EmpVO evo_1) {
		// TODO Auto-generated method stub
		// EmpDAOlmpl.searchEmp(EmpVO evo_1) Start
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) Start >>>");
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) Start >>>" + evo_1.getEmpno());
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) Start >>>" + evo_1.getEname());
		
		// evo_1.getEmpno(), evo_1.getEname() Validation �� �ؾ� �Ѵ�. 
		int empno = evo_1.getEmpno();
		String ename = evo_1.getEname();
		
		// ������ ���� Ȯ��
//		boolean bool = evo_1 != null;
//		System.out.println("bool >>> " + bool);

		// connection ���� ���� ���ε���, ���������� ���̻��
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		EmpVO evo = null;
		if (evo_1 != null) {
			// EmpDAOlmpl.searchEmp(EmpVO evo_1) if�� ����
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) if�� ����");
			try {
				// ����
				con = ConnProperty.getConnection();
				System.out.println("con >>> " + con);

				// ���� ��������
				pstmt = con.prepareStatement(EmpSqlQueryMap.getSearchQuery());
				System.out.println("pstmt >>> " + pstmt);

				// ���� Ȯ��
				System.out.println("SELECT >>> " + EmpSqlQueryMap.getSearchQuery());

				// setting
				pstmt.setInt(1, empno);
				pstmt.setString(2, ename);

				// �����
				rsRs = pstmt.executeQuery();
				System.out.println("rsRs >>> " + rsRs);

				if (rsRs != null) {
					// new ������ ����ؼ� ArrayList �ν��Ͻ�
					aList = new ArrayList();
					// true�϶� ���ư��� while��
					while (rsRs.next()) {
						// new ������ ����ؼ� ValueObject �ν��Ͻ�
						evo = new EmpVO();
						// set,get ���� �� ���Ϲޱ�, get �������� ������Ÿ��
						evo.setEmpno(rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString("ENAME"));
						// aList�� �����͵� ���
						aList.add(evo);
					}
				}

			} catch (Exception e) {
				System.out.println("DB���� �Ǵ� Query ��� ������ �߻� >>> " + e);
			}

			// EmpDAOlmpl.searchEmp(EmpVO evo_1) if�� ��
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) if�� ��");
		} else {
			// EmpDAOlmpl.searchEmp(EmpVO evo_1) else�� ����
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) else�� ����");

			System.out.println("Error");

			// EmpDAOlmpl.searchEmp(EmpVO evo_1) else�� ��
			System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) else�� ��");
		}
		// EmpDAOlmpl.searchEmp(EmpVO evo_1) End
		System.out.println("EmpDAOlmpl.searchEmp(EmpVO evo_1) End >>>");
		return aList;

	}// end of EmpDAOImpl.searchEmp()

	@Override
	public ArrayList likeSearchEmp(EmpVO evo_1) {
		// TODO Auto-generated method stub
		// OracleTest_4.likeSearchEmp(EmpVO evo_1) Start
		System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) Start >>>");		
		System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) Start >>>" + evo_1.getEname());
		
		// evo_1.getEmpno(), evo_1.getEname() Validation �� �ؾ� �Ѵ�. 
		int empno = evo_1.getEmpno();
		String ename = evo_1.getEname();

/*		// ������ ���� Ȯ��
		boolean bool = evo_1 != null;
		System.out.println("bool >>> " + bool);*/

		// connection ���� ���� ���ε���, ���������� ���̻��
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		EmpVO evo = null;

		if (evo_1 != null) {
			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if�� ����
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if�� ����");
			try {
				// ����
				con = ConnProperty.getConnection();
				System.out.println("con >>> " + con);
				// ���� ��������
				pstmt = con.prepareStatement(EmpSqlQueryMap.getLikeSearchQuery());
				System.out.println("pstmt >>> " + pstmt);
				// ���� Ȯ��
				System.out.println("SELECT >>> \n" + EmpSqlQueryMap.getLikeSearchQuery());
				// setting
				pstmt.setString(1, evo_1.getEname());

				// �����
				rsRs = pstmt.executeQuery();
				System.out.println("rsRs >>> " + rsRs);

				if (rsRs != null) {
					// aList �ν��Ͻ�
					aList = new ArrayList();
					while (rsRs.next()) {
						// ValueObject �ν��Ͻ�
						evo = new EmpVO();
						// set,get �̿��ؼ� �޾ƿ���
						evo.setEmpno(rsRs.getInt("EMPNO"));
						evo.setEname(rsRs.getString("ENAME"));
						// aList�� ���
						aList.add(evo);
					}
				}

			} catch (Exception e) {
				System.out.println("DB���� �Ǵ� Query ��� ������ �߻� >>> " + e);
			}
			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if�� ��
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) if�� ��");
		} else {
			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else�� ����
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else�� ����");

			System.out.println("Error");

			// EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else�� ����
			System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) else�� ����");
		}
		
		// OracleTest_4.likeSearchEmp(EmpVO evo_1) End
		System.out.println("EmpDAOlmpl.likeSearchEmp(EmpVO evo_1) End >>>");
		return aList;
	}// end of OracleTest_4.likeSearchEmp(EmpVO evo_1)

}// end of EmpDAOOImpl class