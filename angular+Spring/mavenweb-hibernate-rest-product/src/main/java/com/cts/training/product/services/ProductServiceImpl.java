package com.cts.training.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.cts.training.product.dao.IProductDao;
import com.cts.training.product.dao.ProductDaoHibernateImpl;
import com.cts.training.product.entity.Product;
@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	
	@Qualifier("productDaoHibernateImpl")
	private IProductDao iProductDao;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return this.iProductDao.findAll();
	}

	@Override
	public Product findProductById(Integer id) {
		// TODO Auto-generated method stub
		return this.iProductDao.findById(id);
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return this.iProductDao.add(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return this.iProductDao.update(product);
	}

	@Override
	public boolean deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		return this.iProductDao.delete(id);
	}

}
