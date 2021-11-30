package com.seung.DAO;

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

}
