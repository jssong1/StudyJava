package bitcamp.java142.ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//inputstream, outputstrem (����Ʈ���)
//Reader (���ڱ��)
public class IOTest {
//���Ͼ���ִ��� �ƴ°� ���� �߿�/����������/�����;����
	//�����ڻ������ �˰��������
	// . (dote operator) :��ũ����,���� ���͸�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//os�ý����� ���丮�� ���ϱ����ؼ� ��ã�� / �� \ �����ڱ���
		String filePath = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
		
		try{
			FileInputStream fis = new FileInputStream(filePath + "IOTest.java");
			System.out.println("fis >>> : " + fis);
			FileOutputStream fos = new FileOutputStream(filePath + "IOTest.bak");//IOTest.bak��� ���������� ������
			System.out.println("fos >>> : " + fos);
			
			int data = 0;
			while ((data=fis.read()) != -1) {//-1:���ڿ���
//				System.out.print((char)data);
				fos.write(data);//����� �ѱ��� ����(����Ʈ��� outputstream�����ϱ�)
			}//while��
			
			//������������� �����ֱ�
			fis.close();
			fos.close();
		}catch(IOException i){} //try-catch��
		

	}//���γ�

}//Ŭ������
