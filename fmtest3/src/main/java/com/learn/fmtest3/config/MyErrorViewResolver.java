package com.learn.fmtest3.config;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: 自定义ErrorViewResolver
 * @author: Kecheng Xie
 * @since: 2019-07-27 16:55
 **/
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mv = new ModelAndView("errorPage");
        mv.addObject("custommsg","出错啦!");
        mv.addAllObjects(model);
        return mv;

    }
}
