package com.hk.vmv3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();

		System.out.print("이름을 입력해 주세요: ");
		String name = scan.next();

		System.out.print("금액을 입력해 주세요: ");
		int money = scan.nextInt();

		// Customer 객체화
		Customer cust = new Customer(name, money);

		while (true) {
			vm.showDrinks();
			System.out.print("구매할 번호를 입력해 주세요 (종료:0): ");
			int idx = scan.nextInt();
			if(idx == 0) {
				break;
			}
			vm.sales(idx, cust);
			System.out.println(cust);
		}
		System.out.println("--------------");
		cust.showState();
		scan.close();
	}

}
