package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Memorys {
	
	private MemoryEntries MemoryEntries;
	
	private String TotalMemory;
	 
	@XmlElement(name = "MemoryEntries")
	public MemoryEntries getMemoryEntries() {
		return MemoryEntries;
	}

	public void setMemoryEntries(MemoryEntries memoryEntries) {
		MemoryEntries = memoryEntries;
	}
	@XmlElement(name = "TotalMemory")
	public String getTotalMemory() {
		return TotalMemory;
	}

	public void setTotalMemory(String totalMemory) {
		TotalMemory = totalMemory;
	}

}
