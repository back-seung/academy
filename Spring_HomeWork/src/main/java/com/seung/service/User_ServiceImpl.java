package com.seung.service;

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

}
