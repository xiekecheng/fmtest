package com.learn.fmtest2.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @description: 通过实现接口方式配置FastJsonHttpMessageConverter
 * @author: Kecheng Xie
 * @since: 2019-07-26 17:07
 **/
public class MyWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //todo
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
        converters.add(converter);
    }
}
