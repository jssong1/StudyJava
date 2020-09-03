package bitcamp.java142.ch5.dao;

import java.util.ArrayList;

import bitcamp.java142.ch5.vo.EmpVO;

public interface EmpDAO {
	public ArrayList selectEmp();
	public ArrayList searchEmp(EmpVO canEvo);
	public ArrayList likeSearchEmp(EmpVO canEvo);
	
}
