package com.product;

public class Location {
	private String joblocation;

	public String getJoblocation() {
		return joblocation;
	}

	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String joblocation) {
		super();
		this.joblocation = joblocation;
	}

	@Override
	public String toString() {
		return "Location [joblocation=" + joblocation + "]";
	}

}
