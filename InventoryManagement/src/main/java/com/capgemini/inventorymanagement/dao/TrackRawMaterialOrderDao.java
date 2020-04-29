package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.TrackRawMaterialOrder;

public interface TrackRawMaterialOrderDao {
 
	TrackRawMaterialOrder addTrackRawMaterial(TrackRawMaterialOrder r);
	
	List<TrackRawMaterialOrder> getAllTrackRawmaterials();
	
	TrackRawMaterialOrder getTrackRawMaterialById(int trackingid);
	
	TrackRawMaterialOrder updateTrackRawMaterial(TrackRawMaterialOrder r);
}
