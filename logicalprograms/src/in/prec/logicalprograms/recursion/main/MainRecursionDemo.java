package in.prec.logicalprograms.recursion.main;

import in.prec.logicalprograms.recursion.RecursionDemo;

public class MainRecursionDemo {
	
	public static void main(String[] args) {
		RecursionDemo demo = new RecursionDemo();
		int result=demo.print1(5);
		System.out.println(result);
		
		int result1=demo.power(5, 3);
		System.out.println(result1);
		
		char[] charArray = {'a','b','c'};
		demo.reverseCharacter(charArray, 0);
		
	}
}
