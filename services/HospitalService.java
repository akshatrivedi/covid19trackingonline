package com.capgemini.coronavirustracker.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.coronavirustracker.exceptions.HospitalNotFoundExeption;
import com.capgemini.coronavirustracker.models.HospitalDetails;
import com.capgemini.coronavirustracker.repository.HospitalRepository;


@Service
public class HospitalService {
	
   private static final String HospitalDetails = null;
@Autowired
   private  HospitalRepository hospitalRepository;
   //add hospitalDetails
public HospitalDetails saveHospital(HospitalDetails hospitalDetails) { 
	// TODO Auto-generated method stub
	return hospitalRepository.save(hospitalDetails);
}

    //getHospitalDetails
public HospitalDetails findHospitalById(int hospitalId) {
	// TODO Auto-generated method stub
	return hospitalRepository.findByHospitalId(hospitalId) ;
}



public List<HospitalDetails> viewhospital() {
	
return(List<HospitalDetails>)hospitalRepository.findAll();
	
}

public Object updateHospital(HospitalDetails hospitalDetails, int hospitalId) {
	HospitalDetails existingHospital=hospitalRepository.findById(hospitalId).orElseThrow(()->new HospitalNotFoundExeption(HospitalDetails,"Id",hospitalId));
	existingHospital.setHospitalNames(hospitalDetails.getHospitalNames());
	existingHospital.setHospitalAddress(hospitalDetails.getHospitalAddress());
	existingHospital.setHospitalZone(hospitalDetails.getHospitalZone());
	hospitalRepository.save(existingHospital);
	return existingHospital;
}

public void deleteHospital(int id) {
	// TODO Auto-generated method stub
	hospitalRepository.findById(id).orElseThrow(()->new HospitalNotFoundExeption(HospitalDetails, "Id", id));
	hospitalRepository.deleteById(id);
	
}
}
  
	
