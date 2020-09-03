package bitcamp.java142.ch6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//inputstream, outputstrem (바이트기반)
//Reader (문자기반)

//FileInputStream와 FileReader 생성자 수 3개로 같음
//FileOutputStream과 FileWriter 생성자 수 5개로 같음
//따라서 골라쓰삼 바이트기반으로쓰면 더편하긴하대 ~

public class IOTest2 {

	public static final String FILE_PATH ="/src/bitcamp/java142/"; //변경되지않을 공통부분은 문자상수로 두면 더 편해 -> filePath2 
	public static String workPath(){//처음만들었던 filePath 너무 기니까 공통함수 또는 공통 클래스 하나만들어서 계속쓰기/여러명이서도 가능/ 암호화도 가능 ->filePath1
		System.out.println( "(log) workPath() 함수 START" );
		Properties pt = System.getProperties();
		String userDir = pt.getProperty("user.dir");
		userDir = userDir.replace('\\', '/');
		System.out.println("userDir >>> : " + userDir); //풀력 : userDir >>> : D:/00.BITCAMP/java142/babyjava
		System.out.println( "(log) workPath() 함수 END" );
		return userDir;			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//os시스템은 디렉토리랑 파일구분해서 잘찾기 / 와 \ 구분자구별
		
		System.out.println( "(log) main 함수 START" );
		
		String filePath = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
		System.out.println("filePath >>> :"+ filePath);
		
		String filePath1 = IOTest2.workPath() + "/src/bitcamp/java142/ch6/";
		System.out.println("filePath1 >>> :"+ filePath1);
		
		String filePath2 = IOTest2.workPath() + FILE_PATH +"ch6/";
		System.out.println("filePath2 >>> :"+ filePath2);
		
		String fp1 = FilePathUtils.getFilePath();
		String fp2 = FilePathUtils.FILE_PATH;
		String filePath3 = fp1 + fp2 +"ch6/";
		System.out.println("filePath3 >>> :"+ filePath3);
		
		try{
			FileReader fis = new FileReader(filePath1 + "IOTest2.java");
			System.out.println("fis >>> : " + fis);
			FileWriter fos = new FileWriter(filePath1 + "IOTest2.bak");//IOTest2.bak라는 껍데기파일 생성됨
			System.out.println("fos >>> : " + fos);
			
			int data = 0;
			while ((data=fis.read()) != -1) {//-1:문자열끝
				System.out.print((char)data);
				fos.write(data);//결과는 한글은 안깨짐(문자기반 Reader 썼으니까)
			}//while끝
			
		System.out.println("(log) fis -> fos close하기 ----; connection과는 달리 순서는 상관없음");	
			//열었던순서대로 끊어주기
			fis.close();
			fos.close();
		}catch(IOException i){} //try-catch끝
		
		System.out.println( "(log) main 함수 END" );
	}//메인끝

}//클래스끝














