package com.cts.training.product.dao;

import java.util.List;

import com.cts.training.product.entity.Product;

public interface IProductDao {
	List<Product> findAll();
	Product findById(Integer id);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Integer id);
}
