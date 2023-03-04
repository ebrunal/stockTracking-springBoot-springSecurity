package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.entity.Stock;

public interface StockRepository  extends JpaRepository<Stock, Long>{

}
