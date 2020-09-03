package bitcamp.java142.ch2;

public class CharCasting_12 {
	//static 붙여서 함수시작
	
	//소문자 ASCII 캐스팅
	public static void sAlpaCast(String smallAlpa){
		System.out.println("sAlpaCast(String smallAlpa) 함수 시작 >>> ");
		System.out.println("메인에서 불러온 메인함수의 지역변수 smallAlpa >>> : " + smallAlpa);
		String sAlpa =smallAlpa; //메인함수에서 불러온 함수의 매개변수를 함수내 지역변수로 초기화
		int sAlpaLen = sAlpa.length(); // 데이터가 String일 때는 항상 데이터유무를 확인해야하기 때문에 문자열의 길이를 데이터타입int로 바인딩
		Boolean sBool1 = sAlpaLen>0; //데이터의 문자열길이가 0보다 크다면 데이터가 있음을 알수있다. 
		Boolean sBool2 = sAlpa !=null && sAlpaLen >0;
			System.out.println("sBool로 데이터 유무확인 >>> : " + sBool1); //true로 데이터가 있음을 확인 if문시작가능
			System.out.println("sBool로 데이터 유무확인 >>> : " + sBool2); //true로 데이터가 있음을 확인 if문시작가능
		if(sBool1){
			System.out.println(" if문 진입 ");
			for (int i = 0; i < sAlpaLen ; i++ ){ //for문을 수행: int타입의 i를 0으로 초기화하여 1씩증가하며 수행, sAlpaLen값보다 작을 때만
//				System.out.println(" for 진입 >>> : " +i );// 1~25까지 출력됨
				char sChar = sAlpa.charAt(i); // 함수 charAt()을 이용하여 sAlpa변수의 첨자i값에따라 문자를 sChar에 바인딩
				System.out.println("sChar >>> : " + sChar);
				
			}//for문 끝
		}//if문끝			
	}//함수 sAlpaCast()끝
	
	//대문자 ASCII 캐스팅
	public static void lAlpaCast(String largeAlpa){
		//함수만들때! 시작을 확인할 것 : log 사용
		System.out.println("CharCasting_12.1AlpaCast(String largeAlpa) 함수 시작 >>> ");
		//함수에 매개변수 있으면 데이터를 log로 확인하기
		System.out.println("largeAlpa >>> : " + largeAlpa);
		// 함수의 매개변수를 함수내 지역변수로 초기화 한다.
		String lAlpa =largeAlpa;
		// 데이터가 String (문자열일 경우에는 문자열의 길이 및 null (데이터가 없음)을 꼭 체크한다.)
		int lAlpaLen = lAlpa.length();
		Boolean lBool =lAlpa !=null && lAlpaLen >0;
		if (lBool){
			System.out.println("if문 진입 >>> :" + lBool);
			//대문자 ASCII 캐스팅 로직 구현하기
			for (int i=0; i< lAlpaLen; i++){
//				System.out.println("for 진입>>> :" + i);
				char lChar = lAlpa.charAt(i);
//				System.out.println("for 진입 lChar >>> : " + lChar);
				System.out.println(Integer.toBinaryString(lChar)
						+" : " +(int)lChar
						+" : " + Integer.toOctalString(lChar)
						+" : 0x" + Integer.toHexString(lChar));
			}
		}else{
			System.out.println("데이터에 문제가 있는것 같아요 다시 해보세요 >>>:");

		}//if끝		
		System.out.println("CharCasting_12.1AlpaCast(String largeAlpa) 함수 끝 >>> ");
	}//함수끝
	
	//숫자 ASCII 캐스팅
	public static void numberCast(String number){
		//함수 시작을 확인할 것 : log사용 로그찍기
		System.out.println("CharCasting_12.numberCast(String number) 함수 시작 >>>");
		//함수에 매개변수 있으면 데이터를 log로 확인하기
		System.out.println("number >>> : " + number);
		//함수의 매개변수를 함수내 지역변수로 초기화한다.
		String n = number;
		//데이터가 String (문자열일 경우에는 문자열의 길이 및 null(데이터가 없음)을 꼭 체크한다.)
		int nLen =n.length();
		if(n !=null && nLen>0){
			System.out.println("if문 진입>>>:" + n);
			//숫자 ASCII 캐스팅 로직 구현하기
			for (int i=0; i< nLen; i++){
				//System.out.println("for진입>>> :" + i); 확인했으니생략
				char nChar = n.charAt(i);
				//System.out.println("for 진입 nChar>>> : " + nChar);
				System.out.println(Integer.toBinaryString(nChar)
						+" : "+ (int)nChar
						+" : 0"+ Integer.toOctalString(nChar)
						+" : 0x"+ Integer.toHexString(nChar));
			}
		}else{
			System.out.println("데이터에 문제가 있는것 같아요 다시 해보세요 >>>:");
		}		
		System.out.println("CharCasting_12.numberCast(String numberAlpa) 함수 끝 >>>");
	};
	
	//사칙연산자 ASCII 캐스팅
	//특수기호  ASCII 캐스팅
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 ASCII 캐스팅
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
	
		CharCasting_12.sAlpaCast(smallAlpa);
		CharCasting_12.lAlpaCast(largeAlpa);
		CharCasting_12.numberCast(number);
		

	}

}



/*
 1. smallAlpa >>> : abcdefghijklmnopqrstuvwxyz
2. largeAlpa >>> : ABCDEFGHIJKLMNOPQRSTUVWXYZ
sAlpaCast(String smallAlpa) 함수 시작 >>> 
메인에서 불러온 메인함수의 지역변수 smallAlpa >>> : abcdefghijklmnopqrstuvwxyz
sBool로 데이터 유무확인 >>> : true
sBool로 데이터 유무확인 >>> : true
 if문 진입 
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
CharCasting_12.1AlpaCast(String largeAlpa) 함수 시작 >>> 
largeAlpa >>> : ABCDEFGHIJKLMNOPQRSTUVWXYZ
if문 진입 >>> :true
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
CharCasting_12.1AlpaCast(String largeAlpa) 함수 끝 >>> 
CharCasting_12.numberCast(String number) 함수 시작 >>>
number >>> : 0123456789
if문 진입>>>:0123456789
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
CharCasting_12.numberCast(String numberAlpa) 함수 끝 >>>

 * */