package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		System.out.println("list CoustomerDaoImpl");
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> root = cq.from(Customer.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	/*
	 * @Override public List < Customer > searchCustomers(int theMobile) { Session
	 * session = sessionFactory.getCurrentSession(); CriteriaBuilder cb =
	 * session.getCriteriaBuilder();
	 * 
	 * CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
	 * 
	 * 
	 * 
	 * Root<Customer> root = cq.from(Customer.class);
	 * System.out.println("the mobile number is " + root.get("mobile"));
	 * 
	 * In<Object> inClause = cb.in(root.get("mobile")); cq.where(inClause);
	 * //cq.select(root) .where(root.get("mobile").in(titles)); TypedQuery<Customer>
	 * query = session.createQuery(cq);
	 * 
	 * System.out.println("Hibernate Query in customerDAOImpl class is "+query);
	 * return query.getResultList();
	 * 
	 * }
	 */
	@Override
	public void deleteCustomer(int id) {
		System.out.println("delete cust int id CoustomerDaoImpl");
		Session session = sessionFactory.getCurrentSession();
		Customer book = session.byId(Customer.class).load(id);
		session.delete(book);
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		System.out.println("save CoustomerDaoImpl");
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		System.out.println("getCustomers CoustomerDaoImpl");
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

}