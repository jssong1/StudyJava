package bitcamp.java142.ch5;

import java.util.ArrayList;

import bitcamp.java142.ch5.dao.EmpDAO4_0;
import bitcamp.java142.ch5.dao.EmpDAOImpl4_0;
import bitcamp.java142.ch5.vo.EmpVO;

//----- �������� ������� -----
	// �Լ� ������, ���� �μ�Ʈ �� ������� �ۼ� �� �ٽ� ���ƿͼ� ���γ��� �ۼ�

	public class OrcleTest4_0 {

		// 2. �Լ� ������ ���� ����� return type : ��ü�� null | ���ڴ� "" | ���ڴ� 0 | �Ǽ��� 0.0 |
		// boolean�� false
		
		
		// ��ü��ȸ
		public ArrayList selectEmp() {
			// OracleTest_4.selectEmp() Start
			System.out.println("OracleTest_4.selectEmp() Start >>>");

			// 2-1 interface EmpDAO , 2-2 Implement EmpDAOImpl
			// EmpDAO �������̽� Ŭ������ edao ���������� ���� 
			// EmpDAO �������̽� Ŭ������ ������(������, implimentaion) �� 
			// EmpDAOImpl() Ŭ������ ������(�ν��Ͻ���, ��üȭ, �޸𸮿� �ø� etc.)
			EmpDAO4_0 edao = new EmpDAOImpl4_0();
			
			// working
			// edao ���������� EmpDAO �������̽� Ŭ������ �ִ� 
			// �߻��Լ� selectEmp() �� ȣ��(invoke) �ϸ�
			// �����δ� EmpDAO �������̽� Ŭ������ implemention �� 
			// EmpDAOImpl() Ŭ������ selectEmp() �Լ��� ȣ�� �ȴ�.
			// selectEmp() �Լ��� �������� ArrayList �̴�.
			ArrayList aList = edao.selectEmp();
			// OracleTest_4.selectEmp() End
			System.out.println("OracleTest_4.selectEmp() End >>>");

			// return ���� ��
			// edao.selectEmp() �Լ����� ������ 
			// ArrayList �������� aList�� ������ 
			return aList;
		}// end of OracleTest_4.selectEmp()

		
		// Ű���� �˻�
		public ArrayList searchEmp(int iVal, String sVal) {
			// OracleTest_4.searchEmp(int iVal, String sVal) Start
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) Start >>>");
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) Start >>>" + iVal);
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) Start >>>" + sVal);

			EmpDAO4_0 edao = new EmpDAOImpl4_0();

			// ValueObject �ʱ�ȭ
			EmpVO evo = null;
			// EmpVO�� �ش� �Ű����� ������ �����ʿ�
			// �Ű����� 2��
			evo = new EmpVO(iVal, sVal);

			// �Ű� ���� 2�� �뿡 ���
			// evo.setEmpno(iVal);
			// evo.setEname(sVal);

			// DAO���� VO ��� �� ������ ��� �ٴϸ� �ȵǰ�, ������ �뿡 �־�� �Ѵ�.
			// �߸��� �� : ArrayList aList = edao.searchEmp(iVal, sVal) XXXXXXXXXXXXX
			// �Ű����� 2�� ���� ���� ����ؼ� aList�� �ֱ�
			ArrayList aList = edao.searchEmp(evo);

			// OracleTest_4.searchEmp(int iVal, String sVal) End
			System.out.println("OracleTest_4.searchEmp(int iVal, String sVal) End >>>");

			return aList;
		}// end of OracleTest_4.searchEmp(int iVal, String sVal)

		// like �˻� 
		public ArrayList likeSearchEmp(String sVal) {

			// OracleTest_4.likeSearchEmp(String sVal) Start
			System.out.println("OracleTest_4.likeSearchEmp(String sVal) Start >>>");
			System.out.println("OracleTest_4.likeSearchEmp(int iVal, String sVal) Start >>>" + sVal);

			// �θ𼱾� �ڽ��ν��Ͻ�
			EmpDAO4_0 edao = new EmpDAOImpl4_0();

			// ValueObject �ʱ�ȭ
			EmpVO evo = null;

			// �Ű����� 1��
			evo = new EmpVO(sVal);

			// �Ű����� 1�� �뿡 ���
			// evo.setEname(sVal);

			// �Ű����� ���� ���� ����ؼ� aList�� �ֱ�
			ArrayList aList = edao.likeSearchEmp(evo);

			// OracleTest_4.likeSearchEmp(String sVal) End
			System.out.println("OracleTest_4.likeSearchEmp(String sVal) End >>>");

			return aList;
		}// end of OracleTest_4.likiSearchEmp(String sVal)

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// OracleTest_4.main() Start
			System.out.println("OracleTest_4.main() Start >>>");

			// if���� true�� �� ���ϱ� ������ ��ġ�Ǿ� �� ( ������ ������)
			String sVal = "3";

			if (sVal.equals("1")) {

				System.out.println("OralceTest_4().main() ��ü��ȸ ���� >>> ");

				// �������� ����
				int empno = 0;
				String ename = "";

				// OralceTest_4 Ŭ���� ot4 ���������� �ν��Ͻ�(��üȭ, �޸𸮿� �ø�)
				// ot4 ���������� selectEmp() �Լ� ȣ��(invoke)
				// selectEmp() �Լ� �������� ArrayList �̴�. 
				OrcleTest4_0 ot_4 = new OrcleTest4_0();
				
				// 3. Arraylist�� �޾Ƽ� �Լ�ȣ��
				ArrayList aList_1 = ot_4.selectEmp();
				System.out.println("aList.size() >>> " + aList_1.size());
				System.out.println("main() aList >>> : " + aList_1);
				
				// ȭ�鿡 ��� 
				int aList_1Size = aList_1.size();

				// ArrayList Casting �̿��ؼ� ������ �ϳ��� ������
				if (aList_1 != null && 0 <= aList_1Size) {
					// int i=0���� �ʱ�ȭ, i�� aList_1 ���̺��� ���� ��, �ϳ��� �����϶�
					for (int i = 0; i < aList_1Size; i++) {
						// evo_1 = (��������)aList_1.get(i) <- �ϳ��� ������
						EmpVO evo_1 = (EmpVO) aList_1.get(i);
						empno = evo_1.getEmpno();
						ename = evo_1.getEname();
						// evo_1�� �ִ� Empno ��������
						System.out.print("aList_1 >>> " + empno);
						// evo_1�� �ִ� Ename ��������
						System.out.println(" " + ename);
					}
				} else {
					System.out.println("Error >>> ");
				}
				System.out.println("OralceTest_4().main() ��ü��ȸ �� >>> ");
			}

			
			// Ű���� �˻�
			if (sVal.equals("2")) {

				int empno = 0;
				String ename = "";

				OrcleTest4_0 ot_4 = new OrcleTest4_0();

				ArrayList aList_2 = ot_4.searchEmp(7782, "CLARK");
				int aList_2Size = aList_2.size();

				if (aList_2 != null && 0 <= aList_2Size) {
					// ArrayList Casting �̿��ؼ� ������ �ϳ��� ������
					for (int i = 0; i < aList_2Size; i++) {
						EmpVO evo_2 = (EmpVO) aList_2.get(i);
						empno = evo_2.getEmpno();
						ename = evo_2.getEname();
						// evo_2�� �ִ� Empno ��������
						System.out.print("aList_2 >>> " + empno);
						// evo_2�� �ִ� Ename ��������
						System.out.println(" " + ename);
					}
				} else {
					System.out.println("Error >>> ");
				}

			}

			
			// like �˻� 
			if (sVal.equals("3")) {

				int empno = 0;
				String ename = "";

				// ���� ���Ǻ� �ν��Ͻ�
				OrcleTest4_0 ot_4 = new OrcleTest4_0();
				ArrayList aList_3 = ot_4.likeSearchEmp("A");
				int aList_3Size = aList_3.size();

				if (aList_3 != null && 0 < aList_3Size) {
					// ArrayList Casting �̿��ؼ� ������ �ϳ��� ������
					for (int i = 0; i < aList_3Size; i++) {
						// casting
						EmpVO evo_3 = (EmpVO) aList_3.get(i);
						empno = evo_3.getEmpno();
						ename = evo_3.getEname();
						// evo_3�� �ִ� Empno/Ename ����
						System.out.print("aList_3 >>> " + empno);
						System.out.println(" " + ename);
					}
				}

			}

			// OracleTest_4.main() End
			System.out.println("OracleTest_4.main() End >>>");

		} // end of OracleTest_4.main()

	}// end of OracleTest_4 class

