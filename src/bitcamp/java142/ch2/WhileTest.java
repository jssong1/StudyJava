package bitcamp.java142.ch2;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i<=10){ //1�� 10���������ϱ� true��� �����
			System.out.println(">>> " + i); //>>>1�θ� ����..��������
			i++;// �̰� ���Ƿμ� 10���� �ϳ��� ����
		} // for�����°Ŷ� ���� ����� ���� for���°� ����
		
		int j = 1;
		boolean bool = true;
		while (bool){  //while�� true�϶��� ����ȴ�. 
			System.out.println(">>>1 "+j); //
			if(j==4){
				bool = false; //false �� �� ����� -> 4���� ���
			}//if��
//			System.out.println(">>>2 "+j);
			j++; //�̰� ���ٸ� >>>1�� ���ѹݺ� //j2,bt,j3/j3,bt,j4/j4,bf,j5/bool�� false�� ���ͼ���
//			System.out.println(">>>3 "+j);
		}//while�� �̷��� for���� while��
		
		
	}//main�Լ���
}//WhileTest class��


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
