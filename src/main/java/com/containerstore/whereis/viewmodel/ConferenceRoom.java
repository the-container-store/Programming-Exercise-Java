package com.containerstore.whereis.viewmodel;

public class ConferenceRoom {
	private String name;
	private String location;

	public ConferenceRoom(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public ConferenceRoom() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
