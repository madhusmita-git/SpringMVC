package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	@ResponseBody
	public String getHomeInfo() {
		return "WELCOME";
	}
	
	@RequestMapping(value="/hello")
	public ModelAndView getHelloPage() {
		return new ModelAndView("hello");
	}
	
	/**
	 * getCustomParam
	 * @param path
	 * @param param1 (e.g. http://localhost:8080/SpringMVC/sample/staff?param2=3&val1=test)
	 * @param param2
	 * @return
	 */
	@RequestMapping(value="/{type}", method=RequestMethod.GET)
	@ResponseBody
	public String getCustomParam(@PathVariable String type, 
			@RequestParam(required=false, defaultValue="def1", value="val1") String param1,
			@RequestParam int param2) {
		return "CustomParam: " + type + " -> " + param1 + " -> " + param2;
	}
}