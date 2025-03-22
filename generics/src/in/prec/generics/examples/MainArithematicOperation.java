package in.prec.generics.examples;

import in.prec.generics.demo.ArithmaticOperation;

public class MainArithematicOperation {
	public static void main(String[] args) {
		ArithmaticOperation<Double> operation = 
				new ArithmaticOperation<>(10D,10D);
		
		System.out.println(operation.addition());
	}
}
