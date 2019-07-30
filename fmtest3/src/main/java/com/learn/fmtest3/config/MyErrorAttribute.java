package com.learn.fmtest3.config;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @description: 自定义Error数据
 * @author: Kecheng Xie
 * @since: 2019-07-27 16:32
 **/
@Component
public class MyErrorAttribute extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        errorAttributes.put("custommsg","出错啦");
        errorAttributes.remove("error");
        return errorAttributes;
    }
}
