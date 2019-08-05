package com.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-31 16:01
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.learn.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                .description("接口测试文档swagger")
                .contact(new Contact("江南一点雨","www.baidu.com","568835977@qq.com"))
                .version("v1.0").title("API测试文档")
                .license("Apache2.0").licenseUrl("www.google.com").build());
    }
}
