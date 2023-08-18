package com.device;

public class Location {
	private String locationName;
	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}

	

	public String getLocationName() {
		return locationName;
	}

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + "]";
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

}
