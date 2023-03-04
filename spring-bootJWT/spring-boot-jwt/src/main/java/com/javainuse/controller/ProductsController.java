package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.entity.Products;
import com.javainuse.service.ProductsService;

@RestController
@RequestMapping("/products")


public class ProductsController {
	
	 @Autowired
	 ProductsService productsService;

	    @PostMapping("/save")
	    public ResponseEntity<Products> saveProducts(@RequestBody Products products){
	    	Products savedProducts = productsService.saveProducts(products);
	        return new ResponseEntity<Products>(savedProducts, HttpStatus.CREATED);
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<Products>> getAllProducts(){
	        List<Products> allProducts = productsService.getAllProducts();
	        return new ResponseEntity<List<Products>>(allProducts, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Products> getProductsById(@PathVariable(name = "id") Long productsId){
	    	Products products = productsService.getProductsById(productsId);
	        return new ResponseEntity<Products>(products, HttpStatus.OK);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Products> updateProductsById(@RequestBody Products products){
	    	Products updatedProducts = productsService.updateProducts(products);
	        return new ResponseEntity<Products>(updatedProducts, HttpStatus.OK);
	    } 

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteProductsById(@PathVariable(name = "id") Long productsId){
	    	productsService.deleteProductsById(productsId);
	        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	    }


}
