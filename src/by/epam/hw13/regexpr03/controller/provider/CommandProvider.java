package by.epam.hw13.regexpr03.controller.provider;

import java.util.HashMap;
import java.util.Map;

import by.epam.hw13.regexpr03.controller.command.Command;
import by.epam.hw13.regexpr03.controller.command.impl.InsertUserCommandImpl;
import by.epam.hw13.regexpr03.controller.command.impl.NoSuchCommandCommandImpl;
import by.epam.hw13.regexpr03.controller.dto.RequestType;

public final class CommandProvider {

	private final Map<RequestType, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(RequestType.INSERT_USER, new InsertUserCommandImpl());
		commands.put(RequestType.NO_SUCH_COMMAND, new NoSuchCommandCommandImpl());
	}

	public Command getCommand(String requestTypename) {
		
		RequestType requestType = null;
		Command command = null;

		try {
			
			requestType = RequestType.valueOf(requestTypename);			
			command = commands.get(requestType);
			
		} catch (NullPointerException | IllegalArgumentException e) {
			command = commands.get(RequestType.NO_SUCH_COMMAND);
		}

		return command;

	}
}
