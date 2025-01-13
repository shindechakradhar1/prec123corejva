package in.prec.logicalprograms.menudriven.main;
import in.prec.logicalprograms.menudriven.helper.Helper;
import java.util.Scanner;
public class MainMenuDriven {

	public static void main(String[] args) {
		int choice=0;
		Scanner scanner = new Scanner(System.in);
		Helper helper = new Helper();
		do {
			choice=helper.printMenu(scanner);
			switch(choice) {
			case 1 -> helper.checkPrime(scanner);
			case 2 -> helper.checkPerfect(scanner);
			case 3 -> helper.checkPallindrome(scanner);
			case 4 -> helper.checkArmstrong(scanner);
			case 0 -> System.out.println("Bye.. "); 
			default -> System.out.println("Invalid Input..");
			}
		}while(choice!=0);
		
		scanner.close();
	}
}
