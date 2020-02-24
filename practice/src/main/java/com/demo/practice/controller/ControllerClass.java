package com.demo.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.practice.dao.LoginRepository;
import com.demo.practice.model.Login;

@Controller
public class ControllerClass {

	@Autowired
	LoginRepository loginRepository;
	
	@RequestMapping(value = "") 
	public String displayLogin(Model model) { 
	    model.addAttribute("login", new Login()); 
	    return "Login"; 
	}

	@RequestMapping(value = "/welcome")
	public String welcome(@Validated @ModelAttribute("login")Login login, BindingResult br) {
		if(br.hasErrors())
		{
			return "Login";
		}
		loginRepository.save(login);
		return "index";
	}
	@RequestMapping(value = "/logout")
	public String logout() {
		                
		return "Logout";
	}
}
