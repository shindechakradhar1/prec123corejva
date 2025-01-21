package in.prec.logicalprograms.reversestring.main;

import java.util.Scanner;

import in.prec.logicalprograms.reversestring.ReverseString;

public class MainReverseString {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		ReverseString reverseString = new ReverseString();
//		System.out.println("Enter a Name to Reverse: ");
//		String name=scanner.next();
//		reverseString.setName(name);
//		System.out.println(reverseString.reverseString());
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name to reverse: ");
		String name = scanner.nextLine();
		ReverseString reverse = new ReverseString();
		reverse.setName(name);
		
		System.out.println(reverse.reverseString());
		
		scanner.close();
	}
}
