package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phone;
	private Set<String> Address;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		Address = address;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
	
	
}
