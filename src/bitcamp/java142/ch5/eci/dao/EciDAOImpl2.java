package bitcamp.java142.ch5.eci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bitcamp.java142.ch5.eci.sql.EciSqlQueryMap2;
import bitcamp.java142.ch5.eci.vo.EciVO2;

import bitcamp.java142.common.ChaeBunClass2;
import bitcamp.java142.common.ConnProperty;

public class EciDAOImpl2 implements EciDAO2 {

	
	//�μ�Ʈ->�޸� /�ѹ�->�޸𸮿��ִ°�������
	//Ŀ��->���ϷγѾ
	
	@Override
	public boolean insertEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
		
		System.out.println("-------------------------------A-----EciDAOImpl.insertEci �Լ� START>>>>>");
		//���� ����
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>insertEci_con����� �ּҰ� >>> : " + con);
			
			System.out.println("----2.5>con.getAutoCommit() >>> : " + con.getAutoCommit());
			con.setAutoCommit(false);//-------?
			
			
			pstmt = con.prepareStatement(EciSqlQueryMap2.getInsertQuery());
			System.out.println("--3>insertEci_EciSqlQueryMap2.getInsertQuery()�α� ����>>> :"+ EciSqlQueryMap2.getInsertQuery());
			System.out.println("--4>insertEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
//			pstmt.setString(1, _evo.getEnumm());
			pstmt.setString(1, ChaeBunClass2.ymdNum());//getEnumm ��ſ� ChaeBunClass���� �ڵ����� �ε�������
			
			pstmt.setString(2, _evo.getEname());
			pstmt.setString(3, _evo.getEage());
			pstmt.setString(4, _evo.getEhp());
			pstmt.setString(5, _evo.getEaddr());
			pstmt.setString(6, "Y");
			nCnt = pstmt.executeUpdate();//select��ȸ�� ������ ResultSet=>rsRs=pstmt.executeQuery();
			
			
			//�����Ͱ� ������ ���ϱ�; ��, ConnectionPool�� ����� ���� ������� �ʴ´�.
			boolean b = !con.getAutoCommit();
			System.out.println("b >>> : " + b);
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
	public boolean updateEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
		
		System.out.println("-------------------------------B-----EciDAOImpl.updateEci �Լ� START>>>>>");
		
		//���� ����
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>updateEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getUpdateQuery());
			System.out.println("--3>updateEci_EciSqlQueryMap2.getUpdateQuery()�α� ����>>> :"+ EciSqlQueryMap2.getUpdateQuery());
			System.out.println("--4>updateEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEaddr());
			pstmt.setString(2, _evo.getEnumm());
			nCnt = pstmt.executeUpdate();
			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> 1�� :" + _evo.getEaddr() +" 2�� : " + _evo.getEnumm());
			
			// ��. ConnectionPool�� ����� ���� ������� �ʴ´�. 	
			boolean b = !con.getAutoCommit();//------?
			System.out.println("b >>> : " + b);
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
	public boolean deleteEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
		
		System.out.println("-------------------------------C-----EciDAOImpl2.deleteEci �Լ� START>>>>>");
		
		//�������� 
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>deleteEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getDeleteQuery());
			System.out.println("--3>deleteEci_EciSqlQueryMap2.getDeleteQuery()�α� ����>>> :"+ EciSqlQueryMap2.getDeleteQuery());
			System.out.println("--4>deleteEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			pstmt.setString(1, _evo.getEnumm());
			nCnt = pstmt.executeUpdate();
			
			//�����Ͱ� ������ ���ϱ�; ��, ConnectionPool�� ����� ���� ������� �ʴ´�.
			boolean b = !con.getAutoCommit();//------?
			System.out.println("b >>> : " + b);
			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! �о�ֱ�
            System.out.println("--5>deleteEci_nCnt Delete �� �Ǿ���/�� ��? >>>> " + nCnt);
			
            ConnProperty.conClose(con,pstmt);
			
		}catch(Exception e){
			System.out.println("������ >>> : " + e.getMessage());
		}finally{
			ConnProperty.conClose(con, pstmt); 	
		}//try-catch-finally��
		
		System.out.println("-------------------------------C-----EciDAOImpl2.deleteEci �Լ� END>>>>>");
		if (nCnt == 0) return false;
		return true;
		
	}//deleteEci(EciVO _evo)��

