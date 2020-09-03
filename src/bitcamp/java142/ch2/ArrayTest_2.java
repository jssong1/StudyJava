package bitcamp.java142.ch2;

public class ArrayTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ragged array 가변배열
//		int iV3[][] = new int[5][];
//		iV3[0] = new int[3];
//		iV3[1] = new int[5];
//		iV3[2] = new int[10];

//		{{(0,0)(0,1)(0,2)},{(1,0)(1,1)(1,2)}};
		
		int iV2[][]=new int[2][3]; //1차원배열로 방2개 2차원배열로 방3개를 int타입의 변수 iV2객체를 만들어 각방에 int의 디폴트값인 0으로 초기화
		System.out.println(iV2[0][0]); 
		System.out.println(iV2[0][1]);
		System.out.println(iV2[0][2]);
		System.out.println(iV2[1][0]);
		System.out.println(iV2[1][1]);
		System.out.println(iV2[1][2]);
		System.out.println("iV2.length >>> :" + iV2.length); //1차원배열의 길이
		System.out.println("iV2[0].length >>> :" + iV2[0].length); //1차원배열 중 첨자 0번째의 2차원배열의 길이
		System.out.println("iV2[1].length >>> :" + iV2[1].length); //1차원배열 중 첨자 1번째의 2차원배열의 길이
//		System.out.println("iV2[2].length >>> :" + iV2[2].length); //1차원배열은 2까지 있으므로 첨자는 0과1뿐;따라서 1차원배열중 첨자2번째의 2차원배열의 길이는 구할수 없다
		                                                           //java.lang.ArrayIndexOutOfBoundsException
		
		for(int i=0; i<iV2.length; i++){
		
			for(int j=0; j<iV2[0].length; j++){
				System.out.print("("+i+","+j+")");
			}
			System.out.println("");
		}
		
		
		int iV[] = new int[3]; // 1차원배열이 int타입의 변수 iV객체가 되어 int의 디폴트값0으로 각방에 초기화
		System.out.println(iV[0]); 
		System.out.println(iV[1]);
		System.out.println(iV[2]);
//		System.out.println(iV[3]);//배열첨자에 바인딩할게없다 (java.lang.ArrayIndexOutOfBoundsException)
		System.out.println(iV.length);
		
		char cV[] = new char[3]; 
		System.out.println(cV[0]); 
		System.out.println(cV[1]);
		System.out.println(cV[2]);
		System.out.println(cV.length);
		
		double dV[] = new double[3];  
		System.out.println(dV[0]); 
		System.out.println(dV[1]);
		System.out.println(dV[2]);
		System.out.println(dV.length);
		
		String sV[] = new String[3];  
		System.out.println(sV[0]); 
		System.out.println(sV[1]);
		System.out.println(sV[2]);
		System.out.println(sV.length);
		
		String strV = "abcdefghijklmn"; //String은 char배열
		String beginIndex = strV.substring(3);// 스트링클래스의 함수 substring(int beginIndex,int endIndex) ;리턴값String; static없음
		System.out.println("beginIndex >>> : "+beginIndex); //3이후 문자를 출력
		String beginEndIndex = strV.substring(3,6); //substring(int beginIndex,int endIndex) 첨자 3부터 6번째까지 출력 
		System.out.println("beginEndIndex >>> : "+beginEndIndex);
//		
//		System.out.println(strV[0]); 
//		System.out.println(strV[1]);
//		System.out.println(strV[2]);
//		System.out.println(strV.length);
		
		int iV4[][]=new int[3][4];// 객체가 되어 int의 디폴트값0으로 각방에 초기화
		System.out.println(iV4.length); //열 
		System.out.println(iV4[0].length);//행 
		int iV5[][]=new int[][]{{1,2,3},{4,5,6}};
		System.out.println(iV5.length);
		System.out.println(iV5[0].length);
		
	}//main함수끝
}//클래스끝

/*
0
0
0
0
0
0
iV2.length >>> :2
iV2[0].length >>> :3
iV2[1].length >>> :3
(0,0)(0,1)(0,2)
(1,0)(1,1)(1,2)
0
0
0
3
<빈칸세줄나옴
<
<
3
0.0
0.0
0.0
3
null
null
null
3
beginIndex >>> : defghijklmn
beginEndIndex >>> : def
3
4
2
3

*/
