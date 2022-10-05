package com.capgemini.coronavirustracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.coronavirustracker.models.Userr;

@Repository
public interface UserrRepo extends JpaRepository<Userr, Integer>{

	//spring boots created an querry to fetch user by email id
	public Userr findByEmailId(String email);
	public Userr findByEmailIdAndPassword(String email, String password);
	
}
