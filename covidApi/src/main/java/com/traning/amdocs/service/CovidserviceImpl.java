package com.traning.amdocs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.traning.amdocs.pojo.CovidCenter;

@Service
public class CovidserviceImpl implements ICovid{


	@Override
	public List<CovidCenter> getAllCenters() {
		
		List<CovidCenter> listOfCenters = new ArrayList<CovidCenter>();
		
		listOfCenters.add(new CovidCenter("C-01", "Covid19N", "Nashik", "422001"));
		listOfCenters.add(new CovidCenter("C-32", "Covid_MUMBAI", "Mumbai", "411001"));
		listOfCenters.add(new CovidCenter("C-56", "Covid_THANE", "Thane", "320012"));
		
		return listOfCenters;
	}

	public CovidCenter getCenterByPincode(String pincode) {
		
		return getAllCenters().stream().filter(p->p.getPincode().equals(pincode)).findFirst().get();
	}

	public CovidCenter addCovidCenter(CovidCenter cc) {
		CovidCenter newCC = new CovidCenter(cc.getCovidCenterId(),cc.getCovidCenterName(),cc.getCity(),cc.getPincode());
		return newCC;
	}

}
