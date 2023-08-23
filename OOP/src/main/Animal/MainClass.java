package main.Animal;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Bird.Eagle;
import animal.Fish.Eel;
import animal.Reptile.Crocodile;
import animal.Reptile.Reptile;

public class MainClass {
	public static void main(String[] args) {
//		Animal ani=new Animal();
//		System.out.println(ani.showInfo());
//		
//		System.out.println("*******************");
//		
//		Crocodile cro=new Crocodile();
//		System.out.println(cro.showinfo());
//		System.out.println("*******************");
//		
//		Eel eel=new Eel();
//		System.out.println(eel.showInfo());
//		System.out.println("*******************");
//		
//		Eagle ee=new Eagle();
//		System.out.println(ee.showInfo());
		List<Animal> animals = new ArrayList<>();
		Animal animal = new Animal();
		Animal reptile = new Reptile();
		Animal cro = new Crocodile();
		Animal ee = new Eel();
		Animal eagle = new Eagle();

		animals.add(animal);
		animals.add(reptile);
		animals.add(eagle);
		animals.add(cro);
		animals.add(ee);
		listAnimals(animals);

	}
	
	public static void listAnimals(List<Animal> animals) {
		for(Animal animal : animals) {
			System.out.println(animal.showInfo());
			
		}
	}

}
