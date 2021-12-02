package com.human.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.VO.CommentVO;

@Repository
public class IF_CommentDAOImpl implements IF_CommentDAO{
// sqlsession을 통해서 db에 저장..
	
	@Autowired  // 컨테이너로 부터  SqlSession 타입 객체를 주입받아라... 그러면 sqlSession참조변수를 객체를 주입받아 참조 가능
	private SqlSession sqlSession;  // mybatis에서 제공한 객체 
	private static String mapperquery ="com.human.DAO.IF_CommentDAO";
	
	@Override
	public void insert(CommentVO cvo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperquery+".insert", cvo);
	}

	@Override
	public List<CommentVO> selectallbbsno(int bbs_no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperquery+".selectbbsno", bbs_no);
	}

}
