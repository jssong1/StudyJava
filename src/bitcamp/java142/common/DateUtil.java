package bitcamp.java142.common;

import java.util.Date;

public abstract class DateUtil {
//�����/�ú��� get�ϴ� �Լ��� dateŬ���� �̿��ؼ� �����
	
	public static String getYmd(){
		System.out.println("(log) getYmd START >>>> ");
		Date d = new Date(); 
		System.out.println("(log) Date d >>> : " + d);
		 
		int year = d.getYear()+ 1900;
		int month = d.getMonth() +1;
		int date = d.getDate();
		String yearS = String.valueOf(year);
		String monthS = String.valueOf(month);
		String dateS = String.valueOf(date);
		
//		System.out.println("(log) year : " + yearS + ", month : " + monthS +", date : " +dateS);
		
		String ymd = yearS + "�� " + monthS + "�� " + dateS + "�� ";
		System.out.println("(log) ymd >>>> " +ymd);
		
		System.out.println("(log) getYmd END >>>> ");
		return ymd;
	}
	
	public static String getHms(){
		System.out.println("(log) getHms START >>>> ");
		Date d = new Date(); 
		System.out.println("(log) Date d >>> : " + d);
		
		int hour = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();
		String hourS = String.valueOf(hour);
		String minutesS = String.valueOf(minutes);
		String secondsS = String.valueOf(seconds);
		
//		System.out.println("(log) year : " + hourS + ", month : " + minutesS +", date : " +secondsS);
		
		String hms = hourS + "�� " + minutesS + "�� " + secondsS + "��";
		System.out.println("(log) hms >>>> " +hms);
		
		System.out.println("(log) getHms END >>>> ");
		return hms;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DateUtil.getYmd();
//	String ymd = DateUtil.getYmd();
//	System.out.println("���Ϲ��� ymd >>>> : " + ymd);
	DateUtil.getHms();
//	String hms = DateUtil.getHms();
//	System.out.println(" ���Ϲ��� hms >>>> : " + hms);
	}//main��

}//DateUtil��
