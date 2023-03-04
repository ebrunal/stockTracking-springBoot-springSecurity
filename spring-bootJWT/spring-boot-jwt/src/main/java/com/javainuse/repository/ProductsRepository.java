package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
