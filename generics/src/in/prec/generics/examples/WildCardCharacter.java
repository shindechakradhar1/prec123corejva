package in.prec.generics.examples;

public class WildCardCharacter {
	public static void main(String[] args) {
		PrintNumbers<Object> intNumber = new PrintNumbers<>(100);
		print(intNumber);
		
		PrintNumbers<Object> intNumber1 = new PrintNumbers<>(10D);
		print(intNumber1);
		
	}
	
	public static void print(PrintNumbers<? super Number> obj) {
		System.out.println(obj);
	}
}
