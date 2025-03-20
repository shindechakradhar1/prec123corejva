package in.prec.oops.abstraction.implementing.classes;

import in.prec.oops.abstraction.abstracts.classes.Demo;

public class DemoImpl extends Demo{
	
	public DemoImpl() {
		super();
	}
	
	public DemoImpl(int var) {
		super(var);
	}
	
	public void show() {
		System.out.println("Show method");
	}
	
	public void show1() {
		System.out.println("Show1 method");
	}
}
