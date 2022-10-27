package by.epam.hw13.regexpr03.service.impl;

import by.epam.hw13.regexpr03.bean.User;
import by.epam.hw13.regexpr03.dao.UserDAO;
import by.epam.hw13.regexpr03.dao.exception.DAOException;
import by.epam.hw13.regexpr03.dao.factory.DAOFactory;
import by.epam.hw13.regexpr03.service.UserService;
import by.epam.hw13.regexpr03.service.exception.ServiceException;
import by.epam.hw13.regexpr03.validator.UserValidator;
import by.epam.hw13.regexpr03.validator.exception.UserValidatorException;

public class UserServiceImpl implements UserService {

	private final UserValidator.UserValidatorBuilderImpl userValidatorBuilderImpl = new UserValidator.UserValidatorBuilderImpl();

	@Override
	public void insertUser(User user) throws ServiceException {

		UserValidator userValidator = null;
		
		try {
			
			userValidator = userValidatorBuilderImpl
													.validateId(String.valueOf(user.getUserId()))
													.validateNickName(user.getNickName())
													.validateEmail(user.getEmail())
													.validatePhoneNumber(user.getPhoneNumber())
													.build();
			
			if (userValidator != null) {
				UserDAO userDAOImpl = DAOFactory.getInstance().getUserDAOImpl();
				userDAOImpl.insertUser(user);
			}
			
			
		} catch (UserValidatorException e) {
			throw new ServiceException("There are fields that have not been validated!", e.getIncorrectValues());
		} catch (DAOException e) {
			throw new ServiceException("Connection failed!", e);
		} 

	}

}
