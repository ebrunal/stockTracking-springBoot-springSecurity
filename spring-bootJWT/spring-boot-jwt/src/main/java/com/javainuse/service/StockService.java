package com.javainuse.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javainuse.entity.Stock;
import com.javainuse.repository.StockRepository;

@Service
public class StockService {

	 @Autowired
	    StockRepository stockRepository2;
	 


		public Stock saveStock(Stock stock){
	        return stockRepository2.save(stock);
	    }

	    public List<Stock> getAllStock(){
	        return stockRepository2.findAll();
	    }

	    public Stock getStockById(Long stockId){
	        return stockRepository2.findById(stockId).get();
	    }

	    public Stock updateStock(Stock stock){
	        return stockRepository2.save(stock);
	    }

	    public void deleteStockById(Long stockId){
	    	stockRepository2.deleteById(stockId);
	    }
	
}
