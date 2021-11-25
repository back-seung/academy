package com.human.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.BBSVO;

@Repository
public class IF_BBSDAOImpl implements IF_BBSDAO{
// //서비스단에서 호출한 작업을 sqlsession을 통해서 실제 데이터베이스 작업을 실행하기 위한 DAO
	@Inject  // 컨테이너로 부터  SqlSession 타입 객체를 주입받아라... 그러면 sqlSession참조변수를 객체를 주입받아 참조 가능
	private SqlSession sqlSession;  // mybatis에서 제공한 객체 
	private static String mapperquery ="com.human.DAO.IF_BBSDAO";
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		sqlSession.insert(mapperquery + ".insert", bbsvo);
	}

}
