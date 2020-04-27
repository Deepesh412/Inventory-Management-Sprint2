package com.capgemini.inventorymanagement.services;

import java.util.List;

import com.capgemini.inventorymanagement.entities.DistributorDetails;

public interface DistributorDetailsService {
	
    DistributorDetails addDistributor(DistributorDetails d);

	List<DistributorDetails> getAllDistributors();
	
	DistributorDetails getDistributorDetail(int distributorid);
}