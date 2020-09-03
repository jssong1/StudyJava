package bitcamp.java142.ch5.eci.dao;

import java.util.ArrayList;

import bitcamp.java142.ch5.eci.vo.EciVO2;

public interface EciDAO2 {
	
	public boolean insertEci(EciVO2 evo);
	public boolean updateEci(EciVO2 evo);
	public boolean deleteEci(EciVO2 evo);
	
	public ArrayList<EciVO2> selectEci();
	public ArrayList<EciVO2> searchEci(EciVO2 can0) ;
	public ArrayList<EciVO2> likeSearchEci(EciVO2 evo);
	
//	public boolean updateChaeBun(EciVO2 evo);
}
//<제너릭> : arraylist에들어가있는객체들들어가있는걸 요소(엘리먼트)라고함 데이터타입을 통합해주는거 