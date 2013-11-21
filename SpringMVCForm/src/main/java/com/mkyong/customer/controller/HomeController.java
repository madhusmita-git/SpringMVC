package com.mkyong.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public @ResponseBody String getHomeInfo() {
		return "WELCOME";
	}
	
	@RequestMapping(value="/{path}", method=RequestMethod.GET)
	public @ResponseBody String getCustomParam(@PathVariable String path, @RequestParam String param1,
			@RequestParam int param2) {
		return "CustomParam: " + path + " -> " + param1 + " -> " + param2;
	}
}