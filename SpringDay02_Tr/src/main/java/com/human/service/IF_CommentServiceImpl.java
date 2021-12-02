package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_CommentDAO;
import com.human.VO.CommentVO;

@Service
public class IF_CommentServiceImpl implements IF_CommentService{
	@Inject
	private IF_CommentDAO commentdao; 
	@Override
	public void insert(CommentVO cvo) throws Exception {
		// TODO Auto-generated method stub
		commentdao.insert(cvo);  // dao 호출 > 쿼리문 실행시킬려고 하고.
	}
	@Override
	public List<CommentVO> selectallbbsno(int bbs_no) throws Exception {
		// TODO Auto-generated method stub
		return commentdao.selectallbbsno(bbs_no);
	}

}
