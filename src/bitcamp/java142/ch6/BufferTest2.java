package bitcamp.java142.ch6;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "(log) BufferTest2.main 함수 START" );
		String fp1 = FilePathUtils.getFilePath();
		String fp2 = FilePathUtils.FILE_PATH;
		String filePath = fp1 + fp2 +"ch6/";
		System.out.println("filePath >>> :"+ filePath);
		
		String inFileName = "data2.txt";
		String outFileName = "data2.txt";
		
		FileReader rFile = null;
		FileWriter wFile = null;
		BufferedReader rBuffer = null;
		BufferedWriter wBuffer = null;
		
		try{
//			outFile = new FileOutputStream(filePath + "BufferTest.java", true);
			wFile = new FileWriter(filePath + inFileName, false);
			wBuffer = new BufferedWriter(wFile);
			
			int c = 0;
			for (int i=0; i<10; i++){
				wBuffer.write(i + '0');
			}//for끝
			wBuffer.flush();
			
			rFile = new FileReader(filePath + outFileName);
			rBuffer = new BufferedReader(rFile);
			while((c=rBuffer.read()) != -1){
				System.out.print((char)c + " ");
			}//while끝
			
			
//			System.out.println("(log) try안 inBuffer-outBuffer-inFile-outFile클로즈하기; connection과는 달리 순서는 상관없음 ");
			rBuffer.close();
			wBuffer.close();
			rFile.close();
			wFile.close();
			
		}catch(IOException i){
			
		} //try-catch끝
		
		System.out.println(" ");
		System.out.println( "(log) BufferTest2.main 함수 END" );
	}

}
