package com.cognizant.vendor.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class VendorStock {
	
	private String productId;
	private String vendorId;
	private boolean stockInHand;
	private Date expectedDate;

}
