package bitcamp.java142.ch2;

public class ArrayTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int iV[][]= new int[3][4]; //3��4���� 2�����迭iV�� ���� //[��][��] /  [1�����迭][2�����迭] 
		int iV1[][] = new int[][]{{1,2,3},{4,5,6}};
		int[] iV2[] = {{1,2,3},{4,5,6}};  //[]��ġ�� ������� ���������� ������Ÿ�Կ����� �������

		
		int iV[][] = {{0,1,2,3}
					,{1,2,3,4}
					,{2,3,4,5}};
		for(int i =0;i<iV.length; i++){
			for(int j=0; j<iV[i].length; j++){	
				System.out.print("" + iV[i][j]);
			}
			System.out.println();
		}
/*���
0123
1234
2345
*/
		
//		����
//1��
	
//		iV[][] = [][] {1,2,3},{},{}
		
//		iV[0][0] = 1;
//		iV[0][1] = 1;
//		iV[0][2] = 1;
//		iV[0][3] = 1;
		
		
//		for(int i =0;i<iV.length; i++){
//			for(int j=0; j<iV[i].length; j++){	
//				iV[i][j]=i+j;				
//			}
//		}
//			
//		for(int i =0;i<iV.length; i++){
//			for(int j=0; j<iV[i].length; j++){	
//				System.out.println("iV["+i+"]["+j+"]>>>:" + iV[i][j]);
//			}
//		}
		
//		for(int i =0;i<iV1.length; i++){
//			for(int j=0; j<iV1[i].length; j++){
//
//		System.out.println(iV1[i][j]);
//			}
//		}
		
		//	System.out.println(iV2[i][j]);
		
		
	}//main��

}//Ŭ������
