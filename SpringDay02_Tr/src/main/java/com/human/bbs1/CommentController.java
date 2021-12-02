package com.human.bbs1;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.DAO.IF_CommentDAO;
import com.human.VO.BBSVO;
import com.human.VO.CommentVO;
import com.human.service.IF_CommentService;

@Controller
public class CommentController {
	@Inject
	private IF_CommentService commentSrv;
	
	@RequestMapping(value = "/commentInput", method = RequestMethod.POST)
	public String inputSave(CommentVO cvo, Locale locale, Model model) throws Exception{
		commentSrv.insert(cvo);  // 서비스 레이어를 통해서 작업을 의뢰
		return "redirect:/bbsView?bbsindex="+cvo.getBbs_no();		// 컨트롤러 재호출
	}
}
