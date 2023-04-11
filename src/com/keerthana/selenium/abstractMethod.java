package com.keerthana.selenium;

class abstractMethod {

	public static void main(String[] args) {
		icici i = new icici();

		sbi s = new sbi();
		System.out.println("icici bank rate=" + i.getofinterest());
		System.out.println("sbi bank rate=" + s.getofinterest());
		System.out.println(i.getbalance());
		System.out.println(s.getbalance());

	}

}

abstract class bank {
	abstract int getofinterest();
	public int getbalance() {
		return 100;
	}
}

class icici extends bank {

	@Override
	int getofinterest() {
		return 5;
	}
}

class sbi extends bank {

	@Override
	int getofinterest() {
		return 7;
	}

}

