package bitcamp.java142.ch2;
public class ForTest_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=0; i<5; i++){ //열로 뻗어간다 바깥으로 
//			for (int j=0; j<i; j++){ //행으로뻗어간다 
//				System.out.print("★");
//			} //for j끝
//			System.out.println();
//		} //for i끝
		
		for (int i=0; i<5; i++){ //열로 뻗어간다 바깥으로 
			for (int j=0; j<3; j++){ //행으로뻗어간다 
				System.out.print("★");
			} //for j끝
		System.out.println();
	} //for i끝	
		
		for (int i=0; i<5; i++){ //열로 뻗어간다 바깥으로 
//			System.out.print("시작");
//			System.out.print("☆");
			for (int j=0; j<3; j++){ //행으로뻗어간다 
//				System.out.print("★");
				System.out.print("("+i+","+j+")");
//				System.out.print("*");
			} //for j끝			
//			System.out.print("끝");
			System.out.println();
		} //for i끝		
	} //main함수()끝
}//ForTest_2 클래스 끝
/*

★★★
★★★
★★★
★★★
★★★
(0,0)(0,1)(0,2)
(1,0)(1,1)(1,2)
(2,0)(2,1)(2,2)
(3,0)(3,1)(3,2)
(4,0)(4,1)(4,2)

*/