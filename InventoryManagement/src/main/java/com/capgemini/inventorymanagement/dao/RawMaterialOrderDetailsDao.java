package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.RawMaterialOrderDetails;

public interface RawMaterialOrderDetailsDao {

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();

	RawMaterialOrderDetails getRawMaterialOrderDetailById(int orderid);
	
	RawMaterialOrderDetails deleteRawMaterialOrder(int orderid);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);


}