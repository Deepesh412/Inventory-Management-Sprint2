package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.TrackRawMaterialOrderDaoImpl;
import com.capgemini.inventorymanagement.entities.TrackRawMaterialOrder;
@Service
@Transactional
public class TrackRawMaterialOrderServiceImpl implements TrackRawMaterialOrderService {

	@Autowired
	TrackRawMaterialOrderDaoImpl rdao;
	
	@Override
	public TrackRawMaterialOrder addTrackRawMaterial(TrackRawMaterialOrder r) {
		return rdao.addTrackRawMaterial(r);
	}

	@Override
	public List<TrackRawMaterialOrder> getAllTrackRawmaterials() {
		return rdao.getAllTrackRawmaterials();
	}

	@Override
	public TrackRawMaterialOrder getTrackRawMaterialById(int trackingid) {
		return rdao.getTrackRawMaterialById(trackingid);
	}

	@Override
	public TrackRawMaterialOrder updateTrackRawMaterial(TrackRawMaterialOrder r) {
		return rdao.updateTrackRawMaterial(r);
	}

}
