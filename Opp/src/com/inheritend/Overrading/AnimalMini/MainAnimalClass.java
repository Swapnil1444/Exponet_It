package com.inheritend.Overrading.AnimalMini;

public class MainAnimalClass {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.animalName="Tommy";
		d.animalAge=4;
		System.out.println("Animal Name:"+d.animalName);
		System.out.println("Animal Age:"+d.animalAge);
		d.eat();
		d.sound();
		System.out.println();
		
		Cat c=new Cat();
		c.animalName="Kitty";
		c.animalAge=3;
		System.out.println("Animal Name:"+c.animalName);
		System.out.println("Animal Age:"+c.animalAge);
		c.eat();
		c.sound();
		System.out.println();
		
		Lion l=new Lion();
		l.animalAge=11;
		l.animalName="Simba";
		System.out.println("Animal Name:"+l.animalName);
		System.out.println("Animal Age:"+l.animalAge);
		l.eat();
		l.sound();
		System.out.println();
		
		Tiger t = new Tiger();
        t.animalName = "Sheru";
        t.animalAge = 4;
        System.out.println("Tiger Name: " + t.animalName);
        System.out.println("Tiger Age: " + t.animalAge);
        t.eat();
        t.sound();
	}

}
