package com.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.dao.ProductDao;
import com.product.model.Product;

@Component
public class ProductService 
{
	@Autowired
	private ProductDao dao;

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	
	public void createProduct(Product product)
	{
		dao.createProduct(product);
	}
	public List<Product> getAllProducts()
	{
		List<Product> products=this.dao.getAllProducts();
		return products;
	}
	
	public Product getProduct(int pid)
	{
		Product p=this.dao.getProduct(pid);
		return p;
	}
	
	// delet single product
	
	public void deleteProduct(int pid)
	{
		this.dao.deleteProduct(pid);
	}
	
	public void updateProduct(int pid)
	{
		this.dao.updateProduct(pid);
	}
}
