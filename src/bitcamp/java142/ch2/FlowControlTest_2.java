package bitcamp.java142.ch2;

public class FlowControlTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// int i = 0 �ʱ�ȭ
		// i<5 : ���ǽ� : for ���ǽĵ� true�϶��� ����ȴ�.
		// i++ : ������
		
		int i=0; 
		for (; i < 5; i++){ //�����Լ��� ���������� �ʱ�ȭ �����ص� ����� ���´�. ������ ������ ���ǿ� �ʱ�ȭ�ϵ��� ����..�ڿ� ���������ΰ��������ξȵ�..
			System.out.println(">>>" +i);
		}
		for (; i < 5; i++){ //i++�� i=i+1�� ��� ���� i<5 ������ true�϶����� ����ȴ�.
			System.out.println(">>>" +i);
		}
		for (; i <= 5; i=i+2){
			System.out.println("<<<>>>" +i); //for���� �ٸ� ���̱� ������ �������
		}
		for (; i <= 6; i+=2){ //i+=2�� i=i+2�� ��� ����
			System.out.println("<<<��>>>" +i); 
		}
		
		
		
//		//���� ������ ++,--
//		int x=5;
//		// x++ : x = x + 1
//		System.out.println(x++);
//		x++;
//		System.out.println(x);
				
		//int i = 0;
		i = i + 1;
		System.out.println(">>> : " + i); // 0+1 ->1���
		System.out.println(">>> : " + i++); // i= i+1������ ������������ i�� ���� ��µǱ⶧���� ������ ������ ����->1��µ��� 1+1
		i++; // i=i+1 -> 2+1 -> 3���
		System.out.println(">>> : " + i);
		++i;
		System.out.println(">>> : " + i);
		
		//������
			
		// true�� false ��� Ű����� ������ virtual�ӽ��νİ���
		//�����ǰ������ �����Է��Ѱ� ù��°�� true �׸��� true�ΰ� 
		//ù��°�� true�̸� ����������� ������ false�ΰ�� �ι�° ������ Ȯ������ ���� (����Ŷ)
		boolean b1 = true && true;
		System.out.println("b1 >>> : " +b1 );
		boolean b2 = true && false;
		System.out.println("b2 >>> : " +b2 );
		// short-circuit evaluation
		// ������ AND(&&), OR(||)������
		// & : ���ۼ�Ʈ, | : ��Ƽ��
		// ù��° ������ ����� ���� �� ���� ������ Ȯ������ �ʾƵ� ����� ��������.
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

