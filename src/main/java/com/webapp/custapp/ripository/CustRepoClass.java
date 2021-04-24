package com.webapp.custapp.ripository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.custapp.model.CustomerDetails;

@Repository
public interface CustRepoClass extends CrudRepository<CustomerDetails, Integer> {

	// just changed to interface
	
}
