package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class DeviceCapability {
	private String DeviceCapabilityId;
	private String DeviceCapabilityName;
	private String DeviceId;
	
	@XmlElement(name = "DeviceCapabilityId")
	public String getDeviceCapabilityId() {
		return DeviceCapabilityId;
	}
	public void setDeviceCapabilityId(String deviceCapabilityId) {
		DeviceCapabilityId = deviceCapabilityId;
	}
	@XmlElement(name = "DeviceCapabilityName")
	public String getDeviceCapabilityName() {
		return DeviceCapabilityName;
	}
	public void setDeviceCapabilityName(String deviceCapabilityName) {
		DeviceCapabilityName = deviceCapabilityName;
	}
	@XmlElement(name = "DeviceId")
	public String getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(String deviceId) {
		DeviceId = deviceId;
	}
}
