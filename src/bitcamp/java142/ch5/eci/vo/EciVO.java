package bitcamp.java142.ch5.eci.vo;

public class EciVO {
    private String enumm;//enum은 자바자체키워드가있으니까 m하나더붙임        
    private String ename;         //멤버변수에서 final하지 않은 이유: 멤버변수에서 변경하지 않는 소스가되어 생성자에서 에러남 초기화시켜야해 // 변수에 파이널이 있으면  -> 무조건 값이 있어야함 
    private String eage;          
    private String ehp;         
    private String eaddr;        
    private String edeleteYN;    
    private String einsertdate;   
    private String eupdatedate;
    
    public EciVO(){}
    
	public EciVO(final String ename) {//NOT NULL 쓴 ename 검색키워드로 사용하려고 생성자만듦 / 변경하지마세요 final붙이기(권장)->들어온데이터 리턴할때 변경하지마세요 
		this.ename = ename;
	}

	public EciVO(String enumm, 
				 final String ename, 
				 String eage, 
				 String ehp, 
				 String eaddr, 
				 String edeleteYN,
				 String einsertdate, 
				 String eupdatedate) {
		this.enumm = enumm;
		this.ename = ename;
		this.eage = eage;
		this.ehp = ehp;
		this.eaddr = eaddr;
		this.edeleteYN = edeleteYN;
		this.einsertdate = einsertdate;
		this.eupdatedate = eupdatedate;
	}
	
	public String getEnumm() {
		return enumm;
	}
	public void setEnumm(String enumm) {
		this.enumm = enumm;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(final String ename) {
		this.ename = ename;
	}
	public String getEage() {
		return eage;
	}
	public void setEage(String eage) {
		this.eage = eage;
	}
	public String getEhp() {
		return ehp;
	}
	public void setEhp(String ehp) {
		this.ehp = ehp;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getEdeleteYN() {
		return edeleteYN;
	}
	public void setEdeleteYN(String edeleteYN) {
		this.edeleteYN = edeleteYN;
	}
	public String getEinsertdate() {
		return einsertdate;
	}
	public void setEinsertdate(String einsertdate) {
		this.einsertdate = einsertdate;
	}
	public String getEupdatedate() {
		return eupdatedate;
	}
	public void setEupdatedate(String eupdatedate) {
		this.eupdatedate = eupdatedate;
	}   
}
