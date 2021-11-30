package com.seung.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.seung.VO.Site_VO;
import com.seung.VO.User_VO;

@Repository
public class Site_DAOImpl implements IF_Site_DAO {
	@Inject
	private SqlSession sqlSession;
	private static String mapperquery = "com.seung.DAO.IF_Site_DAO";

	@Override
	public void insert(Site_VO siteVO) throws Exception {
		sqlSession.insert(mapperquery + ".insert", siteVO);
	}

	@Override
	public List<Site_VO> selectAll() throws Exception {
		return sqlSession.selectList(mapperquery + ".selectAll");
	}

	@Override
	public Site_VO selectOne(int no) throws Exception {
		return sqlSession.selectOne(mapperquery + ".selectOne", no);
	}

	@Override
	public void updateCnt(int no) throws Exception {
		sqlSession.update(mapperquery + ".updateCnt", no);
	}

	@Override
	public void update(Site_VO siteVO) throws Exception {
		sqlSession.update(mapperquery + ".update", siteVO);
	}

	@Override
	public void delete(int no) throws Exception {
		sqlSession.delete(mapperquery + ".delete", no);
	}

}
