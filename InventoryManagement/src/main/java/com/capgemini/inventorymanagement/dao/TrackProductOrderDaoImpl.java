package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.TrackProductOrder;
@Repository
public class TrackProductOrderDaoImpl implements TrackProductOrderDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public TrackProductOrder addTrackProduct(TrackProductOrder t) {
		
		return em.merge(t);
	}

	@Override
	public List<TrackProductOrder> getAllTrackProducts() {
		Query q =em.createQuery("select m from TrackProductOrder m");
		List<TrackProductOrder> tracklist = q.getResultList();
		return tracklist;
	}

	@Override
	public TrackProductOrder getTrackProductById(int trackingid) {
		return em.find(TrackProductOrder.class, trackingid);
	}

	@Override
	public TrackProductOrder updateTrackProduct(TrackProductOrder t) {
		TrackProductOrder tp = em.find(TrackProductOrder.class,t.getTrackingid());
		if(tp!=null)
		{
			tp.setExitdate(t.getExitdate());
		}
		return tp;
	}

}
