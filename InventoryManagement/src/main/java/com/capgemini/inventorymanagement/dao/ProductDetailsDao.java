package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.ProductDetails;

public interface ProductDetailsDao {
	
   ProductDetails addProduct(ProductDetails p);
	
	List<ProductDetails> getAllProducts();
	
	ProductDetails getProductDetailsById(int productid);
	
	ProductDetails deleteProduct(int productid);
	
	ProductDetails updateProduct(ProductDetails p);
	
}
