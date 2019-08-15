package com.learn.config;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @description:  实现动态配置权限
 * @author: Kecheng Xie
 * @since: 2019-08-05 22:41
 **/
@Component
public class CustomerMetaSource implements FilterInvocationSecurityMetadataSource {

    // @Autowired
    // MenuService menuService;


    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
