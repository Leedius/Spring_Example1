package com.study.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller : 해당 클래스가 컨트롤러 역할을 하는 클래스임을 지정
@Controller
public class TestController {
	
	//첫 페이지
	//http://localhost:8081 주소입력
	@GetMapping("/")
	public String start() {
		return "index";
	}
	
	//테스트 페이지
	//http://localhost:8081/test 주소입력
	@GetMapping("/test")
	public String goMain() {
		//찾아가는 html파일명
		//.html이라는 확장자는 작성하지 않는다.
		return "main";
	}
	
	//로그인 페이지
	//http://localhost:8081/login 주소입력
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}

}
