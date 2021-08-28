package com.acn.designPattern;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Item> item=new ArrayList<>();
	
	public void addItem(Item item) {
		this.item.add(item);
	}
	
	public void removeItem(Item item) {
		
		this.item.remove(item);
		
	}
public float calculate(List<Item> lItem) {
	float amount=0;
	for(Item item:lItem) {
		amount=amount+item.getPrice();
	}
	return amount;
}

public void paying(StrategyPattern sp) {	
	float amount=calculate(item);
	sp.pay((int) amount);
	
}
}
