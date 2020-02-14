package com.cts.training.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.product.entity.Product;

@Repository
@Transactional
public class ProductDaoHibernateImpl implements IProductDao{
	
	private SessionFactory sessionFactory;
	@Autowired
	public ProductDaoHibernateImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
		
	}
	@Override
	public List<Product> findAll() {	
		Session session = this.sessionFactory.getCurrentSession();
	Query<Product> query =  session.createQuery("from Product",Product.class);
	List<Product> products = query.getResultList();
	return products;

	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Product product = session.find(Product.class, id);
		
		return product;

	}

	@Override
	public boolean add(Product product) {	
	
	Session session = this.sessionFactory.getCurrentSession();
	
	session.save(product);
	
	return true;

	
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		
		session.update(product);
		return true;

	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
Session session = this.sessionFactory.getCurrentSession();
		
		session.remove(this.findById(id));
		return true;
		}

}
