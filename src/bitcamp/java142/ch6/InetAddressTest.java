package bitcamp.java142.ch6;

import java.net.Inet4Address;
import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
		InetAddress ia1  = InetAddress.getByName("127.0.0.1");
		System.out.println("ia1 >>> : " + ia1);
		String ighn1 = ia1.getHostName();
		String igha1 = ia1.getHostAddress();
		System.out.println("ia1.getHostName() >>> : " + ighn1);
		System.out.println("ia1.getHostAddress() >>> : " + igha1);
		
		InetAddress ia2  = InetAddress.getByName("localhost");
		System.out.println("ia2 >>> : " + ia2);
		String ighn2 = ia2.getHostName();
		String igha2 = ia2.getHostAddress();
		System.out.println("ia2.getHostName() >>> : " + ighn2);
		System.out.println("ia2.getHostAddress() >>> : " + igha2);
		
		InetAddress ia22  = InetAddress.getByName("fe80::404f:7327:121a:f65a%13");
		System.out.println("ia22 >>> : " + ia22);
		String ighn22 = ia22.getHostName();
		String igha22 = ia22.getHostAddress();
		System.out.println("ia22.getHostName() >>> : " + ighn22);
		System.out.println("ia22.getHostAddress() >>> : " + igha22);
		
//		InetAddress ia23  = (Inet4address)Inetaddress.getByName("fe80::404f:7327:121a:f65a%13");
//		System.out.println("ia22 >>> : " + ia22);
//		String ighn23 = ia23.getHostName();
//		String igha23 = ia23.getHostAddress();
//		System.out.println("ia23.getHostName() >>> : " + ighn23);
//		System.out.println("ia23.getHostAddress() >>> : " + igha23);
		
		InetAddress ia3  = InetAddress.getByName("www.naver.com");
		System.out.println("ia3 >>> : " + ia3);
		String ighn3 = ia3.getHostName();
		String igha3 = ia3.getHostAddress();
		System.out.println("ia3.getHostName() >>> : " + ighn3);
		System.out.println("ia3.getHostAddress() >>> : " + igha3);
		
		InetAddress ia4  = InetAddress.getByName("www.daum.net");
		System.out.println("ia3 >>> : " + ia4);
		String ighn4 = ia4.getHostName();
		String igha4 = ia4.getHostAddress();
		System.out.println("ia3.getHostName() >>> : " + ighn4);
		System.out.println("ia3.getHostAddress() >>> : " + igha4);
		
		
		}catch(Exception e){//Exception은 최상위클래스 getByNam API에는 UnknownHostException와 SecurityException있음 
			}
	}//main끝

}//클래스끝
/*
ia1 >>> : /127.0.0.1
ia1.getHostName() >>> : 127.0.0.1
ia1.getHostAddress() >>> : 127.0.0.1
ia2 >>> : localhost/127.0.0.1
ia2.getHostName() >>> : localhost
ia2.getHostAddress() >>> : 127.0.0.1
ia3 >>> : www.naver.com/210.89.160.88
ia3.getHostName() >>> : www.naver.com
ia3.getHostAddress() >>> : 210.89.160.88
ia3 >>> : www.daum.net/203.133.167.16
ia3.getHostName() >>> : www.daum.net
ia3.getHostAddress() >>> : 203.133.167.16
*/
