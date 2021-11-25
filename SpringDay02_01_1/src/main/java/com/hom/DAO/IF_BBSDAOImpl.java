package com.hom.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hom.VO.Book_VO;

@Repository
public class IF_BBSDAOImpl implements IF_BBSDAO {
	@Inject // 컨테이너로부터 SqlSession 타입 객체를 주입 받는다. 그럼 sqlSession 참조변수 객체를 주입받아 참조가 가능함
	@Autowired
	private SqlSession sqlSession;
	private static String mapperQuery = "com.hom.DAO.IF_BBSDAO";

	@Override
	public void insert(Book_VO bookVO) throws Exception {
		sqlSession.insert(mapperQuery + ".insert", bookVO);
	}

	@Override
	public List<Book_VO> select(Book_VO bookVO) throws Exception {
		List<Book_VO> bookList = null;
		bookList = sqlSession.selectList("bbs.bookList");
		return bookList;
	}

}
