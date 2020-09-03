package bitcamp.java142.ch6;

import java.io.File;
//들고다닐 예제 파일 업로드,다운로드할 때 쓸 거임
import java.io.FileWriter;

//사용하는 도구에따라 파일이 생성되는 경로가 다름 -> 생성되는 경로확인하는 것이 중요함
public class FileTest_2 {
	
	
	public static final String DIR_PATH = "D:\\00.BITCAMP\\java142\\babyjava\\src\\bitcamp\\java142\\ch6\\";
//	public static final String DIR_PATH = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
	
	//세번째 예시
	public static void fileList(String dir){
		File f = new File(dir);
		System.out.println("new file >>> : " + f);
		File files[] = f.listFiles();
		for(int i=0; i<files.length; i++){
			String fileName = files[i].getName();
			System.out.println("fileName ["+i+"]"+ " >>> :" + fileName);
		}//for끝
	}//fileList 클래스 끝
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String strVal = "ccccc";
//		
//		File f = new File( DIR_PATH + strVal);
//		System.out.println("f >>> : " + f );
//		System.out.println("f.getAbsolutePath() >>> : " + f.getAbsolutePath());
//		boolean b = f.isDirectory();
//		boolean b1 = f.isFile();
//		
//		if(!f.exists() || !f.isDirectory()){
//		System.out.println("디렉토리가 없습니다." );
//		System.out.println("디렉토리 만들기 >>> :" );
////		File dir  = new File (strVal);//실제존재하지않지만 찾아옴 //dir >>> aaaaa //babyjava에서 만들어짐 
//		File dir  = new File (DIR_PATH + strVal); //dir >>> D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\bbbbb
//		System.out.println("만든 dir 경로 >>> : " + dir );
//		
//		
//		//mkdir()와 createNewFile()이용해서 파일만들기
//		dir.mkdir();
//		File file = new File(dir,dir.getName() + ".txt");
//		System.out.println("file >>> : " + file);
//		file.createNewFile(); // 일치하는 파일이 존재하지 않는다면 자동으로 새 파일 만들어줌
//		FileWriter fw = null;
//		fw = new FileWriter(file);//원통으로만들어야지 두번컴파일하면안돼
//		System.out.println("fw >>> : " + fw);
//		fw.write("파일에 내용을 씁니다~~");
//		System.out.println("(log) fw.write 완료 ");
//		fw.close();
//				
//		
//		}else{
//			System.out.println("f1.isDirectory() <<<>>> : " + b);
//			System.out.println("f1.isFile <<<>>> : " + b1);
//		}//if-else끝

		
//		// 두번째 예시
//		String strVal = "ddddd";
//		
//		File f = new File( DIR_PATH + strVal);
//		System.out.println("f >>> : " + f );
//		System.out.println("f.getAbsolutePath() >>> : " + f.getAbsolutePath());
//		boolean b = f.isDirectory();
//		boolean b1 = f.isFile();
//		
//		if(!f.exists() || !f.isDirectory()){
//		System.out.println("디렉토리가 없습니다." );
//		System.out.println("디렉토리 만들기 >>> :" ); 
//		File dir  = new File (DIR_PATH + strVal + "/"); // 끝에  (+ "/" )붙임
//		System.out.println("만든 dir 경로 >>> : " + dir );
//		
//		
//		
//		//mkdir()와 createNewFile()이용해서 파일만들기
//		dir.mkdir();
//		File file = new File(dir,dir.getName() + ".txt");
//		System.out.println("file >>> : " + file);
//		file.createNewFile(); // 일치하는 파일이 존재하지 않는다면 자동으로 새 파일 만들어줌//원통으로만들어야지 if안에넣어서 두번컴파일하면안돼
//		
//			if(dir.exists()){
//				FileWriter fw = null;
//				fw = new FileWriter(file);
//				System.out.println("fw >>> : " + fw);
//				fw.write("ddddd.txt파일에 내용을 씁니다~~");
//				System.out.println("(log) fw.write 완료 ");
//				fw.close();
//				
//			}//if끝
////		System.exit(0);//프로그램 종료 명령어 // 0,1,2: 리터럴 : 프로그램 종료의 의를 정하는 숫자  (자기가 정하는 임의의 숫자)
//		}else{
//			System.out.println("f1.isDirectory() <<<>>> : " + b);
//			System.out.println("f1.isFile <<<>>> : " + b1);
//		}//if-else끝
//		
//		File files[] = f.listFiles();
//		for (int i=0; i<files.length; i++){
//			String fileName = files[i].getName();
//			System.out.println("fileName ["+i+"]"+ " >>> :" + fileName);
//			
//		}//for끝
//		
//	}//main 끝
//
//}//class 끝
		
// 세번째 예시
		String strVal = "eeeee";
		
