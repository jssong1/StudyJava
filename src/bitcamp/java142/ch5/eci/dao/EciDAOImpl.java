package bitcamp.java142.ch5.eci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.eci.sql.EciSqlQueryMap;
import bitcamp.java142.ch5.eci.vo.EciVO;
import bitcamp.java142.common.ConnProperty;

public class EciDAOImpl implements EciDAO {

	
	//�μ�Ʈ->�޸� /�ѹ�->�޸𸮿��ִ°�������
	//Ŀ��->���ϷγѾ
	
	@Override
	public boolean insertEci(EciVO _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
		
		System.out.println("-------------------------------A-----EciDAOImpl.insertEci �Լ� START>>>>>");
		//���� ����
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>insertEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap.getInsertQuery());
			System.out.println("--3>insertEci_EciSqlQueryMap.getInsertQuery()�α� ����>>> :"+ EciSqlQueryMap.getInsertQuery());
			System.out.println("--4>insertEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEnumm());
			pstmt.setString(2, _evo.getEname());
			pstmt.setString(3, _evo.getEage());
			pstmt.setString(4, _evo.getEhp());
			pstmt.setString(5, _evo.getEaddr());
			pstmt.setString(6, "Y");
			nCnt = pstmt.executeUpdate();//select��ȸ�� ������ ResultSet=>rsRs=pstmt.executeQuery();
			
			//�����Ͱ� ������ ���ϱ�; ��, ConnectionPool�� ����� ���� ������� �ʴ´�.
			if(!con.getAutoCommit()) con.commit(); // db commit!!!! �о�ֱ�)
			System.out.println("--5>insertEci_nCnt�� ���°� �� ��? >>>> " + nCnt);
			
			ConnProperty.conClose(con,pstmt);
							
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt);
		}// try-catch-finally��
		
		System.out.println("-------------------------------A-----EciDAOImpl.insertEci �Լ� END>>>>>");
		if (nCnt == 0) return false;
		return true;
	}//insertEci(EciVO _evo)��

	@Override
	public boolean updateEci(EciVO _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
		
		System.out.println("-------------------------------B-----EciDAOImpl.updateEci �Լ� START>>>>>");
		
		//���� ����
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>updateEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap.getUpdateQuery());
			System.out.println("--3>updateEci_EciSqlQueryMap.getUpdateQuery()�α� ����>>> :"+ EciSqlQueryMap.getUpdateQuery());
			System.out.println("--4>updateEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEhp());
			pstmt.setString(2, _evo.getEnumm());
			nCnt = pstmt.executeUpdate();
			
			// ��. ConnectionPool�� ����� ���� ������� �ʴ´�. 		
			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! �о�ֱ�
            System.out.println("--5>updateEci_nCnt update �� �Ǿ���/�� ��? >>>> " + nCnt);
			
            ConnProperty.conClose(con,pstmt);
			
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt);
		}//try-catch-finally��
		
		System.out.println("-------------------------------B-----EciDAOImpl.updateEci �Լ� END>>>>>");
		if (nCnt == 0) return false;
		return true;
	}//updateEci(EciVO _evo)��

	@Override
	public boolean deleteEci(EciVO _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
		
		System.out.println("-------------------------------C-----EciDAOImpl.deleteEci �Լ� START>>>>>");
		
		//�������� 
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>deleteEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap.getDeleteQuery());
			System.out.println("--3>deleteEci_EciSqlQueryMap.getDeleteQuery()�α� ����>>> :"+ EciSqlQueryMap.getDeleteQuery());
			System.out.println("--4>deleteEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEnumm());
			nCnt = pstmt.executeUpdate();
			
			// ��. ConnectionPool�� ����� ���� ������� �ʴ´�. 		
			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! �о�ֱ�
            System.out.println("--5>deleteEci_nCnt Delete �� �Ǿ���/�� ��? >>>> " + nCnt);
			
            ConnProperty.conClose(con,pstmt);
			
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt); 	
		}//try-catch-finally��
		
		System.out.println("-------------------------------C-----EciDAOImpl.deleteEci �Լ� END>>>>>");
		if (nCnt == 0) return false;
		return true;
		
	}//deleteEci(EciVO _evo)��

	@Override
	public ArrayList<EciVO> selectEci() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------D-----EciDAOImpl.selectEci �Լ� START>>>>>");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO> aList = null;
		EciVO evo = null;
				
		//���� ����
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>selectEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap.getSelectQuery());
			System.out.println("--3>selectEci_EciSqlQueryMap.getDeleteQuery()�α� ����>>> :"+ EciSqlQueryMap.getSelectQuery());
			System.out.println("--4>selectEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			rsRs = pstmt.executeQuery();
			System.out.println("--5>selctEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO>();
				while(rsRs.next()){
					evo = new EciVO();
					evo.setEnumm(rsRs.getString("ENUM"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setEage(rsRs.getString("EAGE"));
					evo.setEhp(rsRs.getString("EHP"));
					evo.setEaddr(rsRs.getString(5));
					evo.setEdeleteYN(rsRs.getString(6));
					evo.setEinsertdate(rsRs.getString(7));
					evo.setEupdatedate(rsRs.getString(8));
					aList.add(evo);
					System.out.println("{log) while���鼭 aList�� add�Ǵ� �ּҰ��� >>> : " + aList);
				}
				System.out.println("(log) �迭����Ʈ aList ������ ���� >>>"+aList.size());
			}else{
				System.out.println("�����Ͱ� ���� ������~~ ?");
			}//if-else ��
			ConnProperty.conClose(con, pstmt, rsRs);		
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt, rsRs);
		}//try-catch-finally��
		
		System.out.println("-------------------------------D-----EciDAOImpl.selectEci �Լ� END>>>>>");
		return aList;
	}//selectEci()��

	@Override
	public ArrayList searchEci(EciVO _can0) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------E-----EciDAOImpl.searchEci �Լ� START>>>>>");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO> aList = null;
		EciVO evo = null;
		
		//��������
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>searchEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap.getSearchQuery());
			System.out.println("--3>searchEci_EciSqlQueryMap.getSearchQuery()�α� ����>>> :"+ EciSqlQueryMap.getSearchQuery());
			System.out.println("--4>searchEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			
			//�Ű����� ���� (������ ���� ���ε� �ʿ�)
			//�������� �ִ� ����ǥ(?:�÷��̽�Ȧ��)������2���ϱ� ���ε��ѹ��� ������� ����
			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> :" +_can0.getEnumm());
			pstmt.setString(1, _can0.getEnumm());
			
			rsRs = pstmt.executeQuery();
			System.out.println("--5>searchEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO>();
				while(rsRs.next()){
					evo = new EciVO();
					evo.setEnumm(rsRs.getString("ENUM"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setEage(rsRs.getString("EAGE"));
					evo.setEhp(rsRs.getString("EHP"));
					evo.setEaddr(rsRs.getString(5));
					evo.setEdeleteYN(rsRs.getString(6));
					evo.setEinsertdate(rsRs.getString(7));
					evo.setEupdatedate(rsRs.getString(8));
					aList.add(evo);
					System.out.println("{log) while���鼭 aList�� add�Ǵ� �ּҰ��� >>> : " + aList);
				}
				System.out.println("(log) �迭����Ʈ aList ������ ���� >>>"+aList.size());
			}else{
				System.out.println("�����Ͱ� ���� ������~~ ?");
			}//if-else ��
			ConnProperty.conClose(con, pstmt, rsRs);			
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt, rsRs);
		}//try-catch-finally��
		
		System.out.println("-------------------------------E-----EciDAOImpl.searchEci �Լ� END>>>>>");
		return aList;
	}//searchEci(EciVO _can0)��

	@Override
	public ArrayList likesearchEci() {
		// TODO Auto-generated method stub
		return null;
	}



}
