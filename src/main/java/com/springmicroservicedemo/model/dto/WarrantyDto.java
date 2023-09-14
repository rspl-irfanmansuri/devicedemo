package com.springmicroservicedemo.model.dto;

import java.io.Serializable;

import com.springmicroservicedemo.model.WarrantyType;

public class WarrantyDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;
	Integer warntyId;
	WarrantyType warrnatyType;

	DevicesDto device;

	public Integer getWarntyId() {
		return warntyId;
	}

	public void setWarntyId(Integer warntyId) {
		this.warntyId = warntyId;
	}

	public DevicesDto getDevice() {
		return device;
	}

	public void setDevice(DevicesDto device) {
		this.device = device;
	}

	public WarrantyType getWarrnatyType() {
		return warrnatyType;
	}

	public void setWarrnatyType(WarrantyType warrnatyType) {
		this.warrnatyType = warrnatyType;
	}

	@Override
	public String toString() {
		return "WarrantyDto [warntyId=" + warntyId + ", warrnatyType=" + warrnatyType + ", device=" + device + "]";
	}

}
