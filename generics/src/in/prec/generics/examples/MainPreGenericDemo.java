package in.prec.generics.examples;

import in.prec.generics.demo.PreGenericDemo;

public class MainPreGenericDemo {
	public static void main(String[] args) {
		PreGenericDemo intObj = new PreGenericDemo(10);
		PreGenericDemo strObj = new PreGenericDemo("ABC");
		PreGenericDemo floatObj = new PreGenericDemo(10F);
		
//		System.out.println(no);
		intObj.print();
//		strObj.print();
//		floatObj.print();
	}
}
