package bitcamp.java142.ch2;

public class CharCasting_1 {
	//�������������ľ�����	
	//�ҹ��� ASCII ĳ����	
	public void sAlpaCast(String smallAlpa){ //�������� ���� �Լ��� sAlpaCast�� StringŸ���� smallAlpa���� �ִ´�.
		//�����Ͱ� �ִ��� Ȯ���ϱ�
		int sLen = smallAlpa.length(); // ��Ʈ��Ŭ������ length()�Լ��� �̿��Ͽ� �����Ͱ� �ִ��� Ȯ���ϱ� ���ϰ��� int, static�����Ƿ� ��������.�Լ���();
		boolean sBool = sLen > 0; // �����Ͱ� �ִٸ� ���ڿ��Ǳ��̰� 0���� Ŭ ������ ���
		System.out.println("3. sBool >>> : "+sBool); //true ���
		if(sBool){ // if������ true�� ���� ����ȴ�.
			for (int i=0; i< sLen; i++){ //for�ݺ��� (0���� sLen������ 1�������ϸ鼭 ����)
				char sChar = smallAlpa.charAt(i); // ���ڿ�������Ÿ�� char�� ������ sChar�� ����, �Լ� charAt(int index)�� �̿��Ͽ� smallAlpa������ i��° ÷�ڹ��ڿ��� ���ϰ����� ���ε�
				//String Ŭ������ charAt�Լ�: ���ϰ��� char, static�����Ƿ� ��������.�Լ���(); int index ÷�� �� for�����ǿ��� �ʱ�ȭ�� i�� ���� �ϳ��� ����ȴ�.
				System.out.print(Integer.toBinaryString(sChar)); //���:���� schar�� 2���� (toBinaryString(int i)�Լ� �̿�/static �����Ƿ� Ŭ������.�Լ���()/���ϰ��� string) 
				System.out.print(" : " + (int)sChar); //���: ���� schar�� �޾� �ƽ�Ű�ڵ��� ���ڿ��� 10���� int�� ����ȯ 
				System.out.print(" : 0" + Integer.toOctalString(sChar));//���:���� schar�� 2���� (toOctalString(int i)�Լ� �̿�/static �����Ƿ� Ŭ������.�Լ���()/���ϰ��� string) 
				System.out.println(" : 0x" +Integer.toHexString(sChar));//���:���� schar�� 2���� (toHexString(int i)�Լ� �̿�/static �����Ƿ� Ŭ������.�Լ���()/���ϰ��� string) 
			}
		} 		
	};
	
	//�빮�� ASCII ĳ����
	public void lAlpaCast(String largeAlpa){
		//������Ȯ��
		int lLen = largeAlpa.length();// ��Ʈ��Ŭ���� length()�Լ��� �̿��Ͽ� ���ڿ�largeAlpa�� ���̼��� �ʱ�ȭ; static�����Ƿ�  ��������.�Լ���
		boolean lBool = lLen > 0; // �����Ͱ� �ִ��� Ȯ���ϱ� ���� ������Ÿ���� boolean�� ������ lBool�� �����Ͽ� lLen�� ���̼��� 0���� ū�� Ȯ��;
		System.out.println("lBool >>> : " + lBool);//true���� ���
		if(lBool){//���ǹ�lBool�� true��� ������ �����Ѵ�.
			for(int i=0; i<lLen; i++){ //for�ݺ����� ����: int i�� 0���� 1�������ϸ鼭 lLen������ ����
				char lChar = largeAlpa.charAt(i);// ���ڿ�������Ÿ�� char�� ������ lChar�� ������, charAt(int index)�Լ��� �̿��Ͽ� largeAlpa������ i��° ÷�� ���ڿ����� ���ϰ����� ���ε�
//				System.out.println("lChar Ȯ�� >>> : " + lChar); // A~Z���
				/* lChar Ȯ�� >>> : A
				1000001 : 65 : 0101 : 0x41
				lChar Ȯ�� >>> : B
				1000010 : 66 : 0102 : 0x42
				lChar Ȯ�� >>> : C 
				�̷������� ���������ͻ���*/
				System.out.print(Integer.toBinaryString(lChar)); //���:���� lChar�� 2���� (toBinaryString(int i)�Լ� �̿�/static �����Ƿ� Ŭ������.�Լ���()/���ϰ��� string) 
				System.out.print(" : " + (int)lChar); //���: ���ں��� lchar�� �޾� �ƽ�Ű�ڵ��� ���ڿ��� 10���� int�� ����ȯ 
				System.out.print(" : 0" + Integer.toOctalString(lChar));//���:���� lChar�� 2���� (toOctalString(int i)�Լ� �̿�/static �����Ƿ� Ŭ������.�Լ���()/���ϰ��� string) 
				System.out.println(" : 0x" +Integer.toHexString(lChar));//���:���� lChar�� 2���� (toHexString(int i)�Լ� �̿�/static �����Ƿ� Ŭ������.�Լ���()/���ϰ��� string)
			}
		}
	};
	
