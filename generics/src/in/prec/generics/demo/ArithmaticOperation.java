package in.prec.generics.demo;

public class ArithmaticOperation<T extends Number> {
	private T no1;
	private T no2;
	public ArithmaticOperation(T no1, T no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	public Double addition() {
		return no1.doubleValue()+no2.doubleValue();
	}
	
	
}
