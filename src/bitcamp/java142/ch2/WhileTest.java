package bitcamp.java142.ch2;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i<=10){ //1은 10보다작으니까 true라는 결과임
			System.out.println(">>> " + i); //>>>1로만 돌아..증가안함
			i++;// 이걸 쓰므로서 10까지 하나씩 증가
		} // for문쓰는거랑 거의 비슷한 형식 for쓰는게 낫다
		
		int j = 1;
		boolean bool = true;
		while (bool){  //while이 true일때만 실행된다. 
			System.out.println(">>>1 "+j); //
			if(j==4){
				bool = false; //false 일 때 멈춘다 -> 4까지 출력
			}//if끝
//			System.out.println(">>>2 "+j);
			j++; //이게 없다면 >>>1만 무한반복 //j2,bt,j3/j3,bt,j4/j4,bf,j5/bool이 false로 들어와서끝
//			System.out.println(">>>3 "+j);
		}//while끝 이럴때 for보다 while씀
		
		
	}//main함수끝
}//WhileTest class끝


/*
>>> 1
>>> 2
>>> 3
>>> 4
>>> 5
>>> 6
>>> 7
>>> 8
>>> 9
>>> 10
>>>1 1
>>>2 1
>>>3 2
>>>1 2
>>>2 2
>>>3 3
>>>1 3
>>>2 3
>>>3 4
>>>1 4
>>>2 4
>>>3 5
*/
