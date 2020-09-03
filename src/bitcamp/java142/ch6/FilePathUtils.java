package bitcamp.java142.ch6;

import java.util.Properties;

public abstract class FilePathUtils {
	
	public static final String FILE_PATH ="/src/bitcamp/java142/";
	public static String getFilePath(){//ó��������� filePath �ʹ� ��ϱ� ���� Ŭ���� �ϳ����� ��Ӿ���/�������̼��� ����/ ��ȣȭ�� ���� ->filePath1
		
		System.out.println( "(log) �߻��Լ� getFilePath() �Լ� START" );
		Properties pt = System.getProperties();
		String userDir = pt.getProperty("user.dir");
		userDir = userDir.replace('\\', '/');
		System.out.println("userDir >>> : " + userDir); //Ǯ�� : userDir >>> : D:/00.BITCAMP/java142/babyjava
		System.out.println( "(log) �߻��Լ� getFilePath() �Լ� END" );
		return userDir;
				
	}
}
