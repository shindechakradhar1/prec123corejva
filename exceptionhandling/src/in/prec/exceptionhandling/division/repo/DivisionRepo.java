package in.prec.exceptionhandling.division.repo;

import in.prec.exceptionhandling.division.exceptions.DivisorCanNotBeZeroException;
import in.prec.exceptionhandling.division.exceptions.NameIsEmptyException;

public class DivisionRepo {
	public int division(int no1, int no2) throws NameIsEmptyException,Exception {
		int result = 0;
		String name=null;
		try {
			result = no1/no2;
			System.out.println(name.length());
		}catch(ArithmeticException e) {
			throw new DivisorCanNotBeZeroException();
		}catch(NullPointerException e) {
			throw new NameIsEmptyException("Value of Name is Null", e);
		}
		return result;
	}
}
