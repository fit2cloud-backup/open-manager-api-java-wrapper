package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class Agent {
	private String AgentId;
	private String Description;
	private String DeviceId;
	private String Name;
	private String Status;
	private String URL;
	private String Version;
	
	@XmlElement(name = "AgentId")
	public String getAgentId() {
		return AgentId;
	}
	public void setAgentId(String agentId) {
		AgentId = agentId;
	}
	@XmlElement(name = "Description")
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@XmlElement(name = "DeviceId")
	public String getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(String deviceId) {
		DeviceId = deviceId;
	}
	@XmlElement(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@XmlElement(name = "Status")
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@XmlElement(name = "URL")
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	@XmlElement(name = "Version")
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
}