	//���� ASCII ĳ����
	public void numberCast(String number){ //�Լ��� numberCast�� ���������� �������� StringŸ���� ������ ���ε��Ѵ�.
		//������Ȯ��
		String nnum = number;// �����Լ��� ����,�Լ��� �Ű������� �Լ��� ���������� �ʱ�ȭ �Ѵ�.
		int numLen = nnum.length(); //���ڿ��� ���̸� ������Ÿ��int�� ������ numLen���� ���� �޴´�. 
		boolean numBool = numLen >0; // ���ڿ��� ���̰� 0���� ��� �����Ͱ� Ȯ���� �ߵȰ�
				System.out.println("numBool�� ������ Ȯ�� >>> : " + numBool); // true ���->Ȯ����
		if(numBool){//if������ true���� ���� 
			for(int i=0 ; i< numLen ; i++){ //for�� ���� (int i�� 0���� 1�� �����Ͽ� numLen������ ����) ; int i ��� �ʱ�ȭ �����ֱ�
				char nnChar = nnum.charAt(i); //charAt(index)�Լ��� �̿��Ͽ� ������ ���ڸ� nnChar������ ���ε� 
//				System.out.println("nnChar Ȯ�� >>> :" + nnChar); // 0~9���
				System.out.println(Integer.toBinaryString(nnChar) // ���: ����nnChar�� 2���� �ƽ�Ű�ڵ�� ����ȯ ĳ���� 
						+" : " +(int)nnChar // ���: ���ں��� nnChar�� �޾� 10���� �ƽ�Ű�ڵ�� ����ȯ ĳ����
						+" : " + Integer.toOctalString(nnChar) // ��� : ���� ����nnChar�� 8���� �ƽ�Ű �ڵ�� ����ȯ ĳ����
						+" : 0x" + Integer.toHexString(nnChar)); // ��� : ���� ���� nnChar�� 16���� �ƽ�Ű �ڵ�� ����ȯ ĳ����
			}//for ��			
		}//if ��		
	}; //numberCast �Լ� ��
	
	//��Ģ������ ASCII ĳ����
	public void operCast(String oper){//���ϰ��� ���� �Լ��� operCast���� StringŸ���� �Ű����� oper�� ���ε��Ѵ�.
		String operC = oper; //�����Լ����� �ʱ�ȭ�Ͽ� �ҷ��� �Լ��� �Ű����� oper�� �Լ��� ���������� �ʱ�ȭ �Ѵ�.
//				System.out.println("operC Ȯ�� >>> : " + operC ); // +-*/ ��µ�
		int operLen = operC.length();  // �����Ͱ� �ִ��� Ȯ���ϱ� ���� length()�Լ� �̿�. operC���ڿ��� ���̸� ��Ʈ������Ÿ������ ���ε��Ѵ�.
//				System.out.println("operLen Ȯ�� >>> : " + operLen );// 4 ��µ�
		boolean operBool = operLen > 0; // �����Ͱ� �ִ��� Ȯ���ϱ� ����  ���ڿ��� ���̰� 0���� ū�� Ȯ��
				System.out.println("operBool Ȯ�� >>> : " + operBool);// true ��µ�
		if(operBool){ //if�� ������ true
			for (int i=0; i < operLen; i++){ //for�� ��Ʈi�� 0���� �ʱ�ȭ�Ͽ� i�� operLen������ 1�������ϸ� ���� 
				char operChar = operC.charAt(i); //������Ÿ���� char�� ������ operChar�� �����Ͽ� for������ ����Ǵ� i���� ���ε��Ͽ� operC������ ���ڿ���÷�ڹ�ȣ�� ���ڸ� ����
//				System.out.println(" operChar Ȯ�� " + operChar ); //������� + - * / ��µ�
				System.out.print(Integer.toBinaryString(operChar)); //��µ� String���� operC�� ���ڸ� �ƽ�Ű�ڵ� 2�������� ĳ����,����ȯ
				System.out.print(" : " + (int)operChar); //��µ� String���� operC�� ���ڸ� �ƽ�Ű�ڵ� 10�������� ĳ����,����ȯ
				System.out.print(" : 0" + Integer.toOctalString(operChar)); //��µ� String���� operC�� ���ڸ� �ƽ�Ű�ڵ� 8�������� ĳ����,����ȯ
				System.out.println(" : 0X" + Integer.toHexString(operChar)); //��µ� String���� operC�� ���ڸ� �ƽ�Ű�ڵ� 16�������� ĳ����,����ȯ
			}//for��
		}//if��
	}; //operCast �Լ���
	
