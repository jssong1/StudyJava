package bitcamp.java142.ch5.dao;

import java.util.ArrayList;

import bitcamp.java142.ch5.vo.EmpVO;

public interface EmpDAO4_0 {
	public ArrayList selectEmp();
	public ArrayList searchEmp(EmpVO evo);
	public ArrayList likeSearchEmp(EmpVO evo);
	
}
