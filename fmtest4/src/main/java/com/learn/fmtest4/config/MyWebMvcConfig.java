package com.learn.fmtest4.config;

import com.learn.fmtest4.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:全局配置跨域请求
 * @author: Kecheng Xie
 * @since: 2019-07-27 21:48
 **/
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/book/**").allowedHeaders("*").allowedMethods("*").maxAge(1800).allowedOrigins("http://localhost:8081");
    }



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/hello");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index").setViewName("index");
    }
}
