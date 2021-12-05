package com.healthcare.service.plug;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.healthcare.dao.CustomerProfile;
import com.healthcare.dao.plug.CustomerProfileI;
import com.healthcare.model.CustomerProfileModel;

@Service
public class CustomerServiceImpl implements CustomerServiceI{

	@Autowired
	private CustomerProfileI customerProfileI;
	
	@Override
	public ResponseEntity<String> registerCustomerWelcomeForm(CustomerProfileModel model){
		try {
			CustomerProfile profile = new CustomerProfile();
			BeanUtils.copyProperties(model, profile);
			profile.set_id(String.valueOf(model.getUserId()));
			customerProfileI.insert(profile);
		}catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<String>("Registration failed!!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>("Successfully registered", HttpStatus.OK);
	}

}
