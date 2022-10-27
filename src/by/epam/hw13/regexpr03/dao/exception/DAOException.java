package by.epam.hw13.regexpr03.dao.exception;

public class DAOException extends Exception {

	private static final long serialVersionUID = 6685474824681802553L;

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String message, Exception e) {
		super(e);
	}

}
