package bitcamp.java142.ch3;

import java.util.Calendar;

public class AB_2 extends AB {

	
	// @ : 어노테이션 
	// Override : 오버라이드 했다는 설명
	// @Override 는 오버라이드 어노테이션이라고 부름
	// 해당 함수가 오버라이드 되었다고 명시적으로 표현하는 것 (기능: 함수역할표현/실제기능을 구현)
	@Override
	public void abAbstract() { //추상클래스의 추상함수는 자식클래스에 무조건 오버라이딩됨 머스트
		// TODO Auto-generated method stub
		System.out.println("AB추상클래스에서 오버라이딩 된 abAbstrcsct()함수");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_2 ab2 = new AB_2();
		ab2.abAbstract();
		
		
		String str = AB.commonMethod();//스태틱붙었으니까 클래스.함수명()
		System.out.println("str>>> : "+str ); 
		
		
		//Calendar도 api보니까 추상클래스 (public abstract class Calendar) 인스턴스할수없음 그러므로 getInstance() 함수제공
		Calendar rightNow = Calendar.getInstance();
		System.out.println("rightNow >>> : \n "+ rightNow ); 
		
		
	}//메인끝
}//AB_2클래스끝

/*
AB추상클래스에서 오버라이딩 된 abAbstrcsct()함수
str>>> : 나는 공통기능 함수이다! 인스턴스해서 사용하지마삼
rightNow >>> : 
 java.util.GregorianCalendar[time=1571828296673,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=296,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=58,SECOND=16,MILLISECOND=673,ZONE_OFFSET=32400000,DST_OFFSET=0]
*/