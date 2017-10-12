package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Software {
	private String Description;
	private String Type;
	private String Version;
	
	@XmlElement(name = "Description")
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
