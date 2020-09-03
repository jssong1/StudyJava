package bitcamp.java142.ch5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//ȥ���ϰ� ���ּ��������� 

/*
 *CLASSPATH
 *.;%JAVA_HOME%\classes\ojdbc6.jar
 **/
public class OracleTest_0 {
//	�ڹ� ���ø����̼ǰ� �����ͺ��̽� �������� : datasource
//	1. orcle.jdbc.driver.OracleDriver : jdbc ����̹��� �����ϴ� Ŭ���� 
//		�� Ŭ������ ORACLE������ 9���� ���̻� ������Ʈ�� �������� �ʴ´�.
//		oracle.jdbc.OracleDriver�� ����϶�� �ǰ�
	public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";// ����Ŭ������ �����ϴ� ����̹����� ����ϱ�//����Ŭthin����̹������϶� Ŭ��������¹��
	
	
//	2. JDBC ����̹��� �̿��ؼ� ����Ŭ������ ���̽��� �����ϴ� ��������
//	2-1. �ҹ���! jdbc:oracle:thin: -> jdbc 4 type thin ����̹� ���� ��Ÿ������ (ǻ���ڹ��� ���ξ�...)
//	2-2. @ : ������
//	2-3. 127.0.0.1 : ����Ŭ�� ��ġ�� ����(��ǻ��) ���� 
//					 localhost,  192.168.41.18 : ������ �Ǵ� ip �����̿� (/cmd/ipconfig)
//	2-4. 1521 : ����Ŭ ���ø����̼Ǹ� ��ġ�� TCP PORT
//	2-5. orclJSW : ����Ŭ �����ͺ��̽� SID  

	public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";//�� dbã�ƿͶ� ip(���̸�):��Ʈ:db�̸� //jdbc:oracle:thin-jdbc����̹� ������ oracle thin
//	 											"jdbc:oracle:thin:@192.168.41.42:1521:orclEUB";
	
//	scott / tiger : ����ڰ��� ���� (account info)
	public static final String ORACLE11G_USER = "scott";//�������̵�
	public static final String ORACLE11G_PASS = "tiger";//�������
	
	
	//������ ??Ŭ�������̶� ���ƾ��ߴ��� 
	public OracleTest_0(){
		try {
			/*
			 * Class.forName()�Լ��� �̿��ؼ� (class.forname�� �ѹ��÷������� ���밡��)
			 * JDBC����̹� ���� Ŭ���� 
			 * oracle.jdbe.driver.OracleDriver�� ã�´�.
			 * */
			Class.forName(ORACLE11G_JDBCDRIVER); //������ Ŭ���� static Class<?>������ : forName(String className)�Լ� : Returns the Class object associated with the class or interface with the given string name.
												//������ ����̹� �ε��ض�
		}catch(ClassNotFoundException e){
			System.out.println("����̹� ã�µ� ������ ����>>> : " + e);
		}
	}//OracleTest()��
	
	public void selectEmp(){
		
		
		 //�������̽�������
		Connection con = null; //������� �ʱ�ȭ
		Statement stmt = null; //���������� �ʱ�ȭ
		ResultSet rsRs = null; //���������� �ʱ�ȭ
		
		try{
//			Connection �������̽��� �̿��ؼ� 
//			�ڹ� ���ø����̼ǿ��� ������ ��������(datasource)�� ������
//			����Ŭ �����ͺ��̽��� �����ϸ�
//			�� ����Ǹ� �ڹپ��ø����̼ǰ� ����Ŭ �����ͺ��̽��� �ϳ��� session(connection)�� �����. 
			con = DriverManager.getConnection (ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //DriverManager�ڹٳ� Ŭ���� �ڹٿ��� ���� getConnection�Լ������� url,user,pass���������� �޸𸮿��ö� accept���Ǿ� jdbc connection�������̽��� ����Ŭ����
			System.out.println("con >>> : "+con); 
			
//			����� ����(session, connection)�� ������
//			sql ���ǹ��� ����Ŭ�� �����ϱ� ����
//			�ϳ��� ��θ� �����(�����ϱ� ���� �����Ϸ��� �ϴ� ��)
//			�� ������ Statement �������̽��� �����Ѵ�.
			stmt = con.createStatement();
			System.out.println("stmt >>> : "+stmt);
			
			
			
//			Statement �������̽��� �ִ� �Լ� �� sql���ǹ��� SELECT�ΰ��/ executeQuery()�Լ��� �̿��ؼ� /sql ���ǹ��� ����Ŭ �����ͺ��̽��� �����Ѵ�.
//			sql���ǹ��� ����Ŭ �����ͺ��̽��� ���޵ǰ� 
//			���޹��� sql���ǹ��� ����Ŭ �������� �����Ͽ� �� ����� ���Ϸ� ���� �ٽ� �ڹپ��ø����̼����� �����Ѵ�.
//			�̶� ���޵� ������ ResultSet�������̽��� ���� �޴´�.
			rsRs = stmt.executeQuery("SELECT A.EMPNO EMPNO, A.ENAME ENAME FROM EMP A");
//			rsRs = stmt.executeQuery("SELECT EMPNO AA, ENAME BB FROM EMP");
			System.out.println("rsRs >>> : "+rsRs);
			
			if(rsRs !=null){
				while(rsRs.next()){
					System.out.println(rsRs.getString("EMPNO"));
					System.out.println(""+ rsRs.getString("ENAME"));
//					System.out.println(rsRs.getString("AA"));
//					System.out.println(""+rsRs.getString("BB"));
//					System.out.println(rsRs.getString("1"));
//					System.out.println(""+rsRs.getString("2"));
//					System.out.println(rsRs.getString("3"));
//					System.out.println(""+rsRs.getString("5"));
				
				}//while��
			}//if��
		}catch(SQLException e){ 
			System.out.println("DB���� �Ǵ� ���� ��� ������ �߻� >>> : "+e);
			}//catch��		
	}//selectEmp()��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_0 OT = new OracleTest_0();
		OT.selectEmp();
	}//���γ�

}//Ŭ������


