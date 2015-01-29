package com.murdock.books.springshell.clihello;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.shell.commands.OsOperations;
import org.springframework.shell.commands.OsOperationsImpl;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.shell.support.logging.HandlerUtils;
import org.springframework.stereotype.Component;

@Component
public class OsCommand implements CommandMarker {

	private static final Logger	LOGGER			= HandlerUtils.getLogger(OsCommand.class);

	private OsOperations		osOperations	= new OsOperationsImpl();

	@CliCommand(value = "!", help = "执行操作系统命令")
	public void command(
			@CliOption(key = { "", "command" }, mandatory = false, specifiedDefaultValue = "", unspecifiedDefaultValue = "", help = "被执行的命令") final String command) {

		System.out.println("command is:" + command);
		if (command != null && command.length() > 0) {
			try {
				osOperations.executeCommand(command);
			} catch (final IOException e) {
				LOGGER.severe("Unable to execute command " + command + " [" + e.getMessage() + "]");
			}
		}
	}
}
