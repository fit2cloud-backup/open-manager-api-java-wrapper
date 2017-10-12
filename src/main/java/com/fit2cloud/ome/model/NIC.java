package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class NIC {
	private String Description;
	private String IPAddress;
	private String MACAddress;
	private String Pingable;
	private String Vendor;
	
	@XmlElement(name = "Description")
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@XmlElement(name = "IPAddress")
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	@XmlElement(name = "MACAddress")
	public String getMACAddress() {
		return MACAddress;
	}
	public void setMACAddress(String mACAddress) {
		MACAddress = mACAddress;
	}
	@XmlElement(name = "Pingable")
	public String getPingable() {
		return Pingable;
	}
	public void setPingable(String pingable) {
		Pingable = pingable;
	}
	@XmlElement(name = "Vendor")
	public String getVendor() {
		return Vendor;
	}
	public void setVendor(String vendor) {
		Vendor = vendor;
	}

}
