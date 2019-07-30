package com.learn.fmtest3.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 配置全局的model数据,从而,每个model都可以获取到该数据
 * @author: Kecheng Xie
 * @since: 2019-07-27 13:19
 **/
@ControllerAdvice
public class GlobalConfig{

    /*
    @ModelAttribute(value = "info")
    public Map<String,String> userInfo(){
        HashMap<String,String> map = new HashMap<>();

        map.put("username","罗贯中");
        map.put("gender","男");
        return  map;
    }

     */
    @InitBinder("b")
    public void init(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }
    @InitBinder("a")
    public void init2(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }
}
