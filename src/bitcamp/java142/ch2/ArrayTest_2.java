package bitcamp.java142.ch2;

public class ArrayTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ragged array �����迭
//		int iV3[][] = new int[5][];
//		iV3[0] = new int[3];
//		iV3[1] = new int[5];
//		iV3[2] = new int[10];

//		{{(0,0)(0,1)(0,2)},{(1,0)(1,1)(1,2)}};
		
		int iV2[][]=new int[2][3]; //1�����迭�� ��2�� 2�����迭�� ��3���� intŸ���� ���� iV2��ü�� ����� ���濡 int�� ����Ʈ���� 0���� �ʱ�ȭ
		System.out.println(iV2[0][0]); 
		System.out.println(iV2[0][1]);
		System.out.println(iV2[0][2]);
		System.out.println(iV2[1][0]);
		System.out.println(iV2[1][1]);
		System.out.println(iV2[1][2]);
		System.out.println("iV2.length >>> :" + iV2.length); //1�����迭�� ����
		System.out.println("iV2[0].length >>> :" + iV2[0].length); //1�����迭 �� ÷�� 0��°�� 2�����迭�� ����
		System.out.println("iV2[1].length >>> :" + iV2[1].length); //1�����迭 �� ÷�� 1��°�� 2�����迭�� ����
//		System.out.println("iV2[2].length >>> :" + iV2[2].length); //1�����迭�� 2���� �����Ƿ� ÷�ڴ� 0��1��;���� 1�����迭�� ÷��2��°�� 2�����迭�� ���̴� ���Ҽ� ����
		                                                           //java.lang.ArrayIndexOutOfBoundsException
		
		for(int i=0; i<iV2.length; i++){
		
			for(int j=0; j<iV2[0].length; j++){
				System.out.print("("+i+","+j+")");
			}
			System.out.println("");
		}
		
		
		int iV[] = new int[3]; // 1�����迭�� intŸ���� ���� iV��ü�� �Ǿ� int�� ����Ʈ��0���� ���濡 �ʱ�ȭ
		System.out.println(iV[0]); 
		System.out.println(iV[1]);
		System.out.println(iV[2]);
//		System.out.println(iV[3]);//�迭÷�ڿ� ���ε��ҰԾ��� (java.lang.ArrayIndexOutOfBoundsException)
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
		
		String strV = "abcdefghijklmn"; //String�� char�迭
		String beginIndex = strV.substring(3);// ��Ʈ��Ŭ������ �Լ� substring(int beginIndex,int endIndex) ;���ϰ�String; static����
		System.out.println("beginIndex >>> : "+beginIndex); //3���� ���ڸ� ���
		String beginEndIndex = strV.substring(3,6); //substring(int beginIndex,int endIndex) ÷�� 3���� 6��°���� ��� 
		System.out.println("beginEndIndex >>> : "+beginEndIndex);
//		
//		System.out.println(strV[0]); 
//		System.out.println(strV[1]);
//		System.out.println(strV[2]);
//		System.out.println(strV.length);
		
		int iV4[][]=new int[3][4];// ��ü�� �Ǿ� int�� ����Ʈ��0���� ���濡 �ʱ�ȭ
		System.out.println(iV4.length); //�� 
		System.out.println(iV4[0].length);//�� 
		int iV5[][]=new int[][]{{1,2,3},{4,5,6}};
		System.out.println(iV5.length);
		System.out.println(iV5[0].length);
		
	}//main�Լ���
}//Ŭ������

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
<��ĭ���ٳ���
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
