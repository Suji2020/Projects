package com.agilisium.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class LoginController {

	@RequestMapping("/login")
	public String firstPage() {
		return "login";
	}
	
	 
    @RequestMapping(value={"/","home"})
        public String home(){
            return "home";
        }
  
    @RequestMapping(value="/user")
    public String user(){
        return "user";
    }
 
    @RequestMapping(value="/admin")
    public String admin(){
        return "admin";
    }
  
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
}
