package com.agilisium.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agilisium.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}