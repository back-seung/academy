package com.human.service;

import java.util.List;

import com.human.VO.BBSVO;

public interface IF_BBSService {
	
	// 컨트롤러가  서브스 단을 호출하기 위한 메서드 정의해 놓음.  throws Exception 예외가 발생하면 처리해달라 의미
	public void insert(BBSVO bbsvo) throws Exception;
	// 사용자 입장에서 호출하는 것으로 서비스 단의 메서드를 정의 ..
	public List<BBSVO> bbsList() throws Exception;
	// 사용자 입장에서 글 자세히 보여 주세요.. 서비스를 처리할 메서드를 정의
	public BBSVO viewDetail(int vno) throws Exception;
	// 사용자가 수정을 요청합
	public BBSVO modBBSForm(int vno) throws Exception;
	// 사용자가 실제 수정 데이터를 보냄
	public void modBBSUpdate(BBSVO bbsvo) throws Exception;
	// 사용자가 글을 삭제하고 싶다.
	public void delBBS(int dno) throws Exception;

}
