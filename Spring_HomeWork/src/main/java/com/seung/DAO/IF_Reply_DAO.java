package com.seung.DAO;

import org.springframework.stereotype.Repository;

import com.seung.VO.Reply_VO;


public interface IF_Reply_DAO {
	public void CMTInsert(Reply_VO reVO) throws Exception;
}
