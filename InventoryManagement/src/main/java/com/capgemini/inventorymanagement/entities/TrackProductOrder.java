package com.capgemini.inventorymanagement.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trackproductdetails")
public class TrackProductOrder {

	@Id
	private int trackingid;
	private Date exitdate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productid")
	private ProductDetails productdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderid")
	private ProductOrderDetails productorderdetails;

	public int getTrackingid() {
		return trackingid;
	}

	public void setTrackingid(int trackingid) {
		this.trackingid = trackingid;
	}

	public Date getExitdate() {
		return exitdate;
	}

	public void setExitdate(Date exitdate) {
		this.exitdate = exitdate;
	}

	public ProductDetails getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(ProductDetails productdetails) {
		this.productdetails = productdetails;
	}

	public ProductOrderDetails getProductorderdetails() {
		return productorderdetails;
	}

	public void setProductorderdetails(ProductOrderDetails productorderdetails) {
		this.productorderdetails = productorderdetails;
	}

	
	
	
	
	
}
