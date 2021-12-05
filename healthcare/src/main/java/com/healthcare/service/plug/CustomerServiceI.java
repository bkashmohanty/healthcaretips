package com.healthcare.service.plug;

import org.springframework.http.ResponseEntity;

import com.healthcare.dao.CustomerProfile;
import com.healthcare.model.CustomerProfileModel;

public interface CustomerServiceI {

	public ResponseEntity<String> registerCustomerWelcomeForm(CustomerProfileModel profile);
}
