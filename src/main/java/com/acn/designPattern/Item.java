package com.acn.designPattern;

public class Item {
	String pdId;
	float price;
	
	public Item(String pdId, float price) {
		this.pdId = pdId;
		this.price = price;
	}

	public String getPdId() {
		return pdId;
	}

	public void setPdId(String pdId) {
		this.pdId = pdId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

}
