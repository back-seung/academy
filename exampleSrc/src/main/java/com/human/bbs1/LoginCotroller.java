package com.human.bbs1;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.UserVO;
import com.human.service.IF_UserService;

@Controller
public class LoginCotroller {
	@Inject
	IF_UserService userSrv;	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model) throws Exception{
		
		return "login/loginForm";		
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String loginOut(HttpServletRequest request, Locale locale, Model model) throws Exception{
		HttpSession session = request.getSession();
		session.invalidate(); // 모든 세션값을 지운다.		
		return "redirect:/";		
	}
	
	// 클라이언트가 아이디와 비번을 입력후 파마리터로 전송한 것이고, 컨트롤러는 이 사용자가 가입자인지 확인 후 처리
	// 절차....
	/*
	 *  1. 아이디와 비번을 받야 합니다.
	 *  2. 받은 아이디와 비번으로 데이터베이스에 회원가입여부를 조회 합니다.
	 *     2-1. select * from member where id=? and pwd=?   >> 해킹에서 노출될 수 있다. sql injection
	 *     2-2. select * from member where id=?     >>   컨트롤러에서 비번 비교 한다.
	 *  3. [2-2 선택] 컨트롤러에서 null일 경우 (회원이 아님) null이 아니면 비번을 비교 한다.
	 *  4. 3번에서 비번까지 일치 한다면 회원으로 인정하고 세션에 등록
	 */
	@RequestMapping(value = "/loginProcess",  method = RequestMethod.POST)
	public String loginpro(UserVO uservo, HttpServletRequest request, Locale locale, Model model) throws Exception {
	
		String tagetUrl = "";
		UserVO tempUservo = userSrv.selectOne(uservo.getId());   // 2번입니다.
		if(tempUservo == null) {
			// 아이디가 존재 하지 않는다..  다시 로그인  login/loginForm
			System.out.println("아이디가 없다.");
			tagetUrl= "login/loginForm";
		}else {  // 현재 아이디는 일치한다.
			if(tempUservo.getPwd().equals(uservo.getPwd())) {
				// 비번 일치..  
				// 세션등록 후  메뉴화면 이동 /
				System.out.println("로그인 성공");
				HttpSession session = request.getSession();
				session.setAttribute("userName", tempUservo.getName());
				session.setAttribute("userid", tempUservo.getId());  // 여기까지가 세션처리
				
				tagetUrl= "redirect:/";
			}else {
				//  비번불 일치  .. 다시 로그인   login/loginForm
				System.out.println("아이디 일치/비번 불일치");
				tagetUrl= "login/loginForm";
			}
		}
		return tagetUrl;
	}
	
	
	
}
