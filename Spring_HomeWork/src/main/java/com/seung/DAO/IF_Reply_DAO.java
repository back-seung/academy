package com.seung.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.seung.VO.Reply_VO;

public interface IF_Reply_DAO {
	public void CMTInsert(Reply_VO reVO) throws Exception;

	public List<Reply_VO> selectAll(int no) throws Exception;
}
