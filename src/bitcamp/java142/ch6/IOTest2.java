package bitcamp.java142.ch6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//inputstream, outputstrem (����Ʈ���)
//Reader (���ڱ��)

//FileInputStream�� FileReader ������ �� 3���� ����
//FileOutputStream�� FileWriter ������ �� 5���� ����
//���� ��󾲻� ����Ʈ������ξ��� �����ϱ��ϴ� ~

public class IOTest2 {

	public static final String FILE_PATH ="/src/bitcamp/java142/"; //����������� ����κ��� ���ڻ���� �θ� �� ���� -> filePath2 
	public static String workPath(){//ó��������� filePath �ʹ� ��ϱ� �����Լ� �Ǵ� ���� Ŭ���� �ϳ����� ��Ӿ���/�������̼��� ����/ ��ȣȭ�� ���� ->filePath1
		System.out.println( "(log) workPath() �Լ� START" );
		Properties pt = System.getProperties();
		String userDir = pt.getProperty("user.dir");
		userDir = userDir.replace('\\', '/');
		System.out.println("userDir >>> : " + userDir); //Ǯ�� : userDir >>> : D:/00.BITCAMP/java142/babyjava
		System.out.println( "(log) workPath() �Լ� END" );
		return userDir;			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//os�ý����� ���丮�� ���ϱ����ؼ� ��ã�� / �� \ �����ڱ���
		
		System.out.println( "(log) main �Լ� START" );
		
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
			FileWriter fos = new FileWriter(filePath1 + "IOTest2.bak");//IOTest2.bak��� ���������� ������
			System.out.println("fos >>> : " + fos);
			
			int data = 0;
			while ((data=fis.read()) != -1) {//-1:���ڿ���
				System.out.print((char)data);
				fos.write(data);//����� �ѱ��� �ȱ���(���ڱ�� Reader �����ϱ�)
			}//while��
			
		System.out.println("(log) fis -> fos close�ϱ� ----; connection���� �޸� ������ �������");	
			//������������� �����ֱ�
			fis.close();
			fos.close();
		}catch(IOException i){} //try-catch��
		
		System.out.println( "(log) main �Լ� END" );
	}//���γ�

}//Ŭ������













