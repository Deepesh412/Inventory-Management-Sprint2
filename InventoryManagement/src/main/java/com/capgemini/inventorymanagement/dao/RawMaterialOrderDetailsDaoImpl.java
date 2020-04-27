package com.capgemini.inventorymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagement.entities.RawMaterialOrderDetails;
@Repository
public class RawMaterialOrderDetailsDaoImpl implements RawMaterialOrderDetailsDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
	
		return em.merge(r);
	}

	@Override
	public List<RawMaterialOrderDetails> getAllRawMaterialOrders() {
		Query q=em.createQuery("select m from RawMaterialOrderDetails m");
		List<RawMaterialOrderDetails> rawMaterialOrderlist=q.getResultList();
		return rawMaterialOrderlist;
	}

	@Override
	public RawMaterialOrderDetails getRawMaterialOrderDetailById(int orderid) {
		return em.find(RawMaterialOrderDetails.class, orderid);
	}

	@Override
	public RawMaterialOrderDetails deleteRawMaterialOrder(int orderid) {
		RawMaterialOrderDetails rd=em.find(RawMaterialOrderDetails.class,orderid);
		if(rd!=null)
			{em.remove(rd);
			}
        return rd;
	}

	@Override
	public RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r) {
				RawMaterialOrderDetails rd=em.find(RawMaterialOrderDetails.class,r.getOrderid());
				if(rd!=null)
				{

					rd.setDeliverydate(r.getDeliverydate());
					rd.setOrderdate(r.getOrderdate());
					rd.setDeliverystatus(r.getDeliverystatus());
					rd.setPriceperunit(r.getPriceperunit());
					rd.setQuantityunit(r.getQuantityunit());
					rd.setTotalprice(r.getTotalprice());


				}
				return rd;
	}
}
	
	