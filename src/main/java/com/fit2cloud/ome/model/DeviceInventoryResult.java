package com.fit2cloud.ome.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class DeviceInventoryResult {
	private List<Agent> Agents;
	private String ContactInfo;
	private Device Device;
	private List<DeviceCapability> DeviceCapabilities;
	private List<Enclosure> Enclosures;
	private List<Firmware> Firmware;
	private List<MemoryEntries> Memory;
	private String OS;
	private List<Processor> Processor;
	private List<Software> Software;
	private String SwitchInfos;
	private List<Warranty> Warranty;
	
	@XmlElementWrapper(name = "Agents")  
    @XmlElement(name = "Agent")
	public List<Agent> getAgents() {
		return Agents;
	}
	public void setAgents(List<Agent> agents) {
		Agents = agents;
	}
	
	
    @XmlElement(name = "ContactInfo")
	public String getContactInfo() {
		return ContactInfo;
	}
	public void setContactInfo(String contactInfo) {
		ContactInfo = contactInfo;
	}
	
    @XmlElement(name = "Device")
	public Device getDevice() {
		return Device;
	}
	public void setDevice(Device device) {
		Device = device;
	}
	
	@XmlElementWrapper(name = "DeviceCapabilities")  
    @XmlElement(name = "DeviceCapability")
	public List<DeviceCapability> getDeviceCapabilities() {
		return DeviceCapabilities;
	}
	public void setDeviceCapabilities(List<DeviceCapability> deviceCapabilities) {
		DeviceCapabilities = deviceCapabilities;
	}
	@XmlElementWrapper(name = "Enclosures")  
    @XmlElement(name = "Enclosure")
	public List<Enclosure> getEnclosures() {
		return Enclosures;
	}
	public void setEnclosures(List<Enclosure> enclosures) {
		Enclosures = enclosures;
	}
	@XmlElementWrapper(name = "Firmware")  
    @XmlElement(name = "Firmware")
	public List<Firmware> getFirmware() {
		return Firmware;
	}
	public void setFirmware(List<Firmware> firmware) {
		Firmware = firmware;
	}
	@XmlElementWrapper(name = "Memory")  
    @XmlElement(name = "MemoryEntries")
	public List<MemoryEntries> getMemory() {
		return Memory;
	}
	public void setMemory(List<MemoryEntries> memory) {
		Memory = memory;
	}
    @XmlElement(name = "OS")
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	@XmlElementWrapper(name = "Processor")  
    @XmlElement(name = "Processor")
	public List<Processor> getProcessor() {
		return Processor;
	}
	public void setProcessor(List<Processor> processor) {
		Processor = processor;
	}
	@XmlElementWrapper(name = "Software")  
    @XmlElement(name = "Software")
	public List<Software> getSoftware() {
		return Software;
	}
	public void setSoftware(List<Software> software) {
		Software = software;
	}
    @XmlElement(name = "SwitchInfos")
	public String getSwitchInfos() {
		return SwitchInfos;
	}
	public void setSwitchInfos(String switchInfos) {
		SwitchInfos = switchInfos;
	}
	@XmlElementWrapper(name = "Warranty")  
    @XmlElement(name = "Warranty")
	public List<Warranty> getWarranty() {
		return Warranty;
	}
	public void setWarranty(List<Warranty> warranty) {
		Warranty = warranty;
	}
	
}
