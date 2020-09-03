package bitcamp.java142.ch2;

public class CharCasting_1 {
	//리턴형없는형식쓸거임	
	//소문자 ASCII 캐스팅	
	public void sAlpaCast(String smallAlpa){ //리턴형이 없는 함수명 sAlpaCast에 String타입의 smallAlpa값을 넣는다.
		//데이터가 있는지 확인하기
		int sLen = smallAlpa.length(); // 스트링클래스의 length()함수를 이용하여 데이터가 있는지 확인하기 리턴값은 int, static없으므로 참조변수.함수명();
		boolean sBool = sLen > 0; // 데이터가 있다면 문자열의길이가 0보다 클 것임을 기대
		System.out.println("3. sBool >>> : "+sBool); //true 출력
		if(sBool){ // if문블럭은 true일 때만 수행된다.
			for (int i=0; i< sLen; i++){ //for반복문 (0부터 sLen값까지 1씩증가하면서 수행)
				char sChar = smallAlpa.charAt(i); // 문자열데이터타입 char의 변수명 sChar를 선언, 함수 charAt(int index)을 이용하여 smallAlpa변수의 i번째 첨자문자열을 리턴값으로 바인딩
				//String 클래스의 charAt함수: 리턴값은 char, static없으므로 참조변수.함수명(); int index 첨자 는 for문조건에서 초기화한 i를 통해 하나씩 수행된다.
				System.out.print(Integer.toBinaryString(sChar)); //출력:변수 schar의 2진수 (toBinaryString(int i)함수 이용/static 있으므로 클래스명.함수명()/리턴값은 string) 
				System.out.print(" : " + (int)sChar); //출력: 변수 schar를 받아 아스키코드의 문자열을 10진수 int로 형변환 
				System.out.print(" : 0" + Integer.toOctalString(sChar));//출력:변수 schar의 2진수 (toOctalString(int i)함수 이용/static 있으므로 클래스명.함수명()/리턴값은 string) 
				System.out.println(" : 0x" +Integer.toHexString(sChar));//출력:변수 schar의 2진수 (toHexString(int i)함수 이용/static 있으므로 클래스명.함수명()/리턴값은 string) 
			}
		} 		
	};
	
	//대문자 ASCII 캐스팅
	public void lAlpaCast(String largeAlpa){
		//데이터확인
		int lLen = largeAlpa.length();// 스트링클래스 length()함수를 이용하여 문자열largeAlpa의 길이수를 초기화; static없으므로  참조변수.함수명
		boolean lBool = lLen > 0; // 데이터가 있는지 확인하기 위해 데이터타입이 boolean인 변수명 lBool을 선언하여 lLen의 길이수가 0보다 큰지 확인;
		System.out.println("lBool >>> : " + lBool);//true값을 기대
		if(lBool){//조건문lBool이 true라면 다음을 수행한다.
			for(int i=0; i<lLen; i++){ //for반복문의 조건: int i가 0부터 1씩증가하면서 lLen값까지 수행
				char lChar = largeAlpa.charAt(i);// 문자열데이터타입 char의 변수명 lChar를 선언함, charAt(int index)함수를 이용하여 largeAlpa변수의 i번째 첨자 문자열를을 리턴값으로 바인딩
//				System.out.println("lChar 확인 >>> : " + lChar); // A~Z출력
				/* lChar 확인 >>> : A
				1000001 : 65 : 0101 : 0x41
				lChar 확인 >>> : B
				1000010 : 66 : 0102 : 0x42
				lChar 확인 >>> : C 
				이런식으로 인터프리터산출*/
				System.out.print(Integer.toBinaryString(lChar)); //출력:변수 lChar의 2진수 (toBinaryString(int i)함수 이용/static 있으므로 클래스명.함수명()/리턴값은 string) 
				System.out.print(" : " + (int)lChar); //출력: 문자변수 lchar를 받아 아스키코드의 문자열을 10진수 int로 형변환 
				System.out.print(" : 0" + Integer.toOctalString(lChar));//출력:변수 lChar의 2진수 (toOctalString(int i)함수 이용/static 있으므로 클래스명.함수명()/리턴값은 string) 
				System.out.println(" : 0x" +Integer.toHexString(lChar));//출력:변수 lChar의 2진수 (toHexString(int i)함수 이용/static 있으므로 클래스명.함수명()/리턴값은 string)
			}
		}
	};
	
