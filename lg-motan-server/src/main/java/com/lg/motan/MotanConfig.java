package com.lg.motan;

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
	 * 声明Annotation用来指定需要解析的包名
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
	 * @return
	 */
	@Bean(name="motan")//与配置文件协议名一致
	@ConfigurationProperties(prefix="motan.protocol")
	public  ProtocolConfigBean protocolConfigBean() {
		
		ProtocolConfigBean protocolConfigBean = new ProtocolConfigBean();
		return protocolConfigBean;
		
	}
	
	@Bean(name="registryConfig")//与配置注册中心一致
	@ConfigurationProperties(prefix="motan.registry")
	public RegistryConfigBean registryConfig () {
		RegistryConfigBean registryConfigBean = new RegistryConfigBean();
		return registryConfigBean;
	}
	
}
