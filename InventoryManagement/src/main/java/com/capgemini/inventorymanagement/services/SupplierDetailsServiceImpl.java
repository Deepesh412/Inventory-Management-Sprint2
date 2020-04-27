package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.SupplierDetailsDaoImpl;
import com.capgemini.inventorymanagement.entities.SupplierDetails;


@Service
@Transactional

public class SupplierDetailsServiceImpl implements SupplierDetailsService{
	
	@Autowired
	SupplierDetailsDaoImpl dao;
	
	@Override
	public SupplierDetails addSupplier(SupplierDetails s) {
		return dao.addSupplier(s);
	}

	@Override
	public List<SupplierDetails> getAllSuppliers() {
		return dao.getAllSuppliers();
	}

	@Override
	public SupplierDetails getSupplierById(int supplierid) {
		return dao.getSupplierById(supplierid);
	}
}
