package in.prec.oops.abstraction.abstracts.classes;

public abstract class Demo {
	
	private static int var;
	
	public Demo() {
		
	}
	
	public Demo(int var) {
		this.var=var;
	}
	
	public int getVar() {
		return var;
	}
	
	public abstract void show();
	
	public abstract void show1();
	
	public void display() {
		System.out.println("Display");
	}
	
}
