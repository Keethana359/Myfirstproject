package com.keerthana.selenium;

public class hierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bear wa= new Bear();
		wa.eat();
		
		
	}

}

class Wildanimal {
	void live() {
		System.out.println("live in forest");
	}

	void eat() {
		System.out.println("Eating");
	}
}

class Elephant extends Wildanimal {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("grass eating");
	}
}

class Bear extends Wildanimal {
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bear Eats Honey");
	}
}