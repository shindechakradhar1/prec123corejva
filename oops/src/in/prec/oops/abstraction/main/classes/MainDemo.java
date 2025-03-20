package in.prec.oops.abstraction.main.classes;

import in.prec.oops.abstraction.abstracts.classes.Demo;
import in.prec.oops.abstraction.implementing.classes.DemoImpl;

public class MainDemo {
	public static void main(String[] args) {
		Demo demo = new DemoImpl(10);
		
		System.out.println(demo.getVar());
		demo.show();
		demo.show1();
		
		
	}
}
