package bitcamp.java142.ch6;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageTest {
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "(log) ImageTest.main 함수 START" );
		
		String fp1 = FilePathUtils.getFilePath();
		String fp2 = FilePathUtils.FILE_PATH;
		String filePath = fp1 + fp2 +"ch6/wg31.jpg";
		System.out.println("filePath >>> :"+ filePath);
		
		Image im = null;
		FileInputStream inFile = null;
		BufferedInputStream inBuffer = null;

		
		try{
			inFile = new FileInputStream(filePath);
			inBuffer = new BufferedInputStream(inFile);
			
//			InputStream is = new BufferedInputStream(new FileInputStream(filePath));
			im = ImageIO.read(inBuffer);

			inBuffer.close();
			inFile.close();
			
		}catch(IOException i ){			
		}//try-catch끝
		
		JFrame jf = new JFrame();
		JLabel jl = new JLabel(new ImageIcon(im));
		
		jf.getContentPane().add(jl, BorderLayout.CENTER);
//		jf.setSize(433,577);
		jf.pack();//크기설정안하고 한번에
		jf.setVisible(true);
		System.out.println( "(log) ImageTest.main 함수 END" );
	}//main끝

}//클래스끝
