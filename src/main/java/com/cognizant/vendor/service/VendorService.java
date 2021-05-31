package com.cognizant.vendor.service;

import java.util.List;

import com.cognizant.vendor.model.Vendor;
import com.cognizant.vendor.model.VendorStock;

public interface VendorService {
	
	public List<Vendor> getAllVendor();
	public List<VendorStock> getAllVendorStock();
	public List<Vendor> getDetail(String productId);

}
