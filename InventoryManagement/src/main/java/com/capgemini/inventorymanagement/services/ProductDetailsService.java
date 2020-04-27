package com.capgemini.inventorymanagement.services;

import java.util.List;

import com.capgemini.inventorymanagement.entities.ProductDetails;

public interface ProductDetailsService {
    ProductDetails addProduct(ProductDetails p);
	
	List<ProductDetails> getAllProducts();
	
	ProductDetails getProductDetailsById(int productid);
	
	ProductDetails deleteProduct(int productid);
	
	ProductDetails updateProduct(ProductDetails p);
}
