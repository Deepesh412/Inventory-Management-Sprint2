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
@Table(name = "trackrawmaterialorder")
public class TrackRawMaterialOrder {
	
	@Id
	private int trackingid;
	private Date processdate;
  
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rawmaterialid")
	private RawMaterialDetails rawmaterialdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderid")
	private RawMaterialOrderDetails rawmaterialorderdetails;

	public int getTrackingid() {
		return trackingid;
	}

	public void setTrackingid(int trackingid) {
		this.trackingid = trackingid;
	}

	public Date getProcessdate() {
		return processdate;
	}

	public void setProcessdate(Date processdate) {
		this.processdate = processdate;
	}

	public RawMaterialDetails getRawmaterialdetails() {
		return rawmaterialdetails;
	}

	public void setRawmaterialdetails(RawMaterialDetails rawmaterialdetails) {
		this.rawmaterialdetails = rawmaterialdetails;
	}

	public RawMaterialOrderDetails getRawmaterialorderdetails() {
		return rawmaterialorderdetails;
	}

	public void setRawmaterialorderdetails(RawMaterialOrderDetails rawmaterialorderdetails) {
		this.rawmaterialorderdetails = rawmaterialorderdetails;
	}

	
	

	
}
