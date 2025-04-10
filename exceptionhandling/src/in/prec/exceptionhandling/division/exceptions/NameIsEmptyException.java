package in.prec.exceptionhandling.division.exceptions;

public class NameIsEmptyException extends Exception{

	public NameIsEmptyException() {
		super();
	}

	public NameIsEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public NameIsEmptyException(String message) {
		super(message);
	}
	
}
