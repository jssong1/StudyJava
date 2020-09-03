package bitcamp.java142.ch5.eci.vo;

public class EciVO {
    private String enumm;//enum�� �ڹ���üŰ���尡�����ϱ� m�ϳ�������        
    private String ename;         //����������� final���� ���� ����: ����������� �������� �ʴ� �ҽ����Ǿ� �����ڿ��� ������ �ʱ�ȭ���Ѿ��� // ������ ���̳��� ������  -> ������ ���� �־���� 
    private String eage;          
    private String ehp;         
    private String eaddr;        
    private String edeleteYN;    
    private String einsertdate;   
    private String eupdatedate;
    
    public EciVO(){}
    
	public EciVO(final String ename) {//NOT NULL �� ename �˻�Ű����� ����Ϸ��� �����ڸ��� / �������������� final���̱�(����)->���µ����� �����Ҷ� �������������� 
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
