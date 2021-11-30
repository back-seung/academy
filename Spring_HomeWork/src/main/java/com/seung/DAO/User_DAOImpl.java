package com.seung.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.seung.VO.User_VO;

@Repository
public class User_DAOImpl implements IF_User_DAO {
	@Inject
	private SqlSession sqlSession;
	private static String mapperquery = "com.seung.DAO.IF_User_DAO";

	@Override
	public void UserInput(User_VO userVO) throws Exception {
		sqlSession.insert(mapperquery + ".UserInput", userVO);
	}

	@Override
	public List<User_VO> selectAll() throws Exception {
		return sqlSession.selectList(mapperquery + ".selectAll");
	}

	@Override
	public User_VO selectOne(String id) throws Exception {
		return sqlSession.selectOne(mapperquery + ".selectOne", id);
	}

	@Override
	public void UserUpdate(User_VO userVO) throws Exception {
		sqlSession.update(mapperquery + ".update", userVO);
	}

	@Override
	public void UserDelete(String pwd) throws Exception {
		sqlSession.delete(mapperquery + ".delete", pwd);
	}

}
