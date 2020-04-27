package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.RawMaterialOrderDetailsDaoImpl;
import com.capgemini.inventorymanagement.entities.RawMaterialOrderDetails;

@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsDaoImpl dao;
	
	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		return dao.addRawMaterialOrder(r);
	}

	@Override
	public List<RawMaterialOrderDetails> getAllRawMaterialOrders() {
		return dao.getAllRawMaterialOrders();
	}

	@Override
	public RawMaterialOrderDetails getRawMaterialOrderDetailById(int orderid) {
		return dao.getRawMaterialOrderDetailById(orderid);
	}

	@Override
	public RawMaterialOrderDetails deleteRawMaterialOrder(int orderid) {
		return dao.deleteRawMaterialOrder(orderid);
	}

	@Override
	public RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r) {
		return dao.updateRawMaterialOrder(r);
	}
}
	