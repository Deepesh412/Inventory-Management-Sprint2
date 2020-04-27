package com.capgemini.inventorymanagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distributordetails")
public class DistributorDetails {
	@Id
	private int distributorid;
	private String distributorname;
	private String productname;
	private String address;
	private long phonenumber;
	private String emailid;
	

	public int getDistributorid() {
		return distributorid;
	}

	public void setDistributorid(int distributorid) {
		this.distributorid = distributorid;
	}

	public String getDistributorname() {
		return distributorname;
	}

	public void setDistributorname(String distributorname) {
		this.distributorname = distributorname;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}



	}