package bitcamp.java142.ch4;

public class GetClassTest { //extends java.lang.Object�� �����ȰͰ� ���� ��������� Ŭ������ �⺻������ ���� ObjectŬ������ ��ӹ����ϱ�

	public void aMethod(){
		System.out.println("GetClassTest.aMethod �Լ��Դϴ�");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetClassTest cct = new GetClassTest(); //�ڱ��ڽŵ����;����� �ν��Ͻ�->�⺻�����ڸ������
		System.out.println("----------�������� cct �ּҰ� >>> : "+cct);
		System.out.println("cct.getClass() >>> : "+cct.getClass());//objectŬ������getclass()�Լ�//�������� Class<T> �� Ŭ���� �̸��� �����ϴ°�
		System.out.println("cct.getClass().getName() >>> : "+cct.getClass().getName());//


		Object obj = new GetClassTest(); //�θ�Ŭ����(ObjectŬ����)�� �����ؼ� �ڽ�Ŭ����(GetClassTest) �ν��Ͻ�
		GetClassTest cct1 = (GetClassTest)obj;//�ڽİ� ������ ����ȯ
		System.out.println("----------�������� cct1 �ּҰ� >>> : "+cct1);
		System.out.println("cct1.getClass() >>> : "+cct1.getClass());//objectŬ������getclass()�Լ�//�������� Class<T> //����Ǵ� Ŭ������ ����
		System.out.println("cct1.getClass().getName() >>> : "+cct1.getClass().getName());//�� Ŭ���� �̸��� �����ϴ°�
		
		
		Class cla = obj.getClass(); //Class Ŭ������ cla�������� �����Ͽ� obt  
		System.out.println("1. �������� cla >>> : "+cla);
		
		Object obj1 = new Object(); // 
		Class cla1 = obj1.getClass();
		System.out.println("�������� cla1 >>> : "+cla1);
		
		try{
		Class cla2 = Class.forName("bitcamp.java142.ch4.GetClassTest"); //��Ű��.Ŭ�������� bitcamp.java142.ch4.GetClassTest�� ã�Ƽ� Ŭ��������
		System.out.println("�������� cla2 >>> : "+cla2); //���ϵ� [class ��Ű����.Ŭ������]���
	
		}catch (ClassNotFoundException e){
			
		}
		
		/* Ŭ������ �޸𸮿� �ø���(��üȭ �ϴ�) ���
		 1. new �����ڸ� �̿��ؼ� ������ ����ϴ� ���
		 2. ����ϴ� ���
		 3. �߻�Ŭ����(obstract class)�� getInstance()�Լ��� �̿��ϴ� ���
 		 4. Class.forName("��Ű����.Ŭ�����̸�")�Լ��� �̿��ؼ� 
 		 	��Ű����.Ŭ�����̸����� Ŭ���� ã�� �� newInstatnce()�Լ� �̿��ϴ� ���
		 */
		
		try{
		Class cla3 = Class.forName("bitcamp.java142.ch4.GetClassTest"); //�� Ŭ������ ã�Ƽ�
		System.out.println("----------�������� cla3 >>> : "+cla3); //���ϵ� [class ��Ű����.Ŭ������]���
		GetClassTest cct2 = (GetClassTest)cla3.newInstance();
		System.out.println("newInstance�� ���ϰ��� t/cct2�� ���ϰ���? >>>> :"+cct2); //�ּҰ�����
		cct.aMethod();
		}
		catch (ClassNotFoundException e){}
		catch (InstantiationException e){}
		catch (IllegalAccessException e){}
	}//���γ�	
}//GetClassTest Ŭ���� ��

/*
**getClass()�Լ� //Class<?> //OjectŬ������
	Returns the runtime class of this Object.
**getName()�Լ� //public String //Class<T>�ȿ�
	Returns the name of the entity (class, interface, array class,primitive type, or void) represented by this Class object,as a String. 
**forName(String className)�Լ�//����: static Class<?> 
Returns the Class object associated with the class orinterface with the given string name. 
**newInstance() �Լ� // ���ϰ� : T //ClassŬ������
Creates a new instance of the class represented by this Classobject. 
**T - the type of the class modeled by this Class object. 
	For example, the type of String.class is Class<String>. Use Class<?> if the class being modeled is unknown.
*/
/*
----------�������� cct �ּҰ� >>> : bitcamp.java142.ch4.GetClassTest@15db9742
cct.getClass() >>> : class bitcamp.java142.ch4.GetClassTest
cct.getClass().getName() >>> : bitcamp.java142.ch4.GetClassTest
----------�������� cct1 �ּҰ� >>> : bitcamp.java142.ch4.GetClassTest@6d06d69c
cct1.getClass() >>> : class bitcamp.java142.ch4.GetClassTest
cct1.getClass().getName() >>> : bitcamp.java142.ch4.GetClassTest
1. �������� cla >>> : class bitcamp.java142.ch4.GetClassTest
�������� cla1 >>> : class java.lang.Object
�������� cla2 >>> : class bitcamp.java142.ch4.GetClassTest
----------�������� cla3 >>> : class bitcamp.java142.ch4.GetClassTest
newInstance�� ���ϰ��� t/cct2�� ���ϰ���? >>>> :bitcamp.java142.ch4.GetClassTest@7852e922
GetClassTest.aMethod �Լ��Դϴ�
*/