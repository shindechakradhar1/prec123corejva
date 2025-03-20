package in.prec.oops.inheritance.polymorphism;

public class MethodOverloading {

	public void print() {
		System.out.println("Empty");
	}
	
//	Not Method Overloading
//	public int print(int var1) {
//		System.out.println("Integer var: " + var1);
//		return 0;
//	}
//	
//	public void print(int exp) {
//		
//	}
	
	public void print(String strVar) {
		System.out.println("String Variable: " + strVar);
	}
	
	public void print(int a, float b) {
		System.out.println("int and Float");
	}
	public void print(float a, int b) {
		System.out.println("float and int");
	}
}