//	@Override
//	public boolean updateChaeBun(EciVO2 _evo) {
//		// TODO Auto-generated method stub
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		int nCnt=0;	//insert count- �Է°Ǽ� nCnt�ʱ�ȭ //count�� ������
//		
//		System.out.println("-------------------------------UC-----EciDAOImpl.updateChaebun �Լ� START>>>>>");
//		
//		//���� ����
//		try{
//			con = ConnProperty.getConnection();
//			System.out.println("--2>updateEci_con����� �ּҰ� >>> : " + con);
//			pstmt = con.prepareStatement(EciSqlQueryMap2.getUpdateQuery2());
//			System.out.println("--3>updateEci_EciSqlQueryMap2.getUpdateQuery()�α� ����>>> :"+ EciSqlQueryMap2.getUpdateQuery2());
//			System.out.println("--4>updateEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
//			
//			pstmt.setString(2, _evo.getEnumm());
//			nCnt = pstmt.executeUpdate();
//			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> 1�� :" + _evo.getEaddr() +" 2�� : " + _evo.getEnumm());
//			
//			// ��. ConnectionPool�� ����� ���� ������� �ʴ´�. 	
//			boolean b = !con.getAutoCommit();//------?
//			System.out.println("b >>> : " + b);
//			if (!con.getAutoCommit()) con.commit(); //db commit !!!!!!!! �о�ֱ�
//            System.out.println("--5>updateEci_nCnt update �� �Ǿ���/�� ��? >>>> " + nCnt);
//			
//            ConnProperty.conClose(con,pstmt);
//			
//		}catch(Exception e){
//			System.out.println("������ >>> : " + e.getMessage());
//		}finally{
//			ConnProperty.conClose(con, pstmt);
//		}//try-catch-finally��
//		
//		System.out.println("-------------------------------UC-----EciDAOImpl.updateChaebun �Լ� END>>>>>");
//		if (nCnt == 0) return false;
//		return true;
//	}

	@Override
	public ArrayList<EciVO2> selectEci() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------D-----EciDAOImpl2.selectEci �Լ� START>>>>>");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO2> aList = null;
		EciVO2 evo = null;
				
		//���� ����
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>selectEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getSelectQuery());
			System.out.println("--3>selectEci_EciSqlQueryMap.getSelectQuery()�α� ����>>> :"+ EciSqlQueryMap2.getSelectQuery());
			System.out.println("--4>selectEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			rsRs = pstmt.executeQuery();
			System.out.println("--5>selctEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO2>();
				while(rsRs.next()){
					evo = new EciVO2();
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
		
		System.out.println("-------------------------------D-----EciDAOImpl2.selectEci �Լ� END>>>>>");
		return aList;
	}//selectEci()��

	@Override
	public ArrayList<EciVO2> searchEci(EciVO2 _can0) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------E-----EciDAOImpl2.searchEci �Լ� START>>>>>");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO2> aList = null;
		EciVO2 evo = null;
		
		//��������
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>searchEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getSearchQuery());
			System.out.println("--3>searchEci_EciSqlQueryMap.getSearchQuery()�α� ����>>> :"+ EciSqlQueryMap2.getSearchQuery());
			System.out.println("--4>searchEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			
			//�Ű����� ���� (������ ���� ���ε� �ʿ�)
			//�������� �ִ� ����ǥ(?:�÷��̽�Ȧ��)������2���ϱ� ���ε��ѹ��� ������� ����
			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> :" +_can0.getEnumm());
			pstmt.setString(1, _can0.getEnumm());
			
			rsRs = pstmt.executeQuery();
			System.out.println("--5>searchEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO2>();
				while(rsRs.next()){
					evo = new EciVO2();
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
		
		System.out.println("-------------------------------E-----EciDAOImpl2.searchEci �Լ� END>>>>>");
		return aList;
	}//searchEci(EciVO _can0)��

	@Override
	public ArrayList<EciVO2> likeSearchEci(EciVO2 _evo) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------F-----EciDAOImpl2.likesearchEci �Լ� START>>>>>");

		System.out.println("_evo.getEname() >>> : " + _evo.getEname());
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EciVO2> aList = null;
		EciVO2 evo = null;
		
		
		//��������
		try{
			con = ConnProperty.getConnection();
			System.out.println("--2>likeSearchEci_con����� �ּҰ� >>> : " + con);
			pstmt = con.prepareStatement(EciSqlQueryMap2.getLikeSearchQuery());
			System.out.println("--3>likeSearchEci_EciSqlQueryMap2.getLikeSearchQuery()�α� ����>>> :"+ EciSqlQueryMap2.getLikeSearchQuery());
			System.out.println("--4>likeSearchEci_pstmt����������, pstmt �ּҰ� >>> : " + pstmt);
			
			
			//�Ű����� ���� (������ ���� ���ε� �ʿ�)
			//�������� �ִ� ����ǥ(?:�÷��̽�Ȧ��)������2���ϱ� ���ε��ѹ��� ������� ����
			System.out.println("�÷��̽�Ȧ���� ���ε��� �Ű��������� ������ >>>> :" +_evo.getEname());
			pstmt.setString(1, _evo.getEname());
			
			rsRs = pstmt.executeQuery();
			System.out.println("--5>likeSearchEmp_rsRs����� �ּҰ� >>> : " + rsRs);
			
			if(rsRs !=null) {
				aList = new ArrayList<EciVO2>();
				while(rsRs.next()){
					evo = new EciVO2();
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
		
		System.out.println("-------------------------------F-----EciDAOImpl2.likesearchEci �Լ� END>>>>>");
		return aList;
	}//likesearchEci(EciVO _evo)��



}
