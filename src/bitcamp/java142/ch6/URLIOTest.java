package bitcamp.java142.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

//잘가지고 있기
public class URLIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url =  "https://www.naver.com?id=정송원&pw=정송원11";
		try{
			//엡시딕 : EBCDIC(Extended Binary Coded Decimal Interchange Code) : 확장 이진화 십진법 교환 부호
			String urlEncode = URLEncoder.encode(url, "UTF-8"); //한글을 UTF-8형식으로 인코드
			System.out.println("encode >>> : " +urlEncode);
			String urlDecode = URLDecoder.decode(urlEncode,"UTF-8");//디코드
			System.out.println("edcode >>> : " +urlDecode);
			
			URL u = new URL(urlEncode);
			BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
			
			String inLine = null;
			while((inLine = br.readLine()) !=null){
				System.out.println(inLine);
			}//while 끝
			br.close();
			
		}catch(Exception e ){
			
		}//try-catch 끝
	}//메인끝

}//클래스끝

/*
encode >>> : https%3A%2F%2Fwww.naver.com%3Fid%3D%EC%A0%95%EC%86%A1%EC%9B%90%26pw%3D%EC%A0%95%EC%86%A1%EC%9B%9011
edcode >>> : https://www.naver.com?id=정송원&pw=정송원11

*/