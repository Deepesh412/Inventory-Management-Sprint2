package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.DistributorDetailsDaoImpl;
import com.capgemini.inventorymanagement.entities.DistributorDetails;

@Service
@Transactional
public class DistributorDetailsServiceImpl implements DistributorDetailsService {
	@Autowired
	DistributorDetailsDaoImpl dao;
	
	@Override
	public DistributorDetails addDistributor(DistributorDetails d) {
		return dao.addDistributor(d);
	}

	@Override
	public List<DistributorDetails> getAllDistributors() {
		return dao.getAllDistributors();
	}

	@Override
	public DistributorDetails getDistributorDetail(int distributorid) {
		return dao.getDistributorDetail(distributorid);
	}
	
	

}
