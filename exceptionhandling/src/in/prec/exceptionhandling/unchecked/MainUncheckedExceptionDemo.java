package in.prec.exceptionhandling.unchecked;

public class MainUncheckedExceptionDemo {
	public static void main(String[] args) {
		int[] intArray = {1,2,3};
		
//		System.out.println(10/0);
		throw new RuntimeException("hello");
		
//		System.out.println("Hello");
	}
}
