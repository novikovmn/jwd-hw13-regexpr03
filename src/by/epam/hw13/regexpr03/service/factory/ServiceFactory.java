package by.epam.hw13.regexpr03.service.factory;

import by.epam.hw13.regexpr03.service.UserService;
import by.epam.hw13.regexpr03.service.impl.UserServiceImpl;

public final class ServiceFactory {

	private final UserService userServiceImpl = new UserServiceImpl();

	//////////////////////////////////////////////////////////////////////
	private static final ServiceFactory instance = new ServiceFactory();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}
	//////////////////////////////////////////////////////////////////////
	
	public UserService getUserServiceImpl() {
		return userServiceImpl;
	}
}
