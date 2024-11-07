package com.spring.jdbc2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc2.dao.EmpDao;
import com.spring.jdbc2.entities.Employee;

public class App {
  public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/jdbc2/config.xml");
	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
	
	
	Employee c1 = new Employee();
	c1.setEid(101);
	c1.setEname("yash");
	c1.setDname("Marketing");
	int r = cd.insert(c1);
	System.out.println("Recorded inserted"+r);
	
	
	
	c1.setEid(101);
	c1.setEname("yash");
	c1.setDname("dev");
	int y = cd.update(c1);
	System.out.println("Recorded updated"+y);
	
	
	
	c1.setEid(101);
	int z = cd.delete(c1);
	System.out.println("Recorded deleted"+z);
	
	Employee e = cd.getEmployee(101);
	System.out.println(e);
	
	
	List<Employee> employee = EmpDao.getAllEmployee();
	for(Employee c2:employee ) {
		System.out.println(c1);
	}
	
	
	
			
}
}