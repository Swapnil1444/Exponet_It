package com.inheritend.Overrading.AnimalMini;

public class Cat extends PetAnimal {
	
	 @Override
	    public void eat() {
	        System.out.println("Cat eats fish.");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Cat says: Meow Meow!");
	    }

}
