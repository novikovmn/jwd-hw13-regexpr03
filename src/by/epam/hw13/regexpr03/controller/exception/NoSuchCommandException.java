package by.epam.hw13.regexpr03.controller.exception;

public class NoSuchCommandException extends Exception {

	private static final long serialVersionUID = -1301305659603069719L;

	public NoSuchCommandException() {
	}

	public NoSuchCommandException(String message) {
		super(message);
	}

	public NoSuchCommandException(String message, Exception e) {
		super(message, e);
	}

	public NoSuchCommandException(Exception e) {
		super(e);
	}

}
