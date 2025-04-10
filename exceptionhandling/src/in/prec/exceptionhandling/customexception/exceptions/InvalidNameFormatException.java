package in.prec.exceptionhandling.customexception.exceptions;

public class InvalidNameFormatException extends Exception {

	public InvalidNameFormatException() {
		super();
	}

	public InvalidNameFormatException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidNameFormatException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNameFormatException(String message) {
		super(message);
	}

	public InvalidNameFormatException(Throwable cause) {
		super(cause);
	}
	
}
