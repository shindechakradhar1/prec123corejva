package in.prec.generics.demo;

public class GenericDemo1<T> {
	private T no;
	
	public GenericDemo1(T no) {
		this.no=no;
	}
	
	public T getNo() {
		return no;
	}
	
	public void print() {
		System.out.println(no);
	}
}
