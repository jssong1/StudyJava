package bitcamp.java142.ch3;

import java.util.Calendar;

public class AB_2 extends AB {

	
	// @ : ������̼� 
	// Override : �������̵� �ߴٴ� ����
	// @Override �� �������̵� ������̼��̶�� �θ�
	// �ش� �Լ��� �������̵� �Ǿ��ٰ� ��������� ǥ���ϴ� �� (���: �Լ�����ǥ��/��������� ����)
	@Override
	public void abAbstract() { //�߻�Ŭ������ �߻��Լ��� �ڽ�Ŭ������ ������ �������̵��� �ӽ�Ʈ
		// TODO Auto-generated method stub
		System.out.println("AB�߻�Ŭ�������� �������̵� �� abAbstrcsct()�Լ�");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_2 ab2 = new AB_2();
		ab2.abAbstract();
		
		
		String str = AB.commonMethod();//����ƽ�پ����ϱ� Ŭ����.�Լ���()
		System.out.println("str>>> : "+str ); 
		
		
		//Calendar�� api���ϱ� �߻�Ŭ���� (public abstract class Calendar) �ν��Ͻ��Ҽ����� �׷��Ƿ� getInstance() �Լ�����
		Calendar rightNow = Calendar.getInstance();
		System.out.println("rightNow >>> : \n "+ rightNow ); 
		
		
	}//���γ�
}//AB_2Ŭ������

/*
AB�߻�Ŭ�������� �������̵� �� abAbstrcsct()�Լ�
str>>> : ���� ������ �Լ��̴�! �ν��Ͻ��ؼ� �����������
rightNow >>> : 
 java.util.GregorianCalendar[time=1571828296673,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=296,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=58,SECOND=16,MILLISECOND=673,ZONE_OFFSET=32400000,DST_OFFSET=0]
*/