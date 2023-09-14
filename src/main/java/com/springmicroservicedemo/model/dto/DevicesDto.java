package com.springmicroservicedemo.model.dto;

import java.io.Serializable;
import java.util.Set;

import com.springmicroservicedemo.model.DeviceType;

public class DevicesDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String manufacturer;
	private String modelName;
	private String modelCode;
	private DeviceType deviceType;
	private String macID;
	private String imei1;
	private String imei2;

	private Set<WarrantyDto> warranty;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public String getMacID() {
		return macID;
	}

	public void setMacID(String macID) {
		this.macID = macID;
	}

	public String getImei1() {
		return imei1;
	}

	public void setImei1(String imei1) {
		this.imei1 = imei1;
	}

	public String getImei2() {
		return imei2;
	}

	public void setImei2(String imei2) {
		this.imei2 = imei2;
	}

	public Set<WarrantyDto> getWarranty() {
		return warranty;
	}

	public void setWarranty(Set<WarrantyDto> warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "DevicesDto [id=" + id + ", manufacturer=" + manufacturer + ", modelName=" + modelName + ", modelCode="
				+ modelCode + ", deviceType=" + deviceType + ", macID=" + macID + ", imei1=" + imei1 + ", imei2="
				+ imei2 + ", warranty=" + warranty + "]";
	}

}
