package com.academy.travelapp;

public class Favourites extends Base{
	protected static final String WRITE = "INSERT INTO Favourites (Id, Name, Type, Town) VALUES ('%s', '%s', '%s', '%s')";
	protected String type;
	protected String town;
	
	
	public Favourites (String name, String type, String town) {
		super(name);
		this.type = type;
		this.town = town;
		
		this.write(String.format(WRITE, this.getID().toString(), this.getName(), this.getType(), this.getTown()));
	}
	
	public String getType() {
		return this.type;
	}
	public String getTown() {
		return this.town;
		
	}

}
