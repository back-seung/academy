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
		return "redirect:/inputList";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@ModelAttribute("searchVO") Book_VO searchVO, Model model) throws Exception {
		List<Book_VO> bookList = bbsService.select(searchVO);
		model.addAttribute("bookList", bookList);
		return "BBS/inputList";
	}

	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String listDetail(Model model, HttpServletRequest request) {
		int viewIndex = Integer.parseInt(request.getParameter("index"));
//		Book_VO bookVO = bookList.get(viewIndex);
//		int cnt = bookVO.getCnt();
//		cnt++;
//		bookVO.setCnt(cnt);
//		model.addAttribute("oneData", bookVO);
		return "BBS/listDetail";
	}

	@RequestMapping(value = "/listDelete", method = RequestMethod.GET)
	public String deleteList(Model model, HttpServletRequest request) {
		int delIndex = Integer.parseInt(request.getParameter("index"));
//		Book_VO bookVO = bookList.get(delIndex);
//		bookList.remove(delIndex);
		return "redirect:/inputList";
	}

	@RequestMapping(value = "/listUpdate", method = RequestMethod.GET)
	public String updateList(Model model, HttpServletRequest request) {
		int updateIndex = Integer.parseInt(request.getParameter("index"));
//		Book_VO bookVO = bookList.get(updateIndex);
//		model.addAttribute("oneData", bookVO);
		return "BBS/listUpdate";
	}

	@RequestMapping(value = "/doUpdate", method = RequestMethod.POST)
	public String doUpdate(Model model, HttpServletRequest request) {
		int updateIndex = Integer.parseInt(request.getParameter("index"));
//		Book_VO bookVO = bookList.get(updateIndex);
//		System.out.println(bookVO.getAuthor());
//		System.out.println(bookVO.getInfo());
//		bookVO.setAuthor(request.getParameter("author"));
//		bookVO.setInfo(request.getParameter("info"));
		return "redirect:/inputList";
	}
}
