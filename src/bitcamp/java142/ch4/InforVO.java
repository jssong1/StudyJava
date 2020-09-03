package bitcamp.java142.ch4;

public class InforVO {
	//1. 데이터 : 이름,나이,전화번호(HP),주소(도로명,우편번호)
	
	//은닉화(캡슐화) 클래스밖못나와 setter getter함수이용
	private String name ;
	private String age ; //나이가지고 계산할거아니니까 String으로 함 
	private String hp;
	private String addr;

	
	public InforVO(){}
	public InforVO(String name, String age, String hp, String addr){
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
