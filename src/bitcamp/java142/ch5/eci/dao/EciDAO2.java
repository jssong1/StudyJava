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
//<���ʸ�> : arraylist�����ִ°�ü����ִ°� ���(������Ʈ)����� ������Ÿ���� �������ִ°� 