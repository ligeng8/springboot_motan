package com.lg.config.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;

@Configuration
public class MotanClientConfig
{
    /**
     * motan 客户端配置
     * @return
     */
    @Bean(name = "clientBasicConfig")
    @ConfigurationProperties(prefix = "motan.client")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        return config;
    }
}
