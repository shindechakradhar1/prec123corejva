package in.prec.logicalprograms.recursion;

public class PrimeNumber {

	public boolean isPrime(int number, int divisor) {
		if(number==2)
			return true;
		if(number<2)
			return false;
		if(divisor*divisor>number)
			return true;
		if(number % divisor==0)
			return false;
		
		return isPrime(number, divisor+1);
		
	}
}
