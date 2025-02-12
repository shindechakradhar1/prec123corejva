package in.prec.oops.inheritance.subclasses;

import in.prec.oops.inheritance.superclasses.Animal;

public class Cat extends Animal{
	boolean isDomestic;

	public Cat() {}

	public Cat(boolean isDomestic, int age, int height) {
		super(age, height);
		this.isDomestic = isDomestic;
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

//	@Override
//	public String toString() {
//		return "Cat [isDomestic=" + isDomestic + " age=" + getAge() + " height=" + getHeight() + "]";
//	}
	
	
}
