package bitcamp.java142.ch2;

public class FlowControlTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// int i = 0 초기화
		// i<5 : 조건식 : for 조건식도 true일때만 수행된다.
		// i++ : 증감식
		
		int i=0; 
		for (; i < 5; i++){ //메인함수의 지역변수로 초기화 먼저해도 결과는 나온다. 하지만 지금은 조건에 초기화하도록 권장..뒤에 변수때문인가출력제대로안됨..
			System.out.println(">>>" +i);
		}
		for (; i < 5; i++){ //i++은 i=i+1을 대신 쓴거 i<5 조건이 true일때까지 수행된다.
			System.out.println(">>>" +i);
		}
		for (; i <= 5; i=i+2){
			System.out.println("<<<>>>" +i); //for문은 다른 블럭이기 때문에 상관없음
		}
		for (; i <= 6; i+=2){ //i+=2는 i=i+2을 대신 쓴거
			System.out.println("<<<ㅎ>>>" +i); 
		}
		
		
		
//		//증감 연산자 ++,--
//		int x=5;
//		// x++ : x = x + 1
//		System.out.println(x++);
//		x++;
//		System.out.println(x);
				
		//int i = 0;
		i = i + 1;
		System.out.println(">>> : " + i); // 0+1 ->1출력
		System.out.println(">>> : " + i++); // i= i+1이지만 더해지기전에 i가 먼저 출력되기때문에 증가가 보이지 않음->1출력된후 1+1
		i++; // i=i+1 -> 2+1 -> 3출력
		System.out.println(">>> : " + i);
		++i;
		System.out.println(">>> : " + i);
		
		//논리연산
			
		// true와 false 모두 키워드기 때문에 virtual머신인식가능
		//연산의결과값을 직접입력한거 첫번째는 true 그리고 true인거 
		//첫번째가 true이면 다음결과값을 보지만 false인경우 두번째 조건을 확인하지 않음 (숏서킷)
		boolean b1 = true && true;
		System.out.println("b1 >>> : " +b1 );
		boolean b2 = true && false;
		System.out.println("b2 >>> : " +b2 );
		// short-circuit evaluation
		// 논리연산 AND(&&), OR(||)에서는
		// & : 앰퍼센트, | : 버티컬
		// 첫번째 조건의 결과에 따라 두 번빼 조건을 확인하지 않아도 결과가 정해진다.
		boolean b3 = false && true;
		System.out.println("b3 >>> : " +b3 );
		boolean b4 = false && false;
		System.out.println("b4 >>> : " +b4 );
	
	}

}


/*
>>>0
>>>1
>>>2
>>>3
>>>4
<<<>>>5
>>> : 8
>>> : 8
>>> : 10
>>> : 11
b1 >>> : true
b2 >>> : false
b3 >>> : false
b4 >>> : false
*/

