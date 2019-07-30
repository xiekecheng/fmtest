package com.learn.fmtest2.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;

/**
 * @description: 配置fastjson
 * @author: Kecheng Xie
 * @since: 2019-07-26 16:49
 **/
@Configuration
public class MyFastJsonConfig {
    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        //设置日期格式
        config.setDateFormat("yyyy-MM-dd");
        //设置编码
        config.setCharset(Charset.forName("UTF-8"));
        config.setSerializerFeatures(
                SerializerFeature.WriteClassName,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.PrettyFormat,
                SerializerFeature.WriteNullListAsEmpty
        );
        converter.setFastJsonConfig(config);
        return converter;
    }
}
