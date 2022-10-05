package com.capgemini.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.coronavirustracker.models.Admin;
import com.capgemini.coronavirustracker.models.Userr;
import com.capgemini.coronavirustracker.services.AdminServiceIf;
import com.capgemini.coronavirustracker.services.UserrServiceIf;




@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminServiceIf adminServiceIf;
	
	@Autowired
	private UserrServiceIf userrServiceIf;
	
	
	

	//get admin details by name while login
	@PostMapping("/login")	
	public Admin loginUser(@RequestBody Admin admin) {		
		return adminServiceIf.fetchUserByemailIdAndPassword(admin);
	}
	

	
	
	
	
		
		@DeleteMapping("/delete/{id}")
	// remove services
	public  String deleteService(@PathVariable("id") Integer serviceId) {
		adminServiceIf.deleteService(serviceId);
		return "Deleted";		
	}
	
		
		@GetMapping("/alluser")
	// see all barbers services
	public List<Userr> allServices(){
		return userrServiceIf.fetchAllUser();
		}
		
}
		
	

		
		
	
	
	
	
	
	

	


	

