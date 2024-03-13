package com.example.demo;

import org.springframework.ui.Model;

public class Login 
{
	public String authenticate(String id, String password, Model model) {
        if ("admin".equals(id) && "password".equals(password)) {
            return "redirect:/index";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}
