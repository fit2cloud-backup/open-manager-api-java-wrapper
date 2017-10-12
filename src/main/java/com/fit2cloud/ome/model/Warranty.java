package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Warranty {
	private String DeviceId;
	private String SystemName;
	private String DeviceModelType;
	private String DeviceType;
	private String ServiceTag;
	private String ShippedDate;
	private String StartDate;
	private String EndDate;
	private String ServiceLevelCode;
	private String ServiceProvider;
	private String WarrantyDescription;
	private String WarrantyType;
	private String OrderNumber;
	private String DaysRemaining;
	
	@XmlElement(name = "WarrantyType")
	public String getWarrantyType() {
		return WarrantyType;
	}
	public void setWarrantyType(String warrantyType) {
		WarrantyType = warrantyType;
	}
	
	@XmlElement(name = "DeviceId")
	public String getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(String deviceId) {
		DeviceId = deviceId;
	}
	@XmlElement(name = "SystemName")
	public String getSystemName() {
		return SystemName;
	}
	public void setSystemName(String systemName) {
		SystemName = systemName;
	}
	@XmlElement(name = "DeviceModelType")
	public String getDeviceModelType() {
		return DeviceModelType;
	}
	public void setDeviceModelType(String deviceModelType) {
		DeviceModelType = deviceModelType;
	}
	@XmlElement(name = "DeviceType")
	public String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(String deviceType) {
		DeviceType = deviceType;
	}
	@XmlElement(name = "ServiceTag")
	public String getServiceTag() {
		return ServiceTag;
	}
	public void setServiceTag(String serviceTag) {
		ServiceTag = serviceTag;
	}
	@XmlElement(name = "ShippedDate")
	public String getShippedDate() {
		return ShippedDate;
	}
	public void setShippedDate(String shippedDate) {
		ShippedDate = shippedDate;
	}
	@XmlElement(name = "StartDate")
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	@XmlElement(name = "EndDate")
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	@XmlElement(name = "ServiceLevelCode")
	public String getServiceLevelCode() {
		return ServiceLevelCode;
	}
	public void setServiceLevelCode(String serviceLevelCode) {
		ServiceLevelCode = serviceLevelCode;
	}
	@XmlElement(name = "ServiceProvider")
	public String getServiceProvider() {
		return ServiceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		ServiceProvider = serviceProvider;
	}
	@XmlElement(name = "WarrantyDescription")
	public String getWarrantyDescription() {
		return WarrantyDescription;
	}
	public void setWarrantyDescription(String warrantyDescription) {
		WarrantyDescription = warrantyDescription;
	}
	@XmlElement(name = "OrderNumber")
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}
	@XmlElement(name = "DaysRemaining")
	public String getDaysRemaining() {
		return DaysRemaining;
	}
	public void setDaysRemaining(String daysRemaining) {
		DaysRemaining = daysRemaining;
	}
}
