package com.murdock.books.springshell.clihello;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.JLineShellComponent;
import org.springframework.shell.core.SimpleParser;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class HelpCommand implements CommandMarker, ApplicationContextAware {

	private ApplicationContext ctx;

	@CliCommand(value = "help", help = "列出所有的命令或者帮助")
	public void obtainHelp(
			@CliOption(key = { "", "command" }, optionContext = "disable-string-converter availableCommands", help = "Command name to provide help for")
			String buffer) {
		JLineShellComponent shell = ctx.getBean("shell", JLineShellComponent.class);
		SimpleParser parser = shell.getSimpleParser();
		parser.obtainHelp(buffer);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
}
