package com.human.DAO;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.human.VO.UserVO;
@Repository
public class IF_UserDAOImpl implements IF_UserDAO{
	@Autowired  // 컨테이너로 부터  SqlSession 타입 객체를 주입받아라... 그러면 sqlSession참조변수를 객체를 주입받아 참조 가능
	private SqlSession sqlSession;  // mybatis에서 제공한 객체 
	private static String mapperquery ="com.human.DAO.IF_UserDAO";
	@Override
	public void insertUser(UserVO uservo) throws Exception {
		sqlSession.insert(mapperquery + ".insert", uservo);
		
	}
	@Override
	public List<UserVO> selectall() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperquery+".selectall");
	}
	@Override
	public UserVO selectOne(String uid) throws Exception {
		// 컨트롤러단에 리턴한 값
		          // 서비스단에서 호출할 메서드 명
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".selectOne", uid);
	}
	@Override
	public void moduser(UserVO uservo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(mapperquery + ".usermod", uservo);
	}
	@Override
	public void deluser(String uid) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(mapperquery + ".userdel", uid);
		
	}
}
