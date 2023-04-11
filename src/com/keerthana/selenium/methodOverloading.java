package com.keerthana.selenium;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading mol = new methodOverloading();
		double result= mol.add(10.05f,20,12.98);
		System.out.println(result);
		
				

	}
//	 int add (int a,int b ) {
//		 return a+b;
//	 }
	double add(float a, int b,double c) {
		 return a+b+c;
	 }
}
     
