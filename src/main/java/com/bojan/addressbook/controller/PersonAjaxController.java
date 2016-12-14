package com.bojan.addressbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonAjaxController {
	
	@GetMapping("addressbook-ajax")
	public String showPerson(){
		return "addressbook-ajax";
	}

}
