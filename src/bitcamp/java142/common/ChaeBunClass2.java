package bitcamp.java142.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import bitcamp.java142.ch5.eci.sql.EciSqlQueryMap2;

public abstract class ChaeBunClass2 {
	
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
	
	
	
	

	public static String ymdFormat(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(d);
		return date;
	}
		
	public static String ymFormat(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String date = sdf.format(d);
		return date;
	}
	
	public static String yFormat(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String date = sdf.format(d);
		return date;
	}
	
	
	public static String ymdFormats(String ymdFlag){
		
		String date = "";
		Date d = new Date();
		
		if ("D".equals(ymdFlag)){
			date = new SimpleDateFormat("yyyyMMdd").format(d);
		}
		if ("M".equals(ymdFlag)){
			date = new SimpleDateFormat("yyyyMM").format(d);
		}
		if ("Y".equals(ymdFlag)){
			date = new SimpleDateFormat("yyyy").format(d);
		}
		
		return date;
	}
	
	
	public static String commNum(String commNO){
	
		if(1== commNO.length()){
			commNO="000"+commNO;
		}
		if(2== commNO.length()){
			commNO="00"+commNO;
		}
		if(3== commNO.length()){
			commNO="0"+commNO;
		}
		
		System.out.println("commNO>>> : " +commNO );
		
		return commNO;
	}
	
	
	public static String ymdNum(){
		Connection conn         = null;
		PreparedStatement pstmt = null;
		ResultSet  rsRs         = null;	
		String commNO    = "";	
		
		try{
			conn = ConnProperty.getConnection();
			System.out.println("Connection이 성공되었습니다.");
			
			pstmt = conn.prepareStatement(EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);
				    		
			rsRs = pstmt.executeQuery();	
			System.out.println("CAHBUN ===> : \n" + EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);		
			
			if(rsRs != null){
				  while (rsRs.next()){					
						commNO = rsRs.getString("COMMNO");	
					  }//while끝
					}//if끝
					System.out.println("commNO >>>> : " + commNO);		
					
					commNO =   BIZ_GUBUN_B 
							+  ChaeBunClass2.ymdFormat() 
							+  ChaeBunClass2.commNum(commNO);
					System.out.println("commNO >>>> : " + commNO);
					
					ConnProperty.conClose(conn, pstmt, rsRs);
				
		}catch (Exception e){
			System.out.println("DB 에러 " + e.getMessage());
		}
		finally {
			try{
				ConnProperty.conClose(conn, pstmt, rsRs);
			}catch (Exception e2){
				e2.printStackTrace();
			}		
		} 
		return commNO;
	}
	
	public static String ymNum(){
		Connection conn         = null;
		PreparedStatement pstmt = null;
		ResultSet  rsRs         = null;	
		String commNO    = "";	
		
		try{
			conn = ConnProperty.getConnection();
			System.out.println("Connection이 성공되었습니다.");
			
			pstmt = conn.prepareStatement(EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);
				    		
			rsRs = pstmt.executeQuery();	
			System.out.println("CAHBUN ===> : \n" + EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);		
			
			if(rsRs != null){
				  while (rsRs.next()){					
						commNO = rsRs.getString("COMMNO");	
					  }//while끝
					}//if끝
					System.out.println("commNO >>>> : " + commNO);		
					
					commNO =   BIZ_GUBUN_B 
							+  ChaeBunClass2.ymdFormat() 
							+  ChaeBunClass2.commNum(commNO);
					System.out.println("commNO >>>> : " + commNO);
					
					ConnProperty.conClose(conn, pstmt, rsRs);
				
		}catch (Exception e){
			System.out.println("DB 에러 " + e.getMessage());
		}
		finally {
			try{
				ConnProperty.conClose(conn, pstmt, rsRs);
			}catch (Exception e2){
				e2.printStackTrace();
			}		
		} 
		return commNO;
	}
	
	public static String yNum(){
		Connection conn         = null;
		PreparedStatement pstmt = null;
		ResultSet  rsRs         = null;	
		String commNO    = "";	
		
		try{
			conn = ConnProperty.getConnection();
			System.out.println("Connection이 성공되었습니다.");
			
			pstmt = conn.prepareStatement(EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);
				    		
			rsRs = pstmt.executeQuery();	
			System.out.println("CAHBUN ===> : \n" + EciSqlQueryMap2.ECI_WORK_ENUM_CHAEBUN2);		
			
			if(rsRs != null){
				  while (rsRs.next()){					
						commNO = rsRs.getString("COMMNO");	
					  }//while끝
					}//if끝
					System.out.println("commNO >>>> : " + commNO);		
					
					commNO =   BIZ_GUBUN_B 
							+  ChaeBunClass2.ymdFormat() 
							+  ChaeBunClass2.commNum(commNO);
					System.out.println("commNO >>>> : " + commNO);
					
					ConnProperty.conClose(conn, pstmt, rsRs);
				
		}catch (Exception e){
			System.out.println("DB 에러 " + e.getMessage());
		}
		finally {
			try{
				ConnProperty.conClose(conn, pstmt, rsRs);
			}catch (Exception e2){
				e2.printStackTrace();
			}		
		} 
		return commNO;
	}
	
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
			try{
				ConnProperty.conClose(conn, pstmt, rsRs);
			}catch (Exception e2){
				e2.printStackTrace();
			}		
		} 
	
		return commNO;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNumber = ChaeBunClass2.commonNo();
		System.out.println("commNumber >>> : " + commNumber);
		ChaeBunClass2.commonNo();
		ChaeBunClass2.ymdNum();
		ChaeBunClass2.ymNum();
		ChaeBunClass2.yNum();
		
	}
}
