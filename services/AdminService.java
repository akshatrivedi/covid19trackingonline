package com.capgemini.coronavirustracker.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.coronavirustracker.exceptions.ResourceNotFoundException;
import com.capgemini.coronavirustracker.models.Admin;
import com.capgemini.coronavirustracker.repository.Adminrepo;




@Service
public class AdminService implements AdminServiceIf{
	
	
	@Autowired
	private Adminrepo adminrepo;
	

	
	
	
	
	
	



	//find by admin details
	
	 public Admin fetchAdminByEmailId(String email) {

		return adminrepo.findByAdminEmail(email).orElseThrow(() -> new ResourceNotFoundException("Admin", "Name", email));
		
	}
	
		
		

	




	public Admin fetchUserByemailIdAndPassword(Admin admin) {
		String tempEmailId = admin.getAdminEmail();
		String temppass = admin.getAdminPassword();
		Admin adminObj = null;
			if((tempEmailId) != null && temppass != null){				
					adminObj = adminrepo.findByAdminEmailAndAdminPassword(tempEmailId, temppass);	
				}
			
			if(adminObj == null) {
				throw new  ResourceNotFoundException("Admin", "email", adminObj);	
		
		}

		return adminObj;
	}









	@Override
	public String deleteService(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	
}


