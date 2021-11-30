package com.seung.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.seung.VO.Reply_VO;
import com.seung.service.IF_Reply_Service;

@Controller
public class ReplyController {
	@Inject
	private IF_Reply_Service service;

	@RequestMapping(value = "/CMTInsert", method = RequestMethod.POST)
	public String CMTInsert(Reply_VO reVO, RedirectAttributes rttr) throws Exception {
		System.out.println("Ctrr : " + reVO.getCmt());
		service.CMTInsert(reVO);
		rttr.addAttribute("cmt", reVO.getCmt());
		return "redirect:/selectOne";
	}
}
