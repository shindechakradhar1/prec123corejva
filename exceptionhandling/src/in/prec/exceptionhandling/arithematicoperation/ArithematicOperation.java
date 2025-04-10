package in.prec.exceptionhandling.arithematicoperation;

public class ArithematicOperation {
	public int divide(int no1, int no2) throws Exception{
		int result = 0;
		try {
			result=no1/no2;
		}catch(ArithmeticException e) {
			throw new Exception("No can not be Zero", e);
		}
		return result;
	}
}
