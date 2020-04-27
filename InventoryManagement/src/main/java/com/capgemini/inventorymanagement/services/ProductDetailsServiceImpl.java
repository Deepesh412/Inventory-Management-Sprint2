package com.capgemini.inventorymanagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.ProductDetailsDaoImpl;
import com.capgemini.inventorymanagement.entities.ProductDetails;
@Service
@Transactional
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	ProductDetailsDaoImpl dao;
	
	
	@Override
	public ProductDetails addProduct(ProductDetails p) {
		return dao.addProduct(p);
	}

	@Override
	public List<ProductDetails> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public ProductDetails getProductDetailsById(int productid) {
		return dao.getProductDetailsById(productid);
	}

	@Override
	public ProductDetails deleteProduct(int productid) {
		return dao.deleteProduct(productid);
	}

	@Override
	public ProductDetails updateProduct(ProductDetails p) {
		return dao.updateProduct(p);
	}

}
