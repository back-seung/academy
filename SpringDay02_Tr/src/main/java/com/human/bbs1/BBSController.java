package com.human.bbs1;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.DAO.IF_BBSDAOImpl;
import com.human.VO.BBSVO;
import com.human.service.IF_BBSService;
import com.human.service.IF_BBSServiceImpl;

@Controller
public class BBSController {
	@Inject
	private IF_BBSService bbsService;
	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String inputForm(Locale locale, Model model) throws Exception{
		
		return "bbs/inputForm";		
	}
	@RequestMapping(value = "/inputSave", method = RequestMethod.POST)
	public String inputSave(BBSVO bbsvo, Locale locale, Model model) throws Exception{
		bbsService.insert(bbsvo);
		return "redirect:/bbsList";		// 컨트롤러 재호출
	}
	@RequestMapping(value = "/bbsModinput", method = RequestMethod.POST)
	public String bbsModinput(BBSVO bbsvo, Locale locale, Model model) throws Exception {
		bbsService.modBBSUpdate(bbsvo);
		return "redirect:/bbsList";		// 컨트롤러 재호출
	}	
	@RequestMapping(value = "/bbsList", method = RequestMethod.GET)
	public String bbsList(Locale locale, Model model) throws Exception {
		model.addAttribute("bbslist", bbsService.bbsList());
		return "bbs/bbsList";		
	}
	@RequestMapping(value = "/bbsView", method = RequestMethod.GET)
	public String bbsView(Locale locale, Model model, @RequestParam("bbsindex") int vidx) throws Exception{
		model.addAttribute("oneData", bbsService.viewDetail(vidx));
		return "bbs/bbsView";
	}
	@RequestMapping(value = "/bbsDelete", method = RequestMethod.GET)
	public String bbsdelete(HttpServletRequest request, Locale locale, Model model) throws Exception{
		int viewIndex = Integer.parseInt(request.getParameter("bbsindex"));
		bbsService.delBBS(viewIndex);
		
		return "redirect:/bbsList";		// 컨트롤러 재호출
	}
	@RequestMapping(value = "/bbsMod", method = RequestMethod.GET)
	public String bbsMod(HttpServletRequest request, Locale locale, Model model) throws Exception{
		int viewIndex = Integer.parseInt(request.getParameter("bbsindex"));
	
		model.addAttribute("oneData", bbsService.modBBSForm(viewIndex));
		return "bbs/bbsModForm";		// 컨트롤러 재호출
	}
}



















