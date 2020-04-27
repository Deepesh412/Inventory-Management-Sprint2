package com.capgemini.inventorymanagement.services;

import java.util.List;

import com.capgemini.inventorymanagement.entities.SupplierDetails;

public interface SupplierDetailsService {

	SupplierDetails addSupplier(SupplierDetails s);

	SupplierDetails getSupplierById(int supplierid);
	
	List<SupplierDetails> getAllSuppliers();

}