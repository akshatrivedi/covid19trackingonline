package com.capgemini.coronavirustracker.services;

import org.springframework.stereotype.Service;

import com.capgemini.coronavirustracker.models.Admin;

public interface AdminServiceIf {

    public Admin fetchAdminByEmailId(String email);
   
    public  String deleteService(int serviceId);
  
    public Admin fetchUserByemailIdAndPassword(Admin admin);


}