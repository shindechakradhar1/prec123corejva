package in.prec.logicalprograms.armstrongnumber.main;
import in.prec.logicalprograms.armstrongnumber.ArmstrongNumber;
public class MainArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber number = new ArmstrongNumber();
		for(int i=2;i<=10000;i++) {
			int variable = i;
			number.setNumber(variable);
			if (number.isArmstrongNumber())
				System.out.println(variable + " is a Armstrong Number");
//			else
//				System.out.println(variable + " is not a Armstrong Number_");
		}
	}
}
