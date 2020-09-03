package bitcamp.java142.ch6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {
	
	
	public static String montGap(String d1, String d2){
		System.out.println("(log) montGap 함수 Start 데이터 들어왔나 d1: " + d1 + ", d2 : " +d2 );
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
		System.out.println("(log) montGap 함수 END" );

		return mgapS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(log) main 함수 START" );

		//개월수 구하기
		String d1 = "201911";
		String d2 = "199109";
		String mg = DateTest.montGap(d1, d2);
		System.out.println("mg  >>>> : " + mg);
		System.out.println( d1+ "과 " + d2 + "의 차이는" + mg + "개월입니다.");
	/////////////////////////////////////////////////////////////////////////////////////	
		/*
		 Date 클래스는 1970년 00:00:00 을 기준으로
		 지나간 시간을 millisecond로 반환한다.
		 epoch시간 : 1970년 00:00:00
		 * */
		
		Date d = new Date(); // Date는 util 패키지로 임포트해서 쓰기
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
		
		//년
		int year = d.getYear();
		System.out.println("year >>> : " + year);
		year = year + 1900;
		System.out.println("year >>> : " + year);
		
		 
//		int cYear = Calendar.get(Calendar.YEAR);// get은 일반함수static없으니까 참조변수 이용해야함 / YEAR는 static있음
		int cYear = cd.get(Calendar.YEAR);
		System.out.println("cYear >>> : " + cYear);
		
		// year를 문자로 치환해서 콘솔에 출력하기 (3가지방법있음) //날짜는 숫자로 잘안쓰니까
		cds = String.valueOf(cYear);//내가한거
		String cds1 = year + "";
		String cds2 = Integer.toString(cYear);
		
		System.out.println("cds>>> : " + cds);
		System.out.println("cds1>>> : " + cds1);
		System.out.println("cds2>>> : " + cds2);
		
//		합쳐쓰면
		String cYears = String.valueOf(cd.get(Calendar.YEAR));
		
		
		
		
		//월
		int month = d.getMonth();
		System.out.println("month >>> : " + month); 
		month = month+1	;
		System.out.println("month >>> : " + month); 
		
		int cMonth = cd.get(Calendar.MONTH) +1;//month 0부터시작
		System.out.println("CMonth >>> : " + cMonth); 
		
		String cms = String.valueOf(cMonth);
		String cms1 = cMonth + "";
		String cms2 = Integer.toString(cMonth);
		System.out.println("cms>>> : " + cms);
		System.out.println("cms1>>> : " + cms1);
		System.out.println("cms2>>> : " + cms2);
		
		//일
		int date = d.getDate();
		System.out.println("date >>> : " + date);
		
		int cDate = cd.get(Calendar.DATE);
		System.out.println("cDate >>> : " + cDate);
		String cDateS = String.valueOf(cDate);
		System.out.println("cDateS >>> : " + cDateS);
		
		
		//시
		int hours = d.getHours();
		System.out.println("hour >>> : " + hours);
		String hoursS = String.valueOf(hours);
		
		int cHours1 = cd.get(Calendar.HOUR_OF_DAY);
		System.out.println("Calendar.HOUR_OF_DAY >>> : " + cHours1);
		int cHours = cd.get(Calendar.HOUR);		
		System.out.println("Calendar.HOUR >>> : " + cHours);
		String cHoursS = String.valueOf(cHours);
				
		
		//분
		int minutes = d.getMinutes();
		System.out.println("minutes >>> : " + minutes);
		String minutesS = String.valueOf(minutes);
		
		int cminutes = cd.get(Calendar.MINUTE);
		System.out.println("cminutest >>> : " + cminutes);
		String cminutesS = String.valueOf(cminutes);
		
		//초
		int seconds = d.getSeconds();
		System.out.println("seconds >>> : " +seconds);
		String secondsS = String.valueOf(seconds);
		
		int cseconds = cd.get(Calendar.SECOND);
		System.out.println("cseconds >>> : " + cseconds);
		String csecondsS = String.valueOf(seconds);
		
		System.out.println("(log) main 함수 END" );

	}//main끝

}//클래스끝
