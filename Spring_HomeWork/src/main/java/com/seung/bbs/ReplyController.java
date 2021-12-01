package com.seung.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.seung.VO.Reply_VO;
import com.seung.service.IF_Reply_Service;

@Controller
public class ReplyController {
	@Inject
	private IF_Reply_Service service;

	@RequestMapping(value = "/CMTInsert", method = RequestMethod.POST)
	public String CMTInsert(Reply_VO reVO, RedirectAttributes rttr, @RequestParam("sno") int sno) throws Exception {
		service.CMTInsert(reVO);
		return "redirect:/selectOne?index=" + sno;
	}

	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAllCMT(Model model, @RequestParam("sno") int sno) throws Exception {
		model.addAttribute("replyList", service.selectAll(sno));
		return "redirect:/seleltOne?index=" + sno;
	}
}
