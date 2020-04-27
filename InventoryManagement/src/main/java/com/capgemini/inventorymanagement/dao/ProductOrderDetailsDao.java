package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.ProductOrderDetails;

public interface ProductOrderDetailsDao {
    ProductOrderDetails addProductOrder(ProductOrderDetails p);
    
    List<ProductOrderDetails>getAllProductDetails();
    
    ProductOrderDetails getProductOrderDetailsById(int orderid);
    
    ProductOrderDetails deleteProductOrder(int orderid);
  
    ProductOrderDetails updateproductorder(ProductOrderDetails p);
}
