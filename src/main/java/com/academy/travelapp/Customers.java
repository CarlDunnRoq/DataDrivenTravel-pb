package com.academy.travelapp;

import java.util.List;

public class Customers extends Base {
	protected String address;
	protected String favourites;
	protected static final String WRITE = "INSERT INTO Customer (Id, Name, Address) VALUES ('%s', '%s', '%s')";
	private static final String UPDATE = "UPDATE Animal SET ownerId = '%s' WHERE Id = '%s'";


	public Customers(String name, String address) {
		super(name);
		this.address = address;
		this.write(String.format(WRITE, this.getID().toString(), this.getName(), this.getAddress()));
	}

	public void addFavourite(Favourites favourites) {
		this.write(String.format(UPDATE, this.getID().toString(), favourites.getID().toString()));
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getFavourite() {
		return this.favourites;
	}
	
	
	
	
	public List<Favourites> getFavourites() {
		return null;
	}

	}
	

