package in.prec.logicalprograms.menudriven.helper;
import java.util.Scanner;
import in.prec.logicalprograms.primenumber.PrimeNumber;
import in.prec.logicalprograms.perfectnumber.PerfectNumber;
import in.prec.logicalprograms.armstrongnumber.ArmstrongNumber;
import in.prec.logicalprograms.reversenumber.ReverseNumber;
public class Helper {
	public int printMenu(Scanner scanner) {
		System.out.println("1. Prime");
		System.out.println("2. Perfect");
		System.out.println("3. Pallindrome");
		System.out.println("4. Armstrong");
		System.out.println("0. exit");
		return scanner.nextInt();
	}
	
	public void checkPrime(Scanner scanner) {
		PrimeNumber number = new PrimeNumber();
		System.out.println("Enter a Number for Prime: ");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isPrimeNumber())
			System.out.println(variable + " is a Prime Number");
		else
			System.out.println(variable + " is not a Prime Number");
	}
	
	public void checkPerfect(Scanner scanner) {
		PerfectNumber number = new PerfectNumber();
		System.out.println("Enter a Number for Perfect: ");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isPerfectNumber())
			System.out.println(variable + " is a Perfect Number");
		else
			System.out.println(variable + " is not a Perfect Number");
	}
	
	public void checkArmstrong(Scanner scanner) {
		ArmstrongNumber number = new ArmstrongNumber();
		System.out.println("Enter a Number for Armstrong");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNumber())
			System.out.println(variable + " is a Armstrong Number");
		else
			System.out.println(variable + " is not a Armstrong Number");
		
	}
	
	public void checkPallindrome(Scanner scanner) {
		ReverseNumber number = new ReverseNumber();
		System.out.println("Enter a Number for Pallindrome");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if(number.isPallindrome())
			System.out.println(variable + " is a Pallindrome Number");
		else
			System.out.println(variable + " is not a Pallindrome Number");
		
	}

}
