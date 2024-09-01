package com.praactices.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {
	
	@RequestMapping( value ="/about",method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler") ;
//		putting data in model
	   model.addAttribute("name", "sharad");
	   model.addAttribute("currentDate",new Date().toLocaleString());
       return "about";
	}
//	hundler for iterator
	@GetMapping("/loop")
	public String iterathundler(Model model) {
		 
		List<String> list = List.of("Ankit","Laxmi","Karan","Johan");
		model.addAttribute("names", list);
		
		return "iterat";
	}
	
//	hundler for conditional
	@GetMapping("/condition")
	public String  conditionalHundler(Model model) {
		
		System.out.println("condtional is excuted...."); 
		model.addAttribute("isActive", false);
		model.addAttribute("gender", "F");
		
		List<Integer> list = List.of(12);
		model.addAttribute("myList", list);
		return "condition";
	}
	
//	hundler for including fragments
	@GetMapping("/service")
	public String serverHandler(Model model) {
		
		
		return "service";
	}

}
