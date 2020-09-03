package bitcamp.java142.ch5;
//�ܰ� ����
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	/*
	 * CLASSPATH
	 * .;%JAVA_HOME%\classes\ojdbc6.jar
	 * */

	public class OracleTest_0s {
		
		// �ڹ� ���ø����̼ǰ� �����ͺ��̽� �������� : datasource 
		// 1. oracle.jdbc.driver.OracleDriver : jdbc ����̹��� �����ϴ� Ŭ���� 
		//    �� Ŭ������ ORACLE 9I ���� ���̻� ������Ʈ�� �������� �ʴ´�.
		//    oracle.jdbc.OracleDriver �� ����϶�� �ǰ��Ѵ�. 
		public static final String ORACLE11G_JDBCDRIVER = 
				"oracle.jdbc.driver.OracleDriver";
		// 2. JDBC ����̹��� �̿��ؼ� ����Ŭ������ ���̽��� �����ϴ� ���� ���� 
		// 2-1. jdbc:oracle:thin: -> jdbc 4 type thin ����̹� ���� ��Ÿ������
		// 2-2. @ : ������ 
		// 2-3. 127.0.0.1 : ����Ŭ�� ��ġ�� ����(��ǻ��) ����
		//                  localhost, 192.168.0.23 : ������ �Ǵ� ip �����̿�
		// 2-4. 1521 : ����Ŭ ���ø����̼Ǹ� ��ġ�� TCP PORT 
		// 2-5. orclHBE : ����Ŭ �����ͺ��̽� SID 	
		public static final String ORACLE11G_URL = 
//				"jdbc:oracle:thin:@192.168.41.42:1521:orclLEB";
				"jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";
		// 3. scott / tiger : ���� ����(account info)
		public static final String ORACLE11G_USER = "scott";
		public static final String ORACLE11G_PASS= "tiger";
		
		// ������ 
		public OracleTest_0s(){
			try {
				/*
				 * Class.forName() �Լ��� �̿��ؼ� 
				 * JDBC ����̹� ���� Ŭ����
				 * "oracle.jdbc.driver.OracleDriver �� ã�´�.
				 * */
				Class.forName(ORACLE11G_JDBCDRIVER);
			}catch(ClassNotFoundException e){
				System.out.println("����̹� ã�µ� ������ ���� >>> : " + e);
			}
		}
		
		public void selectEmp(){
			
			Connection con = null;
			Statement  stmt = null;
			ResultSet  rsRs = null;
			
			try {
				// Connection �������̽��� �̿��ؼ� 
				// �ڹ� ���ø����̼ǿ��� ������ ��������(datasource)�� 
				// ������ ����Ŭ �����ͺ��̽��� ���� �ϸ�
				// �� ����Ǹ� �ڹپ��ø����̼ǰ� ����Ŭ �����ͺ��̽��� 
				// �ϳ��� session(connection)�� �����.
				con = DriverManager.getConnection( ORACLE11G_URL
						                          ,ORACLE11G_USER
						                          ,ORACLE11G_PASS);			
				System.out.println("con >>> : " + con);
			// ����� ����(session, connection)�� ������ 
				// sql ���ǹ��� ����Ŭ�� �����ϱ����ؼ� 
				// �ϳ��� ��θ� �����(�����ϱ� ���� �����Ϸ��� �ϴ� ��)
				// �� ��Ȱ�� Statement �������̽��� �����Ѵ�.  
				stmt = con.createStatement();
				System.out.println("stmt >>> : " + stmt);

				// Statement �������̽��� �ִ� �Լ� �� 
				// sql ���ǹ� �� SELECT �� ��� 
				// executeQuery() �Լ��� �̿��ؼ� 
				// sql ���ǹ��� ����Ŭ �����ͺ��̽��� �����Ѵ�. 
				// sql ���ǹ��� ����Ŭ �����ͺ��̽��� ���޵ǰ�
				// ����Ŭ �����ͺ��̽����� ���� ���� sql ���ǹ��� 
				// ����Ŭ ������ �����ؼ� ����� ���Ϸ� ���� 
				// ������� ������ �ٽ� �ڹ� ���ø����̼����� �����ϴµ�
				// �� ���޵Ǵ� ������ ResultSet �������̽��� 
				// ���� �޴´�. 
				rsRs = stmt.executeQuery(  "SELECT A.EMPNO EMPNO, "
		                 + "A.ENAME ENAME FROM EMP A");			
//				rsRs = stmt.executeQuery("SELECT EMPNO AA, ENAME BB FROM EMP");
				System.out.println("rsRs >>> : " + rsRs);
				
				if(rsRs !=null){
					while (rsRs.next()){
						System.out.print(rsRs.getString("EMPNO"));
						System.out.println(" " + rsRs.getString("ENAME"));
//						System.out.print(rsRs.getString("AA"));
//						System.out.println(" " + rsRs.getString("BB"));
//						System.out.print(rsRs.getString(1));
//						System.out.print(" " + rsRs.getString(2));
//						System.out.println(" " + rsRs.getString(3));
					}
				}
			}catch(SQLException e){
				System.out.println("DB���� �Ǵ� ������� ������ �߻�  >>> : " + e);
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new OracleTest_0s().selectEmp();
		}
	}


