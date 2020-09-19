package com.vuavent.springO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vuavent.springO.entity.NhanVien;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
	
	@GetMapping
	public String Default() {
		return "chitiet";
	}
	
	@PostMapping
	public String ShowThongTin(@ModelAttribute NhanVien nv, ModelMap modelMap) {
		modelMap.addAttribute("nv", nv);
		return "chitiet";
	}
	@RequestMapping(path="/test", method=RequestMethod.GET)
	public String chitiet(@RequestParam("id") int id, @RequestParam("sp") String sp, ModelMap modelMap) {
		modelMap.addAttribute("id", id);
		modelMap.addAttribute("sp", sp);
		return "chitiet"; 
	}
	
	@RequestMapping(path="/test/{id}")
	public String GetChitiet(@PathVariable("id") int id, @MatrixVariable("sp") String sp, ModelMap modelMap) {
		modelMap.addAttribute("id", id);
		modelMap.addAttribute("sp", sp);
		return "chitiet";
	}
	
	
}