		File f = new File( DIR_PATH + strVal);
		System.out.println("f >>> : " + f );
		System.out.println("f.getAbsolutePath() >>> : " + f.getAbsolutePath());
		boolean b = f.isDirectory();
		boolean b1 = f.isFile();
		
		if(!f.exists() || !f.isDirectory()){
		System.out.println("디렉토리가 없습니다." );
		System.out.println("디렉토리 만들기 >>> :" ); 
		File dir  = new File (DIR_PATH + strVal + "/"); // 끝에  (+ "/" )붙임
		System.out.println("만든 dir 경로 >>> : " + dir );
		
		
		
		//mkdir()와 createNewFile()이용해서 파일만들기
		dir.mkdir();
		File file = new File(dir,dir.getName() + ".txt");
		System.out.println("file >>> : " + file);
		file.createNewFile(); // 일치하는 파일이 존재하지 않는다면 자동으로 새 파일 만들어줌//원통으로만들어야지 if안에넣어서 두번컴파일하면안돼
		
			if(dir.exists()){
				FileWriter fw = null;
				fw = new FileWriter(file);
				System.out.println("fw >>> : " + fw);
				fw.write("ddddd.txt파일에 내용을 씁니다~~");
				System.out.println("(log) fw.write 완료 ");
				fw.close();
				
			}//if끝
//				System.exit(0);//프로그램 종료 명령어 // 0,1,2: 리터럴 : 프로그램 종료의 의를 정하는 숫자  (자기가 정하는 임의의 숫자)
		}else{
			System.out.println("f1.isDirectory() <<<>>> : " + b);
			System.out.println("f1.isFile <<<>>> : " + b1);
		}//if-else끝
		
		File files[] = f.listFiles();
		for (int i=0; i<files.length; i++){
			String fileName = files[i].getName();
			System.out.println("fileName ["+i+"]"+ " >>> :" + fileName);
			
		}//for끝
		
	}//main 끝

}//class 끝

/*
boolean/ exists(): Tests whether the file or directory denoted by this abstract pathnameexists. /리턴값 : boolean 
boolean/ mkdir() :Creates the directory named by this abstract pathname.
boolean/ mkdirs() :Creates the directory named by this abstract pathname, including anynecessary but nonexistent parent directories. 
boolean/ createNewFile() :Atomically creates a new, empty file named by this abstract pathname ifand only if a file with this name does not yet exist. 
 * */
/* 세번째 출력
f >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc
f.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc
디렉토리가 없습니다.
디렉토리 만들기 >>> :
만든 dir 경로 >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc
file >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc\ccccc.txt
fw >>> : java.io.FileWriter@15db9742
(log) fw.write 완료 
*/

/* 네번째 출력 "리스트만든후"
f >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
f.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
디렉토리가 없습니다.
디렉토리 만들기 >>> :
만든 dir 경로 >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
file >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd\ddddd.txt
fw >>> : java.io.FileWriter@6996db8
(log) fw.write 완료 
fileName [0] >>> :ddddd.txt

---디렉토리와 파일 만든후 실행
f >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
f.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
f1.isDirectory() <<<>>> : true
f1.isFile <<<>>> : false
fileName [0] >>> :ddddd.txt
*/