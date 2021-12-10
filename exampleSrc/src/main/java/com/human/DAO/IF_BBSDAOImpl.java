package com.human.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;

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
	public List<BBSVO> selectAll(PageVO pagevo) throws Exception {
		// TODO Auto-generated method stub
		// 여기는 디비작업만 충실하면 됩니다.. 
		return sqlSession.selectList(mapperquery + ".bbsList", pagevo);
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
	@Override
	public int bbscnt() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".bbscnt");
	}

	@Override
	public int getbbsSeq() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".getcntBBS");
	}

	@Override
	public void insertattach(int bno, String filename) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String,Object>();
		paramMap.put("abno",bno);
		paramMap.put("afilename", filename);
		// 2개의 변수를 파라미터로 전달해야 하는데 두개의 변수를 보낼 수 없어서 하나의 변수로 
		// 묶어야 하는데 vo나 map을 사용한다.. 우리는 간단한 것이므로  map
		sqlSession.insert(mapperquery + ".insertAttach", paramMap);
	}

	@Override
	public List<String> selectAttach(int vno) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperquery + ".selectattach", vno);
	}

}
