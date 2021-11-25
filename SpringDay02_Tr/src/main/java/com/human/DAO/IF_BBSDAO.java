package com.human.DAO;

import com.human.VO.BBSVO;

public interface IF_BBSDAO {	
	//서비스단에서 호출한 작업을 sqlsession을 통해서 실제 데이터베이스 작업을 실행하기 위한 DAO
	// 본 DAO와 mapper의 sql과 mapping을 해서 사용합니다.
	public void insert(BBSVO bbsvo) throws Exception;

}
