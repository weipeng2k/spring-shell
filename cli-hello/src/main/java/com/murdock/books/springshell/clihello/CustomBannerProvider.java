/**
 * 
 */
package com.murdock.books.springshell.clihello;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.shell.support.util.FileUtils;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

/**
 * @author weipeng2k 2015年1月26日 下午3:16:52
 */
@Component
@Order(1)
public class CustomBannerProvider implements BannerProvider {

	@Override
	public String getProviderName() {
		return "Middleware Detector";
	}

	@Override
	public String getBanner() {
		StringBuilder sb = new StringBuilder();
		sb.append(FileUtils.readBanner(CustomBannerProvider.class, "/META-INF/banner.txt"));
		sb.append(OsUtils.LINE_SEPARATOR);
		sb.append("版本：" + getVersion()).append(OsUtils.LINE_SEPARATOR);

		return sb.toString();
	}

	@Override
	public String getVersion() {
		return "1.0.0";
	}

	@Override
	public String getWelcomeMessage() {
		return "欢迎使用 " + getProviderName() + "。 如果需要帮助，请键入 help 然后单击回车键。";
	}

}
