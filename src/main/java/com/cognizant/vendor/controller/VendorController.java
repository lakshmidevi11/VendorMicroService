package com.cognizant.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.vendor.model.Vendor;
import com.cognizant.vendor.service.VendorServiceImplementation;

@RestController
public class VendorController {
	
	@Autowired
	private VendorServiceImplementation vendorService;
	
	@GetMapping(value="/getVendorDetails/{productId}")
	 public List<Vendor> getDetail(@PathVariable("productId") String productId)
	 {
		
		return vendorService.getDetail(productId);
		
		
	 }

}
