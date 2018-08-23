package com.lg.config.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

/**
 * 
 * @author ligeng3
 *
 */
@Configuration
public class MotanConfig {

	/**
	 * 配置扫描的包
	 * 
	 * @return
	 */
	@Bean
	@ConfigurationProperties(prefix = "motan.annotation")
	public AnnotationBean motanAnnotationBean() {
		AnnotationBean annotationBean = new AnnotationBean();
		return annotationBean;
	}

	/**
	 * 协议配置
	 * 
	 * @return
	 */
	@Bean(name = "motan")//预配置文件协议名对应
	@ConfigurationProperties(prefix = "motan.protocol")
	public ProtocolConfigBean protocolConfig() {
		ProtocolConfigBean protocolConfigBean = new ProtocolConfigBean();
		return protocolConfigBean;
	}

	/**
	 * 注册中心配置
	 * 
	 * @return
	 */
	@Bean(name = "registryConfig")//与配置文件注册中心对应
	@ConfigurationProperties(prefix = "motan.registry")
	public RegistryConfigBean registryConfig() {
		RegistryConfigBean config = new RegistryConfigBean();
		return config;
	}

}
