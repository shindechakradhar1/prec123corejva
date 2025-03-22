package in.prec.generics.demo;

public class GenericDemo {
	public static void main(String[] args) {
//		System.out.println(add(10,20));
//		System.out.println(add(10,20));
//		System.out.println(add(10,20));
//		System.out.println(add(10,20));
		
		IntegerPrinting intPrint = new IntegerPrinting(10);
		FloatPrinting floatPrint = new FloatPrinting(10F);
		
		intPrint.print();
		floatPrint.print();
	}
	
	public static int add(int no1, int no2) {
		return no1+no2;
	}
}
