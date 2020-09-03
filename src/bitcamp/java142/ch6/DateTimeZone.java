package bitcamp.java142.ch6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeZone {

	
	public static String dateTimeZone(String _strID){
		
		System.out.println("deteTimeZone함수 START >>> : ");
		System.out.println("main에서 받은 매개변수 _strID : " + _strID);
		String strIDs[] = TimeZone.getAvailableIDs();// 전세계627개도시시간을 배열로 받음
		String timeZoneID = "";
		System.out.println("strIDs.length >>> : " + strIDs.length); //627
		for (int i=0 ; i < strIDs.length; i++){
			System.out.println(" " +i + " : " + strIDs[i]); //도시와 번호보기
			
			//매개변수 받아서 바인딩 후 리턴
			String strID = strIDs[i];
			if(_strID.equals(strID)){
				timeZoneID = strID;
				break;
			}
		}
		System.out.println("deteTimeZone함수 END >>> : ");
		return timeZoneID;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timeZoneID = DateTimeZone.dateTimeZone("Europe/Ljubljana");
		System.out.println("timeZoneID >>> : " + timeZoneID);
		
		//도시시간가져오기
		TimeZone tz = TimeZone.getTimeZone(timeZoneID);
		System.out.println("tz >>> : " + tz);
		Calendar cd = Calendar.getInstance(tz);
		System.out.println("cd >>> : " + cd);
//		Calendar cd1 = Calendar.getInstance();//매개변수 tz(서울)있는것과 없는거 값이 다르다 
//		System.out.println("cd >>> : " + cd1);

		String tzYear = String.valueOf(cd.get(Calendar.YEAR));
		String tzMonth = String.valueOf(cd.get(Calendar.MONTH)+1);
		String tzDay = String.valueOf(cd.get(Calendar.DATE));
		String tzHour = String.valueOf(cd.get(Calendar.HOUR_OF_DAY));
		String tzMin = String.valueOf(cd.get(Calendar.MINUTE));
		String tzSec = String.valueOf(cd.get(Calendar.SECOND));
		System.out.println( timeZoneID + " 시간은 : " + tzYear + "년 " + tzMonth + "월 " + tzDay + "일   "
							+tzHour + "시 " + tzMin + "분 " + tzSec+"초"+"\n");
		
		
		
		//calendar클래스를 date로가져와서 출력하기
		Date d = new Date(cd.getTimeInMillis()); //컴터시간
		String now = new SimpleDateFormat("yyy.MM.dd HH:mm:ss").format(d);
		System.out.println("now >>> :" +  now);
		
		Date d1 = new Date(); //tz시간
		SimpleDateFormat sdf = new SimpleDateFormat ("yyy.MM.dd HH:mm:ss");
		sdf.setTimeZone(tz);
		String Ljutime = sdf.format(d1);
		System.out.println("Ljubljana  >>> : " +Ljutime  );
	}

}

/* getAvailableIDs() : static String[] : Gets all the available IDs supported. 
** setTimeZone(TimeZone zone):void : Sets the time zone for the calendar of this DateFormat object.
** 
*/