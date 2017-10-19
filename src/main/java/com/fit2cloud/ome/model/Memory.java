package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Memory {
	private String Manufacturer;
	private String Name;
	private String PartNumber;
	private String Size;
	private String Type;
	
	@XmlElement(name = "Manufacturer")
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	@XmlElement(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@XmlElement(name = "PartNumber")
	public String getPartNumber() {
		return PartNumber;
	}
	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}
	@XmlElement(name = "Size")
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	@XmlElement(name = "Type")
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
}
