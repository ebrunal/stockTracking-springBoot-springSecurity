package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.entity.Companies;

public interface CompaniesRepository extends JpaRepository<Companies, Long> {

}
