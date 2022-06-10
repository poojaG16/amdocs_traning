package com.traning.amdocs.service;

import java.util.List;

import com.traning.amdocs.pojo.CovidCenter;

public interface ICovid {


	List<CovidCenter> getAllCenters();
	
	CovidCenter getCenterByPincode(String pincode);
	
	CovidCenter addCovidCenter(CovidCenter cc);
}
