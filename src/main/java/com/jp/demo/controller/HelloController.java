package com.jp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.demo.entity.Person;

@Controller
public class HelloController {
	
@RequestMapping(value="/hello",method=RequestMethod.GET)
public String index(Model model) {
	return "index";
}

@RequestMapping(value="/greeting",method=RequestMethod.POST)
public  String greeting(Model model,@ModelAttribute("form") Person p){
	
	model.addAttribute("name",p.getName());
	return "greeting";
}
}
