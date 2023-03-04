package com.javainuse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.entity.Companies;
import com.javainuse.repository.CompaniesRepository;

@Service
public class CompaniesService {
	
	 @Autowired
	 CompaniesRepository companiesRepository2;

	
		public Companies saveCompanies(Companies companies){
	        return companiesRepository2.save(companies);
	    }

	    public List<Companies> getAllCompanies(){
	        return companiesRepository2.findAll();
	    }

	    public Companies getCompaniesById(Long companiesId){
	        return companiesRepository2.findById(companiesId).get();
	    }

	    public Companies updateCompanies(Companies companies){
	        return companiesRepository2.save(companies);
	    }

	    public void deleteCompaniesById(Long companiesId){
	    	companiesRepository2.deleteById(companiesId);
	    }

}
