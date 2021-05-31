INSERT INTO Vendor (vendorId,vendorName,deliveryCharge,rating) VALUES('V101','Suresh',35,4.2);
INSERT INTO Vendor (vendorId,vendorName,deliveryCharge,rating) VALUES('V102','Divya',25,3.6);
INSERT INTO Vendor (vendorId,vendorName,deliveryCharge,rating) VALUES('V103','Ganesh',50,4.0);
INSERT INTO Vendor (vendorId,vendorName,deliveryCharge,rating) VALUES ('V104','Priya',45,2.2);
INSERT INTO Vendor (vendorId,vendorName,deliveryCharge,rating) VALUES('V105','Bala',70,4.3);

INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA1','V101',true,'2021-05-22');
INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA2','V101',false,'2021-06-20');
INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA1','V104',true,'2021-07-06');
INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA2','V102',true,'2021-06-18');
INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA3','V104',false,'2021-08-11');
INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA3','V103',false,'2021-06-02');
INSERT INTO Vendor_Stock (productId,vendorId,stockInHand,expectedDate) VALUES('PA4','V102',true,'2021-06-14');