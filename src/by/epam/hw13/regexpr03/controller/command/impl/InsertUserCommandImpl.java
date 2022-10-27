package by.epam.hw13.regexpr03.controller.command.impl;

import by.epam.hw13.regexpr03.bean.User;
import by.epam.hw13.regexpr03.controller.command.Command;
import by.epam.hw13.regexpr03.controller.dto.Request;
import by.epam.hw13.regexpr03.controller.dto.Response;
import by.epam.hw13.regexpr03.controller.dto.ResponseStatus;
import by.epam.hw13.regexpr03.service.UserService;
import by.epam.hw13.regexpr03.service.exception.ServiceException;
import by.epam.hw13.regexpr03.service.factory.ServiceFactory;

public class InsertUserCommandImpl implements Command{
	
	

	@Override
	public Response execute(Request request) throws ServiceException {
		
		User user = request.getUser();
		
		UserService userServiceImpl = ServiceFactory.getInstance().getUserServiceImpl();
		userServiceImpl.insertUser(user);
		
		return new Response(ResponseStatus.SUCCESS);
		
	}

}
