package bitcamp.java142.ch5.vo;
//VO : Value Object : ������Ʈ 
public class EmpVO {
	
	//settergetter�� �����ڰ��ƴ� ����ȭ�Ͽ� �ʱ�ȭ�� ������ ��
	private int 	empno;
	private String 	ename;
	private String	job;
	private String 	mgr;
	private String	hiredate;
	private int 	sal;
	private int		comm;
	private int		deptno;
	
	//������
	public EmpVO(){}
	
	
	public EmpVO(String ename){ this.ename = ename;}//likesearchEmp()�Լ��� �����ڷ� ���븸����� ������ �ʿ�
	
	public EmpVO(int empno, String ename){
		this.empno = empno;
		this.ename = ename;
	}
	
	public EmpVO(int empno, String ename, String job, String mgr, String hiredate, int sal, int comm, int deptno){
		this.empno 	  =	 empno;
		this.ename 	  =	 ename;
		this.job	  =	 job;
		this.mgr	  =	 mgr;
		this.hiredate =	 hiredate;
		this.sal	  =  sal;
		this.comm     =  comm;
		this.deptno	  =  deptno;
	}//������ this��
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
	
	
} //EmpVOŬ���� ��
