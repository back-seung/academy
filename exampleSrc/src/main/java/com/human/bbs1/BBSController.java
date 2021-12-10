package com.human.bbs1;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;
import com.human.service.IF_BBSService;
import com.human.service.IF_CommentService;
import com.human.util.FileDataUtil;

@Controller
public class BBSController {
	@Inject
	private IF_BBSService bbsService;
	@Inject
	private IF_CommentService commentService;
	@Inject
	private FileDataUtil fileDataUtil;
	
	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String inputForm(Locale locale, Model model) throws Exception{
		
		return "bbs/inputForm";		
	}
	@RequestMapping(value = "/inputSave", method = RequestMethod.POST)
	public String inputSave(BBSVO bbsvo, MultipartFile file, Locale locale, Model model) throws Exception{
		if(file.getOriginalFilename() == "") {
			System.out.println("첨부파일 없는 경우");
			bbsService.insert(bbsvo);
		}else {
			System.out.println("첨부파일이 있는 경우");
			String[] files = fileDataUtil.fileUpload(file);
			bbsvo.setFiles(files);   //클라이언트가 보낸 게시글 정보에 파일 정보를 추가..
			bbsService.insert(bbsvo);
		//	System.out.println(files[0]+" 업로드 성공!!!");
		}
		
		return "redirect:/bbsList";		// 컨트롤러 재호출
	}
	@RequestMapping(value = "/bbsModinput", method = RequestMethod.POST)
	public String bbsModinput(BBSVO bbsvo, Locale locale, Model model) throws Exception {
		bbsService.modBBSUpdate(bbsvo);
		return "redirect:/bbsList";		// 컨트롤러 재호출
	}	
	@RequestMapping(value = "/bbsList", method = RequestMethod.GET)
	public String bbsList(@ModelAttribute PageVO pagevo, Locale locale, Model model) throws Exception {
		// 처음에 page번호를 넘기지 않을 수 도 있다..
		if(pagevo.getPage() == null) {   // 클라이언트가 보낸 파라미터가 자동 매핑되고 해당 변수 값을 가져온 후 null인지 체크
			pagevo.setPage(1);
		}    // page정보
		pagevo.setPerPageNum(10);  // 페이지당 출력할 게시물 수..
		pagevo.setTotalCount(bbsService.bbscnt());  // 전체 게시글 수 ... DB작업 select count(*) from bbs;
		
		System.out.println("전체페이지수 :" + bbsService.bbscnt()  + " / 현재페이지 번호 : "+pagevo.getPage());
		System.out.println("startNo :" + pagevo.getStartNo());
		System.out.println("perpageNum :" + pagevo.getPerPageNum());
		model.addAttribute("bbslist", bbsService.bbsList(pagevo));
	//	model.addAttribute("pagevv",pagevo);
		return "bbs/bbsList";		
	}
	@RequestMapping(value = "/bbsView", method = RequestMethod.GET)
	public String bbsView(Locale locale, Model model, @RequestParam("bbsindex") int vidx) throws Exception{
		//bbsView에게 2개의 자료를 넘겨 줘야 합니다.. 서로 다른 자료..  이럴때는 서비를 분리
		// 12월6일 첨부파일 기능 추가 !!!
		/**
		 *  mybatis는 리스트 방식으로 리턴을 합니다.
		 *  vo은 첨부파일이 배열로 정의 되어 있습니다. 
		 * 
		 */
		// 첨부파일 리스트를 받아 옵니다.
		List<String> files = bbsService.selectAttach(vidx);
		//  vo은 첨부파일이 배열로 정의 되어 있습니다. 배열변화
		String[] filenames = new String[files.size()];
		int cnt=0;
		for(String fname : files) {
			filenames[cnt] = fname;
			cnt++;
		}
		// 리스트를 배열로 전환 
		
		BBSVO tempBBS = bbsService.viewDetail(vidx);
		tempBBS.setFiles(filenames);	
		
		model.addAttribute("oneData", tempBBS);
		model.addAttribute("commentList",commentService.selectallbbsno(vidx));
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



















