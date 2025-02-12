package in.prec.oops.inheritance.subclasses;

import in.prec.oops.inheritance.superclasses.Animal;

public class Dog extends Animal {
	private boolean isWild;
	private int legs;
	private boolean tail;

	public Dog() {
		this(false, 4, true, 0, 0);
		System.out.println("Dog Constructor");
	}

	public Dog(boolean isWild, int legs, boolean tail, int age, int height) {
//		constructor call must be first statement 
		super(age, height);
		this.isWild = isWild;
		this.legs = legs;
		this.tail = tail;
	}

	public boolean isWild() {
		return isWild;
	}

	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isTail() {
		return tail;
	}

	public void setTail(boolean tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Dog [isWild=" + isWild + ", legs=" + legs + ", tail=" + tail + " age=" + getAge() + " height=" + getHeight() +"]";
	}

}
