package com.inheritend.Overrading.AnimalMini;

public class Tiger extends WildAnimal{

	@Override
	public void eat() {
		System.out.println("Tiger hunts deer.");
	}

	@Override
	public void sound() {
		System.out.println("Tiger growls.");
	}

}
