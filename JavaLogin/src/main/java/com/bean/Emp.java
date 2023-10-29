package com.bean;

import java.io.Serializable;

public class Emp implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private String address;
	private String role;
	private String pass;

	public Emp() {
		this.name = "";
		this.email = "";
		this.address = "";
		this.role = "";
		this.pass = "";
	}

	public Emp( String name, String email, String address, String role, String pass) {

		this.name = name;
		this.email = email;
		this.address = address;
		this.role = role;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
