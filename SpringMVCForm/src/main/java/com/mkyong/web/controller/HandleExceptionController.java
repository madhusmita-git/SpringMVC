package com.mkyong.web.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.web.exception.CustomGenericException;

@Controller
public class HandleExceptionController {
	
	@RequestMapping(value = "/errcheck/{type}-{id}", method = RequestMethod.GET)
	public ModelAndView getPages(@PathVariable("type") String type, @PathVariable("id") int id) throws Exception {
		System.out.println("Type: " + type + ", Id: " + id);
		
		if ("error".equals(type)) {
			// go handleCustomException
			throw new CustomGenericException("E888", "This is custom message");
		} else if ("io-error".equals(type)) {
			// go handleAllException
			throw new IOException();
		} else {
			return new ModelAndView("index").addObject("msg", type + "-" + id);
		}
	}
 
	@ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(CustomGenericException ex) { 
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("exception", ex);
		return model; 
	}
 
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(IOException ex) { 
		ModelAndView model = new ModelAndView("error/exception_error");
		model.addObject("exception", ex);
		return model; 
	}	
	
}
