package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.customer.model.Coffee;

@Controller
@RequestMapping("/coffee")
public class XMLController {
	
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public @ResponseBody Coffee getCoffeeInfo(@PathVariable String name) {
		Coffee cof = new Coffee(name, 10);
		return cof;
	}
}
