package by.epam.hw13.regexpr03.validator.exception;

import java.util.HashMap;
import java.util.Map;

public class UserValidatorException extends Exception {

	private static final long serialVersionUID = -1077460483900421171L;

	private Map<String, String> invalidFields = new HashMap<>();

	public UserValidatorException() {
		super();
	}

	public UserValidatorException(String message) {
		super(message);
	}

	public UserValidatorException(Exception e) {
		super(e);
	}

	public UserValidatorException(String message, Exception e) {
		super(message, e);
	}

	public UserValidatorException(String message, Map<String, String> incorrectValues) {
		super(message);
		this.invalidFields = incorrectValues;
	}

	public Map<String, String> getIncorrectValues() {
		return invalidFields;
	}
}
