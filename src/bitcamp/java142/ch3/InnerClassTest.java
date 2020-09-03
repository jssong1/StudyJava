package bitcamp.java142.ch3;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassTest {
	
	class Abc{  //Ŭ�����ȿ� Ŭ���� (InnerClassTest$Abc.class)
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
		b.addActionListener(new ActionListener(){ //�Լ��ȿ��� Ŭ���������ִ�.
			public void actionPerformed(ActionEvent e){
				System.out.println("ActionEvent ����");
			}
		}); //�͸�Ŭ����
	}//���γ�

}//InnerClassTest Ŭ���� ��

/*
a.iV10
*/