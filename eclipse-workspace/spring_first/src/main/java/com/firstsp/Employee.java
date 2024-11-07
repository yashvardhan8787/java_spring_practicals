package com.firstsp;

public class Employee {
	private int eid;

	public Employee(int eid) {
		super();
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
