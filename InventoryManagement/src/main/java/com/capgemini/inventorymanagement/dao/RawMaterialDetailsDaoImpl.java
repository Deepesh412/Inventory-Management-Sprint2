package com.capgemini.inventorymanagement.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.RawMaterialDetails;

@Repository
public class RawMaterialDetailsDaoImpl implements RawMaterialDetailsDao
{

@PersistenceContext
EntityManager em;

@Override
public RawMaterialDetails addDetails(RawMaterialDetails r) {
	
	return em.merge(r);
}

@Override
public List<RawMaterialDetails> getAllDetails() {
	Query q = em.createQuery("select m from RawMaterialDetails m");
	List<RawMaterialDetails>detailslist = q.getResultList();
	return detailslist;
}

@Override
public RawMaterialDetails deleteRawMaterialDetail(int rawmaterialid) {
	RawMaterialDetails rm = em.find(RawMaterialDetails.class, rawmaterialid);
	if(rm!=null)
	{
		em.remove(rm);
	}
	return rm;
}

@Override
public RawMaterialDetails updateDetails(RawMaterialDetails r) {
	RawMaterialDetails rm = em.find(RawMaterialDetails.class, r.getRawmaterialid());
	if(rm!=null)
	{
		rm.setExpirydate(r.getExpirydate());
		rm.setManufacturingdate(r.getManufacturingdate());
		rm.setPriceperunit(r.getPriceperunit());
		rm.setQuantityunit(r.getQuantityunit());
	}
	return rm;
}

@Override
public RawMaterialDetails getRawMaterialDetailById(int rawmaterialid) {
        
	return em.find(RawMaterialDetails.class, rawmaterialid);
}
}