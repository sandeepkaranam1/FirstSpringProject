package com.luv2code.springdemo.mvc;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeController  {

	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
	
	@RequestMapping("/showform")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String showName()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request,Model model)
	{
		String theName=request.getParameter("studentname");
		theName=theName.toUpperCase();
		theName="I love you "+theName;
		model.addAttribute("message",theName);
		return "helloworld";
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("studentname")String theName,Model model)
	{
		theName="As it is :"+theName.toUpperCase();
		model.addAttribute("message",theName);
		return "helloworld";
	}

}
