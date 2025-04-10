package in.prec.exceptionhandling.division.exceptions;

public class DivisorCanNotBeZeroException extends Exception {

	public DivisorCanNotBeZeroException() {
		super();
	}

	public DivisorCanNotBeZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public DivisorCanNotBeZeroException(String message) {
		super(message);
	}

}
