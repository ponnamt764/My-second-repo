package com.webapp.custapp;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.custapp.model.CustomerDetails;
import com.webapp.custapp.ripository.CustRepoClass;

@RestController
public class CustAppController {
	
	@Autowired
	CustRepoClass repo;

	/*@GetMapping("/getCustDT")
	public String getCustDT() {
		
		
		CustomerDetails obj = new CustomerDetails();
		obj.setCust_id(101);
		obj.setCust_name("abc");
		obj.setCustomer_addr("gpm");
		obj.setCustomer_dob("5-9");
		
		repo.save(obj);
		
		return "Customer applications";
		
		
	}*/
	
	@GetMapping(value = "/displayCustDT", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)	
	public CustomerDetails displayCustDT(@RequestParam int cust_id) {
		
		Optional<CustomerDetails> custDt = repo.findById(cust_id);
		
		return custDt.get();	
	}

	@GetMapping(value = "/deleteCustDT", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)	
	public String deleteCustDT(@RequestParam int cust_id) {
		
		repo.deleteById(cust_id);
		
		return "The speified cust details are deleted.";
	}
	@PostMapping(value = "/insertUpdate", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)	
	public String insertUpdate(@RequestBody CustomerDetails custDetails) {
		
		repo.save(custDetails);
		
		return "The speified cust details are Updated.";
	}
}
