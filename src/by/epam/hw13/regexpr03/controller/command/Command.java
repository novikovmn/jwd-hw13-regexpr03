package by.epam.hw13.regexpr03.controller.command;

import by.epam.hw13.regexpr03.controller.dto.Request;
import by.epam.hw13.regexpr03.controller.dto.Response;
import by.epam.hw13.regexpr03.service.exception.ServiceException;

public interface Command {

	Response execute (Request request) throws ServiceException;
	
}
