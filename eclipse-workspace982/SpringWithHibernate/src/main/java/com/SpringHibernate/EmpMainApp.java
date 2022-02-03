package com.SpringHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDaoImpl");

		Employee employee = new Employee();
		employee.setName("Dinesh");
		employee.setAge(25);
		employee.setSalary(50000l);
		System.out.println("------Records Creation--------");
		empDao.createEmployee(employee);
		System.out.println("------Listing Multiple Records--------");
		@SuppressWarnings("unchecked")
		List<Employee> employees = empDao.listEmployees();
		for (Employee emp : employees) {
			System.out.print(emp);
		}
		System.out.println("------find one Records--------");
		Employee employee1 = empDao.getEmployee(3);
		System.out.print(employee1);
		System.out.println("------Delete one Records--------");
		empDao.delete(employee1);
	}

}
