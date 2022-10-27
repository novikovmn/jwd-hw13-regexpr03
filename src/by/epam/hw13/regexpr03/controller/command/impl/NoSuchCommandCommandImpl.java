package by.epam.hw13.regexpr03.controller.command.impl;

import by.epam.hw13.regexpr03.controller.command.Command;
import by.epam.hw13.regexpr03.controller.dto.Request;
import by.epam.hw13.regexpr03.controller.dto.Response;
import by.epam.hw13.regexpr03.controller.dto.ResponseStatus;
import by.epam.hw13.regexpr03.service.exception.ServiceException;

public class NoSuchCommandCommandImpl implements Command {

	@Override
	public Response execute(Request request) throws ServiceException {
		return new Response(ResponseStatus.NO_SUCH_COMMAND);
	}

}
