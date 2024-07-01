package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	 @Autowired
	    private ProductRepository productRepository;

	    public List<Product> findAllProducts() {
	        return productRepository.findAll();
	    }

	    public Product saveProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }

}
