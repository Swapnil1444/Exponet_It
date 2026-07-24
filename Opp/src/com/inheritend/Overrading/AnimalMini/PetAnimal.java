package com.inheritend.Overrading.AnimalMini;

public class PetAnimal extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Pet animal eats pet food.");
	}
	@Override
	public void sound() {
		System.out.println("Pet animal makes a frindly sound.");
	}
	

}
