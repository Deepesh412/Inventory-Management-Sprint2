package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.SupplierDetails;


@Repository
public class SupplierDetailsDaoImpl implements SupplierDetailsDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public SupplierDetails addSupplier(SupplierDetails s) {
		return em.merge(s);
	}

	@Override
	public List<SupplierDetails> getAllSuppliers(){
		Query q=em.createQuery("select m from SupplierDetails m");
		List<SupplierDetails> supplierlist=q.getResultList();
		return supplierlist;
	}


	@Override
	public SupplierDetails getSupplierById(int supplierid) {
		return em.find(SupplierDetails.class, supplierid);
	}
	
}	