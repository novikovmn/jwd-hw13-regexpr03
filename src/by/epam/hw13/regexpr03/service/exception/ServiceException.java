package by.epam.hw13.regexpr03.service.exception;

import java.util.HashMap;
import java.util.Map;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -4761281662754528222L;

	private Map<String, String> invalidFields = new HashMap<>();

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

	public Map<String, String> getInvalidFields() {
		return invalidFields;
	}
	
	public ServiceException(String message, Map<String, String> invalidFields) {
		super(message);
		this.invalidFields = invalidFields;
	}
}
