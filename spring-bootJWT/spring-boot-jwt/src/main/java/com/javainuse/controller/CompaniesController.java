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

import com.javainuse.entity.Companies;
import com.javainuse.service.CompaniesService;


@RestController
@RequestMapping("/companies")

public class CompaniesController {
	
	@Autowired
	CompaniesService companiesService;

    @PostMapping("/save")
    public ResponseEntity<Companies> saveCompanies(@RequestBody Companies companies){
    	Companies savedCompanies = companiesService.saveCompanies(companies);
        return new ResponseEntity<Companies>(savedCompanies, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Companies>> getAllCompanies(){
        List<Companies> allCompanies = companiesService.getAllCompanies();
        return new ResponseEntity<List<Companies>>(allCompanies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Companies> getCompaniesById(@PathVariable(name = "id") Long companiesId){
    	Companies companies = companiesService.getCompaniesById(companiesId);
        return new ResponseEntity<Companies>(companies, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Companies> updateCompaniesById(@RequestBody Companies companies){
    	Companies updatedCompanies = companiesService.updateCompanies(companies);
        return new ResponseEntity<Companies>(updatedCompanies, HttpStatus.OK);
    } 

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCompaniesById(@PathVariable(name = "id") Long companiesId){
    	companiesService.deleteCompaniesById(companiesId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }


}
