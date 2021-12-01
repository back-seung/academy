package com.human.service;

import java.util.List;

import com.human.VO.UserVO;

public interface IF_UserService {
	
	//  컨트롤러가 작업을 요청하는 것을 중심으로 메서드를 정의 합니다.
	public void insert(UserVO uservo) throws Exception;
	// 컨트롤로가 요청하는데 .. 컨트롤러에게 회원의 정보를 보내야 합니다.
	public List<UserVO> selectAll() throws Exception;
	public UserVO selectOne(String uid) throws Exception;
	public void modUser(UserVO uservo) throws Exception;
	public void delUser(String uid) throws Exception;

}
