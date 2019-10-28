package com.hk.vmv1;

import java.util.*;

public class VendingMachine {
	
	private List<Drink> drinks;
	
	public VendingMachine() {
		drinks = new ArrayList();
		
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));		
	}
	
	public void purchase(int idx, int money) {
		//해당 제품의 주소값을 빼온다음에
		int targetIdx = idx - 1;
		if(targetIdx < 0 || targetIdx >= drinks.size()) {
			System.out.println("에러 발생!!");
			return;
		}
		
		Drink d = drinks.get(targetIdx);		
		if(d.getPrice() > money) {
			System.out.println("금액이 부족합니다.");
		} else {
			int calc = money - d.getPrice();
			System.out.printf("잔돈 : %,d\n", calc);
		}
		//money값과 제품의 price값을 비교
		//금액이 부족하면 "금액이 부족합니다."
		//else 잔돈을 나타낸다.
		//idx값이 마이너스 값이거나 outofArrayIndex 에러가 나지 않도록
		
	}
	
	public void showDrinks() {
		
		for(int i=0; i<drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d. %s\n", (i+1), d);
		}
		
		
	}
}









