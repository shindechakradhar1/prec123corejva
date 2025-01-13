package in.prec.logicalprograms.perfectnumber.main;
import in.prec.logicalprograms.perfectnumber.PerfectNumber;

public class MainPerfectNumber {
	public static void main(String[] args) {
		PerfectNumber number = new PerfectNumber();
		int variable=28;
		
		number.setNumber(variable);
		if(number.isPerfectNumber())
			System.out.println(variable + " is a Perfect Number");
		else
			System.out.println(variable + " is not a Perfect Number");
	}
}
