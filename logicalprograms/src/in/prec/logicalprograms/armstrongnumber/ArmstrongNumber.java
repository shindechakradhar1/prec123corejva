package in.prec.logicalprograms.armstrongnumber;

public class ArmstrongNumber {
	int number;
	public ArmstrongNumber() {}
	public ArmstrongNumber(int number) {
		this.number=number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public int calculateNoOfDigit() {
		int temp=number;
		int i=0;
		while(temp!=0) {
			temp/=10;
			i++;
		}
		
		return i;
	}
	
	public int calculatePower(int base, int exp) {
		int power=1;
		for(int i=0;i<exp;i++)
			power*=base;
		
		return power;
	}
	
	public boolean isArmstrongNumber() {
		int temp=number;
//		int noOfDigits=calculateNoOfDigit();
		int noOfDigits=(number+"").length();
//		System.out.println(noOfDigits);
		int result=0;
		while(temp!=0) {
//			result += calculatePower(temp%10,noOfDigits);
//			result += Math.pow(temp%10,noOfDigits);
			result = result + (int) Math.pow(temp%10, noOfDigits);
			temp/=10;
		}
		return result==number;
	}
}
