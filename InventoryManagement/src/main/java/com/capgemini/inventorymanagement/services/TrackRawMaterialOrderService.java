package com.capgemini.inventorymanagement.services;

import java.util.List;

import com.capgemini.inventorymanagement.entities.TrackRawMaterialOrder;

public interface TrackRawMaterialOrderService {

    TrackRawMaterialOrder addTrackRawMaterial(TrackRawMaterialOrder r);
	
	List<TrackRawMaterialOrder> getAllTrackRawmaterials();
	
	TrackRawMaterialOrder getTrackRawMaterialById(int trackingid);
	
	TrackRawMaterialOrder updateTrackRawMaterial(TrackRawMaterialOrder r);
}
