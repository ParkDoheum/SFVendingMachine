package com.hk.vmv3;

public class Main {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.putProduct(1, 1);
		vm.showDrinks();
		vm.sales(1, 1000000);
		vm.showDrinks();
		vm.sales(1, 1000000);
	}

}
