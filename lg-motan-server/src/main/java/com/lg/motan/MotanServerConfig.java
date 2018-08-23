package com.lg.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;

@Configuration
public class MotanServerConfig {

	@Bean
	@ConfigurationProperties(prefix="motan.server")
	public BasicServiceConfigBean basicServiceConfig() {
		BasicServiceConfigBean configBean = new BasicServiceConfigBean();
		return configBean;
	}
}
