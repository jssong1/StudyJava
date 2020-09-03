package bitcamp.java142.ch6;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties pp = System.getProperties(); //pp��������
		
		pp.list(System.out);//�ڹټ�ġ ȯ�漳�������� key&value�������Ѱ� ��� >>>>>>>>  -- listing properties --
		System.out.println("PP >>> : "+pp);//�迭�� ������
		
		//java.version=1.8.0_201
		String javaVersion = pp.getProperty("java.version"); //key�� value�������� //"java.version"�Ű����� String
		System.out.println("javaVerion >>> : "+javaVersion);
		
		//os.name = Windows 10
		String osName = pp.getProperty("os.name"); 
		System.out.println("osName >>> : "+ osName);
		
		String filePath = "\\"; //����� ����
		if("Windows 10".equals(osName)){
		}else{
			filePath = "/"; //��������...������....
		}
		
		//file.encoding = MS949
		String fileEncoding = pp.getProperty("file.encoding"); 
		System.out.println("fileEncoding >>> : "+ fileEncoding);
		
		//user.language = ko
		String userLanguage = pp.getProperty("user.language"); 
		System.out.println("userLanguage >>> : "+ userLanguage);
		
		//file.separator = \
		String fileSeparator = pp.getProperty("file.separator"); 
		System.out.println("fileSeparator >>> : "+ fileSeparator);
		
		//user.country = KR
		String userCountry = pp.getProperty("user.country"); 
		System.out.println("userCountry >>> : "+ userCountry);
		
		//user.dir = C:\00.BITCAMP\java142\babyJava
		String userDir = pp.getProperty("user.dir"); 
		System.out.println("userDir >>> : "+ userDir);
		
	}//main��

}//Ŭ���� ��
//java.util.Properties -> getProperty(String key, String defaultValue) :/���ϰ� String /Searches for the property with the specified key in this property list 

//java.lang.system -> getProperties() /���ϰ�:static Properties/ Determines the current system properties. 

/*
 * D:\>java -version
java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)

D:\>javac -version
javac 1.8.0_201
*/
