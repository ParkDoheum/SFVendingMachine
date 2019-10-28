package com.hk.vmv1;

public class Drink {
	private String pName;
	private int price;
	
	public Drink(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}
	
	public String getPName() {
		return pName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%,d)원", pName, price);
		//return pName + "(" + price +")원";
	}
}













