package com.capgemini.inventorymanagement.services;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.RawMaterialDetailsDaoImpl;
import com.capgemini.inventorymanagement.entities.RawMaterialDetails;
@Service
@Transactional
public class RawMaterialDetailsServiceImpl implements RawMaterialDetailsService
{

	@Autowired
	RawMaterialDetailsDaoImpl dao;
	
	@Override
	public RawMaterialDetails addDetails(RawMaterialDetails r) {
		return dao.addDetails(r);
	}

	@Override
	public List<RawMaterialDetails> getAllDetails() {
		return dao.getAllDetails();
	}

	@Override
	public RawMaterialDetails deleteRawMaterialDetail(int rawmaterialid) {
		return dao.deleteRawMaterialDetail(rawmaterialid);
	}

	@Override
	public RawMaterialDetails updateDetails(RawMaterialDetails r) {
		return dao.updateDetails(r);
	}

	@Override
	public RawMaterialDetails getRawMaterialDetailById(int rawmaterialid) {
		return dao.getRawMaterialDetailById(rawmaterialid);
	}

}

