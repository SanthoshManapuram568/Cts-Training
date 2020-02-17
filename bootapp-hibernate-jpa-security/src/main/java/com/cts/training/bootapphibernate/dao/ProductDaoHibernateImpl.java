package com.cts.training.bootapphibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapphibernate.entity.Product;


@Repository
@Transactional
public class ProductDaoHibernateImpl implements IProductDao{
	private EntityManager em;
	

	@Autowired
	public ProductDaoHibernateImpl(EntityManager em) {
		// TODO Auto-generated constructor stub
		this.em=em;
		
	}
	@Override
	public List<Product> findAll() {	
	//Session session = this.sessionFactory.getCurrentSession();
	Query query = this.em.createQuery("from Product");
	//Query<Product> query =  session.createQuery("from Product",Product.class);
	List<Product> products = query.getResultList();
		
	return products;

	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		//Session session = this.sessionFactory.getCurrentSession();
		Product product = this.em.find(Product.class, id);
		
		return product;

	}

	@Override
	public boolean add(Product product) {	
	
//	Session session = this.sessionFactory.getCurrentSession();
	
	this.em.merge(product);
	
	return true;

	
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		//Session session = this.sessionFactory.getCurrentSession();
		
		this.em.merge(product);
		return true;

	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
//Session session = this.sessionFactory.getCurrentSession();
		
		this.em.remove(this.findById(id));
		return true;
		}


}
