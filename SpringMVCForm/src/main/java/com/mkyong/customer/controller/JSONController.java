package com.mkyong.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.customer.model.Shop;

@Controller
@RequestMapping("/shop")
public class JSONController {

	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public @ResponseBody Shop getStaffInformation(@PathVariable String name) {
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
		return shop;
	}
}