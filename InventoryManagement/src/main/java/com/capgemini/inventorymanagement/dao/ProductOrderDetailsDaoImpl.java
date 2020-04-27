package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.ProductOrderDetails;

@Repository
public class ProductOrderDetailsDaoImpl implements ProductOrderDetailsDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public ProductOrderDetails addProductOrder(ProductOrderDetails p) {
		return em.merge(p);
	}

	@Override
	public List<ProductOrderDetails> getAllProductDetails() {
		Query q=em.createQuery("select m from ProductOrderDetails m");
		List<ProductOrderDetails> productorderlist=q.getResultList();
		return productorderlist;
	}

	@Override
	public ProductOrderDetails getProductOrderDetailsById(int orderid) {
		
		return em.find(ProductOrderDetails.class, orderid);
	}

	@Override
	public ProductOrderDetails deleteProductOrder(int orderid) {
		ProductOrderDetails pod=em.find(ProductOrderDetails.class,orderid);
		if(pod!=null)
			{
			em.remove(pod);
			}
        return pod;
	}

	@Override
	public ProductOrderDetails updateproductorder(ProductOrderDetails p) {
		ProductOrderDetails pod=em.find(ProductOrderDetails.class,p.getOrderid());
		if(pod!=null)
		{
          pod.setDeliverydate(p.getDeliverydate());
          pod.setDeliverystatus(p.getDeliverystatus());
          pod.setOrderdate(p.getOrderdate());
          pod.setPriceperunit(p.getPriceperunit());
          pod.setQuantityunit(p.getQuantityunit());
          pod.setTotalprice(p.getTotalprice());
		}
		return pod;
	}

}
