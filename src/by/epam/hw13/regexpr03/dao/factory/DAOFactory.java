package by.epam.hw13.regexpr03.dao.factory;

import by.epam.hw13.regexpr03.dao.UserDAO;
import by.epam.hw13.regexpr03.dao.impl.UserDAOImpl;

public final class DAOFactory {

	private final UserDAO userDAOImpl = new UserDAOImpl();

	/////////////////////////////////////////////////////////////////////
	private static final DAOFactory instance = new DAOFactory();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}
	////////////////////////////////////////////////////////////////////
	
	public UserDAO getUserDAOImpl() {
		return userDAOImpl; 
	}

}
