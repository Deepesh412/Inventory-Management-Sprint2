package com.capgemini.inventorymanagement.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productorderdetails")
public class ProductOrderDetails {
	
	@Id
	private int orderid;
	private String itemname;
	private int quantityunit;
	private double priceperunit;
	private double totalprice;
	private Date orderdate;
	private Date deliverydate;
	private String deliverystatus;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name = "distributorId", referencedColumnName = "distributorid")
	private DistributorDetails distributorId;
	
	


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public int getQuantityunit() {
		return quantityunit;
	}


	public void setQuantityunit(int quantityunit) {
		this.quantityunit = quantityunit;
	}


	public double getPriceperunit() {
		return priceperunit;
	}


	public void setPriceperunit(double priceperunit) {
		this.priceperunit = priceperunit;
	}


	public double getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}


	public Date getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}


	public Date getDeliverydate() {
		return deliverydate;
	}


	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}


	public String getDeliverystatus() {
		return deliverystatus;
	}


	public void setDeliverystatus(String deliverystatus) {
		this.deliverystatus = deliverystatus;
	}


	public DistributorDetails getDistributorId() {
		return distributorId;
	}


	public void setDistributorId(DistributorDetails distributorId) {
		this.distributorId = distributorId;
	}
	
	
	
	
	
}
	
	
	
