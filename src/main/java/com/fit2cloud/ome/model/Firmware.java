package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Firmware {
	private String Name;
	private String Type;
	private String Version;
	
	@XmlElement(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@XmlElement(name = "Type")
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@XmlElement(name = "Version")
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
}
