package bitcamp.java142.ch4;

public class InforVO {
	//1. ������ : �̸�,����,��ȭ��ȣ(HP),�ּ�(���θ�,�����ȣ)
	
	//����ȭ(ĸ��ȭ) Ŭ�����۸����� setter getter�Լ��̿�
	private String name ;
	private String age ; //���̰����� ����Ұžƴϴϱ� String���� �� 
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
