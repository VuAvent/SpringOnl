package com.vuavent.springO.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class NhanVien {
	String name;
	String address;
	int age;
	GiamDoc gdoc;
	List<GiamDoc> list;
	Map<String, Object> map;
	Properties properties;
	
	public void start(){
		System.out.println("Init ne");
	}
	
	public void destroy() {
		System.out.println("Destroy ne");
	}
	
	public NhanVien createNV() {
		NhanVien nv = new NhanVien();
		nv.setName("abc");
		return nv;
	}
	public void getThongBao() {
		System.out.println("E ml " + name);
	}
	
	public NhanVien(){	
	}
	
	public NhanVien(GiamDoc gdoc) {
		this.gdoc = gdoc;
	}
	
	public NhanVien(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public NhanVien(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GiamDoc getGdoc() {
		return gdoc;
	}

	public void setGdoc(GiamDoc gdoc) {
		this.gdoc = gdoc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<GiamDoc> getList() {
		return list;
	}

	public void setList(List<GiamDoc> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	
	
	
}
