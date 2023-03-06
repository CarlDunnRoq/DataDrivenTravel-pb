package com.academy.travelapp;

import java.util.UUID;

public class Base {
	private UUID id;
	private String name;
	
	public Base(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}
	
	public UUID getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	//database set up and SQL write
	public void write (String sql) {
		try (/*TravelAppDB db = new TravelAppDB();*/ TravelApp app = new TravelApp()) {			
			app.write(sql);
		
	}
	}
}
