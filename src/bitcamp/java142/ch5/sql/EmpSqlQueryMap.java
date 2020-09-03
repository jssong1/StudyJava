package bitcamp.java142.ch5.sql;

//������ ���� �����ؼ� ����� ������ ���������� �������Ѵ�.
public abstract class EmpSqlQueryMap {
	
	public static String getSelectQuery() throws Exception{
		// append : ���ڿ� ����
		// StringBuffer : �����迭�� ���ڿ� �ٿ���, ������
		// String�� StringBuffer�� �ٸ� �׷��� toString�� �̿��ؼ� �� ����ȯ�������		
		System.out.println("2.5<<<<<<<<<<<< EmpSqlQueryMap.getSelectQuery() �Լ� ���� ------------------------------");
		StringBuffer sb = new StringBuffer();//StringBuffer�� ��Ʈ���� �ƴ� char���迭�� �����Ȱ�; ���ϰ��� toString���� ����ȯ�ʿ�
		sb.append(" SELECT A.EMPNO EMPNO \n ");//�ν��Ͻ��� sb������ ��ĭ���Թ��ڿ��� �����ش�
		sb.append("		  ,A.ENAME ENAME \n ");
		sb.append(" FROM   EMP A         \n ");
		System.out.println("2.5------------------------------ >>>>>>>>>>>> EmpSqlQueryMap.getSelectQuery() �Լ� �� ");
		return sb.toString();//����ȯ�ʿ�; Stringbuffer�ν��Ͻ��� ���ڿ��� String���� ����
	}// getSelectQuery()�Լ���
	
	public static String getSearchQuery() throws Exception{
		System.out.println("2.5<<<<<<<<<<<< EmpSqlQueryMap.getSearchQuery() �Լ� ���� ------------------------------");
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO \n");
		sb.append("		  ,A.ENAME ENAME \n");
		sb.append(" FROM   EMP A         \n");
		sb.append("	WHERE  A.EMPNO = ?   \n");
		sb.append("	AND    A.ENAME = ?   \n");
		System.out.println("2.5------------------------------ >>>>>>>>>>>> EmpSqlQueryMap.getSearchQuery() �Լ� �� ");
		return sb.toString(); //����ȯ
		
	}//getSearchQuery()�Լ� ��

	public static String getLikeSearchQuery() throws Exception{
		System.out.println("2.5<<<<<<<<<<<< EmpSqlQueryMap.getLikeSearchQuery() �Լ� ���� ------------------------------");
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO \n");
		sb.append("		  ,A.ENAME ENAME \n");
		sb.append(" FROM   EMP A         \n");
		sb.append("	WHERE  A.ENAME LIKE '%' || ? || '%' \n");
		System.out.println("2.5------------------------------ >>>>>>>>>>>> EmpSqlQueryMap.getLikeSearchQuery() �Լ� �� ");
		return sb.toString();
		
	}//getLikeSearchQuery()�Լ� ��
	
}//EmpSqlQueryMap�߻�Ŭ���� ��
