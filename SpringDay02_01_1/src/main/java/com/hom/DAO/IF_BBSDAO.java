package com.hom.DAO;

import java.util.List;

import com.hom.VO.Book_VO;

public interface IF_BBSDAO {
	// 서비스단에서 호출한 작업을 sqlSession을 통해 실제 데이터 베이스 작업을 실행하기 위한 DAO
	// 본 DAO와 mapper의 sql과 mapping 해서 사용합니다.
	public void insert(Book_VO bookVO) throws Exception;
	public List<Book_VO> select(Book_VO bookVO) throws Exception;
}
