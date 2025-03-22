package in.prec.generics.examples;

public class MainPrintNumber {
	 public static void main(String[] args) {
		PrintNumbers<Integer> printNo1 = new PrintNumbers<>(10);
		Integer result1=printNo1.getNo1();
		System.out.println(result1);
		
		PrintNumbers<Float> printNo2 = new PrintNumbers<>(10F);
		Float result2=printNo2.getNo1();
		System.out.println(result2);
		
		
		PrintNumbers<String> printNo3 = new PrintNumbers<>("ABCD");
		String result3=printNo3.getNo1();
		System.out.println(result3);	
	}
}
