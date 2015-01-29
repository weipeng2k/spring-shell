package com.murdock.books.springshell.clihello;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.HistoryFileNameProvider;
import org.springframework.stereotype.Component;

/**
 * @author weipeng2k 2015年1月26日 下午3:43:49
 */
@Component
@Order(1)
public class CustomHistoryFileNameProvider implements HistoryFileNameProvider {

	@Override
	public String getProviderName() {
		return "Middleware Detector";
	}

	@Override
	public String getHistoryFileName() {
		return "middleware-detector.log";
	}

}
