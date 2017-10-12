package com.fit2cloud.ome.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class DevicesResult {
	private List<Device> Devices;
	private String AddedOrUpdatedTimestamp;
	private String DeletedTimestamp;
	@XmlElement(name = "AddedOrUpdatedTimestamp")
	public String getAddedOrUpdatedTimestamp() {
		return AddedOrUpdatedTimestamp;
	}

	public void setAddedOrUpdatedTimestamp(String addedOrUpdatedTimestamp) {
		AddedOrUpdatedTimestamp = addedOrUpdatedTimestamp;
	}
	@XmlElement(name = "DeletedTimestamp")
	public String getDeletedTimestamp() {
		return DeletedTimestamp;
	}

	public void setDeletedTimestamp(String deletedTimestamp) {
		DeletedTimestamp = deletedTimestamp;
	}

	@XmlElementWrapper(name = "Devices")  
    @XmlElement(name = "Device")
	public List<Device> getDevices() {
		return Devices;
	}

	public void setDevices(List<Device> devices) {
		Devices = devices;
	}
}
