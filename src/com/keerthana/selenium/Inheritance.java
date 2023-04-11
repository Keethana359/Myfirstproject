package com.keerthana.selenium;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A1 a=new A1();
//	    a.printdate();

		A1 a2 = new A1();
		a2.printdate();
		B1 objB = new B1();
		objB.printdate();
		objB.showdate();
		System.out.println("a="+objB.a+" b="+objB.b);
		objB.printmsg();
	}
}

class A1 {
	int a = 10;

	void printdate() {
		System.out.println("a=" + a);
	}
}

class B1 extends A1 {
	int b = 20;

	void showdate() {
		System.out.println("b=" + b);
	}

	void printmsg() {
		System.out.println("this is parent class");
	}
}
