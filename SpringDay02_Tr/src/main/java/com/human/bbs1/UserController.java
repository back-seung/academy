package com.human.bbs1;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.DAO.IF_UserDAO;
import com.human.DAO.IF_UserDAOImpl;
import com.human.VO.UserVO;
import com.human.service.IF_UserService;

@Controller
public class UserController {
	@Inject
	IF_UserService userSrv;	
	
	@RequestMapping(value = "/addUserForm", method = RequestMethod.GET)
	public String inputForm(Locale locale, Model model) throws Exception{		
		return "user/inputForm";		
	}
	
	@RequestMapping(value = "/adduserinput", method = RequestMethod.POST)
	public String adduserinput(UserVO uservo, Locale locale, Model model) throws Exception{		
	//	System.out.println(uservo.getName());  // 진짜 자동 매핑이 되는가?
		userSrv.insert(uservo);
		return "redirect:/userList";		
	}
	
	@RequestMapping(value = "/userMod", method = RequestMethod.POST)
	public String userModinput(UserVO uservo, Locale locale, Model model) throws Exception{
		userSrv.modUser(uservo);
		return "redirect:/userList";
	}
	@RequestMapping(value = "/userMod", method = RequestMethod.GET)
	public String userMod(@RequestParam("uid") String uid, Locale locale, Model model) throws Exception{
		// 수정할 데이터를 검색해서 리턴해 주는 역활
	//	System.out.println(uservo.getName());  // 진짜 자동 매핑이 되는가?
	//	userSrv.insert(uservo);
	            // 처리
		model.addAttribute("moddata", userSrv.selectOne(uid));      //처리와 응답		
		return "user/modForm";		    // 응답
	}
	@RequestMapping(value = "/userDel", method = RequestMethod.GET)
	public String userDel(@RequestParam("uid") String uid, Locale locale, Model model) throws Exception{
	    // 처리
		userSrv.delUser(uid);
		//model.addAttribute("moddata", userSrv.selectOne(uid));      //처리와 응답		
		return "redirect:/userList";		    // 응답
	}
	
	
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String userList(Locale locale, Model model) throws Exception{		
	//	System.out.println(uservo.getName());  // 진짜 자동 매핑이 되는가?
		model.addAttribute("userList", userSrv.selectAll());  // select * from huser;
		return "user/userList";		
	}
}
