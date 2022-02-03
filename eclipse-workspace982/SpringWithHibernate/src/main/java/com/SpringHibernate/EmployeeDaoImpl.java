package com.SpringHibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends SuperHibernateDaoSupport implements EmployeeDao {

	@Override
	public void createEmployee(Employee employee) {
		getHibernateTemplate().saveOrUpdate(employee);
	}

	@Override
	public Employee getEmployee(Integer empid) {
		return (Employee) getHibernateTemplate().get(Employee.class, empid);
	}

	@Override
	public List listEmployees() {
		return getHibernateTemplate().find("FROM EMPLOYEE");
	}

	@Override
	public void delete(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	@Override
	public void update(Employee employee) {
		getHibernateTemplate().saveOrUpdate(employee);
	}
	
}
