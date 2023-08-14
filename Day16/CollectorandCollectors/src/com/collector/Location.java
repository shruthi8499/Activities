package com.collector;

public class Location {
	
	private String locationName;
    public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", state=" + state + "]";
	}
	public Location(String locationName, String state) {
		super();
		this.locationName = locationName;
		this.state = state;
	}
	private String state;
	
	}


