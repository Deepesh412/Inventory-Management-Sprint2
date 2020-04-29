package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.TrackProductOrderDaoImpl;
import com.capgemini.inventorymanagement.entities.TrackProductOrder;
@Service
@Transactional
public class TrackProductOrderServiceImpl implements TrackProductOrderService {

	@Autowired
	TrackProductOrderDaoImpl tdao;
	
	@Override
	public TrackProductOrder addTrackProduct(TrackProductOrder t) {
		
		return tdao.addTrackProduct(t);
	}

	@Override
	public List<TrackProductOrder> getAllTrackProducts() {
	
		return tdao.getAllTrackProducts();
	}

	@Override
	public TrackProductOrder getTrackProductById(int trackingid) {
	
		return tdao.getTrackProductById(trackingid);
	}

	@Override
	public TrackProductOrder updateTrackProduct(TrackProductOrder t) {
	
		return tdao.updateTrackProduct(t);
	}

}
