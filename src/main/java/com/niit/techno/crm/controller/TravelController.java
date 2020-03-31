package com.niit.techno.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.techno.crm.model.Travel;
import com.niit.techno.crm.service.TravelService;

@Controller
@RequestMapping("/travel")
public class TravelController {

	@GetMapping("/travelForm")
	public String showFormForAdd(@RequestParam("customerId") int theId,Model theModel)
{
	Travel travelUser = new Travel();
	theModel.addAttribute("cid",theId);
	theModel.addAttribute("tuser",travelUser);
	return "travel-form";
	
}
	@Autowired
	private TravelService travelService;
	@PostMapping("/saveTravel")
	public String saveTravel(@ModelAttribute("tuser") Travel tUser) {
	travelService.saveTravel(tUser);
	return "redirect:/user/loginUser";
	}


}
