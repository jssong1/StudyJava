package bitcamp.java142.ch5.vo;
//VO : Value Object : 컴포넌트 
public class EmpVO {
	
	//settergetter는 생성자가아닌 은닉화하여 초기화한 변수로 함
	private int 	empno;
	private String 	ename;
	private String	job;
	private String 	mgr;
	private String	hiredate;
	private int 	sal;
	private int		comm;
	private int		deptno;
	
	//생성자
	public EmpVO(){}
	
	
	public EmpVO(String ename){ this.ename = ename;}//likesearchEmp()함수에 생성자로 깡통만들었기 때문에 필요
	
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
	}//생성자 this끝
	
	
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
	
	
	
	
} //EmpVO클래스 끝
