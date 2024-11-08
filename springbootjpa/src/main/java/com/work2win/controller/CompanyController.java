package com.work2win.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.work2win.model.Company;
import com.work2win.repository.CompanyRepository;
import javax.validation.Valid;
import org.json.*;
import java.text.DateFormat;


@CrossOrigin
@RestController
@RequestMapping(value="/")
public class CompanyController {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@GetMapping("company")
	public List<Company> getAllCompanydata() {
		
		DateFormat b = DateFormat.getDateInstance();
		List<Company> comp = companyRepository.findAll();
		
		
		for(Company company: comp) {
			Date d = company.getDate();
			String ds = d.toString();		
			
		}
		return companyRepository.findAll();		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("company")
	public Company addCompany(@Valid @RequestBody Company company) {
		System.out.println(company);
		return companyRepository.save(company);	
	}	 
	
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("company/{id}")
	public ResponseEntity<?>  deleteCompany(@PathVariable Long id){
		companyRepository.deleteById(id);
		return ResponseEntity.ok().build();
		
	}
	
	@GetMapping("companyid/{id}") 
	 public Company getById(@PathVariable Long id){
		
	 return companyRepository.findById(id).orElse(null);
	  
	  }
	
	@GetMapping("status/{status}")
	public List<Company> getByStatus(@PathVariable String status){
		List<Company> comp = companyRepository.getByStatus(status);
		return comp;
		
	}

}
