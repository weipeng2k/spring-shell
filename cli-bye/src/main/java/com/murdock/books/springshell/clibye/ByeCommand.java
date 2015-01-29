/**
 * 
 */
package com.murdock.books.springshell.clibye;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * @author weipeng2k 2015年1月26日 下午6:01:05
 */
@Component
public class ByeCommand implements CommandMarker {
	/**
	 * <pre>
	 * 其中hello表示一个命令，在 shell> 可以键入 hello
	 * 
	 * hello --name 测试
	 * 这时 name = 测试
	 * 
	 * 如果键入 hello
	 * 则 name = null
	 * 
	 * 如果键入 hello --name
	 * 则会提示 必须填充name的值
	 * 
	 * </pre>
	 * 
	 * @param name
	 * @return
	 */
	@CliCommand(value = "bye", help = "再见")
	public String execute(@CliOption(key = "name", help = "输入名称。") String name,
			@CliOption(key = "num", help = "输入标签。") int num) {
		if (name == null) {
			return "请输入名称";
		}
		return "你好，" + name + "" + num;
	}
}
