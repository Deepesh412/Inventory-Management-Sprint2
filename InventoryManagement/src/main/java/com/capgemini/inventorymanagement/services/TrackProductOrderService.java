package com.capgemini.inventorymanagement.services;

import java.util.List;

import com.capgemini.inventorymanagement.entities.TrackProductOrder;

public interface TrackProductOrderService {

	TrackProductOrder addTrackProduct(TrackProductOrder t);
	
	List<TrackProductOrder> getAllTrackProducts();
	
	TrackProductOrder getTrackProductById(int trackingid);
	
	TrackProductOrder updateTrackProduct(TrackProductOrder t);
	
}
