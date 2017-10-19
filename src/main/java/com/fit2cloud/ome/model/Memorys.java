package com.fit2cloud.ome.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Memorys {
	
	private List<Memory> MemoryEntries;
	
	private String TotalMemory;
	 
	@XmlElementWrapper(name = "MemoryEntries")  
    @XmlElement(name = "Memory")
	public List<Memory> getMemoryEntries() {
		return MemoryEntries;
	}

	public void setMemoryEntries(List<Memory> memoryEntries) {
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
