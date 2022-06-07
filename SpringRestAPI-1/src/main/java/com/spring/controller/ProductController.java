package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.main.Product;
import com.spring.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService obj;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home page";
	}
	@GetMapping("/Product")
	public List<Product> getProduct(){
		return this.obj.getProduct();
	}
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product ) 
	{
		return  this.obj.addProduct(product);
	}	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return this.obj.updateProduct(product);
	}
	@DeleteMapping("/delete/{pid}")
	public void deleteProduct(@PathVariable int pid)
	{
		obj.deleteProduct(pid);
	}
	@GetMapping("/search/{pid}")
	public Product getProduct(@PathVariable int pid) 
	{
		return this.obj.getProduct(pid);
	}
}
