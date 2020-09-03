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
//<제너릭> : arraylist에들어가있는객체들들어가있는걸 요소(엘리먼트)라고함 데이터타입을 통합해주는거 