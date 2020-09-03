package bitcamp.java142.ch4;

public class StringBufferTest {
	public static String getSelect(){
		// append : 문자열 붙임
		// StringBuffer : 가변배열로 문자열 붙여줌, 동기방식
		// String과 StringBuffer는 다름 그래서 toString을 이용해서 꼭 형변환해줘야함
		
		StringBuffer sb = new StringBuffer();//StringBuffer는 스트링이 아님 char형배열이 생성된거; 리턴값때 toString으로 형변환필요
		sb.append("SELECT               \n"); //인스턴스된 sb공간에 빈칸포함문자열을 더해준다
		sb.append("			DEPTNO		");
		sb.append("			,DNAME		");
		sb.append("			,LOC		\n");
		sb.append("FROM					");
		sb.append("			DEPT02		\n");
		
		return sb.toString();//형변환필요; Stringbuffer인스턴스의 문자열을 String으로 리턴
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strV = StringBufferTest.getSelect();
		System.out.println("strV >>> : \n" + strV);

	}

}
/*
strV >>> : 
SELECT               
			DEPTNO					,DNAME					,LOC		
FROM								DEPT02		

*/