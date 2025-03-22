package in.prec.generics.demo;

public class PreGenericDemo {
	private Object no;
	
	public PreGenericDemo(Object no) {
		this.no=no;
	}
	
	public Object getNo() {
		return no;
	}
	
	public void print() {
		System.out.println(no);
	}
}
