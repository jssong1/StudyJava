package bitcamp.java142.ch2;

public class PrimitiveMaxMin2{
	
	// 필드
	// 생성자
	// 함수
	
	/*1. 함수의 Access Modifiersms 특별한 일이 없으면 항상 public키워드를 사용한다.
	 *2. 함수 리턴타입은 그 함수에서 사용한 데이터를 확인하고 리턴형 데이터의 타입을 사용한다.
	 *3. 함수 이름은 그 함수를 무슨 역할을 하는지 알 수 있게 함수명을 정하는 것이 좋다.
	 *4. 파라미터 (매개변수)는 아무 데이터가 와도 별 문제가 없으나
	 *	  처음 사용할 때는 리턴타입과 동일한 데이터 타입을 사용하는 것이 좋다
	 *   사용방법은 파라미터() 안에 데이터타입 변수명으로 사용한다.
	 *   예) byteMax(데이터타입 변수명) 
	 *5. 함수 내부의 맨 마지막 라인에 있는 (return 다음 라인은 수행하지 않음)
	 *	 return 키워드의 뒤에오는 변수 또는 문장 또는 값은
	 *	 항시 함수 앞에 있는 리턴형과 데이터타입이 동일해야한다. 
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
		// Primitive 타입 MAX MIN 값을
		// 함수의 리턴값을 받아서 콘솔에서 출력하시오
		// PrimitiveMaxMin2 클래스 참조변수 이용
		// 함수ex : byteMax() byteMin()
		
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
		 * 1. byteMax(byte bMax)를 사용하기 위해서 PrimitiveMaxMin2클래스를 인스턴스한다. 
		 * 2. 인스턴스 한 후 pmm2 참조변수로 byteMax(byte bMax)함수를 호출한다.(invoke)
		 * 		pmm2.byteMax(bMax)
		 * 3. pmm2.byteMax(bMax) 함수를 호출하면 결과 값을 리턴한다
		 * 4. 리턴된 결과값을 받기 위해서 데이터타입 변수명을 선언한다.
		 * 		byte bMaxVal
		 * 5. 선언된 데이터 타입 변수명에 함수를 호출해서 얻은 결과 값을 대입한다 (binding)
		 * 		byte bmaxVal = pmm2.byteMax(bMax); 
		 * 
		 */
	} //end of main 함수

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
