package com.springmicroservicedemo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Devices implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3272639879892323583L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String manufacturer;
	@Column
	private String modelName;
	@Column
	private String modelCode;
	@Column
	private DeviceType deviceType;
	@Column
	@Size(max = 16)
	private String macID;
	@Column
	@Size(max = 16)
	private String imei1;
	@Column
	@Size(max = 16)
	private String imei2;

//	@ElementCollection(fetch = FetchType.LAZY, mappedBy = "device", cascade = CascadeType.ALL)
	@ElementCollection(fetch = FetchType.LAZY, targetClass = Warranty.class)
	private Set<Warranty> warranty;

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

	public Set<Warranty> getWarranty() {
		return warranty;
	}

	public void setWarranty(Set<Warranty> warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Devices [id=" + id + ", manufacturer=" + manufacturer + ", modelName=" + modelName + ", modelCode="
				+ modelCode + ", deviceType=" + deviceType + ", macID=" + macID + ", imei1=" + imei1 + ", imei2="
				+ imei2 + ", warranty=" + warranty + "]";
	}

}
