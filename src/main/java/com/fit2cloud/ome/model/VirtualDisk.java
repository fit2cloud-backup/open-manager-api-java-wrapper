package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class VirtualDisk {
	private String DeviceId;
	private String VirtualDiskNumber;
	private String VirtualDiskDeviceName;
	private String VirtualDiskState;
	private String VirtualDiskStatus;
	private String VirtualDiskLength;
	private String VirtualDiskWritePolicy;
	private String VirtualDiskReadPolicy;
	private String VirtualDiskCachePolicy;
	private String VirtualDiskLayout;
	private String VirtualDiskStripeSize;
	private String VirtualDiskTargetId;
	
	@XmlElement(name = "DeviceId")
	public String getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(String deviceId) {
		DeviceId = deviceId;
	}
	@XmlElement(name = "VirtualDiskNumber")
	public String getVirtualDiskNumber() {
		return VirtualDiskNumber;
	}
	public void setVirtualDiskNumber(String virtualDiskNumber) {
		VirtualDiskNumber = virtualDiskNumber;
	}
	@XmlElement(name = "VirtualDiskDeviceName")
	public String getVirtualDiskDeviceName() {
		return VirtualDiskDeviceName;
	}
	public void setVirtualDiskDeviceName(String virtualDiskDeviceName) {
		VirtualDiskDeviceName = virtualDiskDeviceName;
	}
	@XmlElement(name = "VirtualDiskState")
	public String getVirtualDiskState() {
		return VirtualDiskState;
	}
	public void setVirtualDiskState(String virtualDiskState) {
		VirtualDiskState = virtualDiskState;
	}
	@XmlElement(name = "VirtualDiskStatus")
	public String getVirtualDiskStatus() {
		return VirtualDiskStatus;
	}
	public void setVirtualDiskStatus(String virtualDiskStatus) {
		VirtualDiskStatus = virtualDiskStatus;
	}
	@XmlElement(name = "VirtualDiskLength")
	public String getVirtualDiskLength() {
		return VirtualDiskLength;
	}
	public void setVirtualDiskLength(String virtualDiskLength) {
		VirtualDiskLength = virtualDiskLength;
	}
	@XmlElement(name = "VirtualDiskWritePolicy")
	public String getVirtualDiskWritePolicy() {
		return VirtualDiskWritePolicy;
	}
	public void setVirtualDiskWritePolicy(String virtualDiskWritePolicy) {
		VirtualDiskWritePolicy = virtualDiskWritePolicy;
	}
	@XmlElement(name = "VirtualDiskReadPolicy")
	public String getVirtualDiskReadPolicy() {
		return VirtualDiskReadPolicy;
	}
	public void setVirtualDiskReadPolicy(String virtualDiskReadPolicy) {
		VirtualDiskReadPolicy = virtualDiskReadPolicy;
	}
	@XmlElement(name = "VirtualDiskCachePolicy")
	public String getVirtualDiskCachePolicy() {
		return VirtualDiskCachePolicy;
	}
	public void setVirtualDiskCachePolicy(String virtualDiskCachePolicy) {
		VirtualDiskCachePolicy = virtualDiskCachePolicy;
	}
	@XmlElement(name = "VirtualDiskLayout")
	public String getVirtualDiskLayout() {
		return VirtualDiskLayout;
	}
	public void setVirtualDiskLayout(String virtualDiskLayout) {
		VirtualDiskLayout = virtualDiskLayout;
	}
	@XmlElement(name = "VirtualDiskStripeSize")
	public String getVirtualDiskStripeSize() {
		return VirtualDiskStripeSize;
	}
	public void setVirtualDiskStripeSize(String virtualDiskStripeSize) {
		VirtualDiskStripeSize = virtualDiskStripeSize;
	}
	@XmlElement(name = "VirtualDiskTargetId")
	public String getVirtualDiskTargetId() {
		return VirtualDiskTargetId;
	}
	public void setVirtualDiskTargetId(String virtualDiskTargetId) {
		VirtualDiskTargetId = virtualDiskTargetId;
	}
}

