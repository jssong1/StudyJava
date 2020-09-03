package bitcamp.java142.ch2;
//항상 가지고 다니기
public class ObjectNullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조변수를 사용하는 모든 객체는 항상 null로 초기화해야한다.
		
		String strV = null; //빈깡통 
//		String strV;
//		cf) String StrV1=""; 데이터있는거! 길이구하면 0나온다
		System.out.println("strV >>> : " +strV); 
//		System.out.println("strV.length() >>> : " +strV.length()); //null초기화한 데이터의 길이없음 에러나/java.lang.NullPointerException(참조변수에서만 나오는오류)
		
		strV = "abc";
		//오브젝트의 데이터타입과 참조변수선언하여  널로 초기화하면 참조변수는 데이터가 없기 때문에 사용할수 없당 그러니까 로직시작하기전에 데이터바꿔줬음
		
		if (strV !=null && strV.length() > 0){} //데이터가있다는뜻! String을 핸들링할때 걸어야할 조건/ 데이터가있어야함! 트루거나false는 나중문제
		
		try{
		}catch(Exception e){
		}finally{
			if(strV != null){
				strV=null;//시작과 끝은 null로 초기화해야하기때문에 finally로 설정//지금은 몰라도되지만 나중에는 계속써야함..?! 
			}
		}
	}// main끝
}//class끝


/*
strV >>> : null
*/