package com.seung.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.seung.DAO.IF_Reply_DAO;
import com.seung.VO.Reply_VO;

@Service
public class Reply_ServiceImpl implements IF_Reply_Service {
	@Inject
	IF_Reply_DAO replyDAO;

	@Override
	public void CMTInsert(Reply_VO reVO) throws Exception {
		replyDAO.CMTInsert(reVO);
	}

	@Override
	public List<Reply_VO> selectAll(int no) throws Exception {
		return replyDAO.selectAll(no);
	}

}
