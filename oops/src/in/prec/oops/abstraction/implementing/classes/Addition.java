package in.prec.oops.abstraction.implementing.classes;

import in.prec.oops.abstraction.abstracts.classes.ArithematicOperator;

public class Addition implements ArithematicOperator{

	@Override
	public int operation(int number1, int number2) {
		return number1+number2;
	}
}
