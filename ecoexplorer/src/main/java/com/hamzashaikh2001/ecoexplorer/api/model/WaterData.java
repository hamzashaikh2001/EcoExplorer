package com.hamzashaikh2001.ecoexplorer.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WaterData {
	
	private String zipCode;
	@Id
	private String pwsID;
	private String pwsName;
	private String pwsType;
	private String primarySource;
	private String countiesServed;
	private String citiesServed;
	private String popServed;
	private String numOfFacilities;
	private String numOfViolations;
	private String numOfSiteVisits;
	private String submissionYear;
	
	private WaterData() {}

	public WaterData(String zipCode, String pwsID, String pwsName, String pwsType, String primarySource,
			String countiesServed, String citiesServed, String popServed, String numOfFacilities,
			String numOfViolations, String numOfSiteVisits, String submissionYear) {
		this.zipCode = zipCode;
		this.pwsID = pwsID;
		this.pwsName = pwsName;
		this.pwsType = pwsType;
		this.primarySource = primarySource;
		this.countiesServed = countiesServed;
		this.citiesServed = citiesServed;
		this.popServed = popServed;
		this.numOfFacilities = numOfFacilities;
		this.numOfViolations = numOfViolations;
		this.numOfSiteVisits = numOfSiteVisits;
		this.submissionYear = submissionYear;
	}

	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPwsID() {
		return pwsID;
	}
	public void setPwsID(String pwsID) {
		this.pwsID = pwsID;
	}
	public String getPwsName() {
		return pwsName;
	}
	public void setPwsName(String pwsName) {
		this.pwsName = pwsName;
	}
	public String getPwsType() {
		return pwsType;
	}
	public void setPwsType(String pwsType) {
		this.pwsType = pwsType;
	}
	public String getPrimarySource() {
		return primarySource;
	}
	public void setPrimarySource(String primarySource) {
		this.primarySource = primarySource;
	}
	public String getCountiesServed() {
		return countiesServed;
	}
	public void setCountiesServed(String countiesServed) {
		this.countiesServed = countiesServed;
	}
	public String getCitiesServed() {
		return citiesServed;
	}
	public void setCitiesServed(String citiesServed) {
		this.citiesServed = citiesServed;
	}
	public String getPopServed() {
		return popServed;
	}
	public void setPopServed(String popServed) {
		this.popServed = popServed;
	}
	public String getNumOfFacilities() {
		return numOfFacilities;
	}
	public void setNumOfFacilities(String numOfFacilities) {
		this.numOfFacilities = numOfFacilities;
	}
	public String getNumOfViolations() {
		return numOfViolations;
	}
	public void setNumOfViolations(String numOfViolations) {
		this.numOfViolations = numOfViolations;
	}
	public String getNumOfSiteVisits() {
		return numOfSiteVisits;
	}
	public void setNumOfSiteVisits(String numOfSiteVisits) {
		this.numOfSiteVisits = numOfSiteVisits;
	}
	public String getSubmissionYear() {
		return submissionYear;
	}
	public void setSubmissionYear(String submissionYear) {
		this.submissionYear = submissionYear;
	}
}
