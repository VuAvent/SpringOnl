package com.vuavent.springO.entity;

public class GiamDoc extends NhanVien {
	String chucvu;

	public GiamDoc(String chucvu, String name, int age) {
		super(name, age);
		this.chucvu = chucvu;
	}
	public GiamDoc() {
		
	}
	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	
}
