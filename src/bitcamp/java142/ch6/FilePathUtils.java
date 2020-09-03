package bitcamp.java142.ch6;

import java.util.Properties;

public abstract class FilePathUtils {
	
	public static final String FILE_PATH ="/src/bitcamp/java142/";
	public static String getFilePath(){//처음만들었던 filePath 너무 기니까 공통 클래스 하나만들어서 계속쓰기/여러명이서도 가능/ 암호화도 가능 ->filePath1
		
		System.out.println( "(log) 추상함수 getFilePath() 함수 START" );
		Properties pt = System.getProperties();
		String userDir = pt.getProperty("user.dir");
		userDir = userDir.replace('\\', '/');
		System.out.println("userDir >>> : " + userDir); //풀력 : userDir >>> : D:/00.BITCAMP/java142/babyjava
		System.out.println( "(log) 추상함수 getFilePath() 함수 END" );
		return userDir;
				
	}
}
