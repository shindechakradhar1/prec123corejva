package in.prec.oops.inheritance.main;

import in.prec.oops.inheritance.subclasses.Cat;
import in.prec.oops.inheritance.subclasses.Dog;
import in.prec.oops.inheritance.superclasses.Animal;

public class MainDogAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog(false, 4, true, 5, 2);
		System.out.println("Main Method");
//		dog.height=10;
//		dog.setAge(30);
//		dog.setHeight(5);
//		dog.setTail(false);
//		dog.setLegs(2);
		System.out.println(dog);
		
		Cat cat = new Cat(true, 3, 1);
		
		System.out.println(cat);
		
//		upcasting = object will access all the methods from superclass
//		and overriden method of subclass
		
		Animal animal = dog;
		
		System.out.println(animal.toString());
		
//		downcasting = 
		
		cat=(Cat)animal;
	}
}
