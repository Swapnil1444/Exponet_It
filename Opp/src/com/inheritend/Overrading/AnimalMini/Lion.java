package com.inheritend.Overrading.AnimalMini;

public class Lion extends WildAnimal{
	
	@Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars loudly.");
    }

}
