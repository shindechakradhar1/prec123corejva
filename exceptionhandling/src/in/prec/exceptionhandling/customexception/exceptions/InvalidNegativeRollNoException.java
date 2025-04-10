package in.prec.exceptionhandling.customexception.exceptions;

public class InvalidNegativeRollNoException extends Exception{

	public InvalidNegativeRollNoException() {
		super();
	}

	public InvalidNegativeRollNoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidNegativeRollNoException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNegativeRollNoException(String message) {
		super(message);
	}

	public InvalidNegativeRollNoException(Throwable cause) {
		super(cause);
	}
	
	
}
