package com.human.service;

import com.human.VO.BBSVO;

public interface IF_BBSService {
	
	// 컨트롤러가  서브스 단을 호출하기 위한 메서드 정의해 놓음.  throws Exception 예외가 발생하면 처리해달라 의미
	public void insert(BBSVO bbsvo) throws Exception;

}
