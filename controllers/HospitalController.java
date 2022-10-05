package com.capgemini.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.coronavirustracker.models.HospitalDetails;
import com.capgemini.coronavirustracker.services.HospitalService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/hospital")
public class HospitalController {
 
    @Autowired
	private  HospitalService  hospitalSevice; 
    // add hospitalDetails to the table
    @PostMapping("/saveHospital")
    public HospitalDetails saveHospital(@RequestBody HospitalDetails hospitalDetails) {
    	return hospitalSevice.saveHospital(hospitalDetails); 
	}
    // get hospitalDetails from the table
    @GetMapping("/{id}")
    public HospitalDetails findHospitalById(@PathVariable("id") int hospitalId) {
     
    	return hospitalSevice.findHospitalById(hospitalId);
    }
    //get all hospital details
    @GetMapping("/getallhospital")
    public List<HospitalDetails>viewhospital(){
    	return hospitalSevice.viewhospital();
    }
    //update all hospital details
    @PutMapping("/{id}")
    public ResponseEntity<HospitalDetails> updateHospital(@PathVariable("id") int hospitalId, @RequestBody HospitalDetails hospitalDetails )
    {
    	return new ResponseEntity<HospitalDetails>((HospitalDetails) hospitalSevice.updateHospital(hospitalDetails,hospitalId),HttpStatus.OK);
    }
    @CrossOrigin(origins="http://localhost:4200")
    @DeleteMapping("/{id}")
    
    	public ResponseEntity<String>deleteHospital(@PathVariable("id")int id ){
    	hospitalSevice.deleteHospital(id);
    	return new ResponseEntity<>("Hospital deleted sucessfully!",HttpStatus.OK);
    }
    }
   

