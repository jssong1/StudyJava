package bitcamp.java142.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bitcamp.java142.ch5.eci.sql.EciSqlQueryMap2;

public abstract class ChaeBunClass {
	
	public static final String BIZ_GUBUN_E = "E"; //
	public static final String BIZ_GUBUN_P = "P"; // 상품
	public static final String BIZ_GUBUN_M = "M"; // 고객
	public static final String BIZ_GUBUN_S = "S"; // 판매
	
	public static final String BIZ_GUBUN_MA = "MA"; // 마케팅
	public static final String BIZ_GUBUN_SA = "SA"; //영업부
	public static final String BIZ_GUBUN_DE = "DE"; // 개발부
	public static final String BIZ_GUBUN_AC = "AC"; // 회계부
	
	public static final String BIZ_GUBUN_B = "B"; // 게시판 : BOARD
	public static final String BIZ_GUBUN_N = "N"; // 공지사항 : NOTICE
	
	
	public static String commonNo()
	{	
		Connection conn         = null;
		PreparedStatement pstmt = null;
		ResultSet  rsRs         = null;	
		
		String commNO    = "";		 
					
		try
		{
			conn = ConnProperty.getConnection();
			System.out.println("Connection이 성공되었습니다.");
			
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
			System.out.println("DB 에러 " + e.getMessage());
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


