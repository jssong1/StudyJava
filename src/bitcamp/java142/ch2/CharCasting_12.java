package bitcamp.java142.ch2;

public class CharCasting_12 {
	//static �ٿ��� �Լ�����
	
	//�ҹ��� ASCII ĳ����
	public static void sAlpaCast(String smallAlpa){
		System.out.println("sAlpaCast(String smallAlpa) �Լ� ���� >>> ");
		System.out.println("���ο��� �ҷ��� �����Լ��� �������� smallAlpa >>> : " + smallAlpa);
		String sAlpa =smallAlpa; //�����Լ����� �ҷ��� �Լ��� �Ű������� �Լ��� ���������� �ʱ�ȭ
		int sAlpaLen = sAlpa.length(); // �����Ͱ� String�� ���� �׻� ������������ Ȯ���ؾ��ϱ� ������ ���ڿ��� ���̸� ������Ÿ��int�� ���ε�
		Boolean sBool1 = sAlpaLen>0; //�������� ���ڿ����̰� 0���� ũ�ٸ� �����Ͱ� ������ �˼��ִ�. 
		Boolean sBool2 = sAlpa !=null && sAlpaLen >0;
			System.out.println("sBool�� ������ ����Ȯ�� >>> : " + sBool1); //true�� �����Ͱ� ������ Ȯ�� if�����۰���
			System.out.println("sBool�� ������ ����Ȯ�� >>> : " + sBool2); //true�� �����Ͱ� ������ Ȯ�� if�����۰���
		if(sBool1){
			System.out.println(" if�� ���� ");
			for (int i = 0; i < sAlpaLen ; i++ ){ //for���� ����: intŸ���� i�� 0���� �ʱ�ȭ�Ͽ� 1�������ϸ� ����, sAlpaLen������ ���� ����
//				System.out.println(" for ���� >>> : " +i );// 1~25���� ��µ�
				char sChar = sAlpa.charAt(i); // �Լ� charAt()�� �̿��Ͽ� sAlpa������ ÷��i�������� ���ڸ� sChar�� ���ε�
				System.out.println("sChar >>> : " + sChar);
				
			}//for�� ��
		}//if����			
	}//�Լ� sAlpaCast()��
	
	//�빮�� ASCII ĳ����
	public static void lAlpaCast(String largeAlpa){
		//�Լ����鶧! ������ Ȯ���� �� : log ���
		System.out.println("CharCasting_12.1AlpaCast(String largeAlpa) �Լ� ���� >>> ");
		//�Լ��� �Ű����� ������ �����͸� log�� Ȯ���ϱ�
		System.out.println("largeAlpa >>> : " + largeAlpa);
		// �Լ��� �Ű������� �Լ��� ���������� �ʱ�ȭ �Ѵ�.
		String lAlpa =largeAlpa;
		// �����Ͱ� String (���ڿ��� ��쿡�� ���ڿ��� ���� �� null (�����Ͱ� ����)�� �� üũ�Ѵ�.)
		int lAlpaLen = lAlpa.length();
		Boolean lBool =lAlpa !=null && lAlpaLen >0;
		if (lBool){
			System.out.println("if�� ���� >>> :" + lBool);
			//�빮�� ASCII ĳ���� ���� �����ϱ�
			for (int i=0; i< lAlpaLen; i++){
//				System.out.println("for ����>>> :" + i);
				char lChar = lAlpa.charAt(i);
//				System.out.println("for ���� lChar >>> : " + lChar);
				System.out.println(Integer.toBinaryString(lChar)
						+" : " +(int)lChar
						+" : " + Integer.toOctalString(lChar)
						+" : 0x" + Integer.toHexString(lChar));
			}
		}else{
			System.out.println("�����Ϳ� ������ �ִ°� ���ƿ� �ٽ� �غ����� >>>:");

		}//if��		
		System.out.println("CharCasting_12.1AlpaCast(String largeAlpa) �Լ� �� >>> ");
	}//�Լ���
	
