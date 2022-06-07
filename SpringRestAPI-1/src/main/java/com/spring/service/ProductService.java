package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductRepository;
import com.spring.main.Product;

@Service
public class ProductService {

@Autowired
private ProductRepository productrepository ;

public  Product addProduct (Product product) 
{
	return productrepository.save(product);
}
public Product updateProduct(Product product) {
	return productrepository.save(product);
}
public List<Product> getProduct(){
	return productrepository.findAll();
}
public void deleteProduct(Integer pid) {
	 productrepository.deleteById(pid);
}
public Product getProduct(Integer pid) {
	return productrepository.findById(pid).orElseThrow(null);
}
}