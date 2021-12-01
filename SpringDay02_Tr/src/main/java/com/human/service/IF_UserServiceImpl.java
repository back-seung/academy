package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_UserDAO;
import com.human.VO.UserVO;
@Service
public class IF_UserServiceImpl implements IF_UserService{
	@Inject
	IF_UserDAO userdao=null;

	@Override
	public void insert(UserVO uservo) throws Exception {
		// TODO Auto-generated method stub
		userdao.insertUser(uservo);
	}

	@Override
	public List<UserVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return userdao.selectall();
	}

	@Override
	public UserVO selectOne(String uid) throws Exception {
		// 서비스단에게 넘겨 줄 자료형
		          // 서비스단에서 호출할 메서드
		// TODO Auto-generated method stub
		
		return userdao.selectOne(uid);
	}

	@Override
	public void modUser(UserVO uservo) throws Exception {
		// TODO Auto-generated method stub
		userdao.moduser(uservo);
	}

	@Override
	public void delUser(String uid) throws Exception {
		// TODO Auto-generated method stub
		userdao.deluser(uid);
	}

}
