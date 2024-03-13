package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Login;

@Controller
public class TheController
{
	@GetMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	@GetMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	@PostMapping("/authenticate")
    public String authenticate(@RequestParam String id, @RequestParam String password, Model model) {
        Login login = new Login();
        return login.authenticate(id, password, model);
    }
}


