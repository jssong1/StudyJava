package bitcamp.java142.ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//inputstream, outputstrem (바이트기반)
//Reader (문자기반)
public class IOTest {
//파일어디에있는지 아는게 제일 중요/데이터유무/데이터어떤형태
	//생성자사용방법만 알고있으면됨
	// . (dote operator) :링크연결,현재 디렉터리
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//os시스템은 디렉토리랑 파일구분해서 잘찾기 / 와 \ 구분자구별
		String filePath = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
		
		try{
			FileInputStream fis = new FileInputStream(filePath + "IOTest.java");
			System.out.println("fis >>> : " + fis);
			FileOutputStream fos = new FileOutputStream(filePath + "IOTest.bak");//IOTest.bak라는 껍데기파일 생성됨
			System.out.println("fos >>> : " + fos);
			
			int data = 0;
			while ((data=fis.read()) != -1) {//-1:문자열끝
//				System.out.print((char)data);
				fos.write(data);//결과는 한글은 깨짐(바이트기반 outputstream썼으니까)
			}//while끝
			
			//열었던순서대로 끊어주기
			fis.close();
			fos.close();
		}catch(IOException i){} //try-catch끝
		

	}//메인끝

}//클래스끝
