package com.hk.vmv2;

public class Main {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.putProduct(1, 1);
		vm.showDrinks();
		vm.purchase(1, 1000000);
		vm.showDrinks();
		vm.purchase(1, 1000000);
	}

}
