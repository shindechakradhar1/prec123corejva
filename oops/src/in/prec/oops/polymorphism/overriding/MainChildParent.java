package in.prec.oops.polymorphism.overriding;

import in.prec.oops.polymorphism.overriding.classes.Child;

public class MainChildParent {
	public static void main(String[] args) {
		Child child = new Child();
		child.setAge(50);
		System.out.println(child.getAge());
		child.print();
	}
}
