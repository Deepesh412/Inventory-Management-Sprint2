package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.TrackRawMaterialOrder;

@Repository
public class TrackRawMaterialOrderDaoImpl implements TrackRawMaterialOrderDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public TrackRawMaterialOrder addTrackRawMaterial(TrackRawMaterialOrder r) {

		return em.merge(r);
	}

	@Override
	public List<TrackRawMaterialOrder> getAllTrackRawmaterials() {
		Query q =em.createQuery("select m from TrackRawMaterialOrder m");
		List<TrackRawMaterialOrder> tracklist = q.getResultList();
		return tracklist;
	}

	@Override
	public TrackRawMaterialOrder getTrackRawMaterialById(int trackingid) {

		return em.find(TrackRawMaterialOrder.class, trackingid);
	}

	@Override
	public TrackRawMaterialOrder updateTrackRawMaterial(TrackRawMaterialOrder r) {
		TrackRawMaterialOrder tr = em.find(TrackRawMaterialOrder.class,r.getTrackingid());
		if(tr!=null)
		{
			tr.setProcessdate(r.getProcessdate());
		}
		return tr;
	}

}
