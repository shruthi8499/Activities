package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name="Locationdata")
public class StoreLocation {
	@Id
	 private String location;
	 private String owner;
	 public StoreLocation(String location, String owner) {
		super();
		this.location = location;
		this.owner = owner;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "StoreLocation [location=" + location + ", owner=" + owner + "]";
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public StoreLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
