package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Report {

	@Id
	private Integer pid;
	private String pname;
	private int stock;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
