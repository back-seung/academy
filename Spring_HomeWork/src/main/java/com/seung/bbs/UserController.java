package com.seung.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seung.VO.User_VO;
import com.seung.service.IF_Site_Service;
import com.seung.service.IF_User_Service;

@Controller
public class UserController {
	@Inject
	IF_User_Service Service;

	@RequestMapping(value = "/userInputForm", method = RequestMethod.GET)
	public String UserInputForm() throws Exception {
		return "user/userInputForm";
	}

	@RequestMapping(value = "/UserInput", method = RequestMethod.POST)
	public String UserInput(User_VO userVO) throws Exception {
		Service.UserInput(userVO);
		return "user/userHome";
	}
}
