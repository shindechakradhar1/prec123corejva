package in.prec.exceptionhandling.division.utilities;

import java.util.Scanner;

import in.prec.exceptionhandling.division.exceptions.NameIsEmptyException;
import in.prec.exceptionhandling.division.services.DivisionService;

public class DivisionUtility {
	private DivisionService service = new DivisionService();
	public void division(Scanner scanner) {
		System.out.println("Insert First Number: ");
		int no1=scanner.nextInt();
		System.out.println("Insert Second Number: ");
		int no2=scanner.nextInt();
		int result=0;
		try {
			result=service.division(no1,no2);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}catch(NameIsEmptyException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Division Result is: " + result);
	}
}
