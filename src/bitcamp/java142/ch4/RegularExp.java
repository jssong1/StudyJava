package bitcamp.java142.ch4;

public class RegularExp {
// ���ڰ� �ִ��� üũ�ϴ��Լ�
	
	public static boolean checkNum(String strV){
		
		boolean bool = false;
		char charInput = ' ';
		int nCnt = 0;
		
		for (int i=0; i < strV.length(); i++){
			charInput = strV.charAt(i);
			//if(charInput >= 0x30 && charInput <= 0x39){//���� 0~9 //���ڰ��ƴϸ� ī����
			//if(charInput >= 0x61 && charInput <= 0x7A){//�ҹ��� a~z //�ҹ��ھȰɸ���ī����
			if(charInput >= 0x41 && charInput <= 0x5A){//�빮�� A~Z //�ҹ��ھȰɸ���ī����
			//if(charInput >=  && charInput <= ){//Ư����ȣ @#$%&!üũ�ϱ�	
			}else{
				nCnt++;
				System.out.println("nCnt >>> : " + nCnt);
			}//if else��
		}//for��
		if (nCnt > 0){bool = false;}else{bool = true;}
		return bool;
	}//�Լ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Խ� : Regular Expression
		// Validation
		String str = "abc2d";
		boolean bool = RegularExp.checkNum(str);
		System.out.println("bool >>> : "+bool);
		
	}

}
