package com.healthcare.dao.plug;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.dao.CustomerProfile;

@Repository("customerProfileI")
public interface CustomerProfileI extends MongoRepository<CustomerProfile,String>{
	
}