	//Ư����ȣ  ASCII ĳ����
	public void speCharCast(String speChar){//���������� �Լ��� speCharCast�� �����Ͽ� ������ string Ÿ���� ���� speChar�� �Ű������� �ҷ��� �Լ�����
		String spe = speChar; //�����Լ��� ������������ speChar�� Ŭ�����Լ��� �Ű������� �ƴ� �Լ��� ���������� �ʱ�ȭ
		int speLen = spe.length(); //length()�Լ��� �̿��Ͽ� ����spe�� ���ڿ����̸� intŸ������ ���ε��Ѵ�.
		boolean speBool = speLen >0; // �����Ͱ� ����� �Ѿ�Դٸ� speLen�� ���̰� 0���� Ŭ���̴�.
		System.out.println("Boolean speBoolȮ�� >>> : " + speBool); //true�� ��µ�
		
		if(speBool){//if���� ������ true�� ������ �������
			for(int i = 0; i < speLen; i++){ //for���� ���� : ������Ÿ���� int�� ����i�� ���� 0���� �ʱ�ȭ�Ͽ� 1�������ݺ�����, ���� speLen�� ������ �۴ٸ� ������ ����
			char speC = spe.charAt(i); //������Ÿ���� char�� ������ speC�� for������ ������� ÷�ڿ� �´º���spe�� ���� ���ε�
//			System.out.println("char speC Ȯ�� >>> : "+ speC); // ������� ���پ� ~,!,@,#,$,%,^,&,*,(,),_ �� ��µ�
			System.out.print(Integer.toBinaryString(speC)); //��µ� String���� spe�� ���ڸ� �ƽ�Ű�ڵ� 2�������� ĳ����,����ȯ
			System.out.print(" : " +(int)speC); //��µ� String���� spe�� ���ڸ� �ƽ�Ű�ڵ� 10�������� ĳ����,����ȯ
			System.out.print(" : 0" + Integer.toOctalString(speC));//��µ� String���� spe�� ���ڸ� �ƽ�Ű�ڵ� 8�������� ĳ����,����ȯ
			System.out.println(" : 0X" + Integer.toHexString(speC));//��µ� String���� spe�� ���ڸ� �ƽ�Ű�ڵ� 16�������� ĳ����,����ȯ
			}// for��
		}//if ��
		
		
	};// speCharCast �Լ� ��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����ڴ�ҹ��ڸ� ASCII�� ��ȯ�ϱ�
		// �Լ��� �̿��ؼ�
		// sAlpaCast() : �ҹ��� ASCII ĳ����
		// lAlpaCast() : �빮�� ASCII ĳ����
		// numberCast() : ���� ASCII ĳ����
		// operCast() : ��Ģ������ ASCII ĳ����
		// speCharCast() : Ư����ȣ  ASCII ĳ����
		
		String alpa = "abcdeFGHIJKlmnopQRSTUVwxyz"; //StringŸ���� ������ alpa�� ���� ���ڿ��ʱ�ȭ
		String smallAlpa = alpa.toLowerCase(); //StringŬ������ toLowerCase()�Լ��� �̿��Ͽ� ���ڿ��� �ҹ��ڷ� ���������. ���ϰ�String, static�����Ƿ� ��������.�Լ���();
		String largeAlpa = alpa.toUpperCase();//StringŬ������ toUppercase()�Լ��� �̿��Ͽ� ���ڿ��� �빮�ڷ� ���������. ���ϰ�String, static�����Ƿ� ��������.�Լ���();
		System.out.println("1. smallAlpa >>> : " + smallAlpa);
		System.out.println("2. largeAlpa >>> : " + largeAlpa);
		String number = "0123456789";
		String oper = "+-*/";
		String speChar = "~!@#$%^&*()_";
	
		CharCasting_1 cc_1 = new CharCasting_1(); //�Լ� sAlpaCast()�� ����ϱ����� ���������Ŭ������ ������ cc_1�� �����Ͽ� �ν��Ͻ��Ѵ�.
		cc_1.sAlpaCast(smallAlpa); // ���ϰ��� ���� �Լ� sAlpaCast�� �Ű����� smallAlpa�� �־� �ҷ����� invoke 
		cc_1.lAlpaCast(largeAlpa); // ���ϰ��� ���� �Լ� lAlpaCast�� �Ű����� largeAlpa�� �־� �ҷ����� invoke
		cc_1.numberCast(number); //�������� ���� �Լ� numberCast�� �Ű����� number�� �־� �ҷ����� invoke (number�� main���� ���������� �ʱ�ȭ�ؼ� �޾ƿ°� �ٸ� �Ű��������ϸ�ȵ�)
		cc_1.operCast(oper);// �������� ���� �Լ� operCast�� �Ű����� oper�� �־� �ҷ����� invoke (oper�� main���� ���������� �ʱ�ȭ�Ѱ� �ҷ���)
		cc_1.speCharCast(speChar); //�������� ���� �Լ� speCharCast�� �Ű����� speChar�� �־� �ҷ����� invoke (speChar�� main���� ���������� �ʱ�ȭ�Ѱ� �ҷ���)
	}

}


