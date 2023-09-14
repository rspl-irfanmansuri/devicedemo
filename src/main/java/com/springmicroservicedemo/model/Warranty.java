package com.springmicroservicedemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Warranty implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8934179496882173384L;

	@Column
	private WarrantyType warrnatyType;

	//@ManyToOne
	//@JoinColumn(name = "device_id", nullable = false)
	//private Devices device;

	public WarrantyType getWarrnatyType() {
		return warrnatyType;
	}

	public void setWarrnatyType(WarrantyType warrnatyType) {
		this.warrnatyType = warrnatyType;
	}

	

}
