package com.human.bbs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // �������� ������
public class BBSController {
	@RequestMapping(value = "/bbsInputForm", method = RequestMethod.GET)
	public String bbsInputForm() {
		// 파라미터 없어도 됨
		return "bbsInput";
	}

	@RequestMapping(value = "/bbsInput", method = RequestMethod.POST)
	public String bbsInput(HttpServletRequest HttpServletRequest) {
		// 파라미터가 있어야 함
		String title = HttpServletRequest.getParameter("title");
		String author = HttpServletRequest.getParameter("author");
		String content = HttpServletRequest.getParameter("content");

		// DTO 만들고 DB 작업 코드! but, 테스트로 값만 확인함
		System.out.println("title : " + title + "\nauthor : " + author + "\ncontent : " + content); 
		
		return "bbslist";
	}
}
