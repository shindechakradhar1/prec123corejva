package in.prec.oops.abstraction.main.classes;

import in.prec.oops.abstraction.abstracts.classes.ArithematicOperator;
import in.prec.oops.abstraction.implementing.classes.Addition;

public class MainArithematicOperator {
	public static void main(String[] args) {
		ArithematicOperator addition = new Addition();
		
		System.out.println(addition.operation(10, 30));
		
//		ArithematicOperator addition1 = new Addition();
		
		ArithematicOperator substraction = (number1, number2) -> number1-number2;
		
		System.out.println(substraction.operation(30, 20));
		
		
		ArithematicOperator multiplication = (no1, no2) -> no1*no2;
		
		
		System.out.println(multiplication.operation(4, 5));
		
		
		ArithematicOperator divide = (no1, no2)->no1/no2;
		
		System.out.println(divide.operation(20, 10));
		
	}
}
