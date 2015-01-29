package com.murdock.books.springshell.clihello;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.ExitShellRequest;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.stereotype.Component;

@Component
public class QuitCommand implements CommandMarker {

	@CliCommand(value = { "exit", "quit" }, help = "退出")
	public ExitShellRequest execute() {
		return ExitShellRequest.NORMAL_EXIT;
	}

}
