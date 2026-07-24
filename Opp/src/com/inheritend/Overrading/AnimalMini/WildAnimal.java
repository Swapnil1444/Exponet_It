package com.inheritend.Overrading.AnimalMini;

public class WildAnimal extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Wild Animal hunts for food.");
	}
	@Override
	public void sound() {
		System.out.println("Wild Animal roars.");
	}
	

}
