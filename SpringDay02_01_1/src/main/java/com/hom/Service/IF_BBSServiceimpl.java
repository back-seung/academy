package com.hom.Service;

import java.awt.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hom.DAO.IF_BBSDAO;
import com.hom.VO.Book_VO;

@Service // 서비스로 처리할 객체이니 컨테이너에 등록하라.
public class IF_BBSServiceimpl implements IF_BBSService {
	// 실제 데이터베이스 작업 등 서비스 로직을 실행한다.
	@Inject
	private IF_BBSDAO bbsdao;

	@Override
	public void insert(Book_VO bookVO) throws Exception {
		bbsdao.insert(bookVO);
	}

	@Override
	public java.util.List<Book_VO> selectAll() throws Exception {
		// 권한 체크하도록 추가 등 사용자의 요청을 처리하는 다양한 매커니즘이 추가될 수도 있다.
		return bbsdao.selectAll(); // repository에 데이터 작업을 요청
	}

	@Override
	public Book_VO selectOne(int no) throws Exception {
		bbsdao.updateCnt(no);
		return bbsdao.selectOne(no);
	}

	@Override
	public Book_VO updateView(int no) throws Exception {
		return bbsdao.selectOne(no);
	}

	@Override
	public void update(Book_VO bookVO) throws Exception {
		bbsdao.update(bookVO);
	}

	@Override
	public void delete(int no) throws Exception {
		bbsdao.delete(no);
	}

}
