package bitcamp.java142.ch2;

public class ForTest {
	//�ѱ涧�º�����~�������¹迭ǥ��
	public void forTest(String str[]){
		System.out.println(">>>>>>>>>>>>>>forTest()�Լ�����");
		int strLen = str.length; //�����Լ����� ���� ������ str�迭�� ���̸� int������Ÿ���� ���� ���� strLen�����Ͽ� forTest�Լ��� ���������� �ʱ�ȭ
		
		//for���� �������� ������ ó���� �� ����Ѵ�.
		for (int i=0; i<strLen; i++){  //intŸ���� ����i�� ���� 0���� �ʱ�ȭ ÷�ڰ� 0���ͽ����̱⶧��; i�� strLen���̼����� 1�������ϸ鼭 for�� �ݺ�����
			
			System.out.println("str["+i+"] >>> : "+str[i]); //i�� �ݺ������ϸ� ��÷�ڿ� �ش��ϴ� str���ڿ��� ����
			for (int j=0; j<str[i].length();j++){ //����for����� //intŸ���� ���� j�� ���� 0���� �ʱ�ȭ;j�� 1�������ϸ鼭 ����str�ǰ��迭���ڿ��� ���̼����� �ݺ�����
				System.out.println("str["+i+"].charAt("+j+") >>> : " +str[i].charAt(j));// str��Ʈ���迭�� ÷��i�� ���ڿ� �� �� ���ڿ��迭÷��j��° ���ڸ� ���
			
//				if(str[i].charAt(j) =='b'){
				if(str[i].charAt(j) == 0x65){ //�ƽ�Ű�ڵ� 16������ 0x62�� �ҹ��� b�� ���� 0x65�� e
					System.out.println(">>"); 
					break;// str[i].charAt(j) >>> : e�̸� >>���� ������ : f����� �ȵ�(����for����) �׷��� ù��° for���������� ghi�迭����
				
				}
			}	
		}
		System.out.println("forTest()�Լ���<<<<<<<<<<<<<<<<<");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str[] = {"abc","def","ghi"}; : ��Ʈ�� �迭
		//"abc" : ���ڿ� �迭 , �� �迭�ȿ� �迭�� �ִ°�
		// �迭�� ���̴� length�ʵ��
		String str[] = {"abc","def","ghi"};
		
		
		ForTest ft = new ForTest();
		//�迭 �����͸� �ѱ� ���� �迭�� ���������� �ѱ��.
		ft.forTest(str); //���� �����͸� �Լ��� �ѱ涧�� �迭�� ���������θ� �ѱ��! �޴��Լ��Ķ���Ϳ��� ������Ÿ�԰� �迭ǥ��
		
		
		
		
		
		int strLen = str.length;
		System.out.println("strLen >>> :" + strLen);
		String str0 = str[0];
		System.out.println("str0 >>> : " + str0);
		System.out.println("str0.length() >>> : " + str0.length()); //�迭�ƴϴϱ� length()�Լ��� ���̱���
		System.out.println("str[0].charAt(0) >>> : " + str[0].charAt(0));//charAt(index)�Լ��� �̿��Ͽ� str�迭�� 0��° ���ڿ��� 0��° ���ڸ� ��������
		System.out.println("str[0].charAt(1) >>> : " + str[0].charAt(1));
		System.out.println("str[0].charAt(2) >>> : " + str[0].charAt(2));
		System.out.println("str0.charAt(0) >>> : " + str0.charAt(0));//17���ΰ� ���� �ǹ����� �������� Ȱ���Ѱ�
		System.out.println("str0.charAt(1) >>> : " + str0.charAt(1));
		System.out.println("str0.charAt(2) >>> : " + str0.charAt(2));
		
		String str1 = str[1];
		System.out.println("str1 >>> : " + str1); //str�迭�� ÷�ڹ�ȣ�� 1�� �����͸� ���ε�
		System.out.println("str1.length() >>> : " + str1.length()); //str1�� StringŸ���̸� �迭�̾��� ���������̹Ƿ� length()�Լ��� ���ڿ��Ǳ��̸� ����
		System.out.println("str1 >>> : " + str[1].charAt(0));// 
		System.out.println("str1 >>> : " + str1.charAt(0));
		String str2 = str[2];
		System.out.println("str2 >>> : " + str2);
		System.out.println("str2.length() >>> : " + str2.length()); 
		System.out.println("str2 >>> : " + str[2].charAt(2));
		System.out.println("str2 >>> : " + str2.charAt(2));
		
		

	}//main�Լ�()��

}//Ŭ������
/*
>>>>>>>>>>>>>>forTest()�Լ�����
str[0] >>> : abc
str[0].charAt(0) >>> : a
str[0].charAt(1) >>> : b
str[0].charAt(2) >>> : c
str[1] >>> : def
str[1].charAt(0) >>> : d
str[1].charAt(1) >>> : e
>>
str[2] >>> : ghi
str[2].charAt(0) >>> : g
str[2].charAt(1) >>> : h
str[2].charAt(2) >>> : i
forTest()�Լ���<<<<<<<<<<<<<<<<<
strLen >>> :3
str0 >>> : abc
str0.length() >>> : 3
str[0].charAt(0) >>> : a
str[0].charAt(1) >>> : b
str[0].charAt(2) >>> : c
str0.charAt(0) >>> : a
str0.charAt(1) >>> : b
str0.charAt(2) >>> : c
str1 >>> : def
str1.length() >>> : 3
str1 >>> : d
str1 >>> : d
str2 >>> : ghi
str2.length() >>> : 3
str2 >>> : i
str2 >>> : i
*/