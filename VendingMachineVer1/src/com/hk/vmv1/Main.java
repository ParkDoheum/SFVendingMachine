package com.hk.vmv1;

public class Main {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.showDrinks();
		vm.purchase(2, 1000);
	}

}
