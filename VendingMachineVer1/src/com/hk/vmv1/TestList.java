package com.hk.vmv1;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Drink> list2 = new ArrayList();
		list2.add(new Drink("콜라", 1000));
		list2.add(new Drink("콤비콜라", 2000));
		list2.add(new Drink("사이다", 3000));
		
		Drink dd = list2.get(1);
		
		System.out.println("size : " + list2.size());
		
		
		List list = new ArrayList(); 
				
		//넣는거
		list.add(1);
		list.add("ddd");
		list.add(true);
		list.add(new Drink("사이다", 1000));
		
		//빼는거
		list.get(0);
		list.get(1);
		list.get(2);
		Drink asdf = (Drink)list.get(3);
		
		
		//크기
		list.size();
	}

}
