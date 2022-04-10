package com.SpringBootScratch.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootScratch.Models.Users;
import com.SpringBootScratch.Repository.UsersRepository;
import com.SpringBootScratch.Service.UsersService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@Controller
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private final UsersService usersService;
	
	public UsersController (UsersService usersService) {
		   this.usersService = usersService;
	}
	@GetMapping("/register")
	public String getRegisterPage(Model model) {
		model.addAttribute("registerRequest", new Users());
		return "registration";
	}
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("loginRequest", new Users());
		return "login";
	}
	
	@GetMapping("/codebyme")
	public String getcodePage(Model model) {
		model.addAttribute("codeRequest", new Users());
		return "codebyme";
	}
	@GetMapping("/home")
	public String getProfilePage(Model model) {
		model.addAttribute("profileRequest", new Users());
		return "home";
	}
	
	@PostMapping("/register")  
	public String register(@ModelAttribute Users u,Model model) {
		System.out.println("register request"+u);
		Users registerdUser =  usersService.registerUsers(u.getUname(),u.getUemail() ,u.getUpwd() ,u.getPhone() );

		return registerdUser == null ? null : "redirect:/login";
	}
	
	@PostMapping("/login") 
	public String login(@ModelAttribute Users u,Model model) {
		System.out.println("login request"+u);	
		Users authenticated =  usersService.authenticate(u.getUemail() ,u.getUpwd());
		if(authenticated != null) {
			model.addAttribute("userLogin", authenticated.getUname());
			return "home";
		}else{
		    return null;
		}
	}
}
