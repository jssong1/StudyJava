package bitcamp.java142.ch2;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		i = 2;
		System.out.println("i >>> : " + i);
		i = i + 3;
		System.out.println("i >>> : " + i);
		i = 0;
		System.out.println("i >>> : " + i);
		{
			i = 11; //사용가능
			System.out.println("i >>> : " + i);
			int ii = 22; //여기서 선언하였으므로 이 스콥안에서만 사용가능
		}
		System.out.println("i >>> : " + i); // 브레이스 밖에서 선언했다면 최근값으로 업뎃됨 (11인이유)
		//System.out.println("i >>> : " + ii); //밖에 나올수없으므로 에러남
	} //end of main 함수

} // end of class

/*
i >>> : 2
i >>> : 5
i >>> : 0
i >>> : 11
i >>> : 11
*/