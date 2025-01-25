package in.prec.logicalprograms.recursion.main;

import in.prec.logicalprograms.recursion.PrimeNumber;

public class MainPrimeNumber {
	
	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber();
		int primeNumber=1;
//		boolean result=number.isPrime(primeNumber, 2);
		if(number.isPrime(primeNumber, 2))
			System.out.println(primeNumber + " is a Prime Number" );
		else 
			System.out.println(primeNumber + " is not a Prime Number");
	}
}
