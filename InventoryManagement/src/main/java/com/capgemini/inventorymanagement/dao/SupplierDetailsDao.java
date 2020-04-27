package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.SupplierDetails;

public interface SupplierDetailsDao {

	SupplierDetails addSupplier(SupplierDetails s);

	List<SupplierDetails> getAllSuppliers();
	
	SupplierDetails getSupplierById(int supplierid);


}