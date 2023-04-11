package com.keerthana.selenium;

public class methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method 

        car obj = new car();
        obj.run();
        		
	}
}
     class bike {
    	 void run() {
    		 System.out.println("running time must be wear helmate");
    	 }
     }
     class car extends bike {
    	 void run() {
    		 System.out.println("running time must be wear belt");
    	 }
     }

