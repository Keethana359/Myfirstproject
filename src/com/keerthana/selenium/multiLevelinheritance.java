package com.keerthana.selenium;

public class multiLevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Animal al = new Animal();
          al.eat();
          Dog d = new Dog();
          d.eat();
          d.bark();
          Babydog bd = new Babydog();
          bd.eat();
          bd.bark();
          bd.weep();
          
          }
}
      class Animal{
    	  void eat() {
    		  System.out.println("animal eating");
    	  }
      }
      class Dog extends Animal{
    	  void bark() {
    		  System.out.println("dog barking");
    	  }
      }
      class Babydog extends Dog{
    	  void weep() {
    		  System.out.println("babydog weeping");
    	  }
      }

      
