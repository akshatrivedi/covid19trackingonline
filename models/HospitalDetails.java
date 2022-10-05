package com.capgemini.coronavirustracker.models;

import java.beans.JavaBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@JavaBean
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class HospitalDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int    hospitalId;
	private String hospitalNames;
	private String hospitalZone;
	private String hospitalAddress;
	private int    noOfICUBeds;
	private int    noOfGeneralBeds;
	private int    totalNoOfCases;
	private int    totalNoOfLabTests;
	private int    patientAdmitted;
	private int    patientRelease;
	private int    totalNoOfPatientDeaths;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalNames() {
		return hospitalNames;
	}
	public void setHospitalNames(String hospitalNames) {
		this.hospitalNames = hospitalNames;
	}
	public String getHospitalZone() {
		return hospitalZone;
	}
	public void setHospitalZone(String hospitalZone) {
		this.hospitalZone = hospitalZone;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public int getNoOfICUBeds() {
		return noOfICUBeds;
	}
	public void setNoOfICUBeds(int noOfICUBeds) {
		this.noOfICUBeds = noOfICUBeds;
	}
	public int getNoOfGeneralBeds() {
		return noOfGeneralBeds;
	}
	public void setNoOfGeneralBeds(int noOfGeneralBeds) {
		this.noOfGeneralBeds = noOfGeneralBeds;
	}
	public int getTotalNoOfCases() {
		return totalNoOfCases;
	}
	public void setTotalNoOfCases(int totalNoOfCases) {
		this.totalNoOfCases = totalNoOfCases;
	}
	public int getTotalNoOfLabTests() {
		return totalNoOfLabTests;
	}
	public void setTotalNoOfLabTests(int totalNoOfLabTests) {
		this.totalNoOfLabTests = totalNoOfLabTests;
	}
	public int getPatientAdmitted() {
		return patientAdmitted;
	}
	public void setPatientAdmitted(int patientAdmitted) {
		this.patientAdmitted = patientAdmitted;
	}
	public int getPatientRelease() {
		return patientRelease;
	}
	public void setPatientRelease(int patientRelease) {
		this.patientRelease = patientRelease;
	}
	public int getTotalNoOfPatientDeaths() {
		return totalNoOfPatientDeaths;
	}
	public void setTotalNoOfPatientDeaths(int totalNoOfPatientDeaths) {
		this.totalNoOfPatientDeaths = totalNoOfPatientDeaths;
	}

	
	
}
