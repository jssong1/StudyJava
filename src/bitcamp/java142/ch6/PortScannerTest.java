package bitcamp.java142.ch6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class PortScannerTest extends Thread { //java.lang�� Thread�ҷ���;; �������̽��� implement; Ŭ������ extends
	protected static final int SIZE = 200;
	protected InetAddress target;
	protected int id;
	
	public PortScannerTest(InetAddress target, int id) throws IOException {
		super("Port Scanner #" + id);
		this.target = target;
		this.id = id;
	}//PortScannerTest������ ��

	public void run(){
		int port = 0;
		Socket s = null;
		for (int i =0; i<SIZE ; i++){
			try{
				port = SIZE * id + i;
				s =new Socket(target, port);
				System.out.println("Port #" + port + " is open");
			}catch(IOException ioe){
				System.out.println(">>> [" +i+ "] <<<" + ioe);
			}finally{
				try{
					s.close();
				}catch(Exception ignored){}//finally �� try-catch��
			}// try-catch-finally ��			
		}//for��
	}//run()�Լ� ��
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String host = "localhost";
		try{
			InetAddress addr = InetAddress.getByName(host);
			for(int i =0; i<SIZE; i++){
				System.out.println("<<<<<<  ["+i+"] >>>>>>");
				Thread.sleep(100);

//				public static void sleep(long millis)throws InterruptedException
//				Causes the currently executing thread to sleep (temporarily ceaseexecution) for the specified number of milliseconds, subject tothe precision and accuracy of system timers and schedulers. The threaddoes not lose ownership of any monitors.
//				millis - the length of time to sleep in milliseconds
				
				System.out.println("<<<-----["+i+"]----->>>");
				new PortScannerTest(addr,i).start();
			}//for��
		}catch(Exception e){}//try-catch ��
	}//���� ��

}//Ŭ���� ��

//��� : Port #135 is open