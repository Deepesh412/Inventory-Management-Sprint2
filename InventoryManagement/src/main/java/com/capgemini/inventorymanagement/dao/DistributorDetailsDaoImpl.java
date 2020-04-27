package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.DistributorDetails;

@Repository
public class DistributorDetailsDaoImpl implements DistributorDetailsDao {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public DistributorDetails addDistributor(DistributorDetails d) {
		return em.merge(d);
	}

	@Override
	public List<DistributorDetails> getAllDistributors() {
		Query q=em.createQuery("select m from DistributorDetails m");
		List<DistributorDetails> distributorlist=q.getResultList();
		return distributorlist;
	}

	@Override
	public DistributorDetails getDistributorDetail(int distributorid) {
		return em.find(DistributorDetails.class, distributorid);
	}
	
}	
	
	
