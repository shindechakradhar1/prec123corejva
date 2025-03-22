package in.prec.generics.examples;

public class PrintNumbers<T> {
	T no1;

	public PrintNumbers(T no1) {
		this.no1 = no1;
	}
	
	public void setNo1(T no1) {
		this.no1=no1;
	}
	
	public T getNo1() {
		return no1;
	}

	@Override
	public String toString() {
		return "PrintNumbers [Value=" + no1 + "]";
	}	
}
