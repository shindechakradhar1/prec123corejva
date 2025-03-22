package in.prec.generics.examples;

import in.prec.generics.demo.GenericDemo1;

public class MainGenericDemo1 {
	public static void main(String[] args) {
		GenericDemo1<Integer> intObj = new GenericDemo1<>(10);
		GenericDemo1<String> strObj = new GenericDemo1<>("ABC");
		GenericDemo1<Float> floatObj = new GenericDemo1<>(10F);
		
		Integer no=intObj.getNo();
	}
}
