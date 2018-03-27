package com.shn;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandingController {
	
	@RequestMapping("/")
	public ModelAndView landing() {
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("msg", "hello world");
		
		return model;
		
	}
	

}
