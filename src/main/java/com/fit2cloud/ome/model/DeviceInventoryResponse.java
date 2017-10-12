package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeviceInventoryResponse")  
public class DeviceInventoryResponse {
	private DeviceInventoryResult DeviceInventoryResult;
	
    @XmlElement(name = "DeviceInventoryResult")
	public DeviceInventoryResult getDeviceInventoryResult() {
		return DeviceInventoryResult;
	}

	public void setDeviceInventoryResult(DeviceInventoryResult deviceInventoryResult) {
		DeviceInventoryResult = deviceInventoryResult;
	}

	

}
