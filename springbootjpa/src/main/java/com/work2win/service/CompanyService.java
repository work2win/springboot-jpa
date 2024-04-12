package com.work2win.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work2win.model.Company;
import com.work2win.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;
	
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public Company getCompanyById(Long id) {
		return companyRepository.findById(id).orElse(null);
		
	}
	
	
	
	

}
