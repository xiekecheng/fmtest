package com.learn.securitytest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 15:24
 **/
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class WebSecurityConfig {
}
