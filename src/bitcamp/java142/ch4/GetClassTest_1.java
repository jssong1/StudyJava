package bitcamp.java142.ch4;

import a.b.c.HelloEclipse;//내가 쓰고싶은클래스가져오기 

public class GetClassTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//원래하던방법
//		HelloEclipse he =new HelloEclipse();
//		he.hello();

		
		//이제는 newInstatnce()함수 써보자 매번 new할수는 없으니까 
		try{
			Class cla = Class.forName("a.b.c.HelloEclipse");//
			System.out.println("참조변수 cla3 >>> : " + cla);
			HelloEclipse he = (HelloEclipse)cla.newInstance();
			he.hello();
		}
//		catch(Exception e){}//원래는 이거하나만 적어도되지만
		catch (ClassNotFoundException e){}
		catch (InstantiationException e){}
		catch (IllegalAccessException e){}
		
		
	}//main끝

}//GetClassTest_1 클래스끝

/*
참조변수 cla3 >>> : class a.b.c.HelloEclipse
헬로 이클립스!!
*/