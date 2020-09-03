package bitcamp.java142.ch6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {
	
	
	public static String montGap(String d1, String d2){
		System.out.println("(log) montGap �Լ� Start ������ ���Գ� d1: " + d1 + ", d2 : " +d2 );
		String date1 = d1;
		String date2 = d2;
		
		int m1 = Integer.parseInt(date1.substring(0,4))*12 +Integer.parseInt(date1.substring(4));
		int m2 = Integer.parseInt(date2.substring(0,4))*12 +Integer.parseInt(date2.substring(4));
		int mgap= Math.abs(m1-m2);
		String mgapS = String.valueOf(mgap);
		System.out.println("m1 >>> : "  +m1);
		System.out.println("m2 >>> : "  +m2);
		System.out.println("mgap >>> : "  +mgap);
		System.out.println("mgapS >>> : "  +mgapS);
		System.out.println("(log) montGap �Լ� END" );

		return mgapS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(log) main �Լ� START" );

		//������ ���ϱ�
		String d1 = "201911";
		String d2 = "199109";
		String mg = DateTest.montGap(d1, d2);
		System.out.println("mg  >>>> : " + mg);
		System.out.println( d1+ "�� " + d2 + "�� ���̴�" + mg + "�����Դϴ�.");
	/////////////////////////////////////////////////////////////////////////////////////	
		/*
		 Date Ŭ������ 1970�� 00:00:00 �� ��������
		 ������ �ð��� millisecond�� ��ȯ�Ѵ�.
		 epoch�ð� : 1970�� 00:00:00
		 * */
		
		Date d = new Date(); // Date�� util ��Ű���� ����Ʈ�ؼ� ����
		System.out.println("d >>> : " + d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String day = sdf.format(d);
		System.out.println("day >>> : " +day );
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("yyy.MM.dd HH:mm:ss");
		String day1 = sdf1.format(d);
		System.out.println("day1 >>> : " +day1 );
		
		SimpleDateFormat sdf2 = new SimpleDateFormat ("yyy.MM.dd HH:mm:ss", Locale.CANADA);
		String day2 = sdf2.format(d);
		System.out.println("day2 >>> : " +day2 );
		
		
		
		Calendar cd = Calendar.getInstance();
		System.out.println("cd >>> : \n" + cd);		
		String cds = "";
		
		//��
		int year = d.getYear();
		System.out.println("year >>> : " + year);
		year = year + 1900;
		System.out.println("year >>> : " + year);
		
		 
//		int cYear = Calendar.get(Calendar.YEAR);// get�� �Ϲ��Լ�static�����ϱ� �������� �̿��ؾ��� / YEAR�� static����
		int cYear = cd.get(Calendar.YEAR);
		System.out.println("cYear >>> : " + cYear);
		
		// year�� ���ڷ� ġȯ�ؼ� �ֿܼ� ����ϱ� (3�����������) //��¥�� ���ڷ� �߾Ⱦ��ϱ�
		cds = String.valueOf(cYear);//�����Ѱ�
		String cds1 = year + "";
		String cds2 = Integer.toString(cYear);
		
		System.out.println("cds>>> : " + cds);
		System.out.println("cds1>>> : " + cds1);
		System.out.println("cds2>>> : " + cds2);
		
//		���ľ���
		String cYears = String.valueOf(cd.get(Calendar.YEAR));
		
		
		
		
		//��
		int month = d.getMonth();
		System.out.println("month >>> : " + month); 
		month = month+1	;
		System.out.println("month >>> : " + month); 
		
		int cMonth = cd.get(Calendar.MONTH) +1;//month 0���ͽ���
		System.out.println("CMonth >>> : " + cMonth); 
		
		String cms = String.valueOf(cMonth);
		String cms1 = cMonth + "";
		String cms2 = Integer.toString(cMonth);
		System.out.println("cms>>> : " + cms);
		System.out.println("cms1>>> : " + cms1);
		System.out.println("cms2>>> : " + cms2);
		
		//��
		int date = d.getDate();
		System.out.println("date >>> : " + date);
		
		int cDate = cd.get(Calendar.DATE);
		System.out.println("cDate >>> : " + cDate);
		String cDateS = String.valueOf(cDate);
		System.out.println("cDateS >>> : " + cDateS);
		
		
		//��
		int hours = d.getHours();
		System.out.println("hour >>> : " + hours);
		String hoursS = String.valueOf(hours);
		
		int cHours1 = cd.get(Calendar.HOUR_OF_DAY);
		System.out.println("Calendar.HOUR_OF_DAY >>> : " + cHours1);
		int cHours = cd.get(Calendar.HOUR);		
		System.out.println("Calendar.HOUR >>> : " + cHours);
		String cHoursS = String.valueOf(cHours);
				
		
		//��
		int minutes = d.getMinutes();
		System.out.println("minutes >>> : " + minutes);
		String minutesS = String.valueOf(minutes);
		
		int cminutes = cd.get(Calendar.MINUTE);
		System.out.println("cminutest >>> : " + cminutes);
		String cminutesS = String.valueOf(cminutes);
		
		//��
		int seconds = d.getSeconds();
		System.out.println("seconds >>> : " +seconds);
		String secondsS = String.valueOf(seconds);
		
		int cseconds = cd.get(Calendar.SECOND);
		System.out.println("cseconds >>> : " + cseconds);
		String csecondsS = String.valueOf(seconds);
		
		System.out.println("(log) main �Լ� END" );

	}//main��

}//Ŭ������
