package com.device;

import org.springframework.beans.factory.annotation.Autowired;

public class Technician {
	private String technicianName;
	@Autowired
	  private Device device;
	@Override
	public String toString() {
		return "Technician [technicianName=" + technicianName + ", device=" + device + "]";
	}
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public Technician(String technicianName, Device device) {
		super();
		this.technicianName = technicianName;
		this.device = device;
	}
	public Technician() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
