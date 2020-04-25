package com.capgemini.inventorymanagement.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trackrawmaterialorder")
public class TrackRawMaterialOrder {
	
	@Id
	private int Tracking_id;
	private Date process_date;
    
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RawMaterial_id")
	private RawMaterialDetails Rawmaterialdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rawmaterialorder_id")
	private RawMaterialOrderDetails RawMaterialorderdetails;

	public int getTracking_id() {
		return Tracking_id;
	}

	public void setTracking_id(int tracking_id) {
		Tracking_id = tracking_id;
	}

	public Date getProcess_date() {
		return process_date;
	}

	public void setProcess_date(Date process_date) {
		this.process_date = process_date;
	}
}
