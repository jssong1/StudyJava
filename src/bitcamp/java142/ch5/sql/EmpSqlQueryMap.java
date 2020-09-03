package bitcamp.java142.ch5.sql;

//쿼리는 직접 실행해서 결과가 나오는 쿼리문으로 만들어야한다.
public abstract class EmpSqlQueryMap {
	
	public static String getSelectQuery() throws Exception{
		// append : 문자열 붙임
		// StringBuffer : 가변배열로 문자열 붙여줌, 동기방식
		// String과 StringBuffer는 다름 그래서 toString을 이용해서 꼭 형변환해줘야함		
		System.out.println("2.5<<<<<<<<<<<< EmpSqlQueryMap.getSelectQuery() 함수 시작 ------------------------------");
		StringBuffer sb = new StringBuffer();//StringBuffer는 스트링이 아님 char형배열이 생성된거; 리턴값때 toString으로 형변환필요
		sb.append(" SELECT A.EMPNO EMPNO \n ");//인스턴스된 sb공간에 빈칸포함문자열을 더해준다
		sb.append("		  ,A.ENAME ENAME \n ");
		sb.append(" FROM   EMP A         \n ");
		System.out.println("2.5------------------------------ >>>>>>>>>>>> EmpSqlQueryMap.getSelectQuery() 함수 끝 ");
		return sb.toString();//형변환필요; Stringbuffer인스턴스의 문자열을 String으로 리턴
	}// getSelectQuery()함수끝
	
	public static String getSearchQuery() throws Exception{
		System.out.println("2.5<<<<<<<<<<<< EmpSqlQueryMap.getSearchQuery() 함수 시작 ------------------------------");
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO \n");
		sb.append("		  ,A.ENAME ENAME \n");
		sb.append(" FROM   EMP A         \n");
		sb.append("	WHERE  A.EMPNO = ?   \n");
		sb.append("	AND    A.ENAME = ?   \n");
		System.out.println("2.5------------------------------ >>>>>>>>>>>> EmpSqlQueryMap.getSearchQuery() 함수 끝 ");
		return sb.toString(); //형변환
		
	}//getSearchQuery()함수 끝

	public static String getLikeSearchQuery() throws Exception{
		System.out.println("2.5<<<<<<<<<<<< EmpSqlQueryMap.getLikeSearchQuery() 함수 시작 ------------------------------");
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO \n");
		sb.append("		  ,A.ENAME ENAME \n");
		sb.append(" FROM   EMP A         \n");
		sb.append("	WHERE  A.ENAME LIKE '%' || ? || '%' \n");
		System.out.println("2.5------------------------------ >>>>>>>>>>>> EmpSqlQueryMap.getLikeSearchQuery() 함수 끝 ");
		return sb.toString();
		
	}//getLikeSearchQuery()함수 끝
	
}//EmpSqlQueryMap추상클래스 끝
