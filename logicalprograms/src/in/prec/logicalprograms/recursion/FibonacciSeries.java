package in.prec.logicalprograms.recursion;

public class FibonacciSeries {
	
	
	
	public int fibonacciNo(int number) {
		if(number<=1)
			return number;
		
		return fibonacciNo(number-1)+fibonacciNo(number-2);	
	}
	
	
}
