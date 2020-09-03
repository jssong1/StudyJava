package bitcamp.java142.ch4;

public class StringBufferTest {
	public static String getSelect(){
		// append : ���ڿ� ����
		// StringBuffer : �����迭�� ���ڿ� �ٿ���, ������
		// String�� StringBuffer�� �ٸ� �׷��� toString�� �̿��ؼ� �� ����ȯ�������
		
		StringBuffer sb = new StringBuffer();//StringBuffer�� ��Ʈ���� �ƴ� char���迭�� �����Ȱ�; ���ϰ��� toString���� ����ȯ�ʿ�
		sb.append("SELECT               \n"); //�ν��Ͻ��� sb������ ��ĭ���Թ��ڿ��� �����ش�
		sb.append("			DEPTNO		");
		sb.append("			,DNAME		");
		sb.append("			,LOC		\n");
		sb.append("FROM					");
		sb.append("			DEPT02		\n");
		
		return sb.toString();//����ȯ�ʿ�; Stringbuffer�ν��Ͻ��� ���ڿ��� String���� ����
		
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