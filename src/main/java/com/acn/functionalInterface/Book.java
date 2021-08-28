package com.acn.functionalInterface;

public class Book {
	private String name;
	private String authName;
	private float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(String name, String authName, float price) {
		super();
		this.name = name;
		this.authName = authName;
		this.price = price;
	}
	public Book() {
		
	}

}
