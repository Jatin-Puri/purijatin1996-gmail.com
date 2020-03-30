package com.niit.techno.crm.dao;

import com.niit.techno.crm.model.Address;
import com.niit.techno.crm.model.EliteUser;

public interface EliteDAO {


	public void savECustomer(Address add);
	public EliteUser checkUser(EliteUser theEUser);
}
