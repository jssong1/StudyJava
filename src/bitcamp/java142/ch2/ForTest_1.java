package bitcamp.java142.ch2;

public class ForTest_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int sum = 0;//지역변수
		for (int i=1; i<=10; i++){
			sum += i; // sum =sum+i;
			System.out.printf("1부터 %2d까지의 합 : %2d%n",i, sum);	// %2d 10진수의 2자리수 형식으로 표현  %n:줄바꿈		
		}	
		String sV[] = {"abc","def","ghi"};
		//for문으로 출력하다가 "def"일 때 출력 중단하기

		for (int i=0; i< sV.length ; i++){
			System.out.println("sV["+i+"] >>> : " +sV[i]);
			//문자열 비교는 equals()함수를 이용할것
			if ("def".equals(sV[i])){ //함수니까==쓰면 안됨
 //			if ("def"==sV[i]){
				break;
			}			
		}		
		char cV[] = {'a','b','c','d','e'};
		//for문으로 출력하다가 'd'일 때 출력 중단하기
		
		for (int j=0; j<cV.length; j++){
			System.out.println("cV["+j+"] >>> : "+cV[j]);
			
			//if(0X64==cV[j]{
			if ('d'==cV[j]){
				break;
			}			
		}		
		//int iV[] = new int[]{1, 2, 3, 4, 5};
		int iV[] = {1, 2, 3, 4, 5}; //iV는 지역변수이면서 참조변수임 new int[]가 생략된거
		//iV데이터를 콘솔에 출력
		for(int i =0; i<iV.length; i++){			
			//3일때 멈추기
//			if (3 == iV[i]){
//				break;//3,4,5는 출력안됨
//			}			
			System.out.println("<<<iV["+i+"]>>> :"+iV[i]);
			
			//3일때 멈추기
			if (3 == iV[i]){
				break;//4,5는 출력안됨
			}			
		}		
		//iV데이터를 콘솔에 출력
//		System.out.println(">>> : "+iV[0]);
//		System.out.println(">>> : "+iV[1]);
//		System.out.println(">>> : "+iV[2]);
//		System.out.println(">>> : "+iV[3]);
//		System.out.println(">>> : "+iV[4]);		
	} //main함수()끝

}// ForTest_1클래스

/*
1부터  1까지의 합 :  1
1부터  2까지의 합 :  3
1부터  3까지의 합 :  6
1부터  4까지의 합 : 10
1부터  5까지의 합 : 15
1부터  6까지의 합 : 21
1부터  7까지의 합 : 28
1부터  8까지의 합 : 36
1부터  9까지의 합 : 45
1부터 10까지의 합 : 55
sV[0] >>> : abc
sV[1] >>> : def
cV[0] >>> : a
cV[1] >>> : b
cV[2] >>> : c
cV[3] >>> : d
<<<iV[0]>>> :1
<<<iV[1]>>> :2
<<<iV[2]>>> :3

*/