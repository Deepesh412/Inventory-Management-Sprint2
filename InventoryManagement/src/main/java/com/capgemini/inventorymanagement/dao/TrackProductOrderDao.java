package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.TrackProductOrder;

public interface TrackProductOrderDao {

	TrackProductOrder addTrackProduct(TrackProductOrder t);
	
	List<TrackProductOrder> getAllTrackProducts();
	
	TrackProductOrder getTrackProductById(int trackingid);
	
	TrackProductOrder updateTrackProduct(TrackProductOrder t);
	
}
