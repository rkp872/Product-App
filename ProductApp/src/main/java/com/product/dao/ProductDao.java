package com.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.product.model.Product;

@Component
public class ProductDao 
{
	@Autowired
	private HibernateTemplate hibernate;
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernate.saveOrUpdate(product);
	}
	//get All Product
	public List<Product> getAllProducts()
	{
		List<Product> products=this.hibernate.loadAll(Product.class);
		return products;
	}
	
	//getSingle Product
	public Product getProduct(int pid)
	{
		Product p=this.hibernate.get(Product.class, pid);
		return p;
	}
	
	// delet single product
	@Transactional	
	public void deleteProduct(int pid)
	{
		Product p=this.hibernate.get(Product.class, pid);
		this.hibernate.delete(p);
	}
	
	@Transactional	
	public void updateProduct(int pid)
	{
		Product p=this.hibernate.get(Product.class, pid);
		this.hibernate.update(p);
	}
}
