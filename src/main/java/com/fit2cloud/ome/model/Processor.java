package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Processor {
	private String Brand;
	private String  Cores;
	private String  CurSpeed;
	private String  MaxSpeed;
	private String  Model;
	
	@XmlElement(name = "Brand")
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@XmlElement(name = "Cores")
	public String getCores() {
		return Cores;
	}
	public void setCores(String cores) {
		Cores = cores;
	}
	@XmlElement(name = "CurSpeed")
	public String getCurSpeed() {
		return CurSpeed;
	}
	public void setCurSpeed(String curSpeed) {
		CurSpeed = curSpeed;
	}
	@XmlElement(name = "MaxSpeed")
	public String getMaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		MaxSpeed = maxSpeed;
	}
	@XmlElement(name = "Model")
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
}
