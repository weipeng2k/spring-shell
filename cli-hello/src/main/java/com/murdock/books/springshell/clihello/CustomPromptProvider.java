/**
 * 
 */
package com.murdock.books.springshell.clihello;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * @author weipeng2k 2015年1月26日 下午3:35:52
 */
@Component
@Order(1)
public class CustomPromptProvider implements PromptProvider {

	@Override
	public String getProviderName() {
		return "Middleware Detector";
	}

	@Override
	public String getPrompt() {
		return "middleware-detector>";
	}

}
