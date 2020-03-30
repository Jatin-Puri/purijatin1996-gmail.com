package com.niit.techno.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.techno.crm.dao.EliteDAO;
import com.niit.techno.crm.model.Address;
import com.niit.techno.crm.model.EliteUser;

@Service
public class EliteServiceImpl implements EliteService {

	@Autowired
	private EliteDAO eliteDAO;

	//@Override
	@Transactional
	public void savECustomer(Address add) {
		// TODO Auto-generated method stub
		eliteDAO.savECustomer(add);
	}
	//@Override
	@Transactional
	public EliteUser checkUser(EliteUser theEUser) {
		// TODO Auto-generated method stub
		return eliteDAO.checkUser(theEUser);
	}


}
