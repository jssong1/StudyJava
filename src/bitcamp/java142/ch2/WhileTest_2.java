package bitcamp.java142.ch2;
//whileTest_1을 
//0일때끝아야해정수조건 문자상수정수를받아서 함수로구현 함수에 리턴을 받아 메인콘솔에서 값을 출력
//쌤이한거
import java.util.Scanner;

public class WhileTest_2 {
	
	public int whileTest_2(Scanner sc, int num){
		int numV = num;
		int sum = 0;
		boolean bFlag = true;
		
		while (bFlag){
			System.out.print(">>> : " );
			String tmp =  sc.nextLine();
			
			try{
				numV=Integer.parseInt(tmp);
				if(numV != 0){
					sum += numV; 
				}else{
					bFlag = false;
				}//else끝
			}catch(NumberFormatException e){
				System.out.println("에러가 >>> : " + e );
				bFlag = false;
			}//catch끝
			
		} //while끝
		return sum;
	} //함수 whileTest_2끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)"); 
		
		WhileTest_2 wt_2 =new WhileTest_2();
		int sum = wt_2.whileTest_2(sc,num);
		
		System.out.println("합계가 : " +sum);
	}

}

/*
합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)
>>> : 200
>>> : 123
>>> : 10
>>> : 0
합계가 : 333

합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)
>>> : 삼백
에러가 >>> : java.lang.NumberFormatException: For input string: "삼백"
합계가 : 0

*/
