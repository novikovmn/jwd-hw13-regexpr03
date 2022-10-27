package by.epam.hw13.regexpr03.service;

import by.epam.hw13.regexpr03.bean.User;
import by.epam.hw13.regexpr03.service.exception.ServiceException;

public interface UserService {
	
	void insertUser (User user) throws ServiceException;

}
