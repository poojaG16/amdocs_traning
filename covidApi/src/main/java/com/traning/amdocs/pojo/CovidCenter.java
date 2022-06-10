package com.traning.amdocs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CovidCenter {

	
	private String covidCenterId;
	private String CovidCenterName;
	private String city;
	private String pincode;
	
	
	
	public CovidCenter() {
		super();
	}



	public CovidCenter(String covidCenterId, String covidCenterName, String city, String pincode) {
		
		this.covidCenterId = covidCenterId;
		this.CovidCenterName = covidCenterName;
		this.city = city;
		this.pincode = pincode;
	}



	public String getCovidCenterId() {
		return covidCenterId;
	}



	public void setCovidCenterId(String covidCenterId) {
		this.covidCenterId = covidCenterId;
	}



	public String getCovidCenterName() {
		return CovidCenterName;
	}



	public void setCovidCenterName(String covidCenterName) {
		CovidCenterName = covidCenterName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
}

