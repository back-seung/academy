package com.hom.Service;

import java.awt.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
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
	public java.util.List<Book_VO> select(Book_VO searchVO) throws Exception {
		return bbsdao.select(searchVO);
	}

}
