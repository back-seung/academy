package com.human.DAO;

import java.util.List;

import com.human.VO.CommentVO;

public interface IF_CommentDAO {
	
	public void insert(CommentVO cvo) throws Exception;
	public List<CommentVO> selectallbbsno(int bbs_no) throws Exception;

}