	//숫자 ASCII 캐스팅
	public void numberCast(String number){ //함수명 numberCast는 리턴형없는 형식으로 String타입의 변수를 바인딩한다.
		//데이터확인
		String nnum = number;// 메인함수의 변수,함수의 매개변수를 함수내 지역변수로 초기화 한다.
		int numLen = nnum.length(); //문자열의 길이를 데이터타입int인 변수명 numLen으로 값을 받는다. 
		boolean numBool = numLen >0; // 문자열의 길이가 0보다 길면 데이터가 확인이 잘된것
				System.out.println("numBool로 데이터 확인 >>> : " + numBool); // true 기대->확인함
		if(numBool){//if문블럭이 true여야 수행 
			for(int i=0 ; i< numLen ; i++){ //for문 시작 (int i가 0부터 1씩 증가하여 numLen값까지 수행) ; int i 라고 초기화 시켜주기
				char nnChar = nnum.charAt(i); //charAt(index)함수를 이용하여 가져온 문자를 nnChar변수에 바인딩 
//				System.out.println("nnChar 확인 >>> :" + nnChar); // 0~9출력
				System.out.println(Integer.toBinaryString(nnChar) // 출력: 문자nnChar의 2진수 아스키코드로 형변환 캐스팅 
						+" : " +(int)nnChar // 출력: 문자변수 nnChar을 받아 10진수 아스키코드로 형변환 캐스팅
						+" : " + Integer.toOctalString(nnChar) // 출력 : 문자 변수nnChar의 8진수 아스키 코드로 형변환 캐스팅
						+" : 0x" + Integer.toHexString(nnChar)); // 출력 : 문자 변수 nnChar의 16진수 아스키 코드로 형변환 캐스팅
			}//for 끝			
		}//if 끝		
	}; //numberCast 함수 끝
	
	//사칙연산자 ASCII 캐스팅
	public void operCast(String oper){//리턴값이 없는 함수명 operCast선언 String타입의 매개변수 oper을 바인딩한다.
		String operC = oper; //메인함수에서 초기화하여 불러온 함수의 매개변수 oper를 함수내 지역변수로 초기화 한다.
//				System.out.println("operC 확인 >>> : " + operC ); // +-*/ 출력됨
		int operLen = operC.length();  // 데이터가 있는지 확인하기 위해 length()함수 이용. operC문자열의 길이를 인트데이터타입으로 바인딩한다.
//				System.out.println("operLen 확인 >>> : " + operLen );// 4 출력됨
		boolean operBool = operLen > 0; // 데이터가 있는지 확인하기 위해  문자열의 길이가 0보다 큰지 확인
				System.out.println("operBool 확인 >>> : " + operBool);// true 출력됨
		if(operBool){ //if의 조건은 true
			for (int i=0; i < operLen; i++){ //for문 인트i를 0으로 초기화하여 i가 operLen값까지 1씩증가하며 실행 
				char operChar = operC.charAt(i); //데이터타입이 char인 변수명 operChar를 선언하여 for문에서 실행되는 i값을 바인딩하여 operC변수의 문자열의첨자번호의 문자를 산출
//				System.out.println(" operChar 확인 " + operChar ); //순서대로 + - * / 출력됨
				System.out.print(Integer.toBinaryString(operChar)); //출력된 String변수 operC의 문자를 아스키코드 2진법으로 캐스팅,형변환
				System.out.print(" : " + (int)operChar); //출력된 String변수 operC의 문자를 아스키코드 10진법으로 캐스팅,형변환
				System.out.print(" : 0" + Integer.toOctalString(operChar)); //출력된 String변수 operC의 문자를 아스키코드 8진법으로 캐스팅,형변환
				System.out.println(" : 0X" + Integer.toHexString(operChar)); //출력된 String변수 operC의 문자를 아스키코드 16진법으로 캐스팅,형변환
			}//for끝
		}//if끝
	}; //operCast 함수끝
	
