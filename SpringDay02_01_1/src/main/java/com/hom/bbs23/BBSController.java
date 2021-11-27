package com.hom.bbs23;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hom.DAO.IF_BBSDAO;
import com.hom.Service.IF_BBSService;
import com.hom.VO.Book_VO;

@Controller
public class BBSController {
	@Inject
	private IF_BBSService bbsService;


	@RequestMapping(value = "/inputSubmit", method = RequestMethod.GET)
	public String inputForm() {
		return "BBS/inputSubmit";
	}

	@RequestMapping(value = "/inputSave", method = RequestMethod.POST)
	public String inputSave(Book_VO bookVO) throws Exception {
		bbsService.insert(bookVO);
		return "redirect:/viewList";
	}

	// 업데이트 창 이동
	@RequestMapping(value = "/listUpdate", method = RequestMethod.GET)
	public String updateList(Model model, @RequestParam("index") int no) throws Exception {
		model.addAttribute("oneData", bbsService.updateView(no));
		return "BBS/listUpdate";
	}

	// 수정 실제로 ㄱ
	@RequestMapping(value = "/modInput", method = RequestMethod.POST)
	public String update(Book_VO bookVO) throws Exception {
		System.out.println(bookVO.getAuthor());
		System.out.println(bookVO.getInfo());
		bbsService.update(bookVO);
		return "redirect:/viewList";
	}

	@RequestMapping(value = "/viewList", method = RequestMethod.GET)
	public String list(@ModelAttribute("searchVO") Book_VO searchVO, Model model) throws Exception {
		model.addAttribute("viewList", bbsService.selectAll());
		return "BBS/viewList";
	}

	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String listDetail(Model model, @RequestParam("index") int no) throws Exception {
		model.addAttribute("oneData", bbsService.selectOne(no));
		return "BBS/listDetail";
	}

	@RequestMapping(value = "/listDelete", method = RequestMethod.GET)
	public String deleteList(Model model, @RequestParam("index") int no) throws Exception {
		bbsService.delete(no);
		return "redirect:/viewList";
	}

}