/*
1. smallAlpa >>> : abcdefghijklmnopqrstuvwxyz
2. largeAlpa >>> : ABCDEFGHIJKLMNOPQRSTUVWXYZ
3. sBool >>> : true
1100001 : 97 : 0141 : 0x61
1100010 : 98 : 0142 : 0x62
1100011 : 99 : 0143 : 0x63
1100100 : 100 : 0144 : 0x64
1100101 : 101 : 0145 : 0x65
1100110 : 102 : 0146 : 0x66
1100111 : 103 : 0147 : 0x67
1101000 : 104 : 0150 : 0x68
1101001 : 105 : 0151 : 0x69
1101010 : 106 : 0152 : 0x6a
1101011 : 107 : 0153 : 0x6b
1101100 : 108 : 0154 : 0x6c
1101101 : 109 : 0155 : 0x6d
1101110 : 110 : 0156 : 0x6e
1101111 : 111 : 0157 : 0x6f
1110000 : 112 : 0160 : 0x70
1110001 : 113 : 0161 : 0x71
1110010 : 114 : 0162 : 0x72
1110011 : 115 : 0163 : 0x73
1110100 : 116 : 0164 : 0x74
1110101 : 117 : 0165 : 0x75
1110110 : 118 : 0166 : 0x76
1110111 : 119 : 0167 : 0x77
1111000 : 120 : 0170 : 0x78
1111001 : 121 : 0171 : 0x79
1111010 : 122 : 0172 : 0x7a
lBool >>> : true
1000001 : 65 : 0101 : 0x41
1000010 : 66 : 0102 : 0x42
1000011 : 67 : 0103 : 0x43
1000100 : 68 : 0104 : 0x44
1000101 : 69 : 0105 : 0x45
1000110 : 70 : 0106 : 0x46
1000111 : 71 : 0107 : 0x47
1001000 : 72 : 0110 : 0x48
1001001 : 73 : 0111 : 0x49
1001010 : 74 : 0112 : 0x4a
1001011 : 75 : 0113 : 0x4b
1001100 : 76 : 0114 : 0x4c
1001101 : 77 : 0115 : 0x4d
1001110 : 78 : 0116 : 0x4e
1001111 : 79 : 0117 : 0x4f
1010000 : 80 : 0120 : 0x50
1010001 : 81 : 0121 : 0x51
1010010 : 82 : 0122 : 0x52
1010011 : 83 : 0123 : 0x53
1010100 : 84 : 0124 : 0x54
1010101 : 85 : 0125 : 0x55
1010110 : 86 : 0126 : 0x56
1010111 : 87 : 0127 : 0x57
1011000 : 88 : 0130 : 0x58
1011001 : 89 : 0131 : 0x59
1011010 : 90 : 0132 : 0x5a
numBool�� ������ Ȯ�� >>> : true
110000 : 48 : 60 : 0x30
110001 : 49 : 61 : 0x31
110010 : 50 : 62 : 0x32
110011 : 51 : 63 : 0x33
110100 : 52 : 64 : 0x34
110101 : 53 : 65 : 0x35
110110 : 54 : 66 : 0x36
110111 : 55 : 67 : 0x37
111000 : 56 : 70 : 0x38
111001 : 57 : 71 : 0x39
operBool Ȯ�� >>> : true
101011 : 43 : 053 : 0X2b
101101 : 45 : 055 : 0X2d
101010 : 42 : 052 : 0X2a
101111 : 47 : 057 : 0X2f
Boolean speBoolȮ�� >>> : true
1111110 : 126 : 0176 : 0X7e
100001 : 33 : 041 : 0X21
1000000 : 64 : 0100 : 0X40
100011 : 35 : 043 : 0X23
100100 : 36 : 044 : 0X24
100101 : 37 : 045 : 0X25
1011110 : 94 : 0136 : 0X5e
100110 : 38 : 046 : 0X26
101010 : 42 : 052 : 0X2a
101000 : 40 : 050 : 0X28
101001 : 41 : 051 : 0X29
1011111 : 95 : 0137 : 0X5f
*/