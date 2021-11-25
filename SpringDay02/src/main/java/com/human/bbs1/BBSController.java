package com.human.bbs1;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.BBS_VO;
import com.human.service.IF_BBSService;

@Controller
public class BBSController {
	private IF_BBSService bbsService; // 서비스 객체

	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String inputForm() throws Exception {
		return "BBS/inputForm";
	}

	@RequestMapping(value = "/inputSave", method = RequestMethod.POST)
	public String inputSave(BBS_VO bbsvo, Locale locale, Model model) throws Exception {
		bbsService.insert(bbsvo);
		return "redirect:/bbsList"; // 컨트롤러 재호출
	}

//	@RequestMapping(value = "/bbsList", method = RequestMethod.POST)
//	public String bbsModInput(HttpServletRequest request, Locale locale, Model model) throws Exception {
//		int viewIndex = Integer.parseInt(request.getParameter("index"));
//		
//		return ;
//	}

	@RequestMapping(value = "/bbsList", method = RequestMethod.GET)
	public String bbsList(Model model) throws Exception {
		return "BBS/bbsList";
	}
}
