package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Customer;
import com.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listCustomers(Model theModel) {
		System.out.println("listCustomers Coustomer Controller");
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		System.out.println("showFormfor add Coustomer Controller");
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		System.out.println("saveCustomer Coustomer Controller");
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	/*
	 * @RequestMapping(value = "/searchCustomer", method = RequestMethod.GET) public
	 * String searchCustomer(@RequestParam("mobile") int theMobile, Model theModel)
	 * { System.out.println("search Customer"); List<Customer> theCustomers =
	 * customerService.searchCustomer(theMobile); return "redirect:/customer/list";
	 * }
	 */

	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		System.out.println("showForm for update Coustomer Controller");
		Customer theCustomer = customerService.getCustomer(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		System.out.println("deleteCustomer Coustomer Controller");
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
}
