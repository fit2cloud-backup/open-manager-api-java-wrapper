package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Enclosure {
	private String EnclosureId;
	private String EnclosureProductId;
	private String EnclosureServiceTag;
	
	@XmlElement(name = "EnclosureId")
	public String getEnclosureId() {
		return EnclosureId;
	}
	public void setEnclosureId(String enclosureId) {
		EnclosureId = enclosureId;
	}
	@XmlElement(name = "EnclosureProductId")
	public String getEnclosureProductId() {
		return EnclosureProductId;
	}
	public void setEnclosureProductId(String enclosureProductId) {
		EnclosureProductId = enclosureProductId;
	}
	@XmlElement(name = "EnclosureServiceTag")
	public String getEnclosureServiceTag() {
		return EnclosureServiceTag;
	}
	public void setEnclosureServiceTag(String enclosureServiceTag) {
		EnclosureServiceTag = enclosureServiceTag;
	}

}
