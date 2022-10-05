package com.capgemini.coronavirustracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.coronavirustracker.models.HospitalDetails;

@Repository
public interface HospitalRepository extends CrudRepository <HospitalDetails, Integer> {

	HospitalDetails findByHospitalId(int hospitalId);

//	List<HospitalDetails> findAll(HospitalDetails hospitalDetails);
	

}
