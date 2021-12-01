package com.seung.service;

import java.util.List;

import com.seung.VO.Reply_VO;

public interface IF_Reply_Service {
	public void CMTInsert(Reply_VO reVO) throws Exception;

	public List<Reply_VO> selectAll(int no) throws Exception;
}
