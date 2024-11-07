package com.spring.jdbc2.dao;

import java.util.List;

import com.spring.jdbc2.entities.Employee;

public interface EmpDao {
	public int insert(Employee employee);	
	public int update(Employee employee);
	public int delete(Employee employee);
	
	
public Employee  getEmployee(int Eid);

public static List<Employee> getAllEmployee() {
	// TODO Auto-generated method stub
	return null;
}
	

}