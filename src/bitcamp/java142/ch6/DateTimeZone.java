package bitcamp.java142.ch6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeZone {

	
	public static String dateTimeZone(String _strID){
		
		System.out.println("deteTimeZone�Լ� START >>> : ");
		System.out.println("main���� ���� �Ű����� _strID : " + _strID);
		String strIDs[] = TimeZone.getAvailableIDs();// ������627�����ýð��� �迭�� ����
		String timeZoneID = "";
		System.out.println("strIDs.length >>> : " + strIDs.length); //627
		for (int i=0 ; i < strIDs.length; i++){
			System.out.println(" " +i + " : " + strIDs[i]); //���ÿ� ��ȣ����
			
			//�Ű����� �޾Ƽ� ���ε� �� ����
			String strID = strIDs[i];
			if(_strID.equals(strID)){
				timeZoneID = strID;
				break;
			}
		}
		System.out.println("deteTimeZone�Լ� END >>> : ");
		return timeZoneID;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timeZoneID = DateTimeZone.dateTimeZone("Europe/Ljubljana");
		System.out.println("timeZoneID >>> : " + timeZoneID);
		
		//���ýð���������
		TimeZone tz = TimeZone.getTimeZone(timeZoneID);
		System.out.println("tz >>> : " + tz);
		Calendar cd = Calendar.getInstance(tz);
		System.out.println("cd >>> : " + cd);
//		Calendar cd1 = Calendar.getInstance();//�Ű����� tz(����)�ִ°Ͱ� ���°� ���� �ٸ��� 
//		System.out.println("cd >>> : " + cd1);

		String tzYear = String.valueOf(cd.get(Calendar.YEAR));
		String tzMonth = String.valueOf(cd.get(Calendar.MONTH)+1);
		String tzDay = String.valueOf(cd.get(Calendar.DATE));
		String tzHour = String.valueOf(cd.get(Calendar.HOUR_OF_DAY));
		String tzMin = String.valueOf(cd.get(Calendar.MINUTE));
		String tzSec = String.valueOf(cd.get(Calendar.SECOND));
		System.out.println( timeZoneID + " �ð��� : " + tzYear + "�� " + tzMonth + "�� " + tzDay + "��   "
							+tzHour + "�� " + tzMin + "�� " + tzSec+"��"+"\n");
		
		
		
		//calendarŬ������ date�ΰ����ͼ� ����ϱ�
		Date d = new Date(cd.getTimeInMillis()); //���ͽð�
		String now = new SimpleDateFormat("yyy.MM.dd HH:mm:ss").format(d);
		System.out.println("now >>> :" +  now);
		
		Date d1 = new Date(); //tz�ð�
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