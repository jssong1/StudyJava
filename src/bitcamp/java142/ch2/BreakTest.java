package bitcamp.java142.ch2;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i = 0;
		boolean bFlag = true;
		
		while (bFlag){
			
			
			if(sum>100){
				break; //break면 지금 여기서 즉시 중단
//				bFlag = false; // break대신 false라면 i=15로 sum120까지 출력
			}
			i++;
			sum += i;
			
		}//while끝
		System.out.println("i= " + i);
		System.out.println("sum= " + sum);
	}//main끝
}//class끝

/*
i= 14
sum= 105

break 대신 false 적었을때 결과
i= 15
sum= 120

*/
