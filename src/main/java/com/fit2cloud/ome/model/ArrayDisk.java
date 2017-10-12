package com.fit2cloud.ome.model;

import javax.xml.bind.annotation.XmlElement;

public class ArrayDisk {
	private String DeviceId;
	private String ArrayDiskNumber;
	private String ArrayDiskName;
	private String ArrayDiskVendorName;
	private String ArrayDiskStatus;
	private String ArrayDiskModelNumber;
	private String ArrayDiskSerialNumber;
	private String ArrayDiskRevision;
	private String ArrayDiskEnclosureId;
	private String ArrayDiskChannel;
	private String ArrayDiskLength;
	private String ArrayDiskFreeSpace;
	private String ArrayDiskUsedSpace;
	private String ArrayDiskBusType;
	private String ArrayDiskTargetId;
	private String ArrayDiskMediaType;
	private String RemainingRatedWriteEndurance;
	private String ArrayDiskDescription;
	private String ArraySupportedEncryptionTypes;
	
	@XmlElement(name = "DeviceId")
	public String getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(String deviceId) {
		DeviceId = deviceId;
	}
	@XmlElement(name = "ArrayDiskNumber")
	public String getArrayDiskNumber() {
		return ArrayDiskNumber;
	}
	public void setArrayDiskNumber(String arrayDiskNumber) {
		ArrayDiskNumber = arrayDiskNumber;
	}
	@XmlElement(name = "ArrayDiskName")
	public String getArrayDiskName() {
		return ArrayDiskName;
	}
	public void setArrayDiskName(String arrayDiskName) {
		ArrayDiskName = arrayDiskName;
	}
	@XmlElement(name = "ArrayDiskVendorName")
	public String getArrayDiskVendorName() {
		return ArrayDiskVendorName;
	}
	public void setArrayDiskVendorName(String arrayDiskVendorName) {
		ArrayDiskVendorName = arrayDiskVendorName;
	}
	@XmlElement(name = "ArrayDiskStatus")
	public String getArrayDiskStatus() {
		return ArrayDiskStatus;
	}
	public void setArrayDiskStatus(String arrayDiskStatus) {
		ArrayDiskStatus = arrayDiskStatus;
	}
	@XmlElement(name = "ArrayDiskModelNumber")
	public String getArrayDiskModelNumber() {
		return ArrayDiskModelNumber;
	}
	public void setArrayDiskModelNumber(String arrayDiskModelNumber) {
		ArrayDiskModelNumber = arrayDiskModelNumber;
	}
	@XmlElement(name = "ArrayDiskSerialNumber")
	public String getArrayDiskSerialNumber() {
		return ArrayDiskSerialNumber;
	}
	public void setArrayDiskSerialNumber(String arrayDiskSerialNumber) {
		ArrayDiskSerialNumber = arrayDiskSerialNumber;
	}
	@XmlElement(name = "ArrayDiskRevision")
	public String getArrayDiskRevision() {
		return ArrayDiskRevision;
	}
	public void setArrayDiskRevision(String arrayDiskRevision) {
		ArrayDiskRevision = arrayDiskRevision;
	}
	@XmlElement(name = "ArrayDiskEnclosureId")
	public String getArrayDiskEnclosureId() {
		return ArrayDiskEnclosureId;
	}
	public void setArrayDiskEnclosureId(String arrayDiskEnclosureId) {
		ArrayDiskEnclosureId = arrayDiskEnclosureId;
	}
	@XmlElement(name = "ArrayDiskChannel")
	public String getArrayDiskChannel() {
		return ArrayDiskChannel;
	}
	public void setArrayDiskChannel(String arrayDiskChannel) {
		ArrayDiskChannel = arrayDiskChannel;
	}
	@XmlElement(name = "ArrayDiskLength")
	public String getArrayDiskLength() {
		return ArrayDiskLength;
	}
	public void setArrayDiskLength(String arrayDiskLength) {
		ArrayDiskLength = arrayDiskLength;
	}
	@XmlElement(name = "ArrayDiskFreeSpace")
	public String getArrayDiskFreeSpace() {
		return ArrayDiskFreeSpace;
	}
	public void setArrayDiskFreeSpace(String arrayDiskFreeSpace) {
		ArrayDiskFreeSpace = arrayDiskFreeSpace;
	}
	@XmlElement(name = "ArrayDiskUsedSpace")
	public String getArrayDiskUsedSpace() {
		return ArrayDiskUsedSpace;
	}
	public void setArrayDiskUsedSpace(String arrayDiskUsedSpace) {
		ArrayDiskUsedSpace = arrayDiskUsedSpace;
	}
	@XmlElement(name = "ArrayDiskBusType")
	public String getArrayDiskBusType() {
		return ArrayDiskBusType;
	}
	public void setArrayDiskBusType(String arrayDiskBusType) {
		ArrayDiskBusType = arrayDiskBusType;
	}
	@XmlElement(name = "ArrayDiskTargetId")
	public String getArrayDiskTargetId() {
		return ArrayDiskTargetId;
	}
	public void setArrayDiskTargetId(String arrayDiskTargetId) {
		ArrayDiskTargetId = arrayDiskTargetId;
	}
	@XmlElement(name = "ArrayDiskMediaType")
	public String getArrayDiskMediaType() {
		return ArrayDiskMediaType;
	}
	public void setArrayDiskMediaType(String arrayDiskMediaType) {
		ArrayDiskMediaType = arrayDiskMediaType;
	}
	@XmlElement(name = "RemainingRatedWriteEndurance")
	public String getRemainingRatedWriteEndurance() {
		return RemainingRatedWriteEndurance;
	}
	public void setRemainingRatedWriteEndurance(String remainingRatedWriteEndurance) {
		RemainingRatedWriteEndurance = remainingRatedWriteEndurance;
	}
	@XmlElement(name = "ArrayDiskDescription")
	public String getArrayDiskDescription() {
		return ArrayDiskDescription;
	}
	public void setArrayDiskDescription(String arrayDiskDescription) {
		ArrayDiskDescription = arrayDiskDescription;
	}
	@XmlElement(name = "ArraySupportedEncryptionTypes")
	public String getArraySupportedEncryptionTypes() {
		return ArraySupportedEncryptionTypes;
	}
	public void setArraySupportedEncryptionTypes(String arraySupportedEncryptionTypes) {
		ArraySupportedEncryptionTypes = arraySupportedEncryptionTypes;
	}
	
}
