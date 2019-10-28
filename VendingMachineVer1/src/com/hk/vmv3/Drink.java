package com.hk.vmv3;

public class Drink {
	private String pName;
	private int price;
	private int stock; //재고
	
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
	
	public int getStock() {
		return stock;
	}	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public boolean minusStock() {
		if(stock == 0) {
			return false;
		}
		stock--;
		return true;	
	}
	
	
	
	public void plusStock() {
		stock++;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%,d)원 - (재고: %,d)"
				, pName, price, stock);
		//return pName + "(" + price +")원";
	}
	
	
}













