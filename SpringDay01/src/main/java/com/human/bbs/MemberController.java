package com.human.bbs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@RequestMapping(value = "/memberInputForm", method = RequestMethod.GET) // /memberInputForm 위치에 GET방식으로 요청
	public String MemberInputForm() {
		return "memberInput"; // views 폴더에 memberInput.jsp 탐색후 실행
	}

	@RequestMapping(value = "/memberListForm", method = RequestMethod.GET)
	public String memberListForm(HttpServletRequest HttpServletRequest, Model model) {
		String id = HttpServletRequest.getParameter("id");
		String pw = HttpServletRequest.getParameter("pw");

		System.out.println("id : " + id + "pw : " + pw);
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "memberList";
	}
}
