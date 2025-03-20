package in.prec.oops.abstraction.abstracts.classes;

public interface Operable {

	static int var=10;
	void operation();
	
//	from java 1.8
	static void show() {
		System.out.println("Hello");
	}
//	default method
	public default void print() {
		defaultShow();
	}
	
//	from java 1.9 version
	private void defaultShow() {
		System.out.println("Print");
	}
}
