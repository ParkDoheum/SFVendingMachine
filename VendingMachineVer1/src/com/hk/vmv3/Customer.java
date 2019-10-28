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
		
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//구매
	public void purchase(int idx) {
		addStock(idx);
		payMoney(idx);
	}
	
	//재고 1씩 올리기
	public void addStock(int idx) {
		drinks.get(idx).plusStock();
		
		//밑에꺼 둘다 getStock, setStock 이용하여 한 방법
		/*
		//3줄로 처리 (가독성 ^)
		Drink d = drinks.get(idx);
		int stock = d.getStock();
		d.setStock(stock++);
		*/
		
		//1줄로 처리 (가독성 떨어짐)
		//drinks.get(idx).setStock((drinks.get(idx).getStock()) + 1);
	}
	
	//금액 사용
	public void payMoney(int idx) {
		//잔돈 프린트
	}
	
	@Override
	public String toString() {
		return name + ", " + money;
	}
}















