package com.inheritend.Overrading.AnimalMini;

public class Dog extends PetAnimal {
	
	@Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sound() {
        System.out.println("Dog says: Bark Bark!");
    }

}
