package bitcamp.java142.ch5;


	import java.sql.*;


public class OracleTest_1108 {
	

		public static final String ORACLE11G_JDBCDRIVER = "oracle.jdbc.driver.OracleDriver";
		public static final String ORACLE11G_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orclJSW";
		public static final String ORACLE11G_USER = "scott";
		public static final String ORACLE11G_PASS = "tiger";
		
	 
		public OracleTest_1108(){
			try {
				Class.forName(ORACLE11G_JDBCDRIVER); 
			}catch(ClassNotFoundException e){
				System.out.println("����̹� ã�µ� ������ ����>>> : " + e);
			}
		}//OracleTest()��
		
		public void selectEmp(){
			
			//statement������ ��ȸ
			//prepareStatement��ȸ�Ǽ��� ���ų� ��ȸ�������Ұ��ǰ� 
			
			Connection con = null; //������� �ʱ�ȭ
			PreparedStatement pstmt = null;
//			Statement stmt = null; //���������� �ʱ�ȭ
			ResultSet rsRs = null; //���������� �ʱ�ȭ
			String sql = "SELECT A.EMPNO," + "A.ENAME ENAME FROM EMP A"; //���������������� ���ڿ����Ұ�
			
			try{
				con = DriverManager.getConnection (ORACLE11G_URL, ORACLE11G_USER, ORACLE11G_PASS); 
				System.out.println("con >>> : "+con); 
			
				
				//PreparedStatement�� Statement�� 
				//�������̾���ִ��� �� PrepareStatement()�� ������sql�ְ� executeQuery()���� �Ű����� ����
				//Statement()�� ������ ��ġ�� �ݴ��̴�
				//�츮�� PreparedStatement()�� ���Ŵ�
				
				pstmt= con.prepareStatement(sql);
				System.out.println("pstmt >>> : "+pstmt);
//				stmt = con.createStatement();
//				System.out.println("stmt >>> : "+stmt);
				
				rsRs = pstmt.executeQuery();
//				rsRs = stmt.executeQuery("SELECT A.EMPNO EMPNO, A.ENAME ENAME FROM EMP A");
//				rsRs = stmt.executeQuery("SELECT EMPNO AA, ENAME BB FROM EMP");
				System.out.println("rsRs >>> : "+rsRs);
				
				if(rsRs !=null){
					while(rsRs.next()){
						System.out.print(rsRs.getString("EMPNO"));
						System.out.println(" "+ rsRs.getString("ENAME"));
//						System.out.println(rsRs.getString("AA"));
//						System.out.println(" "+rsRs.getString("BB"));
//						System.out.println(rsRs.getString("1"));
//						System.out.println(" "+rsRs.getString("2"));
//						System.out.println(rsRs.getString("3"));
//						System.out.println(" "+rsRs.getString("5"));
					
					}//while��
				}//if��
			}catch(SQLException e){ 
				System.out.println("DB���� �Ǵ� ���� ��� ������ �߻� >>> : "+e);
				}//catch��		
		}//selectEmp()��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleTest_1108 OT = new OracleTest_1108();
		OT.selectEmp();
		
	}//���γ�

}//Ŭ������
	



