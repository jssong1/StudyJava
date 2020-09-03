package bitcamp.java142.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url =  "https://developer.oracle.com/java";

//		쿼리스트링 : Query String : ?key=value&key=value
		try{
			URL u = new URL(url);
//			System.out.println("URL >>> : "+u);
			URLConnection uc = u.openConnection();
//			System.out.println("URLConnection >>> " +uc);
			BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//			System.out.println("uc.getInputStream() >>> : " + uc.getInputStream());
//			System.out.println("BufferedReader >>> : " + br);
			String inLine = "";
			while ((inLine = br.readLine()) != null){
				System.out.println(inLine);
				
			}//while끝
		}catch(Exception e){}
	
	
	}//main끝

}//클래스 끝
