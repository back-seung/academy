package com.seung.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.seung.DAO.IF_User_DAO;
import com.seung.VO.User_VO;

@Service
public class User_ServiceImpl implements IF_User_Service {
	@Inject
	private IF_User_DAO userdao;

	@Override
	public void UserInput(User_VO userVO) throws Exception {
		userdao.UserInput(userVO);
	}

	@Override
	public List<User_VO> selectAll() throws Exception {
		return userdao.selectAll();
	}

	@Override
	public User_VO selectOne(String id) throws Exception {
		return userdao.selectOne(id);
	}

	@Override
	public void UserUpdate(User_VO userVO) throws Exception {
		userdao.UserUpdate(userVO);
	}

	@Override
	public void UserDelete(String pwd) throws Exception {
		userdao.UserDelete(pwd);
	}

}
