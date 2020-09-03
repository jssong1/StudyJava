package bitcamp.java142.ch3;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassTest {
	
	class Abc{  //클래스안에 클래스 (InnerClassTest$Abc.class)
		int iV = 10;
	}
	
	public void aMethod(){
		Abc a = new Abc();
		System.out.println("a.iV"+a.iV);
	}
	
	Object o = new Object(){void oMethod(){}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest ict= new InnerClassTest();
		ict.aMethod();
		Button b = new Button("Start");
		b.addActionListener(new ActionListener(){ //함수안에도 클래스들어갈수있다.
			public void actionPerformed(ActionEvent e){
				System.out.println("ActionEvent ㅋㅋ");
			}
		}); //익명클래스
	}//메인끝

}//InnerClassTest 클래스 끝

/*
a.iV10
*/