package bitcamp.java142.ch6;

import java.io.File;

public class FileTest {

	public static final String DIR_PATH = "D:\\00.BITCAMP\\java142\\babyjava\\src\\bitcamp\\java142\\ch6\\";
//	public static final String DIR_PATH = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
			
		File f1 = new File(DIR_PATH + "FileTest.java");
		System.out.println("f1 >>> : " +f1);
		System.out.println("f1.getPath() >>> : " +f1.getPath()); //���&�����̸����� �ٳ���/but api���� �ٸ��� �����⶧���� �����ؼ�����
		System.out.println("f1.getName() >>> : " +f1.getName());
		System.out.println("f1.getAbsolutePath() >>> : " +f1.getAbsolutePath()); //���� ���/ �����ο��� ����ε� �������� 
		System.out.println("f1.getParent() >>> : " +f1.getParent());
		System.out.println("f1.getCanonicalPath() >>> : " +f1.getCanonicalPath());//���� ��� /����ξ������� //�׷��ǷξȽ�

		boolean b = f1.isDirectory(); //���丮����
		boolean b1 = f1.isFile(); //��������
		System.out.println("f1.isDirectory() >>> : " + b);
		System.out.println("f1.isFile >>> : " + b1);
	}//main��

}//class��


/*���
 * editplus�� ��ΰ� �ٸ��� ��������  (D:\00.BITCAMP\java142\babyjava\FileTest_1.java)
 * rootfile�� �ٸ� 
 * babyjava�������� FileTest_1.java�� ����!!! (\src\bitcamp\java142\ch6)�� ��� isFile�� false �� ����
f1 >>> : FileTest_1.java
f1.getPath() >>> : FileTest_1.java
f1.getName() >>> : FileTest_1.java
f1.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\FileTest_1.java
f1.getParent() >>> : null
f1.getCanonicalPath() >>> : D:\00.BITCAMP\java142\babyjava\FileTest_1.java
f1.isDirectory() >>> : false
f1.isFile >>> : false
 *  
 * */
 /* String DIR_PATH �̿��ϴϱ� getParent()���� ����
f1 >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.getPath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.getName() >>> : FileTest.java
f1.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.getParent() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6
f1.getCanonicalPath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.isDirectory() >>> : false
f1.isFile >>> : true
*/
 