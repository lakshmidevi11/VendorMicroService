package com.cognizant.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Vendor {
	
	private String vendorId;
	private String vendorName;
	private double deliveryCharge;
	private double rating;

}
