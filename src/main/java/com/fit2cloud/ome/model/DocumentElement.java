package com.fit2cloud.ome.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DocumentElement")
public class DocumentElement {
	private List<ArrayDisk> ArrayDisk;
	private List<VirtualDisk> VirtualDisk;
	@XmlElement(name = "ArrayDisk")
	public List<ArrayDisk> getArrayDisk() {
		return ArrayDisk;
	}
	public void setArrayDisk(List<ArrayDisk> arrayDisk) {
		ArrayDisk = arrayDisk;
	}
	@XmlElement(name = "VirtualDisk")
	public List<VirtualDisk> getVirtualDisk() {
		return VirtualDisk;
	}
	public void setVirtualDisk(List<VirtualDisk> virtualDisk) {
		VirtualDisk = virtualDisk;
	}
}
