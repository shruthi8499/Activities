package com.product;

public class Device {
	private String  deviceName;
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public Device(String deviceName, String deviceType, int no_of_days_for_rent) {
		super();
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.no_of_days_for_rent = no_of_days_for_rent;
	}
	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", deviceType=" + deviceType + ", no_of_days_for_rent="
				+ no_of_days_for_rent + "]";
	}
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String deviceType;
	private int no_of_days_for_rent;

	}

