package in.prec.exceptionhandling.arithematicoperation;

public class MainArithematicOperation {
	public static void main(String[] args) {
		ArithematicOperation operation = new ArithematicOperation();
		int result=0;
		try {
			result=operation.divide(12, 0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
}
