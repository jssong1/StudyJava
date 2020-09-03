package bitcamp.java142.ch6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferTest {
	//os�� ����ϴ� �ڸ����ø����̼�  io�� buffer(�������� ������ ��)�� �о; �������� flush�� �о�� 
	//������ ���ǵ����ʵ��� paket(�����ʹ����)���� ��� - �ӵ� ¯����; 
	/*
	 * 1. InputStream?out����?
	 * 2. Buffer�� ���
	 * 3. Buffer�� �ޱ�
	 * 4. OutputStream
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "(log) BufferTest.main �Լ� START" );
		String fp1 = FilePathUtils.getFilePath();
		String fp2 = FilePathUtils.FILE_PATH;
		String filePath = fp1 + fp2 +"ch6/";
		System.out.println("filePath >>> :"+ filePath);
		
		String inFileName = "data.txt";
		String outFileName = "data.txt";
		
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outBuffer = null;
		
		try{
//			outFile = new FileOutputStream(filePath + "BufferTest.java", true);
			outFile = new FileOutputStream(filePath + inFileName, false);
			outBuffer = new BufferedOutputStream(outFile);
			
			int c = 0;
			for (int i=0; i<10; i++){
				outBuffer.write(i + '0');
			}//for��
			outBuffer.flush();
			
			inFile = new FileInputStream(filePath + outFileName);
			inBuffer = new BufferedInputStream(inFile);
			while((c=inBuffer.read()) != -1){
				System.out.print((char)c + " ");
			}//while��
			
//			System.out.println("(log) try�� inBuffer-outBuffer-inFile-outFile Ŭ�����ϱ�;connection���� �޸� ������ �������");
			inBuffer.close();
			outBuffer.close();
			inFile.close();
			outFile.close();
			
		}catch(IOException i){
			
		} //try-catch��
		
		System.out.println(" ");
		System.out.println( "(log) BufferTest.main �Լ� END" );
	}

}
