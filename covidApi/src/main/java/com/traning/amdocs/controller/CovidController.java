package com.traning.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traning.amdocs.pojo.CovidCenter;
import com.traning.amdocs.service.CovidserviceImpl;

@RestController
public class CovidController{
	@Autowired
	private CovidserviceImpl codSer;
	
	
	@GetMapping("/allcenters")
	public ResponseEntity<?> getAllCenters()
	{
		return new ResponseEntity<>(codSer.getAllCenters(),HttpStatus.OK);
	}
	
	
	@GetMapping("/pincodes/{pincode}")
	public ResponseEntity<?> getAllcentersByPincode(@PathVariable("pincode") String pincode)
	{
	
		return new ResponseEntity<>(codSer.getCenterByPincode(pincode),HttpStatus.OK);
	}
	
	@PostMapping("/addcenter")
	public ResponseEntity<?> addCovidCenter(@RequestBody CovidCenter cc)
	{
		return new ResponseEntity<>(codSer.addCovidCenter(cc),HttpStatus.OK);
	}
	
}
