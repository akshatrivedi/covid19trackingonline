package com.capgemini.coronavirustracker.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.coronavirustracker.models.Admin;

@Repository
public interface Adminrepo extends CrudRepository<Admin , Integer> {
	
	public Optional <Admin> findByAdminEmail(String email);
	public Admin findByAdminEmailAndAdminPassword(String email, String password);
	
}