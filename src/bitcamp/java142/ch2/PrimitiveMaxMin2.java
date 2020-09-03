package bitcamp.java142.ch2;

public class PrimitiveMaxMin2{
	
	// �ʵ�
	// ������
	// �Լ�
	
	/*1. �Լ��� Access Modifiersms Ư���� ���� ������ �׻� publicŰ���带 ����Ѵ�.
	 *2. �Լ� ����Ÿ���� �� �Լ����� ����� �����͸� Ȯ���ϰ� ������ �������� Ÿ���� ����Ѵ�.
	 *3. �Լ� �̸��� �� �Լ��� ���� ������ �ϴ��� �� �� �ְ� �Լ����� ���ϴ� ���� ����.
	 *4. �Ķ���� (�Ű�����)�� �ƹ� �����Ͱ� �͵� �� ������ ������
	 *	  ó�� ����� ���� ����Ÿ�԰� ������ ������ Ÿ���� ����ϴ� ���� ����
	 *   ������� �Ķ����() �ȿ� ������Ÿ�� ���������� ����Ѵ�.
	 *   ��) byteMax(������Ÿ�� ������) 
	 *5. �Լ� ������ �� ������ ���ο� �ִ� (return ���� ������ �������� ����)
	 *	 return Ű������ �ڿ����� ���� �Ǵ� ���� �Ǵ� ����
	 *	 �׽� �Լ� �տ� �ִ� �������� ������Ÿ���� �����ؾ��Ѵ�. 
	 * */

	
	
	public byte byteMax(byte bMax){
		return bMax;
	}
	public byte byteMin(byte bMin){
		return bMin;
	}
	//short
	public short shortMax(short sMax){
		return sMax;
	}
	public short shortMin(short sMin){
		return sMin;
	}
	//int
	public int intMax(int iMax){
		return iMax;
	}
	public int intMin(int iMin){
		return iMin;
	}
	//long
	public long longMax(long lMax){
		return lMax;
	}
	public long longMin(long lMin){
		return lMin;
	}
	//float
	public float floatMax(float fMax){
		return fMax;
	}
	public float floatMin(float fMin){
		return fMin;
	}
	//double
	public double doubleMax(double dMax){
		return dMax;
	}
	public double doubleMin(double dMin){
		return dMin;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitive Ÿ�� MAX MIN ����
		// �Լ��� ���ϰ��� �޾Ƽ� �ֿܼ��� ����Ͻÿ�
		// PrimitiveMaxMin2 Ŭ���� �������� �̿�
		// �Լ�ex : byteMax() byteMin()
		
		byte bMax = Byte.MAX_VALUE;
		byte bMin = Byte.MIN_VALUE;
		//short
		short sMax = Short.MAX_VALUE;
		short sMin = Short.MIN_VALUE;
		//int
		int iMax = Integer.MAX_VALUE;
		int iMin = Integer.MIN_VALUE;
		//long
		long lMax = Long.MAX_VALUE;
		long lMin = Long.MIN_VALUE;
		//float
		float fMax = Float.MAX_VALUE;
		float fMin = Float.MIN_VALUE;
		//double
		double dMax = Double.MAX_VALUE;
		double dMin = Double.MIN_VALUE;
		
		
		PrimitiveMaxMin2 pmm2 = new PrimitiveMaxMin2();
		byte bMaxVal = pmm2.byteMax(bMax);
		System.out.println("bMaxVal >>> : " + bMaxVal);
		byte bMinVal = pmm2.byteMin(bMin);
		System.out.println("bMinVal >>> : " + bMinVal);
		
		//short
		short sMaxVal = pmm2.shortMax(sMax);
		System.out.println("sMaxVal >>> : " + sMaxVal);
		short sMinVal = pmm2.shortMin(sMin);
		System.out.println("sMinVal >>> : " + sMinVal);
		
		//int
		int iMaxVal = pmm2.intMax(iMax);
		System.out.println("iMaxVal >>> : " + iMaxVal);
		int iMinVal = pmm2.intMin(iMin);
		System.out.println("iMinVal >>> : " + iMinVal);
		
		//long
		long lMaxVal = pmm2.longMax(lMax);
		System.out.println("iMaxVal >>> : " + lMaxVal);
		long lMinVal = pmm2.longMin(lMin);
		System.out.println("iMinVal >>> : " + lMinVal);
		//float
		float fMaxVal = pmm2.floatMax(fMax);
		System.out.println("fMaxVal >>> : " + fMaxVal);
		float fMinVal = pmm2.floatMin(fMin);
		System.out.println("fMinVal >>> : " + fMinVal);
		//double
		double dMaxVal = pmm2.doubleMax(dMax);
		System.out.println("dMaxVal >>> : " + dMaxVal);
		double dMinVal = pmm2.doubleMin(dMin);
		System.out.println("dMinxVal >>> : " + dMinVal);
		
		
		
		/*
		 * 1. byteMax(byte bMax)�� ����ϱ� ���ؼ� PrimitiveMaxMin2Ŭ������ �ν��Ͻ��Ѵ�. 
		 * 2. �ν��Ͻ� �� �� pmm2 ���������� byteMax(byte bMax)�Լ��� ȣ���Ѵ�.(invoke)
		 * 		pmm2.byteMax(bMax)
		 * 3. pmm2.byteMax(bMax) �Լ��� ȣ���ϸ� ��� ���� �����Ѵ�
		 * 4. ���ϵ� ������� �ޱ� ���ؼ� ������Ÿ�� �������� �����Ѵ�.
		 * 		byte bMaxVal
		 * 5. ����� ������ Ÿ�� ������ �Լ��� ȣ���ؼ� ���� ��� ���� �����Ѵ� (binding)
		 * 		byte bmaxVal = pmm2.byteMax(bMax); 
		 * 
		 */
	} //end of main �Լ�

} // end of class

/*
 bMaxVal >>> : 127
bMinVal >>> : -128
sMaxVal >>> : 32767
sMinVal >>> : -32768
iMaxVal >>> : 2147483647
iMinVal >>> : -2147483648
iMaxVal >>> : 9223372036854775807
iMinVal >>> : -9223372036854775808
fMaxVal >>> : 3.4028235E38
fMinVal >>> : 1.4E-45
dMaxVal >>> : 1.7976931348623157E308
dMinxVal >>> : 4.9E-324
*/
