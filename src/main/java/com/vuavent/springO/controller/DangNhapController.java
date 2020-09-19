package com.vuavent.springO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class DangNhapController {
	@GetMapping
	public String Default() {
		return "login";
	}
	@PostMapping
	public String PostLogin(@RequestParam String username, @RequestParam String pass) {
		if(username.equals("Vu") && pass.equals("vu")) {
			return "redirect:/";
		}
		return "login";
	}
}
