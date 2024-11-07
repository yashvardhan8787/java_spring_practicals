package com.spring.mvc.controllers



@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is a font page ");
		return "index" ;
	}
}
