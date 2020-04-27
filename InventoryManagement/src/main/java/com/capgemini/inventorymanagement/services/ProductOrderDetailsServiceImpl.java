package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.ProductOrderDetailsDaoImpl;
import com.capgemini.inventorymanagement.entities.ProductOrderDetails;

@Service
@Transactional
public class ProductOrderDetailsServiceImpl implements ProductOrderDetailsService {

	@Autowired
	ProductOrderDetailsDaoImpl dao;
	
	@Override
	public ProductOrderDetails addProductOrder(ProductOrderDetails p) {
		return dao.addProductOrder(p);
	}

	@Override
	public List<ProductOrderDetails> getAllProductDetails() {
		return dao.getAllProductDetails();
	}

	@Override
	public ProductOrderDetails getProductOrderDetailsById(int orderid) {
		return dao.getProductOrderDetailsById(orderid);
	}

	@Override
	public ProductOrderDetails deleteProductOrder(int orderid) {
		return dao.deleteProductOrder(orderid);
	}

	@Override
	public ProductOrderDetails updateproductorder(ProductOrderDetails p) {
		return dao.updateproductorder(p);
	}

}
