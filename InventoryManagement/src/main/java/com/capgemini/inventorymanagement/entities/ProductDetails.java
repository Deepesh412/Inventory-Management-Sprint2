package com.capgemini.inventorymanagement.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productdetails")
public class ProductDetails {
    @Id
	private int productid;
	private String itemname;
	private int quantityunit;
	private double priceperunit;
	private Date manufacturingdate;
    private Date expirydate;
    
    @OneToOne(mappedBy = "productdetails")
    
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
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
	public Date getManufacturingdate() {
		return manufacturingdate;
	}
	public void setManufacturingdate(Date manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
    
   
   
    
    
    
}