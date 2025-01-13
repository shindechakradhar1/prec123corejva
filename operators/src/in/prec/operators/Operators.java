package in.prec.operators;

public class Operators {

	int number1;
	int number2;
	
	public Operators() {}
	
	public Operators(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	public void setNumber1(int number1) {
		this.number1=number1;
	}
	
	public void setNumber2(int number2) {
		this.number2=number2;
	}
	
	public int getNumber1() {
		return number1;
	}
	
	public int getNumber2() {
		return number2;
	}
	
	public int performAddition() {
		return number1+number2;
	}
	
	public int performLogicalAndOperation() {
		return number1&number2;
	}
	
	public int complementOperationOnNumber1() {
		return ~number1;
	}
	
	public int leftShiftOperationOnNumber2(int position) {
		return number2<<position;
	}
	
	public int greaterNumber() {
		return (number1>number2)?number1:number2;
	}
}
