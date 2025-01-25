package in.prec.logicalprograms.recursion.main;

import in.prec.logicalprograms.recursion.FibonacciSeries;

public class MainFibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		
		int result=series.fibonacciNo(6);
		System.out.println(result);
	}
}
