package bitcamp.java142.ch3;

public class AAMain {

	//������ �����ε�
	public AAMain(){
		System.out.println("AAmain()������");
	}
	public AAMain(String str){ //�Ű������� ���ڿ��� ���� ������
		System.out.println("AAmain(String str)������");
	}
	public AAMain(String str, int i){ //�Ű������� ���ڿ��� int������Ÿ���� ���� ������
		System.out.println("AAmain(String str, int i)������");
	}
	
	//���� Ŭ�������� �Լ��̸��� �������� ����
	//�Ű�����(�Ķ����)�� �ٸ� �Լ��� ������
	//�Լ� �����ε�(overlodading)�̶�� �Ѵ�  // cf.�������̵��� ��Ӱ��迡�� �Ͼ�°�
	
	public void bb(){
		System.out.println("bb()�Լ� >>> : AAmain");
	}//AAmainŬ������ �ν��Ͻ� �����ʾ����ϱ� ��µ�������. �ڿ��̴ٸ���	
	
	public void bb(String str){
		System.out.println("bb(String str)�Լ� >>> : AAmain >>> " +str);
	}
	
	public void bb(String str, int i){
		System.out.println("bb(String str, int i)�Լ� >>> : AAmain >>> " + str + " & " + i);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA aa = new AA();//public�� �������� Ŭ���� AA�� �ν��Ͻ��ϸ� ��Ӱ����ִ� BBŬ�������� �ν��Ͻ��Ǿ� �����ִ�.
		//Ŭ������ �޸𸮿� �ö󰡸鼭 �����ڵ� �����Ǿ� �ö󰣴�. BBŬ���� -> AAŬ���� �θ��ڽļ�����/ ���� BB������, AA������ ������ ��µȴ�.	
		aa.bb();//�ν��Ͻ� �� aaŬ������ bb()�Լ� ȣ��/�ڽź��� ã���ϱ� AAŬ�������ִ� �Լ� bb�� ��µ�/ AAŬ������ �Լ�bb�� ���ٸ� ��Ӱ����ִ� BBŬ������ �Լ�bb���
		
		AAMain aam = new AAMain();
		aam.bb(); //�̸��� ������ �����ڿ��� bb()�Լ���
		aam.bb("song");//AAMainŬ������ bb(String)�Լ��� ȣ�� �Ű����������ʹ� song���� �����ؼ� ���
		aam.bb("song",1); 
		AAMain aam_1 = new AAMain("���ۿ�"); 
		AAMain aam_2 = new AAMain("���ۿ�",77);
	}//main�Լ���
}//AAMain��

/*
BB()������
AA()������
bb()�Լ� >>> : AA
AAmain()������
bb()�Լ� >>> : AAmain
bb(String str)�Լ� >>> : AAmain >>> song
bb(String str, int i)�Լ� >>> : AAmain >>> song & 1
AAmain(String str)������
AAmain(String str, int i)������
*/
