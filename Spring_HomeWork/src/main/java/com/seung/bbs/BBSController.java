package com.seung.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.seung.VO.Page_VO;
import com.seung.VO.Site_VO;
import com.seung.service.IF_Reply_Service;
import com.seung.service.IF_Site_Service;

@Controller
public class BBSController {
	@Inject
	private IF_Site_Service bbsService; // 서비스객체
	@Inject
	private IF_Reply_Service replyService;

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
	public String selectAll(Model model, Page_VO pageVO) throws Exception {
		if (pageVO.getPage() == null) {
			pageVO.setPage(1);
		}
		pageVO.setPerPageNum(10);
		pageVO.setTotalCount(bbsService.boardCNT());
		System.out.println("전체글 개수  : " + pageVO.getTotalCount());
		System.out.println("현재 페이지  : " + pageVO.getPage());
		model.addAttribute("siteList", bbsService.selectAll(pageVO));
		model.addAttribute("pageVO", pageVO);
		System.out.println(pageVO.getStartPage());
		System.out.println(pageVO.getEndPage());
		return "bbs/siteList";
	}

	@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
	public String selectOne(Model model, int index) throws Exception {
		model.addAttribute("siteData", bbsService.selectOne(index));
		model.addAttribute("replyList", replyService.selectAll(index));
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
