package in.prec.staticandfinal.staticdemo;

public class StaticDemo {
	static int var;
	
	int var2;
	
	static {
		var=10;
	}
	
	public static void print() {
		System.out.println(var);
		
		StaticDemo dmeo = new StaticDemo();
		print1();
		
		System.out.println(dmeo.var2);
		
	}
	
	public static void print1() {
		StaticDemo dmeo = new StaticDemo();
		dmeo.print2();
	}
	
	public void print2() {
		print1();
		print();
		System.out.println(var);
		System.out.println(var2);
	}
	
}
