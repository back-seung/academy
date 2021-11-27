package com.hom.Service;

import java.util.List;

import com.hom.VO.Book_VO;

public interface IF_BBSService {
	// 컨트롤러가 서비스단을 호출하기 위해 메서드를 정의해놓음. throws Exception은 예외가 발생하면 대신 처리해달라는 의미
	public void insert(Book_VO bookVO) throws Exception;

	public List<Book_VO> selectAll() throws Exception;

	public Book_VO selectOne(int no) throws Exception;

	public Book_VO updateView(int no) throws Exception;

	public void update(Book_VO bookVO) throws Exception;

	public void delete(int no) throws Exception;
}
