package in.prec.oops.polymorphism.overriding.classes;

public class Child extends Parent{
	public void setAge(int age){
		System.out.println("child age= " + (age-30));
		super.setAge(age);
	}
	
	public void print() {
		System.out.println("Child");
	}
}
