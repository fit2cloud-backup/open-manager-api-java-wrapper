package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DevicesResponse") 
public class DevicesResponse {
	private DevicesResult DevicesResult;
	
	@XmlElement(name = "DevicesResult")
	public DevicesResult getDevicesResult() {
		return DevicesResult;
	}

	public void setDevicesResult(DevicesResult devicesResult) {
		DevicesResult = devicesResult;
	}
}
