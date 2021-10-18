package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


	/**
	 * 
	 * @author user
	 * 클래스 단독 매핑
	 * 
	 * */


@Controller
@RequestMapping("/guestbook/*")
public class GusetbookController {

	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestbookController.delete()";
	}
	
}
