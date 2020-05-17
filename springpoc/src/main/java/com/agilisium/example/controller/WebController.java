package com.agilisium.example.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agilisium.enity.Product;
import com.agilisium.repository.ProductRepository;
import com.agilisium.service.ProductService;

@RestController
@RequestMapping("/api")
public class WebController {
	
	@Autowired(required=true)
	public ProductRepository productRepository;
	
	@Autowired
	public ProductService productService;
	    
	    @GetMapping(value="/getSingleProduct")
	    public Product findByProduct(@RequestParam ("product")final String product){
	    	return productRepository.findByProduct(product);
	    }
	    
	    @PostMapping(value="/addProducts")
	    public Product load(@RequestBody final Product product){
	    	productRepository.save(product);
	    	return productRepository.findByProduct(product.getProduct());
	    }
	    
	    @GetMapping("/getAllProducts")
	    private List<Product> getAllProducts(){
	        List<Product> productList = new ArrayList<Product>();
	        productRepository.findAll().forEach(productList::add);
	        return productList;
	    }
	    @GetMapping("/getProductById")
	    private Product getProduct(@RequestParam("id") Long id){
	        return productRepository.findProductById(id);
	    }
	   
	    @DeleteMapping("/deleteProduct")
	    private void deleteProduct(@RequestParam("id") Long id){
	        productRepository.delete(productRepository.findProductById(id));
	    }
	    
	    
	    
	    
}