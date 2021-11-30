package com.seung.DAO;

import java.util.List;

import com.seung.VO.User_VO;

public interface IF_User_DAO {
	public void UserInput(User_VO userVO) throws Exception;

	public List<User_VO> selectAll() throws Exception;

	public User_VO selectOne(String id) throws Exception;

	public void UserUpdate(User_VO userVO) throws Exception;

	public void UserDelete(String pwd) throws Exception;
}
