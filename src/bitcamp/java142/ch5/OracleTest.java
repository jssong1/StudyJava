package bitcamp.java142.ch5;
//�����ð� �����鼭 �Ѱ�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *CLASSPATH
 *.;%JAVA_HOME%\classes\ojdbc6.jar
 **/

public class OracleTest {

	
	//��������, �������ξ��Ŵ� ���ڻ���� ����  ������
	public static final String ORACLE11G_JDBCDRIVER="oracle.jdbc.driver.OracleDriver";//������,�긦��ã����
	public static final String ORACLE11G_URL="jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";//���� thinŸ�Ե���̹����ڴ�/@ã�ƿ����� ������:��Ʈ:db�̸�
	public static final String ORACLE11G_USER="scott";//�����̸�
	public static final String ORACLE11G_PASS="tiger";//�������ӹ�
	
	//������
	public OracleTest(){
		
		try{
			Class.forName(ORACLE11G_JDBCDRIVER);//������ ã�ƶ� �ε��ض�
			
		}catch(ClassNotFoundException e){
			System.out.println("����̹� ã�µ� ������ ���� >>>:" +e);
		}
	}//OracleTest()��
	
	public void selectEmp(){//���������̵� �Լ�
		Connection con =null;//�������̽��ʱ�ȭ
		Statement stmt =null;////�������̽��ʱ�ȭ
		ResultSet rsRs = null;//�������̽��ʱ�ȭ
		
		
		//����
		try{
			con = DriverManager.getConnection(ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); //��ΰ� ����°�
			System.out.println("con>>> : "+con);//����Ŭ�������� Ŭ������������ذ� (��������ּҰ�)
			stmt = con.createStatement();  //���忬���϶�����/�̾��༭�����̴¿���/ ��sql�������ϰ�޴¿���
			System.out.println("stmt>>> : "+stmt); //OracleStatementWrapperŬ�������������ϴ°�
			
			//rsRs = stmt.executeQuery("SELECT * FROM EMP");//SELECT������ �������ǽ������������󰣴� RSrS���޴´� ���ϵ�ī��*���� EMPNO,ENAME���� ��ȸ�غ��� �������ѿ��ε���/ �ؿ��÷����̵� 1,2������ ���� 
			//ALIAS������ " SELECT EMPNO AA, ENAME BB FROM EMP" getString("EMPNO")�ϸ� ������ getString("AA")���ؾ���
			rsRs = stmt.executeQuery("SELECT A.EMPNO EMPNO , A.ENAME ENAME FROM EMP A");//�����̺�alias��Ἥ��������� (�����������󰡴°�)
			System.out.println("rsRs>>> : "+rsRs);//SetImpl�̼���Ʈ�Ѱ�����޾��ִ°� 
			
			
			if(rsRs != null){ //�������־����Ȯ����
				while(rsRs.next()){ //true,false������
					System.out.println(" "+rsRs.getString("EMPNO"));//ALIAS������ ��ȸ
					System.out.println(" "+rsRs.getString("ENAME"));
//					System.out.println(" "+rsRs.getString("AA"));
//					System.out.println(" "+rsRs.getString("BB"));
					System.out.println(rsRs.getString(1));//select�ϴ��÷��Ǿ��̵� 1,2,3���ΰ����°� ���̵��� "EMPNO"���ڷ���ȸ���� �� ALIAS������ ALIAS����ȸ
					System.out.println(" "+rsRs.getString(2));
//					System.out.println(" "+rsRs.getString(3));//���°Ŵ޶���ϸ�ȵ� ���� rsRs�ʱ�ȭ�Ҷ� ���ϵ�ī��� �� 
//					System.out.println(" "+rsRs.getString(5));//�÷����̵�5���� hiredate��ȸ�Ǿ� ������
				}//while��
				
			}//if��
			
		}catch(SQLException e){
			System.out.println("DB���� �Ǵ� ���� ��� ������ �߻� >>> : "+e);
		}	//catch��
		
	}//selectEmp()�Լ� ��
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest OT = new OracleTest();
		OT.selectEmp();
		
	} //�����Լ���

}//OracleTestŬ������
