package com.human.service;

import java.util.List;

import com.human.VO.CommentVO;

public interface IF_CommentService {	
	public void insert(CommentVO cvo) throws Exception;
	public List<CommentVO> selectallbbsno(int bbs_no) throws Exception;
}
