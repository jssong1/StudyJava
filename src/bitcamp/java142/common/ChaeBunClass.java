package bitcamp.java142.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bitcamp.java142.ch5.eci.sql.EciSqlQueryMap2;

public abstract class ChaeBunClass {
	
	public static final String BIZ_GUBUN_E = "E"; //
	public static final String BIZ_GUBUN_P = "P"; // ��ǰ
	public static final String BIZ_GUBUN_M = "M"; // ��
	public static final String BIZ_GUBUN_S = "S"; // �Ǹ�
	
	public static final String BIZ_GUBUN_MA = "MA"; // ������
	public static final String BIZ_GUBUN_SA = "SA"; //������
	public static final String BIZ_GUBUN_DE = "DE"; // ���ߺ�
	public static final String BIZ_GUBUN_AC = "AC"; // ȸ���
	
	public static final String BIZ_GUBUN_B = "B"; // �Խ��� : BOARD
	public static final String BIZ_GUBUN_N = "N"; // �������� : NOTICE
	
	
	public static String commonNo()
	{	
		Connection conn         = null;
		PreparedStatement pstmt = null;
		ResultSet  rsRs         = null;	
		
		String commNO    = "";		 
					
		try
		{
			conn = ConnProperty.getConnection();
			System.out.println("Connection�� �����Ǿ����ϴ�.");
			
			pstmt = conn.prepareStatement(EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);
				    		
			rsRs = pstmt.executeQuery();	
			System.out.println("CAHBUN ===> : \n" + EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);	
			
			if ( rsRs != null){
			  while (rsRs.next()){
//				commNO = String.valueOf(rsRs.getInt("commNO"));	
				commNO = rsRs.getString("commNO");	
			  }
			}
			System.out.println("commNO >>>> : " + commNO);
			
			if (1 == commNO.length())
			{
				commNO = "00" + commNO;
			}
			if (2 == commNO.length())
			{
				commNO = "0" + commNO;
			}
			
			System.out.println("commNO >>>> : " + commNO);
			
//			commNO = "E" + commNO;
			commNO = BIZ_GUBUN_E + commNO;
			System.out.println("commNO >>>> : " + commNO);
			
			ConnProperty.conClose(conn, pstmt, rsRs);
		}
		catch (Exception e){
			System.out.println("DB ���� " + e.getMessage());
		}
		finally {
			ConnProperty.conClose(conn, pstmt, rsRs);			
		} 
	
		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNumber = ChaeBunClass.commonNo();
		System.out.println("commNumber >>> : " + commNumber);
	}
}


