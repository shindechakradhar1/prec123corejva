package in.prec.exceptionhandling.customexception.exceptions;

public class InvalidUnderAgeAgeException extends Exception{

	public InvalidUnderAgeAgeException() {
		super();
	}

	public InvalidUnderAgeAgeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidUnderAgeAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidUnderAgeAgeException(String message) {
		super(message);
	}

	public InvalidUnderAgeAgeException(Throwable cause) {
		super(cause);
	}
	
}
