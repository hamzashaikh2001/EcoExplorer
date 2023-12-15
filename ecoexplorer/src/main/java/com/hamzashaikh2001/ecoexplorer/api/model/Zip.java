package com.hamzashaikh2001.ecoexplorer.api.model;

public class Zip {
	
	private String zipCode;
	
	public Zip(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Zip [zipCode=" + zipCode + "]";
	}
}
