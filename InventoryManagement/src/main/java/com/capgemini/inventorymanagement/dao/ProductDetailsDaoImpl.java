package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.ProductDetails;

@Repository

public class ProductDetailsDaoImpl implements ProductDetailsDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public ProductDetails addProduct(ProductDetails p) {
		return em.merge(p);
	}

	@Override
	public List<ProductDetails> getAllProducts() {
		Query q=em.createQuery("select m from ProductDetails m");
		List<ProductDetails> productlist=q.getResultList();
		return productlist;
	}

	@Override
	public ProductDetails getProductDetailsById(int productid) {
		return em.find(ProductDetails.class, productid);
	}

	@Override
	public ProductDetails deleteProduct(int productid) {
		ProductDetails pd=em.find(ProductDetails.class,productid);
		if(pd!=null)
			{em.remove(pd);
			}
        return pd;
	}

	@Override
	public ProductDetails updateProduct(ProductDetails p) {
				ProductDetails pd=em.find(ProductDetails.class,p.getProductid());
				if(pd!=null)
				{

					pd.setExpirydate(p.getExpirydate());
					pd.setManufacturingdate(p.getManufacturingdate());
					pd.setPriceperunit(p.getPriceperunit());
					pd.setQuantityunit(p.getQuantityunit());
				}
				return pd;
	}
	
	
	
}
