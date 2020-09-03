package bitcamp.java142.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

//�߰����� �ֱ�
public class URLIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url =  "https://www.naver.com?id=���ۿ�&pw=���ۿ�11";
		try{
			//���õ� : EBCDIC(Extended Binary Coded Decimal Interchange Code) : Ȯ�� ����ȭ ������ ��ȯ ��ȣ
			String urlEncode = URLEncoder.encode(url, "UTF-8"); //�ѱ��� UTF-8�������� ���ڵ�
			System.out.println("encode >>> : " +urlEncode);
			String urlDecode = URLDecoder.decode(urlEncode,"UTF-8");//���ڵ�
			System.out.println("edcode >>> : " +urlDecode);
			
			URL u = new URL(urlEncode);
			BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
			
			String inLine = null;
			while((inLine = br.readLine()) !=null){
				System.out.println(inLine);
			}//while ��
			br.close();
			
		}catch(Exception e ){
			
		}//try-catch ��
	}//���γ�

}//Ŭ������

/*
encode >>> : https%3A%2F%2Fwww.naver.com%3Fid%3D%EC%A0%95%EC%86%A1%EC%9B%90%26pw%3D%EC%A0%95%EC%86%A1%EC%9B%9011
edcode >>> : https://www.naver.com?id=���ۿ�&pw=���ۿ�11

*/