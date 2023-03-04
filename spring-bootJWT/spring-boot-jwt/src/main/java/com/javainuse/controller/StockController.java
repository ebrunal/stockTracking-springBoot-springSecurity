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

import com.javainuse.entity.Stock;
import com.javainuse.service.StockService;



@RestController
@RequestMapping("/stock")

public class StockController {
	
	@Autowired
	StockService stockService;

    @PostMapping("/save")
    public ResponseEntity<Stock> saveStock(@RequestBody Stock stock){
    	Stock savedStock = stockService.saveStock(stock);
        return new ResponseEntity<Stock>(savedStock, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Stock>> getAllStock(){
        List<Stock> allStock = stockService.getAllStock();
        return new ResponseEntity<List<Stock>>(allStock, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stock> getStockById(@PathVariable(name = "id") Long stockId){
    	Stock stock = stockService.getStockById(stockId);
        return new ResponseEntity<Stock>(stock, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Stock> updateStockById(@RequestBody Stock stock){
    	Stock updatedStock = stockService.updateStock(stock);
        return new ResponseEntity<Stock>(updatedStock, HttpStatus.OK);
    } 

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStockById(@PathVariable(name = "id") Long stockId){
    	stockService.deleteStockById(stockId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }


}
