package by.epam.hw13.regexpr03.dao;

import by.epam.hw13.regexpr03.bean.User;
import by.epam.hw13.regexpr03.dao.exception.DAOException;

public interface UserDAO {
	
	void insertUser(User user) throws DAOException;

}
