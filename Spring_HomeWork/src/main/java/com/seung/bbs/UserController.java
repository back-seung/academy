package com.seung.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.seung.VO.User_VO;
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

	@RequestMapping(value = "/UserList", method = RequestMethod.GET)
	public String UserSelectAll(Model model) throws Exception {
		model.addAttribute("userList", Service.selectAll());
		return "user/UserList";
	}

	@RequestMapping(value = "/userModForm", method = RequestMethod.GET)
	public String userModForm(Model model, @RequestParam("id") String id) throws Exception {
		model.addAttribute("user", Service.selectOne(id));
		return "user/userModForm";
	}

	@RequestMapping(value = "/UserUpdate", method = RequestMethod.POST)
	public String updateUser(User_VO userVO) throws Exception {
		Service.UserUpdate(userVO);
		return "redirect:/UserList";
	}

	@RequestMapping(value = "/UserDelete", method = RequestMethod.GET)
	public String UserDelete(@RequestParam("pwd") String pwd) throws Exception {
		Service.UserDelete(pwd);
		return "redirect:/UserList";
	}
}
