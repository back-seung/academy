package com.human.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.VO.BBSVO;

@Repository  // 데이터베이스 담당 레이어
public class IF_BBSDAOImpl implements IF_BBSDAO{
// //서비스단에서 호출한 작업을 sqlsession을 통해서 실제 데이터베이스 작업을 실행하기 위한 DAO
	@Autowired  // 컨테이너로 부터  SqlSession 타입 객체를 주입받아라... 그러면 sqlSession참조변수를 객체를 주입받아 참조 가능
	private SqlSession sqlSession;  // mybatis에서 제공한 객체 
	private static String mapperquery ="com.human.DAO.IF_BBSDAO";
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		sqlSession.insert(mapperquery + ".insert", bbsvo);
	}
	@Override
	public List<BBSVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		// 여기는 디비작업만 충실하면 됩니다.. 
		return sqlSession.selectList(mapperquery + ".bbsList");
	}
	@Override
	public void updateCntbbs(int vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(mapperquery+".updatecnt",vo);
	}
	@Override
	public BBSVO selectOne(int vo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".selectOne",vo);
	}
	@Override
	public void updateBBS(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(mapperquery+".updatebbs", bbsvo);
	}
	@Override
	public void delBBS(int dno) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(mapperquery+".delbbs", dno);
	}

}
