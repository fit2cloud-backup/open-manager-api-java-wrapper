package com.fit2cloud.ome.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class MemoryEntries {
	private List<Memory> Memory;
	
	@XmlElementWrapper(name = "Memory")  
    @XmlElement(name = "Memory")
	public List<Memory> getMemory() {
		return Memory;
	}

	public void setMemory(List<Memory> memory) {
		Memory = memory;
	}
}
