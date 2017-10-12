package com.fit2cloud.ome.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Device {
	private String AssetTag;
	private String DNSName;
	private String DiscoveryTime;
	private String ExpressServiceCode;
	private String GlobalStatus;
	private String IDracName;
	private String Id;
	private String InventoryTime;
	private String IsIdrac;
	private String IsInband;
	private String LaunchURL;
	private List<NIC> NICS;
	private String Name;
	private String NodeId;
	private String OSName;
	private String OSRevision;
	private String PowerStatus;
	private String ServiceTag;
	private String StatusTime;
	private String SystemId;
	private String SystemModel;
	private String Type;
	
	@XmlElement(name = "AssetTag")
	public String getAssetTag() {
		return AssetTag;
	}
	public void setAssetTag(String assetTag) {
		AssetTag = assetTag;
	}
	@XmlElement(name = "DNSName")
	public String getDNSName() {
		return DNSName;
	}
	public void setDNSName(String dNSName) {
		DNSName = dNSName;
	}
	@XmlElement(name = "DiscoveryTime")
	public String getDiscoveryTime() {
		return DiscoveryTime;
	}
	public void setDiscoveryTime(String discoveryTime) {
		DiscoveryTime = discoveryTime;
	}
	@XmlElement(name = "ExpressServiceCode")
	public String getExpressServiceCode() {
		return ExpressServiceCode;
	}
	public void setExpressServiceCode(String expressServiceCode) {
		ExpressServiceCode = expressServiceCode;
	}
	@XmlElement(name = "GlobalStatus")
	public String getGlobalStatus() {
		return GlobalStatus;
	}
	public void setGlobalStatus(String globalStatus) {
		GlobalStatus = globalStatus;
	}
	@XmlElement(name = "IDracName")
	public String getIDracName() {
		return IDracName;
	}
	public void setIDracName(String iDracName) {
		IDracName = iDracName;
	}
	@XmlElement(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@XmlElement(name = "InventoryTime")
	public String getInventoryTime() {
		return InventoryTime;
	}
	public void setInventoryTime(String inventoryTime) {
		InventoryTime = inventoryTime;
	}
	@XmlElement(name = "IsIdrac")
	public String getIsIdrac() {
		return IsIdrac;
	}
	public void setIsIdrac(String isIdrac) {
		IsIdrac = isIdrac;
	}
	@XmlElement(name = "IsInband")
	public String getIsInband() {
		return IsInband;
	}
	public void setIsInband(String isInband) {
		IsInband = isInband;
	}
	@XmlElement(name = "LaunchURL")
	public String getLaunchURL() {
		return LaunchURL;
	}
	public void setLaunchURL(String launchURL) {
		LaunchURL = launchURL;
	}
	@XmlElementWrapper(name = "NICS")  
    @XmlElement(name = "NIC")
	public List<NIC> getNICS() {
		return NICS;
	}
	public void setNICS(List<NIC> nICS) {
		NICS = nICS;
	}
	@XmlElement(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@XmlElement(name = "NodeId")
	public String getNodeId() {
		return NodeId;
	}
	public void setNodeId(String nodeId) {
		NodeId = nodeId;
	}
	@XmlElement(name = "OSName")
	public String getOSName() {
		return OSName;
	}
	public void setOSName(String oSName) {
		OSName = oSName;
	}
	@XmlElement(name = "OSRevision")
	public String getOSRevision() {
		return OSRevision;
	}
	public void setOSRevision(String oSRevision) {
		OSRevision = oSRevision;
	}
	@XmlElement(name = "PowerStatus")
	public String getPowerStatus() {
		return PowerStatus;
	}
	public void setPowerStatus(String powerStatus) {
		PowerStatus = powerStatus;
	}
	@XmlElement(name = "ServiceTag")
	public String getServiceTag() {
		return ServiceTag;
	}
	public void setServiceTag(String serviceTag) {
		ServiceTag = serviceTag;
	}
	@XmlElement(name = "StatusTime")
	public String getStatusTime() {
		return StatusTime;
	}
	public void setStatusTime(String statusTime) {
		StatusTime = statusTime;
	}
	@XmlElement(name = "SystemId")
	public String getSystemId() {
		return SystemId;
	}
	public void setSystemId(String systemId) {
		SystemId = systemId;
	}
	@XmlElement(name = "SystemModel")
	public String getSystemModel() {
		return SystemModel;
	}
	public void setSystemModel(String systemModel) {
		SystemModel = systemModel;
	}
	@XmlElement(name = "Type")
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}

}
