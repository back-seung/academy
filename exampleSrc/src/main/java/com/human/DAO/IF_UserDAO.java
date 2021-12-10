package com.human.DAO;

import java.util.List;

import com.human.VO.UserVO;

public interface IF_UserDAO {  // 인터페이스는 객체를 만들지 구현한 것으로 만든다..이유는 의존성 낮춘다.
	// 여기는 ... 스프링과 데이터베이스 쿼리간의 다리
	// insert into huser values (?,?,?,?);
	public void insertUser(UserVO uservo) throws Exception;
	// spring 에서 이 쿼리를 실행 후 원하는 값이 있는가?
	// select * from huser;
	public List<UserVO> selectall() throws Exception;
	public UserVO selectOne(String uid) throws Exception;
	   // 서비스단에 리턴한 값
	              // 서비스단에서 호출할 메서드 
	public void moduser(UserVO uservo) throws Exception;
	public void deluser(String uid)  throws Exception;
	
}
