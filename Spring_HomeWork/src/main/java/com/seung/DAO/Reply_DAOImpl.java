package com.seung.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.seung.VO.Reply_VO;

@Repository
public class Reply_DAOImpl implements IF_Reply_DAO {
	@Inject
	SqlSession sqlSession;
	String mappingQuery = "com.seung.DAO.IF_Reply_DAO";

	@Override
	public void CMTInsert(Reply_VO reVO) throws Exception {
		sqlSession.insert(mappingQuery + ".insert", reVO);
	}

	@Override
	public List<Reply_VO> selectAll(int index) throws Exception {
		System.out.println("DAO : " + index);
		return sqlSession.selectList(mappingQuery + ".selectAll", index);
	}

}
