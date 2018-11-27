package com.ford.bean;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;

public class Equipments {
	private String equipmentId;
	private int equipmentNo;
	private String equipmentType;
	private String equipmentName;
	private String manufacturer;
	private String modelNumber;
	private String serialNumber;
	private String homeLocation;
	private String presentLocation;
	private Date lastCalibration;
	private Float nextCalibration;
	private String issuedTo;
	private String status;
	private String conditionReceived;
	private String conditionReturned;
	private int eid;
	private String barcode;
	private String model;
	private String equipmentDescription;
	private String custodian;
	private Float calibrationFrequency;
	private String comment;
	private Timestamp warrantyDate;
	private String availability;
	private Timestamp serviceStartDate;
	private String calibrationType;
	private boolean checkboxselected=true;
	public boolean isCheckboxselected() {
		return checkboxselected;
	}
	public void setCheckboxselected(boolean checkboxselected) {
		this.checkboxselected = checkboxselected;
	}
	public String getConditionReturned() {
		return conditionReturned;
	}
	public void setConditionReturned(String conditionReturned) {
		this.conditionReturned = conditionReturned;
	}
	public int getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(int equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Float getNextCalibration() {
		return nextCalibration;
	}
	public void setNextCalibration(Float nextCalibration) {
		this.nextCalibration = nextCalibration;
	}
	public Float getCalibrationFrequency() {
		return calibrationFrequency;
	}
	public void setCalibrationFrequency(Float calibrationFrequency) {
		this.calibrationFrequency = calibrationFrequency;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEquipmentDescription() {
		return equipmentDescription;
	}
	public void setEquipmentDescription(String equipmentDescription) {
		this.equipmentDescription = equipmentDescription;
	}
	public String getCustodian() {
		return custodian;
	}
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Timestamp getWarrantyDate() {
		return warrantyDate;
	}
	public void setWarrantyDate(Timestamp warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	
	public Timestamp getServiceStartDate() {
		return serviceStartDate;
	}
	public void setServiceStartDate(Timestamp serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}
	public String getCalibrationType() {
		return calibrationType;
	}
	public void setCalibrationType(String calibrationType) {
		this.calibrationType = calibrationType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public String getHomeLocation() {
		return homeLocation;
	}
	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}
	public String getPresentLocation() {
		return presentLocation;
	}
	public void setPresentLocation(String presentLocation) {
		this.presentLocation = presentLocation;
	}
	public Date getLastCalibration() {
		return lastCalibration;
	}
	public void setLastCalibration(Date lastCalibration) {
		this.lastCalibration = lastCalibration;
	}
	
	public String getIssuedTo() {
		return issuedTo;
	}
	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConditionReceived() {
		return conditionReceived;
	}
	public void setConditionReceived(String conditionReceived) {
		this.conditionReceived = conditionReceived;
	}

	
	public String getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipmentId == null) ? 0 : equipmentId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipments other = (Equipments) obj;
		if (equipmentId == null) {
			if (other.equipmentId != null)
				return false;
		} else if (!equipmentId.equals(other.equipmentId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Equipments [equipmentId=" + equipmentId + ", equipmentNo=" + equipmentNo + ", equipmentType="
				+ equipmentType + ", equipmentName=" + equipmentName + ", manufacturer=" + manufacturer
				+ ", modelNumber=" + modelNumber + ", serialNumber=" + serialNumber + ", homeLocation=" + homeLocation
				+ ", presentLocation=" + presentLocation + ", lastCalibration=" + lastCalibration + ", nextCalibration="
				+ nextCalibration + ", issuedTo=" + issuedTo + ", status=" + status + ", conditionReceived="
				+ conditionReceived + ", conditionReturned=" + conditionReturned + ", eid=" + eid + ", barcode="
				+ barcode + ", model=" + model + ", equipmentDescription=" + equipmentDescription + ", custodian="
				+ custodian + ", calibrationFrequency=" + calibrationFrequency + ", comment=" + comment
				+ ", warrantyDate=" + warrantyDate + ", availability=" + availability + ", serviceStartDate="
				+ serviceStartDate + ", calibrationType=" + calibrationType + ", checkboxselected=" + checkboxselected
				+ "]";
	}
	

}
