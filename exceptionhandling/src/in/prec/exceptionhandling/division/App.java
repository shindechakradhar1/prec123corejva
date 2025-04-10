package in.prec.exceptionhandling.division;

import java.util.Scanner;

import in.prec.exceptionhandling.division.utilities.DivisionUtility;

public class App {
	
	public static void main(String[] args) {
		DivisionUtility util = new DivisionUtility();
		Scanner scanner = new Scanner(System.in);
		util.division(scanner);
		scanner.close();
	}
}
