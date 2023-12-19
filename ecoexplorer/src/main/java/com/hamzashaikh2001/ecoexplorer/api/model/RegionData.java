package com.hamzashaikh2001.ecoexplorer.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegionData {
	
	@Id
	private String zipCode;
	private String no2;
	private String ozone;
	private String pm25;
	private String state;
	private String type;
	private String primaryCity;
	private String acceptableCities;
	private String unacceptableCities;
	private String county;
	private String timezone;
	private String areaCodes;
	private String latitude;
	private String longitude;
	private String estimatedPop;
	
	private RegionData() {}
	
	public RegionData(String zipCode, String no2, String ozone, String pm25, String state, String type, String primaryCity,
			String acceptableCities, String unacceptableCities, String county, String timezone, String areaCodes,
			String latitude, String longitude, String estimatedPop) {
		this.zipCode = zipCode;
		this.no2 = no2;
		this.ozone = ozone;
		this.pm25 = pm25;
		this.state = state;
		this.type = type;
		this.primaryCity = primaryCity;
		this.acceptableCities = acceptableCities;
		this.unacceptableCities = unacceptableCities;
		this.county = county;
		this.timezone = timezone;
		this.areaCodes = areaCodes;
		this.latitude = latitude;
		this.longitude = longitude;
		this.estimatedPop = estimatedPop;
	}

	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getNo2() {
		return no2;
	}
	public void setNo2(String no2) {
		this.no2 = no2;
	}
	public String getOzone() {
		return ozone;
	}
	public void setOzone(String ozone) {
		this.ozone = ozone;
	}
	public String getPm25() {
		return pm25;
	}
	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrimaryCity() {
		return primaryCity;
	}
	public void setPrimaryCity(String primaryCity) {
		this.primaryCity = primaryCity;
	}
	public String getAcceptableCities() {
		return acceptableCities;
	}
	public void setAcceptableCities(String acceptableCities) {
		this.acceptableCities = acceptableCities;
	}
	public String getUnacceptableCities() {
		return unacceptableCities;
	}
	public void setUnacceptableCities(String unacceptableCities) {
		this.unacceptableCities = unacceptableCities;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getAreaCodes() {
		return areaCodes;
	}
	public void setAreaCodes(String areaCodes) {
		this.areaCodes = areaCodes;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getEstimatedPop() {
		return estimatedPop;
	}
	public void setEstimatedPop(String estimatedPop) {
		this.estimatedPop = estimatedPop;
	}
}