	//특수기호  ASCII 캐스팅
	public void speCharCast(String speChar){//리턴형없는 함수명 speCharCast를 선언하여 메인의 string 타입의 변수 speChar를 매개변수로 불러서 함수시작
		String spe = speChar; //메인함수의 지역변수였던 speChar를 클래스함수의 매개변수가 아닌 함수의 지역변수로 초기화
		int speLen = spe.length(); //length()함수를 이용하여 변수spe의 문자열길이를 int타입으로 바인딩한다.
		boolean speBool = speLen >0; // 데이터가 제대로 넘어왔다면 speLen의 길이가 0보다 클것이다.
		System.out.println("Boolean speBool확인 >>> : " + speBool); //true가 출력됨
		
		if(speBool){//if문의 조건이 true기 때문에 수행시작
			for(int i = 0; i < speLen; i++){ //for문을 시작 : 데이터타입이 int인 변수i의 값을 0으로 초기화하여 1씩증가반복수행, 값이 speLen의 값보다 작다면 다음을 수행
			char speC = spe.charAt(i); //데이터타입이 char인 변수명 speC에 for문에서 수행받은 첨자에 맞는변수spe의 값을 바인딩
//			System.out.println("char speC 확인 >>> : "+ speC); // 순서대로 한줄씩 ~,!,@,#,$,%,^,&,*,(,),_ 이 출력됨
			System.out.print(Integer.toBinaryString(speC)); //출력된 String변수 spe의 문자를 아스키코드 2진법으로 캐스팅,형변환
			System.out.print(" : " +(int)speC); //출력된 String변수 spe의 문자를 아스키코드 10진법으로 캐스팅,형변환
			System.out.print(" : 0" + Integer.toOctalString(speC));//출력된 String변수 spe의 문자를 아스키코드 8진법으로 캐스팅,형변환
			System.out.println(" : 0X" + Integer.toHexString(speC));//출력된 String변수 spe의 문자를 아스키코드 16진법으로 캐스팅,형변환
			}// for끝
		}//if 끝
		
		
	};// speCharCast 함수 끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영문자대소문자를 ASCII로 변환하기
		// 함수를 이용해서
		// sAlpaCast() : 소문자 ASCII 캐스팅
		// lAlpaCast() : 대문자 ASCII 캐스팅
		// numberCast() : 숫자 ASCII 캐스팅
		// operCast() : 사칙연산자 ASCII 캐스팅
		// speCharCast() : 특수기호  ASCII 캐스팅
		
		String alpa = "abcdeFGHIJKlmnopQRSTUVwxyz"; //String타입의 변수명 alpa를 선언 문자열초기화
		String smallAlpa = alpa.toLowerCase(); //String클래스의 toLowerCase()함수를 이용하여 문자열을 소문자로 변경시켜줌. 리턴값String, static없으므로 참조변수.함수명();
		String largeAlpa = alpa.toUpperCase();//String클래스의 toUppercase()함수를 이용하여 문자열을 대문자로 변경시켜줌. 리턴값String, static없으므로 참조변수.함수명();
		System.out.println("1. smallAlpa >>> : " + smallAlpa);
		System.out.println("2. largeAlpa >>> : " + largeAlpa);
		String number = "0123456789";
		String oper = "+-*/";
		String speChar = "~!@#$%^&*()_";
	
		CharCasting_1 cc_1 = new CharCasting_1(); //함수 sAlpaCast()를 사용하기위해 사용자정의클래스를 변수명 cc_1을 선언하여 인스턴스한다.
		cc_1.sAlpaCast(smallAlpa); // 리턴값이 없는 함수 sAlpaCast에 매개변수 smallAlpa를 넣어 불러오기 invoke 
		cc_1.lAlpaCast(largeAlpa); // 리턴값이 없는 함수 lAlpaCast에 매개변수 largeAlpa를 넣어 불러오기 invoke
		cc_1.numberCast(number); //리턴형이 없는 함수 numberCast에 매개변수 number를 넣어 불러오기 invoke (number은 main에서 지역변수로 초기화해서 받아온거 다른 매개변수명하면안됨)
		cc_1.operCast(oper);// 리턴형이 없는 함수 operCast에 매개변수 oper를 넣어 불러오기 invoke (oper은 main에서 지역변수로 초기화한거 불러옴)
		cc_1.speCharCast(speChar); //리턴형이 없는 함수 speCharCast에 매개변수 speChar를 넣어 불러오기 invoke (speChar는 main에서 지역변수로 초기화한거 불러옴)
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
numBool로 데이터 확인 >>> : true
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
operBool 확인 >>> : true
101011 : 43 : 053 : 0X2b
101101 : 45 : 055 : 0X2d
101010 : 42 : 052 : 0X2a
101111 : 47 : 057 : 0X2f
Boolean speBool확인 >>> : true
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