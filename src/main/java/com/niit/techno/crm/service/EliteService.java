package com.niit.techno.crm.service;

import com.niit.techno.crm.model.Address;
import com.niit.techno.crm.model.EliteUser;

public interface EliteService {

	public void savECustomer(Address add);
	public EliteUser checkUser(EliteUser theUser);
}
