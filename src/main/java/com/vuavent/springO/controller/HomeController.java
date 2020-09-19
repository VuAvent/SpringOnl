package com.vuavent.springO.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpConnectTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.propertyeditors.InputStreamEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vuavent.springO.entity.GiamDoc;
import com.vuavent.springO.entity.NhanVien;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("/bean")
	@ResponseBody
	public String HomeView(){
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nhanvien = (NhanVien) context.getBean("nhanvien");
//		nhanvien.getThongBao();
//		for(GiamDoc value : nhanvien.getList())
//		{
//			System.out.println(value.getName());
//		}
//		System.out.println(nhanvien.getGdoc().getName() + nhanvien.getGdoc().getAge() + nhanvien.getGdoc().getAddress());
		
//		GiamDoc gdoc = (GiamDoc) nhanvien.getMap().get("key2");
//		System.out.println(gdoc.getName());
		
//		for(Entry<String, Object> entry : nhanvien.getMap().entrySet())
//		{
//			System.out.println(entry.getKey());
//		}
		
//		String jdbc = nhanvien.getProperties().getProperty("jdbc");
//		System.out.println(jdbc);
		
//		nhanvien.setName("Le thi a");
//		System.out.println(nhanvien.getName());
//		
//		NhanVien nhanvien2 = (NhanVien) context.getBean("nhanvien");
//		System.out.println(nhanvien2.getName());
//		System.out.println(nhanvien2.getGdoc().getName());
		
//		System.out.println(nhanvien.getGdoc().getChucvu());
		
		((ClassPathXmlApplicationContext)context).close();
		return "abc";
	}
	
	@GetMapping
	public ModelAndView trangchuCach1() {
		ModelAndView viewTrangchu = new ModelAndView();
		viewTrangchu.setViewName("home");
	
		NhanVien nv = new NhanVien();
		nv.setAddress("nam phuoc");
		nv.setAge(19);
		nv.setName("Vu");
		viewTrangchu.addObject("nhanvien", nv);

		NhanVien nv2 = new NhanVien();
		nv2.setAddress("dn");
		nv2.setAge(20);
		nv2.setName("Minh");
		viewTrangchu.addObject("nhanvien2", nv2);
		
		List<NhanVien> list = new ArrayList<NhanVien>();
		list.add(nv);
		list.add(nv2);
		viewTrangchu.addObject("listnv", list);
		
		return viewTrangchu;
	}
	
	@RequestMapping("1")
	public ModelAndView trangchuCach2(ModelMap modelMap) {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		NhanVien nv = new NhanVien();
		nv.setAddress("nam phuoc");
		nv.setAge(19);
		nv.setName("Vu");

		NhanVien nv2 = new NhanVien();
		nv.setAddress("dn");
		nv.setAge(20);
		nv.setName("Minh");
		
		List<NhanVien> list = new ArrayList<NhanVien>();
		list.add(nv);
		list.add(nv2);
		modelMap.addAttribute("listnv", list);
		return view;
	}
	
	

}
