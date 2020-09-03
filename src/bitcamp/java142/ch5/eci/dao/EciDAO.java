package bitcamp.java142.ch5.eci.dao;

import java.util.ArrayList;

import bitcamp.java142.ch5.eci.vo.EciVO;
import bitcamp.java142.ch5.eci.vo.EciVO2;

public interface EciDAO {
	
	public boolean insertEci(EciVO evo);
	public boolean updateEci(EciVO evo);
	public boolean deleteEci(EciVO evo);
	
	public ArrayList<EciVO> selectEci();
	public ArrayList<EciVO> searchEci(EciVO can0) ;
	public ArrayList<EciVO> likesearchEci();
}
//<���ʸ�> : arraylist�����ִ°�ü����ִ°� ���(������Ʈ)����� ������Ÿ���� �������ִ°� 