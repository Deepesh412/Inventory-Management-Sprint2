package com.capgemini.inventorymanagement.services;

import java.util.List;

import com.capgemini.inventorymanagement.entities.RawMaterialOrderDetails;

public interface RawMaterialOrderDetailsService 
{
	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();

	RawMaterialOrderDetails getRawMaterialOrderDetailById(int orderid);
	
	RawMaterialOrderDetails deleteRawMaterialOrder(int orderid);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);

}
