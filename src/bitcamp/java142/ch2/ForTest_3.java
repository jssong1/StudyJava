package bitcamp.java142.ch2;
public class ForTest_3 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int iV[] = {1,2,3,4,5};
		for (int i =0; i<iV.length; i++){
			System.out.println("<<<>>>" +iV[i]);
		}	
		for (int tmp: iV){ //��ü�迭, ������Ʈ�迭 <-���ɿ� �ǿ��� ��������  ����
			System.out.println(">>><<<" + tmp);
		}
		for (int i=0; i<=10;i++){
			System.out.println(">>> : "+i);
		}
		Thread.sleep(500); //�������°� �ӵ� �� ����
		for (int i=10; i>=0; i--){
			System.out.println("<<< : "+i);
		}
				
//		for (int i=0; i<=1000000; i++){
//			System.out.println(">>> : " + i);
//		}
//		Thread.sleep(3000);
//		for(int i =1000000; i>=0; i--){
//			System.out.println(">>> : " + i);		
//			}
	}
}

/*
<<<>>>1
<<<>>>2
<<<>>>3
<<<>>>4
<<<>>>5
>>><<<1
>>><<<2
>>><<<3
>>><<<4
>>><<<5
>>> : 0
>>> : 1
>>> : 2
>>> : 3
>>> : 4
>>> : 5
>>> : 6
>>> : 7
>>> : 8
>>> : 9
>>> : 10
<<< : 10
<<< : 9
<<< : 8
<<< : 7
<<< : 6
<<< : 5
<<< : 4
<<< : 3
<<< : 2
<<< : 1
<<< : 0
*/