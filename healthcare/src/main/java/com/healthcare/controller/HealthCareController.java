package com.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.model.CustomerProfileModel;
import com.healthcare.service.plug.CustomerServiceImpl;

@RestController
public class HealthCareController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@GetMapping("/test")
	public String test() {
		return "Welcome to our service";
	}

	@PostMapping("/register/customer")
	public ResponseEntity<String> registerCustomer(@RequestBody CustomerProfileModel model) {

//		BeanUtils.copyProperties(model, profile);
		return customerServiceImpl.registerCustomerWelcomeForm(model);

	}

}
