package com.hk.vmv3;

import java.util.*;

public class Customer {
	private List<Drink> drinks = new ArrayList();
	private String name;
	private int money;
	
	//생성자 - drinks는 벤딩머신과 같게처리
	//외부에서 들어오는 name, money값을 
	//this name, money변수에 값을 넣어주는 
	//생성자를 만드세요.
	public Customer(String name, int money) {
		init();
		this.name = name;
		this.money = money;
	}
	
	private void init() {
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
	}
	
	public void purchase(int idx) {
		
	}
	
}















