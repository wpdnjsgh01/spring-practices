package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author user
 * @RequestMapping 클래스 + 메소드
 */

@Controller
public class UserController {

	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/view/join.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam(value="n", required=false, defaultValue="") String name) {
		return "UserController.update()";
	}
	
}
