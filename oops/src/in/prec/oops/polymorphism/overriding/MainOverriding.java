package in.prec.oops.polymorphism.overriding;

import in.prec.oops.polymorphism.overriding.classes.Animal;
import in.prec.oops.polymorphism.overriding.classes.Cat;

public class MainOverriding {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.print();
		
		Cat cat = new Cat();
		cat.print();
	}
}
