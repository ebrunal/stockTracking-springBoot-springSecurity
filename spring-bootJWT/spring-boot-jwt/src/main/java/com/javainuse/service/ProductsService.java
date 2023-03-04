package com.javainuse.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javainuse.entity.Products;
import com.javainuse.repository.ProductsRepository;

@Service
public class ProductsService {
	
	    @Autowired
	    ProductsRepository productsRepository2;

	    
	   
		public Products saveProducts(Products products){
	        return productsRepository2.save(products);
	    }

	    public List<Products> getAllProducts(){
	        return productsRepository2.findAll();
	    }

	    public Products getProductsById(Long productsId){
	        return productsRepository2.findById(productsId).get();
	    }

	    public Products updateProducts(Products products){
	        return productsRepository2.save(products);
	    }

	    public void deleteProductsById(Long productsId){
	    	productsRepository2.deleteById(productsId);
	    }

}
