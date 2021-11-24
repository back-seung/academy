package com.hom.bbs23;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.swing.Popup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hom.VO.Book_VO;

@Controller
public class BBSController {
	ArrayList<Book_VO> bookList = new ArrayList<Book_VO>();

	@RequestMapping(value = "/inputSubmit", method = RequestMethod.GET)
	public String inputForm() {
		return "BBS/inputSubmit";
	}

	@RequestMapping(value = "/inputSave", method = RequestMethod.POST)
	public String inputSave(HttpServletRequest request) {
		Book_VO myB = new Book_VO();
		myB.setAuthor(request.getParameter("author"));
		myB.setTitle(request.getParameter("title"));
		myB.setGenre(request.getParameter("genre"));
		myB.setCompany(request.getParameter("company"));
		myB.setInfo(request.getParameter("info"));
		bookList.add(myB);
		return "redirect:/inputList";
	}

	@RequestMapping(value = "/inputList", method = RequestMethod.GET)
	public String inputList(Model model) {
		model.addAttribute("bookList", bookList);
		return "BBS/inputList";
	}

	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String listDetail(Model model, HttpServletRequest request) {
		int viewIndex = Integer.parseInt(request.getParameter("index"));
		Book_VO bookVO = bookList.get(viewIndex);
		int cnt = bookVO.getCnt();
		cnt++;
		bookVO.setCnt(cnt);
		model.addAttribute("oneData", bookVO);
		return "BBS/listDetail";
	}

	@RequestMapping(value = "/listDelete", method = RequestMethod.GET)
	public String deleteList(Model model, HttpServletRequest request) {
		int delIndex = Integer.parseInt(request.getParameter("index"));
		Book_VO bookVO = bookList.get(delIndex);
		bookList.remove(delIndex);
		return "redirect:/inputList";
	}

	@RequestMapping(value = "/listUpdate", method = RequestMethod.GET)
	public String updateList(Model model, HttpServletRequest request) {
		int updateIndex = Integer.parseInt(request.getParameter("index"));
		Book_VO bookVO = bookList.get(updateIndex);
		model.addAttribute("oneData", bookVO);
		return "BBS/listUpdate";
	}

	@RequestMapping(value = "/doUpdate", method = RequestMethod.POST)
	public String doUpdate(Model model, HttpServletRequest request) {
		int updateIndex = Integer.parseInt(request.getParameter("index"));
		Book_VO bookVO = bookList.get(updateIndex);
		System.out.println(bookVO.getAuthor());
		System.out.println(bookVO.getInfo());
		bookVO.setAuthor(request.getParameter("author"));
		bookVO.setInfo(request.getParameter("info"));
		return "redirect:/inputList";
	}
}
