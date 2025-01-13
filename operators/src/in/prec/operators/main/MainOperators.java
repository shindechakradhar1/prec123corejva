package in.prec.operators.main;
import in.prec.operators.Operators;
public class MainOperators {

	public static void main(String[] args) {
		Operators operator = new Operators();
		operator.setNumber1(10);
		operator.setNumber2(20);
		int result=operator.performAddition();
		int greatestNumber=operator.greaterNumber();
		System.out.println(result);
		System.out.println(greatestNumber);
		int leftShiftResult = operator.leftShiftOperationOnNumber2(2);
		System.out.println(leftShiftResult);
	}
}