	//���� ASCII ĳ����
	public static void numberCast(String number){
		//�Լ� ������ Ȯ���� �� : log��� �α����
		System.out.println("CharCasting_12.numberCast(String number) �Լ� ���� >>>");
		//�Լ��� �Ű����� ������ �����͸� log�� Ȯ���ϱ�
		System.out.println("number >>> : " + number);
		//�Լ��� �Ű������� �Լ��� ���������� �ʱ�ȭ�Ѵ�.
		String n = number;
		//�����Ͱ� String (���ڿ��� ��쿡�� ���ڿ��� ���� �� null(�����Ͱ� ����)�� �� üũ�Ѵ�.)
		int nLen =n.length();
		if(n !=null && nLen>0){
			System.out.println("if�� ����>>>:" + n);
			//���� ASCII ĳ���� ���� �����ϱ�
			for (int i=0; i< nLen; i++){
				//System.out.println("for����>>> :" + i); Ȯ�������ϻ���
				char nChar = n.charAt(i);
				//System.out.println("for ���� nChar>>> : " + nChar);
				System.out.println(Integer.toBinaryString(nChar)
						+" : "+ (int)nChar
						+" : 0"+ Integer.toOctalString(nChar)
						+" : 0x"+ Integer.toHexString(nChar));
			}
		}else{
			System.out.println("�����Ϳ� ������ �ִ°� ���ƿ� �ٽ� �غ����� >>>:");
		}		
		System.out.println("CharCasting_12.numberCast(String numberAlpa) �Լ� �� >>>");
	};
	
	//��Ģ������ ASCII ĳ����
	//Ư����ȣ  ASCII ĳ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ASCII ĳ����
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
	
		CharCasting_12.sAlpaCast(smallAlpa);
		CharCasting_12.lAlpaCast(largeAlpa);
		CharCasting_12.numberCast(number);
		

	}

}



/*
 1. smallAlpa >>> : abcdefghijklmnopqrstuvwxyz
2. largeAlpa >>> : ABCDEFGHIJKLMNOPQRSTUVWXYZ
sAlpaCast(String smallAlpa) �Լ� ���� >>> 
���ο��� �ҷ��� �����Լ��� �������� smallAlpa >>> : abcdefghijklmnopqrstuvwxyz
sBool�� ������ ����Ȯ�� >>> : true
sBool�� ������ ����Ȯ�� >>> : true
 if�� ���� 
sChar >>> : a
sChar >>> : b
sChar >>> : c
sChar >>> : d
sChar >>> : e
sChar >>> : f
sChar >>> : g
sChar >>> : h
sChar >>> : i
sChar >>> : j
sChar >>> : k
sChar >>> : l
sChar >>> : m
sChar >>> : n
sChar >>> : o
sChar >>> : p
sChar >>> : q
sChar >>> : r
sChar >>> : s
sChar >>> : t
sChar >>> : u
sChar >>> : v
sChar >>> : w
sChar >>> : x
sChar >>> : y
sChar >>> : z
CharCasting_12.1AlpaCast(String largeAlpa) �Լ� ���� >>> 
largeAlpa >>> : ABCDEFGHIJKLMNOPQRSTUVWXYZ
if�� ���� >>> :true
1000001 : 65 : 101 : 0x41
1000010 : 66 : 102 : 0x42
1000011 : 67 : 103 : 0x43
1000100 : 68 : 104 : 0x44
1000101 : 69 : 105 : 0x45
1000110 : 70 : 106 : 0x46
1000111 : 71 : 107 : 0x47
1001000 : 72 : 110 : 0x48
1001001 : 73 : 111 : 0x49
1001010 : 74 : 112 : 0x4a
1001011 : 75 : 113 : 0x4b
1001100 : 76 : 114 : 0x4c
1001101 : 77 : 115 : 0x4d
1001110 : 78 : 116 : 0x4e
1001111 : 79 : 117 : 0x4f
1010000 : 80 : 120 : 0x50
1010001 : 81 : 121 : 0x51
1010010 : 82 : 122 : 0x52
1010011 : 83 : 123 : 0x53
1010100 : 84 : 124 : 0x54
1010101 : 85 : 125 : 0x55
1010110 : 86 : 126 : 0x56
1010111 : 87 : 127 : 0x57
1011000 : 88 : 130 : 0x58
1011001 : 89 : 131 : 0x59
1011010 : 90 : 132 : 0x5a
CharCasting_12.1AlpaCast(String largeAlpa) �Լ� �� >>> 
CharCasting_12.numberCast(String number) �Լ� ���� >>>
number >>> : 0123456789
if�� ����>>>:0123456789
110000 : 48 : 060 : 0x30
110001 : 49 : 061 : 0x31
110010 : 50 : 062 : 0x32
110011 : 51 : 063 : 0x33
110100 : 52 : 064 : 0x34
110101 : 53 : 065 : 0x35
110110 : 54 : 066 : 0x36
110111 : 55 : 067 : 0x37
111000 : 56 : 070 : 0x38
111001 : 57 : 071 : 0x39
CharCasting_12.numberCast(String numberAlpa) �Լ� �� >>>

 * */