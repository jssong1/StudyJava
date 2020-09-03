package bitcamp.java142.ch4;

import java.math.*;
import static java.math.BigDecimal.*;
import static java.math.RoundingMode.*;




public class BigDecimalEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BigDecimal bd1 = new BigDecimal("123.456");
		BigDecimal bd2 = new BigDecimal("1.0");
		
		
		System.out.print("bd1= "+bd1); // bd1= 123.456
		System.out.print(",\tvalue= "+bd1.unscaledValue()); //value= 123456
		System.out.print(",\tscale= "+bd1.scale());//scale= 3 : 소수점이하의 자리수
		System.out.print(",\tprecision= "+bd1.precision());//precision= 6 :정수의 전체 자리수
		System.out.println();
		
		System.out.print("bd2= "+bd2);
		System.out.print(",\tvalue= "+bd2.unscaledValue());
		System.out.print(",\tscale= "+bd2.scale());
		System.out.print(",\tprecision= "+bd2.precision());
		System.out.println();
		
		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.print("bd3= "+bd3);
		System.out.print(",\tvalue= "+bd3.unscaledValue());
		System.out.print(",\tscale= "+bd3.scale());
		System.out.print(",\tprecision= "+bd3.precision());
		System.out.println();
		
		System.out.println(bd1.divide(bd2,2,HALF_UP));
		System.out.println(bd1.setScale(2,HALF_UP));//setScale() : scale을값을 2번째자리까지 반올림한다고 scale 변경
		System.out.println(bd1.divide(bd2,new MathContext(2,HALF_UP)));//
		
		
		
	}//main()끝

}
