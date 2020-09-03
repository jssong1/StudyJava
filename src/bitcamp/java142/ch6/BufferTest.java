package bitcamp.java142.ch6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferTest {
	//os를 통과하는 자마어플리케이션  io의 buffer(내가정한 단위의 통)로 읽어서; 자투리는 flush로 밀어내기 
	//갈때는 유실되지않도록 paket(데이터담는통)으로 통신 - 속도 짱빠름; 
	/*
	 * 1. InputStream?out먼저?
	 * 2. Buffer로 담기
	 * 3. Buffer로 받기
	 * 4. OutputStream
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "(log) BufferTest.main 함수 START" );
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
			}//for끝
			outBuffer.flush();
			
			inFile = new FileInputStream(filePath + outFileName);
			inBuffer = new BufferedInputStream(inFile);
			while((c=inBuffer.read()) != -1){
				System.out.print((char)c + " ");
			}//while끝
			
//			System.out.println("(log) try안 inBuffer-outBuffer-inFile-outFile 클로즈하기;connection과는 달리 순서는 상관없음");
			inBuffer.close();
			outBuffer.close();
			inFile.close();
			outFile.close();
			
		}catch(IOException i){
			
		} //try-catch끝
		
		System.out.println(" ");
		System.out.println( "(log) BufferTest.main 함수 END" );
	}

}
