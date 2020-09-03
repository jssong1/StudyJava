package bitcamp.java142.ch6;

import java.io.File;

public class FileTest {

	public static final String DIR_PATH = "D:\\00.BITCAMP\\java142\\babyjava\\src\\bitcamp\\java142\\ch6\\";
//	public static final String DIR_PATH = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
			
		File f1 = new File(DIR_PATH + "FileTest.java");
		System.out.println("f1 >>> : " +f1);
		System.out.println("f1.getPath() >>> : " +f1.getPath()); //경로&파일이름까지 다나옴/but api따라 다르게 나오기때문에 조심해서쓰기
		System.out.println("f1.getName() >>> : " +f1.getName());
		System.out.println("f1.getAbsolutePath() >>> : " +f1.getAbsolutePath()); //절대 경로/ 절대경로에는 상대경로도 쓸수있음 
		System.out.println("f1.getParent() >>> : " +f1.getParent());
		System.out.println("f1.getCanonicalPath() >>> : " +f1.getCanonicalPath());//정규 경로 /상대경로쓸수없음 //그러므로안써

		boolean b = f1.isDirectory(); //디렉토리인지
		boolean b1 = f1.isFile(); //파일인지
		System.out.println("f1.isDirectory() >>> : " + b);
		System.out.println("f1.isFile >>> : " + b1);
	}//main끝

}//class끝


/*출력
 * editplus랑 경로가 다른거 볼수있음  (D:\00.BITCAMP\java142\babyjava\FileTest_1.java)
 * rootfile이 다름 
 * babyjava폴더에는 FileTest_1.java가 없어!!! (\src\bitcamp\java142\ch6)가 없어서 isFile도 false 로 나옴
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
 /* String DIR_PATH 이용하니까 getParent()까지 나옴
f1 >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.getPath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.getName() >>> : FileTest.java
f1.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.getParent() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6
f1.getCanonicalPath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\FileTest.java
f1.isDirectory() >>> : false
f1.isFile >>> : true
*/
 