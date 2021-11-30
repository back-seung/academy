package com.seung.bbs;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.seung.VO.Site_VO;
import com.seung.service.IF_Site_Service;

@Controller
public class BBSController {
	@Inject
	private IF_Site_Service bbsService; // 서비스객체

	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String inputForm() throws Exception {

		return "bbs/inputForm";
	}

	@RequestMapping(value = "/inputSave", method = RequestMethod.POST)
	public String inputSave(Site_VO siteVO) throws Exception {
		bbsService.insert(siteVO);
		return "redirect:/siteList"; // 컨트롤러 재호출
	}

	@RequestMapping(value = "/siteList", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		model.addAttribute("siteList", bbsService.selectAll());
		return "bbs/siteList";
	}

	@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
	public String selectAOne(Model model, @RequestParam("index") int OneIndex) throws Exception {
		model.addAttribute("siteData", bbsService.selectOne(OneIndex));
		return "bbs/selectOne";
	}

	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(Model model, @RequestParam("index") int ModIndex) throws Exception {
		model.addAttribute("siteData", bbsService.updateView(ModIndex));
		return "bbs/ModForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String siteUpdate(Site_VO siteVO) throws Exception {
		bbsService.update(siteVO);
		return "redirect:/siteList";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String siteDelete(@RequestParam("index") int no) throws Exception {
		bbsService.delete(no);
		return "redirect:/siteList";
	}

}
