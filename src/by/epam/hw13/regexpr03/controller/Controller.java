package by.epam.hw13.regexpr03.controller;

import by.epam.hw13.regexpr03.controller.command.Command;
import by.epam.hw13.regexpr03.controller.dto.Request;
import by.epam.hw13.regexpr03.controller.dto.Response;
import by.epam.hw13.regexpr03.controller.provider.CommandProvider;
import by.epam.hw13.regexpr03.service.exception.ServiceException;

public final class Controller {

	private final CommandProvider commandProvider = new CommandProvider();

	public Response execute(Request request) throws ServiceException {

		String requestType = request.getRequestType();
		
		
		Command command = commandProvider.getCommand(requestType);

		Response response = null;

		response = command.execute(request);
		
		return response;

	}

}
